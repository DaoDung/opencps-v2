package org.opencps.dossiermgt.action.util;

import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

public class OpenCPSConfigUtil {
	public static final String OPENCPS_NOTIFICATION_ENABLE = "org.opencps.notification.enable";
	public static final String OPENCPS_CACHE_TTL = "cache.default.ttl.seconds";
	private static final int DEFAULT_TTL = 3600;
	public static final String OPENCPS_DOSSIER_LOG_ENABLE = "org.opencps.dossierlog.enable";
	public static final String OPENCPS_TRACK_USER_ENABLE = "org.opencps.trackuser.enable";
	public static final String OPENCPS_API_HTTP_CACHE_ENABLE = "org.opencps.api.httpcache.enable";
	public static final int DEFAULT_HTTP_CACHE_AGE = 86400;
	public static final String OPENCPS_API_HTTP_CACHE_MAX_AGE = "org.opencps.api.httpcache.maxage";
	public static final int DEFAULT_CONNECT_TIMEOUT = 0;
	public static final int DEFAULT_READ_TIMEOUT = 0;
	public static final String OPENCPS_REST_CONNECTION_TIMEOUT = "org.opencps.rest.connection.timeout";
	public static final String OPENCPS_REST_READ_TIMEOUT = "org.opencps.rest.read.timeout";
	
	public static boolean isNotificationEnable() {
	    String notificationEnableProperty = PropsUtil.get(OPENCPS_NOTIFICATION_ENABLE);
	    return Validator.isNotNull(notificationEnableProperty) ? Boolean.parseBoolean(notificationEnableProperty) : false;
	}
	
	public static int getCacheTTL() {
	    String cacheTTLProperty = PropsUtil.get(OPENCPS_CACHE_TTL);
	    return Validator.isNotNull(cacheTTLProperty) ? Integer.parseInt(cacheTTLProperty) : DEFAULT_TTL;
		
	}
	
	public static boolean isDossierLogEnable() {
		String dossierLogEnable = PropsUtil.get(OPENCPS_DOSSIER_LOG_ENABLE);
		return Validator.isNotNull(dossierLogEnable) ? Boolean.parseBoolean(dossierLogEnable) : false;
	}
	
	public static boolean isTrackUserEnable() {
		String trackUserEnable = PropsUtil.get(OPENCPS_TRACK_USER_ENABLE);
		return Validator.isNotNull(trackUserEnable) ? Boolean.parseBoolean(trackUserEnable) : false;
	}	

	public static boolean isHttpCacheEnable() {
		String httpCacheEnable = PropsUtil.get(OPENCPS_API_HTTP_CACHE_ENABLE);
		return Validator.isNotNull(httpCacheEnable) ? Boolean.parseBoolean(httpCacheEnable) : true;
	}	
	
	public static int getHttpCacheMaxAge() {
	    String httpCacheMaxAgeProperty = PropsUtil.get(OPENCPS_API_HTTP_CACHE_MAX_AGE);
	    return Validator.isNotNull(httpCacheMaxAgeProperty) ? Integer.parseInt(httpCacheMaxAgeProperty) : DEFAULT_HTTP_CACHE_AGE;
		
	}
	
	public static int getRestConnectionTimeout() {
	    String connectionTimeoutProperty = PropsUtil.get(OPENCPS_REST_CONNECTION_TIMEOUT);
	    return Validator.isNotNull(connectionTimeoutProperty) ? Integer.parseInt(connectionTimeoutProperty) : DEFAULT_CONNECT_TIMEOUT;
		
	}
	
	public static int getRestReadTimeout() {
	    String readTimeoutProperty = PropsUtil.get(OPENCPS_REST_READ_TIMEOUT);
	    return Validator.isNotNull(readTimeoutProperty) ? Integer.parseInt(readTimeoutProperty) : DEFAULT_READ_TIMEOUT;
		
	}
}
