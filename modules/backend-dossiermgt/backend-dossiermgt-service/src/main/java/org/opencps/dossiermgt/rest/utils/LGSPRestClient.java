package org.opencps.dossiermgt.rest.utils;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.HttpMethod;

import org.opencps.dossiermgt.lgsp.model.MResult;
import org.opencps.dossiermgt.lgsp.model.Mtoken;
import org.opencps.dossiermgt.model.DossierStatistic;
import org.opencps.dossiermgt.rest.model.DossierPublishModel;
import org.opencps.dossiermgt.scheduler.InvokeREST;
import org.opencps.dossiermgt.service.DossierStatisticLocalServiceUtil;

public class LGSPRestClient {
	private Log _log = LogFactoryUtil.getLog(LGSPRestClient.class);
	private String consumerKey;
	private String consumerSecret;
	private String consumerAdapter;
	
	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	private String baseUrl;

	public LGSPRestClient(String baseUrl) {
		if (baseUrl.charAt(baseUrl.length() - 1) == '/' && baseUrl.length() >= 2) {
			this.baseUrl = baseUrl.substring(0, baseUrl.length() - 2);
		} else {
			this.baseUrl = baseUrl;
		}
	}

	private static final String DOSSIERS_BASE_PATH = "/Document";
	private static final String TOKEN_BASE_PATH = "/token";
	private static final String STATISTICS_BASE_PATH = "/Statistic";
	
	public static LGSPRestClient fromJSONObject(JSONObject configObj) {
		if (configObj.has(SyncServerTerm.CONSUMER_KEY) 
				&& configObj.has(SyncServerTerm.CONSUMER_SECRET)
				&& configObj.has(SyncServerTerm.SERVER_URL)
				&& configObj.has(SyncServerTerm.CONSUMER_ADAPTER)
				) {
			return new LGSPRestClient(
					configObj.getString(SyncServerTerm.CONSUMER_KEY), 
					configObj.getString(SyncServerTerm.CONSUMER_SECRET),
					configObj.getString(SyncServerTerm.SERVER_URL),
					configObj.getString(SyncServerTerm.CONSUMER_ADAPTER));
		}
		else {
			return null;
		}
	}
	
	public LGSPRestClient(String consumerKey, String consumerSecret, String baseUrl, String consumerAdapter) {
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
		if (baseUrl.charAt(baseUrl.length() - 1) == '/' && baseUrl.length() >= 2) {
			this.baseUrl = baseUrl.substring(0, baseUrl.length() - 2);
		}
		else {
			this.baseUrl = baseUrl;
		}
		if (consumerAdapter.charAt(consumerAdapter.length() - 1) == '/' && consumerAdapter.length() >= 2) {
			this.consumerAdapter = consumerAdapter.substring(0, consumerAdapter.length() - 2);
		}
		else {
			this.consumerAdapter = consumerAdapter;
		}		
	}
	
	public Mtoken getToken() {
		Mtoken result = null;
		InvokeREST callRest = new InvokeREST();
		HashMap<String, String> properties = new HashMap<String, String>();
		Map<String, Object> params = new HashMap<>();
		params.put("grant_type", "client_credentials");
		params.put("client_secret", consumerSecret);
		params.put("client_id", consumerKey);
		
		JSONObject resultObj = callRest.callPostAPI(HttpMethod.POST, "application/json",
				baseUrl, TOKEN_BASE_PATH, properties, params);
//		_log.info("====lGSP token====" + resultObj.toJSONString());
		if (resultObj != null && resultObj.has("status")
				&& resultObj.getInt("status") == 200) {
			try {
				result = OpenCPSConverter.convertMtoken(JSONFactoryUtil.createJSONObject(resultObj.getString("message")));
			} catch (JSONException e) {
				_log.debug(e);
			}
		}
		
		return result;
	}	
	
	public MResult publishDossier(String token, DossierPublishModel model) {
		MResult result = new MResult();
		InvokeREST callRest = new InvokeREST();

		JSONObject lgspObj = OpenCPSConverter.convertDossierToLGSPJSON(model);
		JSONObject resultObj = callRest.callPostAPIRaw(token, HttpMethod.POST, "application/json",
			consumerAdapter, DOSSIERS_BASE_PATH + "/SyncDocument", lgspObj.toJSONString());
		if (resultObj != null && resultObj.has("status")) {
			result.setStatus(resultObj.getInt("status"));
			result.setMessage(resultObj.getString("message"));
		}
		
		return result;
	}
	
	public MResult postDocumentTrace(String token, long dossierId) {
		MResult result = new MResult();
		InvokeREST callRest = new InvokeREST();

		JSONObject lgspObj = OpenCPSConverter.convertToDocumentTraces(dossierId);
		JSONObject resultObj = callRest.callPostAPIRaw(token, HttpMethod.POST, "application/json",
			consumerAdapter, DOSSIERS_BASE_PATH + "/UpdateDocumentTraces", lgspObj.toJSONString());
		if (resultObj != null && resultObj.has("status")) {
			result.setStatus(resultObj.getInt("status"));
			result.setMessage(resultObj.getString("message"));
		}
		
		return result;		
	}
	
	public MResult updateStatisticsMonth(String token, long groupId, int month, int year) {
		MResult result = new MResult();
		InvokeREST callRest = new InvokeREST();

		DossierStatistic statistic = DossierStatisticLocalServiceUtil.fetchByG_M_Y(groupId, month, year);
		if (statistic != null) {
			JSONObject lgspObj = OpenCPSConverter.convertStatisticsToLGSPJSON(statistic);
			JSONObject resultObj = callRest.callPostAPIRaw(token, HttpMethod.POST, "application/json",
				consumerAdapter, STATISTICS_BASE_PATH + "/UpdateStatistic ", lgspObj.toJSONString());
			if (resultObj != null && resultObj.has("status")) {
				result.setStatus(resultObj.getInt("status"));
				result.setMessage(resultObj.getString("message"));
			}			
		}
		
		return result;
	}
}
