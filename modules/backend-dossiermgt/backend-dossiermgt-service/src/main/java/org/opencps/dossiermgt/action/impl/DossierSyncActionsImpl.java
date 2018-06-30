package org.opencps.dossiermgt.action.impl;

import java.util.List;

import org.opencps.dossiermgt.action.DossierSyncActions;
import org.opencps.dossiermgt.model.DossierSync;
import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.ServiceContext;

public class DossierSyncActionsImpl implements DossierSyncActions{

	private static Log _log = LogFactoryUtil.getLog(DossierSyncActionsImpl.class);
	@Override
	public JSONObject getDossierSyncList(long userId, String action, int syncType, Sort[] sorts, Integer start,
			Integer end, ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
//		SearchContext searchContext = new SearchContext();

		try {
			List<DossierSync> docList = DossierSyncLocalServiceUtil.getDossierSyncList(action, syncType, start, end);
			if (docList != null && docList.size() > 0) {
				_log.info("docList:"+docList);
			}
			result.put("data", docList);
			
			long total = DossierSyncLocalServiceUtil.countDossierSyncList(action, syncType);
			_log.info("total:"+total);
			result.put("total", total);
//			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return result;
	}
	@Override
	public JSONObject getDossierSyncById(long userId, Long dossierId, Integer model, int actionCodeNo, Sort[] sorts, Integer start, Integer end,
			ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
//		SearchContext searchContext = new SearchContext();

		try {
			List<DossierSync> docList = DossierSyncLocalServiceUtil.getDossierSyncByIdList(dossierId, model, actionCodeNo, start, end);
			if (docList != null && docList.size() > 0) {
				_log.info("docList:"+docList);
			}
			result.put("data", docList);
			
			long total = DossierSyncLocalServiceUtil.countDossierSyncByIdList(dossierId, model, actionCodeNo);
			_log.info("total:"+total);
			result.put("total", total);
//			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return result;
	}

}
