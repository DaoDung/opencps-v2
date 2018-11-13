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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.MenuRole;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the menu role service. This utility wraps {@link org.opencps.dossiermgt.service.persistence.impl.MenuRolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MenuRolePersistence
 * @see org.opencps.dossiermgt.service.persistence.impl.MenuRolePersistenceImpl
 * @generated
 */
@ProviderType
public class MenuRoleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(MenuRole menuRole) {
		getPersistence().clearCache(menuRole);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MenuRole> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MenuRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MenuRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MenuRole update(MenuRole menuRole) {
		return getPersistence().update(menuRole);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MenuRole update(MenuRole menuRole,
		ServiceContext serviceContext) {
		return getPersistence().update(menuRole, serviceContext);
	}

	/**
	* Returns all the menu roles where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching menu roles
	*/
	public static List<MenuRole> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the menu roles where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @return the range of matching menu roles
	*/
	public static List<MenuRole> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the menu roles where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching menu roles
	*/
	public static List<MenuRole> findByUuid(String uuid, int start, int end,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the menu roles where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching menu roles
	*/
	public static List<MenuRole> findByUuid(String uuid, int start, int end,
		OrderByComparator<MenuRole> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first menu role in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu role
	* @throws NoSuchMenuRoleException if a matching menu role could not be found
	*/
	public static MenuRole findByUuid_First(String uuid,
		OrderByComparator<MenuRole> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first menu role in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu role, or <code>null</code> if a matching menu role could not be found
	*/
	public static MenuRole fetchByUuid_First(String uuid,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last menu role in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu role
	* @throws NoSuchMenuRoleException if a matching menu role could not be found
	*/
	public static MenuRole findByUuid_Last(String uuid,
		OrderByComparator<MenuRole> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last menu role in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu role, or <code>null</code> if a matching menu role could not be found
	*/
	public static MenuRole fetchByUuid_Last(String uuid,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the menu roles before and after the current menu role in the ordered set where uuid = &#63;.
	*
	* @param menuRoleId the primary key of the current menu role
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next menu role
	* @throws NoSuchMenuRoleException if a menu role with the primary key could not be found
	*/
	public static MenuRole[] findByUuid_PrevAndNext(long menuRoleId,
		String uuid, OrderByComparator<MenuRole> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence()
				   .findByUuid_PrevAndNext(menuRoleId, uuid, orderByComparator);
	}

	/**
	* Removes all the menu roles where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of menu roles where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching menu roles
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the menu roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long roleId) {
		return getPersistence().findByF_RID(roleId);
	}

	/**
	* Returns a range of all the menu roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @return the range of matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long roleId, int start, int end) {
		return getPersistence().findByF_RID(roleId, start, end);
	}

	/**
	* Returns an ordered range of all the menu roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long roleId, int start, int end,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence()
				   .findByF_RID(roleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the menu roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long roleId, int start, int end,
		OrderByComparator<MenuRole> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_RID(roleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first menu role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu role
	* @throws NoSuchMenuRoleException if a matching menu role could not be found
	*/
	public static MenuRole findByF_RID_First(long roleId,
		OrderByComparator<MenuRole> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().findByF_RID_First(roleId, orderByComparator);
	}

	/**
	* Returns the first menu role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching menu role, or <code>null</code> if a matching menu role could not be found
	*/
	public static MenuRole fetchByF_RID_First(long roleId,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence().fetchByF_RID_First(roleId, orderByComparator);
	}

	/**
	* Returns the last menu role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu role
	* @throws NoSuchMenuRoleException if a matching menu role could not be found
	*/
	public static MenuRole findByF_RID_Last(long roleId,
		OrderByComparator<MenuRole> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().findByF_RID_Last(roleId, orderByComparator);
	}

	/**
	* Returns the last menu role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching menu role, or <code>null</code> if a matching menu role could not be found
	*/
	public static MenuRole fetchByF_RID_Last(long roleId,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence().fetchByF_RID_Last(roleId, orderByComparator);
	}

	/**
	* Returns the menu roles before and after the current menu role in the ordered set where roleId = &#63;.
	*
	* @param menuRoleId the primary key of the current menu role
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next menu role
	* @throws NoSuchMenuRoleException if a menu role with the primary key could not be found
	*/
	public static MenuRole[] findByF_RID_PrevAndNext(long menuRoleId,
		long roleId, OrderByComparator<MenuRole> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence()
				   .findByF_RID_PrevAndNext(menuRoleId, roleId,
			orderByComparator);
	}

	/**
	* Returns all the menu roles where roleId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleIds the role IDs
	* @return the matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long[] roleIds) {
		return getPersistence().findByF_RID(roleIds);
	}

	/**
	* Returns a range of all the menu roles where roleId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleIds the role IDs
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @return the range of matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long[] roleIds, int start, int end) {
		return getPersistence().findByF_RID(roleIds, start, end);
	}

	/**
	* Returns an ordered range of all the menu roles where roleId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleIds the role IDs
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long[] roleIds, int start,
		int end, OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence()
				   .findByF_RID(roleIds, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the menu roles where roleId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching menu roles
	*/
	public static List<MenuRole> findByF_RID(long[] roleIds, int start,
		int end, OrderByComparator<MenuRole> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_RID(roleIds, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the menu roles where roleId = &#63; from the database.
	*
	* @param roleId the role ID
	*/
	public static void removeByF_RID(long roleId) {
		getPersistence().removeByF_RID(roleId);
	}

	/**
	* Returns the number of menu roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the number of matching menu roles
	*/
	public static int countByF_RID(long roleId) {
		return getPersistence().countByF_RID(roleId);
	}

	/**
	* Returns the number of menu roles where roleId = any &#63;.
	*
	* @param roleIds the role IDs
	* @return the number of matching menu roles
	*/
	public static int countByF_RID(long[] roleIds) {
		return getPersistence().countByF_RID(roleIds);
	}

	/**
	* Returns the menu role where menuConfigId = &#63; and roleId = &#63; or throws a {@link NoSuchMenuRoleException} if it could not be found.
	*
	* @param menuConfigId the menu config ID
	* @param roleId the role ID
	* @return the matching menu role
	* @throws NoSuchMenuRoleException if a matching menu role could not be found
	*/
	public static MenuRole findByF_MENU_ROLE(long menuConfigId, long roleId)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().findByF_MENU_ROLE(menuConfigId, roleId);
	}

	/**
	* Returns the menu role where menuConfigId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param menuConfigId the menu config ID
	* @param roleId the role ID
	* @return the matching menu role, or <code>null</code> if a matching menu role could not be found
	*/
	public static MenuRole fetchByF_MENU_ROLE(long menuConfigId, long roleId) {
		return getPersistence().fetchByF_MENU_ROLE(menuConfigId, roleId);
	}

	/**
	* Returns the menu role where menuConfigId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param menuConfigId the menu config ID
	* @param roleId the role ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching menu role, or <code>null</code> if a matching menu role could not be found
	*/
	public static MenuRole fetchByF_MENU_ROLE(long menuConfigId, long roleId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_MENU_ROLE(menuConfigId, roleId, retrieveFromCache);
	}

	/**
	* Removes the menu role where menuConfigId = &#63; and roleId = &#63; from the database.
	*
	* @param menuConfigId the menu config ID
	* @param roleId the role ID
	* @return the menu role that was removed
	*/
	public static MenuRole removeByF_MENU_ROLE(long menuConfigId, long roleId)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().removeByF_MENU_ROLE(menuConfigId, roleId);
	}

	/**
	* Returns the number of menu roles where menuConfigId = &#63; and roleId = &#63;.
	*
	* @param menuConfigId the menu config ID
	* @param roleId the role ID
	* @return the number of matching menu roles
	*/
	public static int countByF_MENU_ROLE(long menuConfigId, long roleId) {
		return getPersistence().countByF_MENU_ROLE(menuConfigId, roleId);
	}

	/**
	* Caches the menu role in the entity cache if it is enabled.
	*
	* @param menuRole the menu role
	*/
	public static void cacheResult(MenuRole menuRole) {
		getPersistence().cacheResult(menuRole);
	}

	/**
	* Caches the menu roles in the entity cache if it is enabled.
	*
	* @param menuRoles the menu roles
	*/
	public static void cacheResult(List<MenuRole> menuRoles) {
		getPersistence().cacheResult(menuRoles);
	}

	/**
	* Creates a new menu role with the primary key. Does not add the menu role to the database.
	*
	* @param menuRoleId the primary key for the new menu role
	* @return the new menu role
	*/
	public static MenuRole create(long menuRoleId) {
		return getPersistence().create(menuRoleId);
	}

	/**
	* Removes the menu role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param menuRoleId the primary key of the menu role
	* @return the menu role that was removed
	* @throws NoSuchMenuRoleException if a menu role with the primary key could not be found
	*/
	public static MenuRole remove(long menuRoleId)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().remove(menuRoleId);
	}

	public static MenuRole updateImpl(MenuRole menuRole) {
		return getPersistence().updateImpl(menuRole);
	}

	/**
	* Returns the menu role with the primary key or throws a {@link NoSuchMenuRoleException} if it could not be found.
	*
	* @param menuRoleId the primary key of the menu role
	* @return the menu role
	* @throws NoSuchMenuRoleException if a menu role with the primary key could not be found
	*/
	public static MenuRole findByPrimaryKey(long menuRoleId)
		throws org.opencps.dossiermgt.exception.NoSuchMenuRoleException {
		return getPersistence().findByPrimaryKey(menuRoleId);
	}

	/**
	* Returns the menu role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param menuRoleId the primary key of the menu role
	* @return the menu role, or <code>null</code> if a menu role with the primary key could not be found
	*/
	public static MenuRole fetchByPrimaryKey(long menuRoleId) {
		return getPersistence().fetchByPrimaryKey(menuRoleId);
	}

	public static java.util.Map<java.io.Serializable, MenuRole> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the menu roles.
	*
	* @return the menu roles
	*/
	public static List<MenuRole> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the menu roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @return the range of menu roles
	*/
	public static List<MenuRole> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the menu roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of menu roles
	*/
	public static List<MenuRole> findAll(int start, int end,
		OrderByComparator<MenuRole> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the menu roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MenuRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of menu roles
	* @param end the upper bound of the range of menu roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of menu roles
	*/
	public static List<MenuRole> findAll(int start, int end,
		OrderByComparator<MenuRole> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the menu roles from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of menu roles.
	*
	* @return the number of menu roles
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static MenuRolePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MenuRolePersistence, MenuRolePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MenuRolePersistence.class);

		ServiceTracker<MenuRolePersistence, MenuRolePersistence> serviceTracker = new ServiceTracker<MenuRolePersistence, MenuRolePersistence>(bundle.getBundleContext(),
				MenuRolePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}