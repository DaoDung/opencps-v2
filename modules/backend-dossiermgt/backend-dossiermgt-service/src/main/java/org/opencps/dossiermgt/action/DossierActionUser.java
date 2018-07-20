package org.opencps.dossiermgt.action;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.service.persistence.DossierActionUserPK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;

public interface DossierActionUser {
	public org.opencps.dossiermgt.model.DossierActionUser addDossierActionUser(
			org.opencps.dossiermgt.model.DossierActionUser dossierActionUser);

	public org.opencps.dossiermgt.model.DossierActionUser updateDossierActionUser(
			org.opencps.dossiermgt.model.DossierActionUser dossierActionUser);

	public org.opencps.dossiermgt.model.DossierActionUser deleteDossierActionUser(
			DossierActionUserPK dossierActionUserPK) throws PortalException;

	public void initDossierActionUser(Dossier dossier, int allowAssignUser, long dossierActionId, long userId, long groupId, long assignedUserId) throws PortalException;
	
	public void assignDossierActionUser(Dossier dossier, int allowAssignUser, long dossierActionId, long userId, long groupId, long assignUserId, JSONArray subUsers) throws PortalException;

	public void copyRoleAsStep(ProcessStep curStep, Dossier dossier);
}
