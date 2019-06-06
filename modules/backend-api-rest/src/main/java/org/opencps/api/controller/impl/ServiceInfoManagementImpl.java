package org.opencps.api.controller.impl;

import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.opencps.api.controller.ServiceInfoManagement;
import org.opencps.api.controller.util.ServiceInfoUtils;
import org.opencps.api.serviceinfo.model.FileTemplateModel;
import org.opencps.api.serviceinfo.model.FileTemplateResultsModel;
import org.opencps.api.serviceinfo.model.ServiceInfoDetailModel;
import org.opencps.api.serviceinfo.model.ServiceInfoInputModel;
import org.opencps.api.serviceinfo.model.ServiceInfoResultsModel;
import org.opencps.api.serviceinfo.model.ServiceInfoSearchModel;
import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.auth.api.keys.ActionKeys;
import org.opencps.datamgt.constants.DictItemTerm;
import org.opencps.dossiermgt.action.ServiceInfoActions;
import org.opencps.dossiermgt.action.impl.ServiceInfoActionsImpl;
import org.opencps.dossiermgt.action.util.SpecialCharacterUtils;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.action.util.OpenCPSConfigUtil;
import org.opencps.dossiermgt.constants.ServiceInfoTerm;
import org.opencps.dossiermgt.model.ServiceFileTemplate;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.service.ServiceFileTemplateLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
import org.opencps.dossiermgt.service.persistence.ServiceFileTemplatePK;

import backend.auth.api.exception.BusinessExceptionImpl;

public class ServiceInfoManagementImpl implements ServiceInfoManagement {

	@SuppressWarnings("unchecked")
	@Override
	public Response getServiceInfos(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, ServiceInfoSearchModel query, Request requestCC) {

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		ServiceInfoResultsModel results = new ServiceInfoResultsModel();

		try {
			if (query.getEnd() == 0) {

				query.setStart(-1);

				query.setEnd(-1);

			}

			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			//params.put(Field.KEYWORD_SEARCH, query.getKeyword());
			//Keyword search like
			String keywordSearch = query.getKeyword();
			String keySearch = StringPool.BLANK;
			if (Validator.isNotNull(keywordSearch)) {
				keySearch = SpecialCharacterUtils.splitSpecial(keywordSearch);
			}
			params.put(Field.KEYWORD_SEARCH, keySearch);

			params.put(ServiceInfoTerm.ADMINISTRATION_CODE, query.getAdministration());
			params.put(ServiceInfoTerm.DOMAIN_CODE, query.getDomain());
			params.put(ServiceInfoTerm.MAX_LEVEL, query.getLevel());
			params.put(ServiceInfoTerm.PUBLIC_, query.getActive());

			Sort[] sorts = null;
			if (Validator.isNotNull(query.getSort()) && (query.getSort().equals(DictItemTerm.SIBLING_AGENCY)
					|| query.getSort().equals(DictItemTerm.SIBLING_DOMAIN))) {
				sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_Number_sortable", Sort.INT_TYPE,
					GetterUtil.getBoolean(query.getOrder())) };
			} else {
				sorts = new Sort[] { SortFactoryUtil.create(query.getSort() + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(query.getOrder())) };
			}
			JSONObject jsonData = actions.getServiceInfos(serviceContext.getUserId(), serviceContext.getCompanyId(),
					groupId, params, sorts, query.getStart(), query.getEnd(), serviceContext);

			results.setTotal(jsonData.getInt("total"));
			results.getData()
					.addAll(ServiceInfoUtils.mappingToServiceInfoResultModel((List<Document>) jsonData.get("data"), serviceContext));
			EntityTag etag = new EntityTag(Integer.toString(Long.valueOf(groupId).hashCode()));
		    ResponseBuilder builder = requestCC.evaluatePreconditions(etag);
		    
			if (OpenCPSConfigUtil.isHttpCacheEnable() && builder == null) {
				builder = Response.status(200);
				CacheControl cc = new CacheControl();
				cc.setMaxAge(OpenCPSConfigUtil.getHttpCacheMaxAge());
				cc.setPrivate(true);	
				builder.tag(etag);
				return builder.status(200).entity(results).cacheControl(cc).build();
			}
			else {
				return Response.status(200).entity(results).build();				
			}

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}

	}

	@Override
	public Response addServiceInfo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, ServiceInfoInputModel input) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		long userId = serviceContext.getUserId();

		BackendAuth auth = new BackendAuthImpl();

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		ServiceInfoInputModel serviceInfoInput = new ServiceInfoInputModel();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, ServiceInfo.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			String serviceCode = HtmlUtil.escape(input.getServiceCode());
			String serviceName = HtmlUtil.escape(input.getServiceName());
			String processText = HtmlUtil.escape(input.getProcessText());
			String methodText = HtmlUtil.escape(input.getMethodText());
			String dossierText = HtmlUtil.escape(input.getDossierText());
			String conditionText = HtmlUtil.escape(input.getConditionText());
			String durationText = HtmlUtil.escape(input.getDurationText());
			String applicantText = HtmlUtil.escape(input.getApplicantText());
			String resultText = HtmlUtil.escape(input.getResultText());
			String regularText = HtmlUtil.escape(input.getRegularText());
			String feeText = HtmlUtil.escape(input.getFeeText());
			String administrationCode = HtmlUtil.escape(input.getAdministrationCode());
			String domainCode = HtmlUtil.escape(input.getDomainCode());
			String active = HtmlUtil.escape(input.getActive());
			
			ServiceInfo serviceInfo = actions.updateServiceInfo(userId, groupId, input.getServiceInfoId(),
					serviceCode, serviceName, processText, methodText,
					dossierText, conditionText, durationText, applicantText,
					resultText, regularText, feeText, administrationCode,
					domainCode, input.getMaxLevel(), GetterUtil.getBoolean(active),
					serviceContext);

			serviceInfoInput = ServiceInfoUtils.mappingToServiceInfoInputModel(serviceInfo);

			return Response.status(200).entity(serviceInfoInput).build();

		} catch (Exception e) {

			return BusinessExceptionImpl.processException(e);
		}

	}

	@Override
	public Response getDetailServiceInfo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, Request requestCC) {
		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		ServiceInfoDetailModel results = new ServiceInfoDetailModel();

		try {
			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

			ServiceInfo serviceInfo = null;

			serviceInfo = actions.getByCode(id, groupId);

			if (Validator.isNull(serviceInfo)) {
				serviceInfo = actions.getById(GetterUtil.getLong(id));
			}

			if (Validator.isNull(serviceInfo)) {
				throw new Exception();
			} else {
				results = ServiceInfoUtils.mappingToServiceInfoDetailModel(serviceInfo, serviceContext);
			}
			EntityTag etag = new EntityTag(Integer.toString(Long.valueOf(groupId).hashCode()));
		    ResponseBuilder builder = requestCC.evaluatePreconditions(etag);			
		    if (OpenCPSConfigUtil.isHttpCacheEnable() && builder == null) {
				builder = Response.status(200);
				CacheControl cc = new CacheControl();
				cc.setMaxAge(OpenCPSConfigUtil.getHttpCacheMaxAge());
				cc.setPrivate(true);	
				builder.tag(etag);
				return builder.status(200).entity(results).cacheControl(cc).build();
			}
			else {
				return Response.status(200).entity(results).build();
			}
		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response updateServiceInfo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long id, ServiceInfoInputModel input) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		ServiceInfoInputModel serviceInfoInput = new ServiceInfoInputModel();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, ServiceInfo.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			String serviceCode = HtmlUtil.escape(input.getServiceCode());
			String serviceName = HtmlUtil.escape(input.getServiceName());
			String processText = HtmlUtil.escape(input.getProcessText());
			String methodText = HtmlUtil.escape(input.getMethodText());
			String dossierText = HtmlUtil.escape(input.getDossierText());
			String conditionText = HtmlUtil.escape(input.getConditionText());
			String durationText = HtmlUtil.escape(input.getDurationText());
			String applicantText = HtmlUtil.escape(input.getApplicantText());
			String resultText = HtmlUtil.escape(input.getResultText());
			String regularText = HtmlUtil.escape(input.getRegularText());
			String feeText = HtmlUtil.escape(input.getFeeText());
			String administrationCode = HtmlUtil.escape(input.getAdministrationCode());
			String domainCode = HtmlUtil.escape(input.getDomainCode());
			String active = HtmlUtil.escape(input.getActive());
			
			ServiceInfo serviceInfo = actions.updateServiceInfo(user.getUserId(), groupId, GetterUtil.getLong(id),
					serviceCode, serviceName, processText, methodText,
					dossierText, conditionText, durationText, applicantText,
					resultText, regularText, feeText, administrationCode,
					domainCode, input.getMaxLevel(), GetterUtil.getBoolean(active),
					serviceContext);

			serviceInfoInput = ServiceInfoUtils.mappingToServiceInfoInputModel(serviceInfo);

			return Response.status(200).entity(serviceInfoInput).build();

		} catch (Exception e) {

			return BusinessExceptionImpl.processException(e);
		}

	}

	@Override
	public Response deleteServiceInfo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		BackendAuth auth = new BackendAuthImpl();

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		ServiceInfoInputModel serviceInfoInput = new ServiceInfoInputModel();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, ServiceInfo.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			ServiceInfo serviceInfo = actions.removeServiceInfo(GetterUtil.getLong(id));

			if (Validator.isNotNull(serviceInfo)) {
				serviceInfoInput = ServiceInfoUtils.mappingToServiceInfoInputModel(serviceInfo);

				return Response.status(200).entity(serviceInfoInput).build();
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response getFileTemplatesOfServiceInfo(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id) {

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		FileTemplateResultsModel results = new FileTemplateResultsModel();

		try {

			JSONObject jsonData = actions.getServiceFileTemplate(GetterUtil.getLong(id));

			List<ServiceFileTemplate> fileTemplates = (List<ServiceFileTemplate>) jsonData.get("data");

			results.setTotal(jsonData.getInt("total"));
			results.getData().addAll(ServiceInfoUtils.mappingToFileTemplates(fileTemplates));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}

	}

	@Override
	public Response addFileTemplateToServiceInfo(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Attachment file, String id, String fileTemplateNo,
			String templateName, String fileType, int fileSize, String fileName) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		long userId = serviceContext.getUserId();

		ServiceFileTemplate serviceFileTemplate = null;

		BackendAuth auth = new BackendAuthImpl();

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		DataHandler dataHandler = file.getDataHandler();

		InputStream inputStream = null;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, ServiceInfo.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			inputStream = dataHandler.getInputStream();


			serviceFileTemplate = actions.addServiceFileTemplate(userId, groupId, GetterUtil.getLong(id),
					fileTemplateNo, templateName, fileName,
					inputStream, fileType, fileSize, serviceContext);

			FileTemplateModel result = ServiceInfoUtils.mappingToFileTemplateModel(serviceFileTemplate);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {

			return BusinessExceptionImpl.processException(e);
		}

	}

	public static byte[] getBytes(InputStream is) throws IOException {

		int len;
		int size = 1024;
		byte[] buf;

		if (is instanceof ByteArrayInputStream) {
			size = is.available();
			buf = new byte[size];
			is.read(buf, 0, size);
		} else {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			buf = new byte[size];
			while ((len = is.read(buf, 0, size)) != -1)
				bos.write(buf, 0, len);
			buf = bos.toByteArray();
		}
		return buf;
	}


	@Override
	public Response downloadFileTemplateOfServiceInfo(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String templateNo) {

		ServiceFileTemplatePK fileTemplatePK = new ServiceFileTemplatePK(GetterUtil.getLong(id), templateNo);

		try {
			ServiceFileTemplate fileTemplate = ServiceFileTemplateLocalServiceUtil
					.getServiceFileTemplate(fileTemplatePK);

			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileTemplate.getFileEntryId());

			File file = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(), fileEntry.getVersion(), true);

			ResponseBuilder responseBuilder = Response.ok((Object) file);

			responseBuilder.header("Content-Disposition", "attachment; filename=\"" + fileEntry.getFileName() + "\"");
			responseBuilder.header("Content-Type", fileEntry.getMimeType());

			return responseBuilder.build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);

		}

	}

	@Override
	public Response deleteFileTemplateOfServiceInfo(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String templateNo) {

		BackendAuth auth = new BackendAuthImpl();

		ServiceInfoActions actions = new ServiceInfoActionsImpl();

		ServiceFileTemplate serviceFileTemplate = null;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, ServiceInfo.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			serviceFileTemplate = actions.removeServiceFileTemplate(GetterUtil.getLong(id), templateNo);

			FileTemplateModel result = ServiceInfoUtils.mappingToFileTemplateModel(serviceFileTemplate);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {

			return BusinessExceptionImpl.processException(e);
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ServiceInfoManagementImpl.class);

	@Override
	public Response getStatisticByLevel(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, Request requestCC) {

		ServiceInfoActions actions = new ServiceInfoActionsImpl();
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		
		JSONObject results = JSONFactoryUtil.createJSONObject();
		
		try {
			results = actions.getStatisticByLevel(serviceContext, groupId);
			
//			_log.info(results);
			EntityTag etag = new EntityTag(Integer.toString(Long.valueOf(groupId).hashCode()));
		    ResponseBuilder builder = requestCC.evaluatePreconditions(etag);
		    
			if (OpenCPSConfigUtil.isHttpCacheEnable() && builder == null) {
				builder = Response.status(200);
				CacheControl cc = new CacheControl();
				cc.setMaxAge(OpenCPSConfigUtil.getHttpCacheMaxAge());
				cc.setPrivate(true);	
				builder.tag(etag);
				return builder.status(200).entity(JSONFactoryUtil.looseSerialize(results)).cacheControl(cc).build();
			}
			else {
				return Response.status(200).entity(JSONFactoryUtil.looseSerialize(results)).build();				
			}
		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response getStatisticByAgency(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, ServiceInfoSearchModel search, Request requestCC) {
		ServiceInfoActions actions = new ServiceInfoActionsImpl();
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		
		JSONObject results = JSONFactoryUtil.createJSONObject();
		
		try {
			//Sort agency
			Sort[] sorts = null;
			if (Validator.isNull(search.getSort())) {
				sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.CREATE_DATE + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(search.getOrder())) };
			} else {
				sorts = new Sort[] { SortFactoryUtil.create(search.getSort() + "_Number_sortable", Sort.INT_TYPE,
						GetterUtil.getBoolean(search.getOrder())) };
			}
			results = actions.getStatisticByAdministration(groupId, sorts, serviceContext);
			
//			_log.info(results);
			EntityTag etag = new EntityTag(Integer.toString(Long.valueOf(groupId).hashCode()));
		    ResponseBuilder builder = requestCC.evaluatePreconditions(etag);
			if (OpenCPSConfigUtil.isHttpCacheEnable() && builder == null) {
				builder = Response.status(200);
				CacheControl cc = new CacheControl();
				cc.setMaxAge(OpenCPSConfigUtil.getHttpCacheMaxAge());
				cc.setPrivate(true);	
				builder.tag(etag);
				return builder.status(200).entity(JSONFactoryUtil.looseSerialize(results)).cacheControl(cc).build();
			}
			else {
				return Response.status(200).entity(JSONFactoryUtil.looseSerialize(results)).build();
			}
		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response getStatisticByDomain(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String agency, ServiceInfoSearchModel search, Request requestCC) {
		ServiceInfoActions actions = new ServiceInfoActionsImpl();
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		
		JSONObject results = JSONFactoryUtil.createJSONObject();
		
		try {
			//Sort agency
			Sort[] sorts = null;
			if (Validator.isNull(search.getSort())) {
				sorts = new Sort[] { SortFactoryUtil.create(DossierTerm.CREATE_DATE + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(search.getOrder())) };
			} else {
				sorts = new Sort[] { SortFactoryUtil.create(search.getSort() + "_Number_sortable", Sort.INT_TYPE,
						GetterUtil.getBoolean(search.getOrder())) };
			}
			if (Validator.isNotNull(agency)) {
				results = actions.getStatisticByDomainFilterAdministration(groupId, sorts, serviceContext, agency);
			}
			else {
				results = actions.getStatisticByDomain(groupId, sorts, serviceContext);
			}
//			_log.info(results);
			EntityTag etag = new EntityTag(Integer.toString(Long.valueOf(groupId).hashCode()));
		    ResponseBuilder builder = requestCC.evaluatePreconditions(etag);
			if (OpenCPSConfigUtil.isHttpCacheEnable() && builder == null) {
				builder = Response.status(200);
				CacheControl cc = new CacheControl();
				cc.setMaxAge(OpenCPSConfigUtil.getHttpCacheMaxAge());
				cc.setPrivate(true);	
				builder.tag(etag);
				return builder.status(200).entity(JSONFactoryUtil.looseSerialize(results)).cacheControl(cc).build();
			}
			else {
				return Response.status(200).entity(JSONFactoryUtil.looseSerialize(results)).build();
			}
		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

}
