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

package org.opencps.dossiermgt.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.opencps.dossiermgt.exception.NoSuchDossierActionException;
import org.opencps.dossiermgt.model.DossierAction;

/**
 * The persistence interface for the dossier action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see org.opencps.dossiermgt.service.persistence.impl.DossierActionPersistenceImpl
 * @see DossierActionUtil
 * @generated
 */
@ProviderType
public interface DossierActionPersistence extends BasePersistence<DossierAction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierActionUtil} to access the dossier action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossier actions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid(String uuid);

	/**
	* Returns a range of all the dossier actions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid(String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the dossier actions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where uuid = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByUuid_PrevAndNext(long dossierActionId,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of dossier actions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dossier actions
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the dossier action where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierActionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByUUID_G(String uuid, long groupId)
		throws NoSuchDossierActionException;

	/**
	* Returns the dossier action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the dossier action where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the dossier action where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dossier action that was removed
	*/
	public DossierAction removeByUUID_G(String uuid, long groupId)
		throws NoSuchDossierActionException;

	/**
	* Returns the number of dossier actions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dossier actions
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the dossier actions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid_C(String uuid,
		long companyId);

	/**
	* Returns a range of all the dossier actions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid_C(String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByUuid_C_PrevAndNext(long dossierActionId,
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of dossier actions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dossier actions
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns the dossier action where dossierId = &#63; and pending = &#63; or throws a {@link NoSuchDossierActionException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param pending the pending
	* @return the matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_DPG(long dossierId, boolean pending)
		throws NoSuchDossierActionException;

	/**
	* Returns the dossier action where dossierId = &#63; and pending = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param pending the pending
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_DPG(long dossierId, boolean pending);

	/**
	* Returns the dossier action where dossierId = &#63; and pending = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param pending the pending
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_DPG(long dossierId, boolean pending,
		boolean retrieveFromCache);

	/**
	* Removes the dossier action where dossierId = &#63; and pending = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param pending the pending
	* @return the dossier action that was removed
	*/
	public DossierAction removeByDID_DPG(long dossierId, boolean pending)
		throws NoSuchDossierActionException;

	/**
	* Returns the number of dossier actions where dossierId = &#63; and pending = &#63;.
	*
	* @param dossierId the dossier ID
	* @param pending the pending
	* @return the number of matching dossier actions
	*/
	public int countByDID_DPG(long dossierId, boolean pending);

	/**
	* Returns the dossier action where dossierId = &#63; and nextActionId = &#63; or throws a {@link NoSuchDossierActionException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param nextActionId the next action ID
	* @return the matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_NACTID(long dossierId, long nextActionId)
		throws NoSuchDossierActionException;

	/**
	* Returns the dossier action where dossierId = &#63; and nextActionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param nextActionId the next action ID
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_NACTID(long dossierId, long nextActionId);

	/**
	* Returns the dossier action where dossierId = &#63; and nextActionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param nextActionId the next action ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_NACTID(long dossierId, long nextActionId,
		boolean retrieveFromCache);

	/**
	* Removes the dossier action where dossierId = &#63; and nextActionId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param nextActionId the next action ID
	* @return the dossier action that was removed
	*/
	public DossierAction removeByDID_NACTID(long dossierId, long nextActionId)
		throws NoSuchDossierActionException;

	/**
	* Returns the number of dossier actions where dossierId = &#63; and nextActionId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param nextActionId the next action ID
	* @return the number of matching dossier actions
	*/
	public int countByDID_NACTID(long dossierId, long nextActionId);

	/**
	* Returns the dossier action where dossierId = &#63; and actionCode = &#63; or throws a {@link NoSuchDossierActionException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @return the matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_ACTC(long dossierId, String actionCode)
		throws NoSuchDossierActionException;

	/**
	* Returns the dossier action where dossierId = &#63; and actionCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_ACTC(long dossierId, String actionCode);

	/**
	* Returns the dossier action where dossierId = &#63; and actionCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_ACTC(long dossierId, String actionCode,
		boolean retrieveFromCache);

	/**
	* Removes the dossier action where dossierId = &#63; and actionCode = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @return the dossier action that was removed
	*/
	public DossierAction removeByDID_ACTC(long dossierId, String actionCode)
		throws NoSuchDossierActionException;

	/**
	* Returns the number of dossier actions where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @return the number of matching dossier actions
	*/
	public int countByDID_ACTC(long dossierId, String actionCode);

	/**
	* Returns the dossier action where dossierId = &#63; and userId = &#63; or throws a {@link NoSuchDossierActionException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @return the matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_UID(long dossierId, long userId)
		throws NoSuchDossierActionException;

	/**
	* Returns the dossier action where dossierId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_UID(long dossierId, long userId);

	/**
	* Returns the dossier action where dossierId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_UID(long dossierId, long userId,
		boolean retrieveFromCache);

	/**
	* Removes the dossier action where dossierId = &#63; and userId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @return the dossier action that was removed
	*/
	public DossierAction removeByDID_UID(long dossierId, long userId)
		throws NoSuchDossierActionException;

	/**
	* Returns the number of dossier actions where dossierId = &#63; and userId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @return the number of matching dossier actions
	*/
	public int countByDID_UID(long dossierId, long userId);

	/**
	* Returns all the dossier actions where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID(long dossierId);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID(long dossierId, int start,
		int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID(long dossierId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID(long dossierId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where dossierId = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByDID_PrevAndNext(long dossierActionId,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeByDID(long dossierId);

	/**
	* Returns the number of dossier actions where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching dossier actions
	*/
	public int countByDID(long dossierId);

	/**
	* Returns all the dossier actions where groupId = &#63; and pending = &#63;.
	*
	* @param groupId the group ID
	* @param pending the pending
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_PENDING(long groupId,
		boolean pending);

	/**
	* Returns a range of all the dossier actions where groupId = &#63; and pending = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_PENDING(long groupId,
		boolean pending, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where groupId = &#63; and pending = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_PENDING(long groupId,
		boolean pending, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where groupId = &#63; and pending = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_PENDING(long groupId,
		boolean pending, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where groupId = &#63; and pending = &#63;.
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByG_PENDING_First(long groupId, boolean pending,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where groupId = &#63; and pending = &#63;.
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByG_PENDING_First(long groupId, boolean pending,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where groupId = &#63; and pending = &#63;.
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByG_PENDING_Last(long groupId, boolean pending,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where groupId = &#63; and pending = &#63;.
	*
	* @param groupId the group ID
	* @param pending the pending
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByG_PENDING_Last(long groupId, boolean pending,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where groupId = &#63; and pending = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param groupId the group ID
	* @param pending the pending
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByG_PENDING_PrevAndNext(long dossierActionId,
		long groupId, boolean pending,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where groupId = &#63; and pending = &#63; from the database.
	*
	* @param groupId the group ID
	* @param pending the pending
	*/
	public void removeByG_PENDING(long groupId, boolean pending);

	/**
	* Returns the number of dossier actions where groupId = &#63; and pending = &#63;.
	*
	* @param groupId the group ID
	* @param pending the pending
	* @return the number of matching dossier actions
	*/
	public int countByG_PENDING(long groupId, boolean pending);

	/**
	* Returns all the dossier actions where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSN(long dossierId,
		String fromSequenceNo);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSN(long dossierId,
		String fromSequenceNo, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSN(long dossierId,
		String fromSequenceNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSN(long dossierId,
		String fromSequenceNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_FSN_First(long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_FSN_First(long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_FSN_Last(long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_FSN_Last(long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByDID_FSN_PrevAndNext(long dossierActionId,
		long dossierId, String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where dossierId = &#63; and fromSequenceNo = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	*/
	public void removeByDID_FSN(long dossierId, String fromSequenceNo);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @return the number of matching dossier actions
	*/
	public int countByDID_FSN(long dossierId, String fromSequenceNo);

	/**
	* Returns all the dossier actions where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_SN(long groupId,
		long dossierId, String sequenceNo);

	/**
	* Returns a range of all the dossier actions where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_SN(long groupId,
		long dossierId, String sequenceNo, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_SN(long groupId,
		long dossierId, String sequenceNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_SN(long groupId,
		long dossierId, String sequenceNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByG_DID_SN_First(long groupId, long dossierId,
		String sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByG_DID_SN_First(long groupId, long dossierId,
		String sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByG_DID_SN_Last(long groupId, long dossierId,
		String sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByG_DID_SN_Last(long groupId, long dossierId,
		String sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByG_DID_SN_PrevAndNext(long dossierActionId,
		long groupId, long dossierId, String sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	*/
	public void removeByG_DID_SN(long groupId, long dossierId, String sequenceNo);

	/**
	* Returns the number of dossier actions where groupId = &#63; and dossierId = &#63; and sequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param sequenceNo the sequence no
	* @return the number of matching dossier actions
	*/
	public int countByG_DID_SN(long groupId, long dossierId, String sequenceNo);

	/**
	* Returns all the dossier actions where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_FSN(long groupId,
		long dossierId, String fromSequenceNo);

	/**
	* Returns a range of all the dossier actions where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_FSN(long groupId,
		long dossierId, String fromSequenceNo, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_FSN(long groupId,
		long dossierId, String fromSequenceNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByG_DID_FSN(long groupId,
		long dossierId, String fromSequenceNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByG_DID_FSN_First(long groupId, long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByG_DID_FSN_First(long groupId, long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByG_DID_FSN_Last(long groupId, long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByG_DID_FSN_Last(long groupId, long dossierId,
		String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByG_DID_FSN_PrevAndNext(long dossierActionId,
		long groupId, long dossierId, String fromSequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	*/
	public void removeByG_DID_FSN(long groupId, long dossierId,
		String fromSequenceNo);

	/**
	* Returns the number of dossier actions where groupId = &#63; and dossierId = &#63; and fromSequenceNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param fromSequenceNo the from sequence no
	* @return the number of matching dossier actions
	*/
	public int countByG_DID_FSN(long groupId, long dossierId,
		String fromSequenceNo);

	/**
	* Returns all the dossier actions where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_STEP(long dossierId,
		String fromStepCode);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and fromStepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_STEP(long dossierId,
		String fromStepCode, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and fromStepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_STEP(long dossierId,
		String fromStepCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and fromStepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_STEP(long dossierId,
		String fromStepCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_STEP_First(long dossierId,
		String fromStepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_STEP_First(long dossierId,
		String fromStepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_STEP_Last(long dossierId,
		String fromStepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_STEP_Last(long dossierId,
		String fromStepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByDID_STEP_PrevAndNext(long dossierActionId,
		long dossierId, String fromStepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where dossierId = &#63; and fromStepCode = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	*/
	public void removeByDID_STEP(long dossierId, String fromStepCode);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and fromStepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @return the number of matching dossier actions
	*/
	public int countByDID_STEP(long dossierId, String fromStepCode);

	/**
	* Returns all the dossier actions where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC(long dossierId,
		String stepCode);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and stepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC(long dossierId,
		String stepCode, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and stepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC(long dossierId,
		String stepCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and stepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC(long dossierId,
		String stepCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_SC_First(long dossierId, String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_SC_First(long dossierId, String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_SC_Last(long dossierId, String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_SC_Last(long dossierId, String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByDID_SC_PrevAndNext(long dossierActionId,
		long dossierId, String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where dossierId = &#63; and stepCode = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	*/
	public void removeByDID_SC(long dossierId, String stepCode);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @return the number of matching dossier actions
	*/
	public int countByDID_SC(long dossierId, String stepCode);

	/**
	* Returns all the dossier actions where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_CODE(long dossierId,
		String actionCode);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and actionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_CODE(long dossierId,
		String actionCode, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and actionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_CODE(long dossierId,
		String actionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and actionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_CODE(long dossierId,
		String actionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_CODE_First(long dossierId,
		String actionCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_CODE_First(long dossierId,
		String actionCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_CODE_Last(long dossierId, String actionCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_CODE_Last(long dossierId,
		String actionCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByDID_CODE_PrevAndNext(long dossierActionId,
		long dossierId, String actionCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where dossierId = &#63; and actionCode = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	*/
	public void removeByDID_CODE(long dossierId, String actionCode);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and actionCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actionCode the action code
	* @return the number of matching dossier actions
	*/
	public int countByDID_CODE(long dossierId, String actionCode);

	/**
	* Returns all the dossier actions where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_U_SC(long dossierId,
		long userId, String stepCode);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_U_SC(long dossierId,
		long userId, String stepCode, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_U_SC(long dossierId,
		long userId, String stepCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_U_SC(long dossierId,
		long userId, String stepCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_U_SC_First(long dossierId, long userId,
		String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_U_SC_First(long dossierId, long userId,
		String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_U_SC_Last(long dossierId, long userId,
		String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_U_SC_Last(long dossierId, long userId,
		String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the dossier actions before and after the current dossier action in the ordered set where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierActionId the primary key of the current dossier action
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction[] findByDID_U_SC_PrevAndNext(long dossierActionId,
		long dossierId, long userId, String stepCode,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Removes all the dossier actions where dossierId = &#63; and userId = &#63; and stepCode = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	*/
	public void removeByDID_U_SC(long dossierId, long userId, String stepCode);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and userId = &#63; and stepCode = &#63;.
	*
	* @param dossierId the dossier ID
	* @param userId the user ID
	* @param stepCode the step code
	* @return the number of matching dossier actions
	*/
	public int countByDID_U_SC(long dossierId, long userId, String stepCode);

	/**
	* Returns all the dossier actions where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC_NOT_DAI(long dossierId,
		String stepCode, long dossierActionId);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC_NOT_DAI(long dossierId,
		String stepCode, long dossierActionId, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC_NOT_DAI(long dossierId,
		String stepCode, long dossierActionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_SC_NOT_DAI(long dossierId,
		String stepCode, long dossierActionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_SC_NOT_DAI_First(long dossierId,
		String stepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_SC_NOT_DAI_First(long dossierId,
		String stepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_SC_NOT_DAI_Last(long dossierId,
		String stepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_SC_NOT_DAI_Last(long dossierId,
		String stepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Removes all the dossier actions where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	*/
	public void removeByDID_SC_NOT_DAI(long dossierId, String stepCode,
		long dossierActionId);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and stepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param stepCode the step code
	* @param dossierActionId the dossier action ID
	* @return the number of matching dossier actions
	*/
	public int countByDID_SC_NOT_DAI(long dossierId, String stepCode,
		long dossierActionId);

	/**
	* Returns all the dossier actions where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @return the matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSC_NOT_DAI(long dossierId,
		String fromStepCode, long dossierActionId);

	/**
	* Returns a range of all the dossier actions where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSC_NOT_DAI(long dossierId,
		String fromStepCode, long dossierActionId, int start, int end);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSC_NOT_DAI(long dossierId,
		String fromStepCode, long dossierActionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier actions
	*/
	public java.util.List<DossierAction> findByDID_FSC_NOT_DAI(long dossierId,
		String fromStepCode, long dossierActionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_FSC_NOT_DAI_First(long dossierId,
		String fromStepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the first dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_FSC_NOT_DAI_First(long dossierId,
		String fromStepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action
	* @throws NoSuchDossierActionException if a matching dossier action could not be found
	*/
	public DossierAction findByDID_FSC_NOT_DAI_Last(long dossierId,
		String fromStepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator)
		throws NoSuchDossierActionException;

	/**
	* Returns the last dossier action in the ordered set where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public DossierAction fetchByDID_FSC_NOT_DAI_Last(long dossierId,
		String fromStepCode, long dossierActionId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Removes all the dossier actions where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	*/
	public void removeByDID_FSC_NOT_DAI(long dossierId, String fromStepCode,
		long dossierActionId);

	/**
	* Returns the number of dossier actions where dossierId = &#63; and fromStepCode = &#63; and dossierActionId &ne; &#63;.
	*
	* @param dossierId the dossier ID
	* @param fromStepCode the from step code
	* @param dossierActionId the dossier action ID
	* @return the number of matching dossier actions
	*/
	public int countByDID_FSC_NOT_DAI(long dossierId, String fromStepCode,
		long dossierActionId);

	/**
	* Caches the dossier action in the entity cache if it is enabled.
	*
	* @param dossierAction the dossier action
	*/
	public void cacheResult(DossierAction dossierAction);

	/**
	* Caches the dossier actions in the entity cache if it is enabled.
	*
	* @param dossierActions the dossier actions
	*/
	public void cacheResult(java.util.List<DossierAction> dossierActions);

	/**
	* Creates a new dossier action with the primary key. Does not add the dossier action to the database.
	*
	* @param dossierActionId the primary key for the new dossier action
	* @return the new dossier action
	*/
	public DossierAction create(long dossierActionId);

	/**
	* Removes the dossier action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierActionId the primary key of the dossier action
	* @return the dossier action that was removed
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction remove(long dossierActionId)
		throws NoSuchDossierActionException;

	public DossierAction updateImpl(DossierAction dossierAction);

	/**
	* Returns the dossier action with the primary key or throws a {@link NoSuchDossierActionException} if it could not be found.
	*
	* @param dossierActionId the primary key of the dossier action
	* @return the dossier action
	* @throws NoSuchDossierActionException if a dossier action with the primary key could not be found
	*/
	public DossierAction findByPrimaryKey(long dossierActionId)
		throws NoSuchDossierActionException;

	/**
	* Returns the dossier action with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierActionId the primary key of the dossier action
	* @return the dossier action, or <code>null</code> if a dossier action with the primary key could not be found
	*/
	public DossierAction fetchByPrimaryKey(long dossierActionId);

	@Override
	public java.util.Map<java.io.Serializable, DossierAction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dossier actions.
	*
	* @return the dossier actions
	*/
	public java.util.List<DossierAction> findAll();

	/**
	* Returns a range of all the dossier actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of dossier actions
	*/
	public java.util.List<DossierAction> findAll(int start, int end);

	/**
	* Returns an ordered range of all the dossier actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier actions
	*/
	public java.util.List<DossierAction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator);

	/**
	* Returns an ordered range of all the dossier actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dossier actions
	*/
	public java.util.List<DossierAction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dossier actions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dossier actions.
	*
	* @return the number of dossier actions
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}