package backend.api.rest.application.v21;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import com.liferay.portal.kernel.model.User;

import backend.api.rest.application.v21.impl.ActionConfigApiImpl;
import backend.api.rest.application.v21.impl.DocumentTypeApiImpl;
import backend.api.rest.application.v21.impl.DossierDocumentApiImpl;
import backend.api.rest.application.v21.impl.DossierSyncApiImpl;
import backend.api.rest.application.v21.impl.MenuConfigApiImpl;
import backend.api.rest.application.v21.impl.StatisticApiImpl;
import backend.api.rest.application.v21.impl.StatisticReportApiImpl;
import backend.api.rest.application.v21.impl.StepConfigApiImpl;

/**
 * @author binhth
 */
@Component( 
property = { 
    JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/secure/rest/v2_1", 
    JaxrsWhiteboardConstants.JAX_RS_NAME + "=OpenCPS.restv2_1"
}, 
service = Application.class)
public class BackendAPIRestApplicationV2 extends Application {

	@Reference
	private UserContextProvider _userContextProvider;
	@Reference
	private CompanyContextProvider _companyContextProvider;
	@Reference
	private LocaleContextProvider _localeContextProvider;
	@Reference
	private ServiceContextProvider _serviceContextProvider;

	@Override
	public Set<Object> getSingletons() {

		Set<Object> singletons = new HashSet<>();

		singletons.add(_userContextProvider);
		singletons.add(_companyContextProvider);
		singletons.add(_localeContextProvider);
		singletons.add(_serviceContextProvider);
		
		singletons.add(new ActionConfigApiImpl());
		singletons.add(new MenuConfigApiImpl());
		singletons.add(new StepConfigApiImpl());
		singletons.add(new DocumentTypeApiImpl());
		singletons.add(new StatisticApiImpl());
		singletons.add(new DossierSyncApiImpl());
		singletons.add(new DossierDocumentApiImpl());
		singletons.add(new StatisticReportApiImpl());
		
		singletons.add(this);
		
		return singletons;	
	}
}