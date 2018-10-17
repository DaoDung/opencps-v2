package backend.feedback.service.listener;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

import org.apache.commons.lang3.StringEscapeUtils;
import org.osgi.service.component.annotations.Component;

import backend.feedback.model.Voting;
import backend.feedback.service.VotingLocalServiceUtil;

@Component(immediate = true, service = ModelListener.class)
public class VotingTempListener extends BaseModelListener<Voting> {

	@Override
	public void onAfterCreate(Voting model) throws ModelListenerException {
	}

	@Override
	public void onAfterUpdate(Voting model) throws ModelListenerException {
	}

	@Override
	public void onBeforeCreate(Voting model) throws ModelListenerException {
//		try {
//			model.setClassName(HtmlUtil.escape(model.getClassName()));
//			model.setClassPK(HtmlUtil.escape(model.getClassPK()));
//			model.setSubject(HtmlUtil.escape(model.getSubject()));
//			model.setChoices(HtmlUtil.escape(model.getChoices()));
//			model.setTemplateNo(HtmlUtil.escape(model.getTemplateNo()));
//			model.setCommentable(Boolean.valueOf(HtmlUtil.escape(String.valueOf(model.getCommentable()))));
//
//		} catch (Exception e) {
//			_log.error(e);
//		}
	}

	@Override
	public void onBeforeUpdate(Voting model) throws ModelListenerException {
//		try {
//			model.setClassName(HtmlUtil.escape(model.getClassName()));
//			model.setClassPK(HtmlUtil.escape(model.getClassPK()));
//			model.setSubject(HtmlUtil.escape(model.getSubject()));
//			model.setChoices(HtmlUtil.escape(model.getChoices()));
//			model.setTemplateNo(HtmlUtil.escape(model.getTemplateNo()));
//			model.setCommentable(Boolean.valueOf(HtmlUtil.escape(String.valueOf(model.getCommentable()))));
//
//		} catch (Exception e) {
//			_log.error(e);
//		}
	}


	private Log _log = LogFactoryUtil.getLog(VotingTempListener.class.getName());
}
