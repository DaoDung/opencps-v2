package org.opencps.statistic.rest.facade;

import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.HashMap;

import org.opencps.statistic.rest.dto.GovAgencyRequest;
import org.opencps.statistic.rest.dto.GovAgencyResponse;
import org.opencps.statistic.rest.util.DossierStatisticConfig;
import org.opencps.statistic.rest.util.DossierStatisticConstants;
import org.opencps.statistic.rest.util.ServerConfigContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import opencps.statistic.common.webservice.exception.UpstreamServiceFailedException;
import opencps.statistic.common.webservice.exception.UpstreamServiceTimedOutException;
import opencps.statistic.common.webservice.facade.OpencpsRestFacade;

public class OpencpsCallGovAgencyRestFacadeImpl extends OpencpsRestFacade<GovAgencyRequest, GovAgencyResponse>
		implements OpencpsCallRestFacade<GovAgencyRequest, GovAgencyResponse> {

	//private final static Logger LOG = LoggerFactory.getLogger(OpencpsCallGovAgencyRestFacadeImpl.class);
	
	@Override
	public GovAgencyResponse callRestService(GovAgencyRequest payload)
			throws UpstreamServiceTimedOutException, UpstreamServiceFailedException {
		return makeServiceCall(payload);
	}

	@Override
	protected GovAgencyResponse makeServiceCall(GovAgencyRequest payload)
			throws UpstreamServiceTimedOutException, UpstreamServiceFailedException {
		
		MultiValueMap<String, String> urlQueryParams = new LinkedMultiValueMap<>();
		
		String endPoint = DossierStatisticConfig.get(DossierStatisticConstants.GOV_AGENCY_ENDPOINT);
		
		//LOG.info(endPoint);
		
		// get the params for EE
		HashMap<String, String> urlPathSegments = new HashMap<>();

		// build the url
		String url = buildUrl(endPoint, urlPathSegments, urlQueryParams);

		HttpHeaders httpHeaders = new HttpHeaders();
		
		httpHeaders.add(DossierStatisticConstants.GROUP_ID, Long.toString(payload.getGroupId()));
		if (Validator.isNotNull(PropsUtil.get(ServerConfigContants.SERVER_SYNC_KEY))
				&& Validator.isNotNull(PropsUtil.get(ServerConfigContants.SERVER_SYNC_SECRET))) {
			setHttpHeadersAuthorization(httpHeaders, PropsUtil.get(ServerConfigContants.SERVER_SYNC_KEY), PropsUtil.get(ServerConfigContants.SERVER_SYNC_SECRET));
		}
		else {
			httpHeaders.add("Authorization", "Basic " + DossierStatisticConfig.get(DossierStatisticConstants.OPENCPS_AUTHENCATION));
		}
		
		return executeGenericRestCall(url, HttpMethod.GET, httpHeaders, payload, GovAgencyResponse.class).getBody();

	}

}
