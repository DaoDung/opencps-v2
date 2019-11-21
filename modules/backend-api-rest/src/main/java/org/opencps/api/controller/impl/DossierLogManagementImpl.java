package org.opencps.api.controller.impl;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.opencps.api.controller.DossierLogManagement;
import org.opencps.api.controller.util.DossierLogUtils;
import org.opencps.api.dossierlog.model.DossierLogModel;
import org.opencps.api.dossierlog.model.DossierLogResultsModel;
import org.opencps.api.dossierlog.model.DossierLogSearchModel;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.dossiermgt.action.DossierLogActions;
import org.opencps.dossiermgt.action.impl.DossierLogActionsImpl;
import org.opencps.dossiermgt.action.util.ConstantUtils;
import org.opencps.dossiermgt.action.util.ReadFilePropertiesUtils;
import org.opencps.dossiermgt.constants.DossierLogTerm;
import org.opencps.dossiermgt.model.DossierLog;

import backend.auth.api.exception.BusinessExceptionImpl;

public class DossierLogManagementImpl implements DossierLogManagement {

	@Override
	public Response addDossierLogByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long id, String notificationType, String author,
			String payload, String content) {

		long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

		try {

			DossierLogActions action = new DossierLogActionsImpl();

			DossierLog dossierLog = action.addDossierLog(groupId, id, author, content, notificationType, payload,
					serviceContext);

			DossierLogModel result = DossierLogUtils.mappingToDossierLogModel(dossierLog);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response getDossierLogs(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, DossierLogSearchModel query) {

		long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

		try {

			DossierLogResultsModel results = new DossierLogResultsModel();

			DossierLogActions action = new DossierLogActionsImpl();

			JSONObject dossierLogJsonObject = action.getDossierLogs(groupId, query.getNotificationType(),
					query.isOwner(), query.getStart(), query.getEnd(), query.getSort(), query.getOrder(),
					serviceContext);

			List<Document> documents = (List<Document>) dossierLogJsonObject.get("data");
			//
			results.setTotal(dossierLogJsonObject.getInt("total"));
			results.getData().addAll(DossierLogUtils.mappingToDossierLogResultsModel(documents));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response getDossierLogById(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, DossierLogSearchModel query, long dossierId, String password) {

		long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));
		try {

			JSONObject results = JSONFactoryUtil.createJSONObject();

			DossierLogActions action = new DossierLogActionsImpl();

			JSONObject dossierLogJsonObject = action.getDossierLogById(groupId, dossierId, password, query.isOwner(),
					query.getStart(),

					query.getEnd(), query.getSort(), query.getOrder(), serviceContext);

			List<Document> documents = (List<Document>) dossierLogJsonObject.get("data");

			JSONArray models = JSONFactoryUtil.createJSONArray();

			for (Document document : documents) {

				JSONObject model = JSONFactoryUtil.createJSONObject();

				long dossierLogId = GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK));

				model.put(DossierLogTerm.DOSSIER_LOG_ID, dossierLogId);

				model.put(DossierLogTerm.AUTHOR, document.get(DossierLogTerm.AUTHOR) != null ? document.get(DossierLogTerm.AUTHOR).toUpperCase() : StringPool.BLANK);

				model.put(DossierLogTerm.CONTENT, document.get(DossierLogTerm.CONTENT));

				String strDate = document.get(DossierLogTerm.CREATE_DATE);

				Date date = null;

				if (Validator.isNotNull(strDate)) {
					date = APIDateTimeUtils.convertStringToDate(strDate, ReadFilePropertiesUtils.get(ConstantUtils.PATTERN_LUCENE));
				}

//				model.put("createDate", date != null
//						? APIDateTimeUtils.convertDateToString(date, APIDateTimeUtils._TIMESTAMP) : strDate);

				model.put("createDate", date != null
				? date.getTime() : 0l);

				model.put("notificationType", document.get(DossierLogTerm.NOTIFICATION_TYPE));

				JSONObject payload = JSONFactoryUtil.createJSONObject(document.get(DossierLogTerm.PAYLOAD));

				model.put("payload", payload);

				models.put(model);

			}

			results.put("total", dossierLogJsonObject.getInt("total"));

			results.put("data", models);

			return Response.status(200).entity(results.toJSONString()).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

}
