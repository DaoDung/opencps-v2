package org.opencps.usermgt.lifecycle;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.opencps.usermgt.model.UserLogin;
import org.opencps.usermgt.service.UserLoginLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

@Component (
	    immediate = true,
	    property = {
	        "key=logout.events.pre"
	    },
	    service = LifecycleAction.class
	)
public class OpenCPSLogoutAction extends Action {
    @Override
    public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
//        System.out.println("### Start Post Logout Action ######################");
        
        Long userId = request.getAttribute("USER_ID") != null ? (Long)request.getAttribute("USER_ID") : 0;
        
		String sessionId = request.getSession() != null ? request.getSession().getId() : StringPool.BLANK;
		try {
			UserLogin userLogin = UserLoginLocalServiceUtil.fetchByU_S(userId, sessionId);
			if (userLogin != null) {
				userLogin.setLogout(new Date());
				userLogin.setModifiedDate(new Date());
				userLogin = UserLoginLocalServiceUtil.updateUserLogin(userLogin);
				UserLoginLocalServiceUtil.traceLogout(userId, sessionId);
			}
		} catch (SystemException e) {
		} 
         
//        System.out.println("### End Post Logout Action ######################");
    }
}
