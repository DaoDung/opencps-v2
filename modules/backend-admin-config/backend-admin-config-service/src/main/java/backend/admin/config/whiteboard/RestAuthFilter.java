/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package backend.admin.config.whiteboard;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Binhth
 */
@Component(
	immediate = true,
	property = {
		"servlet-context-name=",
		"servlet-filter-name=Rest Auth Filter",
		"url-pattern=/o/v1/socket/*",
		"url-pattern=/o/v1/opencps/users/*"
		,
		"url-pattern=/o/rest/v2/*",
		"url-pattern=/o/rest/v2_1/*"
	}, service = Filter.class
)
public class RestAuthFilter implements Filter {

	public final static String P_AUTH = "Token";
	public final static String USER_ID = "USER_ID";
	public final static String AUTHORIZATION = "Authorization";
	public final static String[] IGNORE_PATTERN = new String[] { ".+/o/rest/v2/serviceinfos/\\w+/filetemplates/\\w+" };
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("RestAuthFilter.doFilter()");
		HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

		String pAuth = httpRequest.getHeader(P_AUTH);
		String path = httpRequest.getRequestURI();
		boolean exclude = false;
		for (String pattern : IGNORE_PATTERN) {
			if (path.matches(pattern)) {
				exclude = true;
				break;
			}
		}
		if (Validator.isNotNull(httpRequest.getParameter("Token"))) {
			pAuth = httpRequest.getParameter("Token");
		}
		if (exclude || AuthTokenUtil.getToken(httpRequest).equals(pAuth) || (Validator.isNotNull(httpRequest.getHeader("localaccess")) ? httpRequest.getHeader("localaccess").equals(pAuth) : false) ) {
			Object userObj = httpRequest.getSession(true).getAttribute(USER_ID);
			System.out.println("RestAuthFilter.doFilter()" + userObj);
			if (Validator.isNotNull(userObj)) {
				httpRequest.setAttribute(USER_ID, userObj);
				authOK(servletRequest, servletResponse, filterChain, (Long) userObj);
			} else {
				long sockId = Validator.isNotNull(httpRequest.getHeader("userid")) ? Long.valueOf(httpRequest.getHeader("userid")) : 0;
				httpRequest.setAttribute(USER_ID, sockId);
				authOK(servletRequest, servletResponse, filterChain, sockId);
			}
		
		} else {
			
			Enumeration<String> headerNames = httpRequest.getHeaderNames();
			
			boolean isBasic = false;
			String strBasic = StringPool.BLANK;
			
			if (headerNames != null) {
				while (headerNames.hasMoreElements()) {
		            String key = (String) headerNames.nextElement();
		            String value = httpRequest.getHeader(key);
		            if (key.trim().equalsIgnoreCase(AUTHORIZATION)) {
		            	strBasic = value;
		            	isBasic = true;
		            	break;
		            }
		        }
			}
			if (isBasic) {

				try {
					// Get encoded user and password, comes after "BASIC "  
			        String userpassEncoded = strBasic.substring(6);  
			        String decodetoken = new String(Base64.decode(userpassEncoded),
			                StringPool.UTF8);
			        String account[] = decodetoken.split(":");
			        
			        String email = account[0];
			        String password = account[1];
		        
					long userId = AuthenticatedSessionManagerUtil.getAuthenticatedUserId(httpRequest, email, password, CompanyConstants.AUTH_TYPE_EA);
				
					authOK(servletRequest, servletResponse, filterChain, userId);
					
				} catch (PortalException e) {
					authFailure(servletResponse);
				}

			} else {
				authFailure(servletResponse);
			}
			
		}

	}

	private void authOK(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain, long userId)
			throws IOException, ServletException {
		servletRequest.setAttribute(USER_ID, userId);
		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		response.addHeader("Access-Control-Allow-Origin", "*");
//		response.addHeader("Access-Control-Allow-Headers", "*");
//		response.addHeader("Access-Control-Allow-Methods", "DELETE,POST,GET,PUT,HEAD");
		
		filterChain.doFilter(servletRequest, response);
	}

	private void authFailure(ServletResponse servletResponse) throws IOException {
		servletResponse.setCharacterEncoding("UTF-8");
		servletResponse.setContentType("application/json; charset=utf-8");
		
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		// response.addHeader("Access-Control-Allow-Origin", "*");
		// response.addHeader("Access-Control-Allow-Headers", "*");
		// response.addHeader("Access-Control-Allow-Methods", "*");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = response.getWriter();												
		
		OpenCPSErrorDetails error = new OpenCPSErrorDetails(new Date(), "permission denied", "");
		
		out.println(error.toString());
		out.flush();
		out.close();
	}

	@Override
	public void init(FilterConfig filterConfig) {
	}

}