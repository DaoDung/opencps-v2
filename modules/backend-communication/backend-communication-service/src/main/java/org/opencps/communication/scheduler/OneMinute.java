package org.opencps.communication.scheduler;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.opencps.communication.constants.NotificationTemplateTerm;
import org.opencps.communication.model.NotificationQueue;
import org.opencps.communication.model.Notificationtemplate;
import org.opencps.communication.service.NotificationQueueLocalServiceUtil;
import org.opencps.communication.service.NotificationtemplateLocalService;
import org.opencps.communication.service.NotificationtemplateLocalServiceUtil;
import org.opencps.communication.sms.utils.ViettelSMSUtils;
import org.opencps.communication.utils.NotificationQueueBusinessFactoryUtil;
import org.opencps.communication.utils.NotificationUtil;
import org.opencps.kernel.context.MBServiceContextFactoryUtil;
import org.opencps.kernel.message.MBMessageEntry;
import org.opencps.kernel.message.email.MBEmailSenderFactoryUtil;
import org.opencps.kernel.message.notification.MBNotificationSenderFactoryUtil;
import org.opencps.kernel.message.sms.SendMTConverterUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 * @author trungnt
 */
@Component(immediate = true, service = OneMinute.class)
public class OneMinute extends BaseSchedulerEntryMessageListener {
	private static volatile boolean isRunning = false;
	
	@Override
	protected void doReceive(Message message) {
		if (!isRunning) {
			isRunning = true;
		}
		else {
			return;
		}
		doProcessNotification(message);
		isRunning = false;
	}

	private void doProcessNotification(Message message) {
		
		List<NotificationQueue> notificationQueues = NotificationQueueLocalServiceUtil
				.findByF_LessThan_ExpireDate(new Date());

		if (notificationQueues != null) {
			_log.info("notificationQueues SIZE: "+notificationQueues.size());
			for (NotificationQueue notificationQueue : notificationQueues) {
				Notificationtemplate notificationtemplate = NotificationtemplateLocalServiceUtil.findByF_TYPE_INTER(
						notificationQueue.getGroupId(), notificationQueue.getNotificationType(),
						NotificationTemplateTerm.MINUTELY);
				if (notificationtemplate != null) {
					_log.info("Template: "+notificationtemplate.getNotificationType());
					try {
						ServiceContext serviceContext =
							MBServiceContextFactoryUtil.create(
								notificationQueue.getCompanyId(),
								notificationQueue.getGroupId(),
								notificationQueue.getUserId());

						MBMessageEntry messageEntry =
							NotificationUtil.createMBMessageEntry(
								notificationQueue, notificationtemplate,
								serviceContext);
						//_log.info("messageEntry: "+JSONFactoryUtil.looseSerialize(messageEntry));
						//Process send SMS
						boolean flagSend = false;
						if(messageEntry.isSendSMS()){
							_log.info("messageEntry.isSendSMS(): "+messageEntry.isSendSMS());
							String results = SendMTConverterUtils.sendSMS(messageEntry.getTextMessage(),
									messageEntry.getEmailSubject(), messageEntry.getToTelNo());
							if (Validator.isNotNull(results)
									&& results.equals(String.valueOf(HttpServletResponse.SC_ACCEPTED))) {
								flagSend = true;
							}
							//Send viettel
							ViettelSMSUtils.sendSMS(messageEntry.getTextMessage(), messageEntry.getEmailSubject(), messageEntry.getToTelNo());
							
							_log.info("END SEND SMS"+flagSend);
						} else {
							flagSend = true;
						}

						if(messageEntry.isSendEmail()){
							_log.info("messageEntry.isSendEmail(): "+messageEntry.isSendEmail());
							MBEmailSenderFactoryUtil.send(messageEntry, StringPool.BLANK);
						}

						if(messageEntry.isSendNotify()){
							_log.info("messageEntry.isSendNotify(): "+messageEntry.isSendNotify());
							MBNotificationSenderFactoryUtil.send(
								messageEntry, messageEntry.getClassName(),
								serviceContext);
						}
						// Remove queue when send SMS success
						if (flagSend) {
							NotificationQueueBusinessFactoryUtil.delete(
									notificationQueue.getNotificationQueueId(),
									serviceContext);
						}
					}
					catch (Exception e) {
						_log.warn("Can't send message from queue " + e);
					}
				}
			}
		}
	}

	@Activate
	@Modified
	protected void activate() {

		schedulerEntryImpl.setTrigger(
			TriggerFactoryUtil.createTrigger(
				getEventListenerClass(), getEventListenerClass(), 45,
				TimeUnit.SECOND));
		_schedulerEngineHelper.register(
			this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {

		_schedulerEngineHelper.unregister(this);
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(
		ModuleServiceLifecycle moduleServiceLifecycle) {

	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(
		SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {

	}

	@Reference
	private NotificationtemplateLocalService _notificationTemplateLocalService;

	private SchedulerEngineHelper _schedulerEngineHelper;

	private Log _log = LogFactoryUtil.getLog(OneMinute.class);

}
