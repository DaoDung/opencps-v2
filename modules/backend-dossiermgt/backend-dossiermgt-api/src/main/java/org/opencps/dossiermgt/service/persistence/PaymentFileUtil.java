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

import org.opencps.dossiermgt.model.PaymentFile;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the payment file service. This utility wraps {@link org.opencps.dossiermgt.service.persistence.impl.PaymentFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see PaymentFilePersistence
 * @see org.opencps.dossiermgt.service.persistence.impl.PaymentFilePersistenceImpl
 * @generated
 */
@ProviderType
public class PaymentFileUtil {
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
	public static void clearCache(PaymentFile paymentFile) {
		getPersistence().clearCache(paymentFile);
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
	public static List<PaymentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PaymentFile update(PaymentFile paymentFile) {
		return getPersistence().update(paymentFile);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PaymentFile update(PaymentFile paymentFile,
		ServiceContext serviceContext) {
		return getPersistence().update(paymentFile, serviceContext);
	}

	/**
	* Returns all the payment files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching payment files
	*/
	public static List<PaymentFile> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the payment files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public static List<PaymentFile> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the payment files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByUuid(String uuid, int start, int end,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the payment files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByUuid(String uuid, int start, int end,
		OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByUuid_First(String uuid,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByUuid_First(String uuid,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByUuid_Last(String uuid,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByUuid_Last(String uuid,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the payment files before and after the current payment file in the ordered set where uuid = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public static PaymentFile[] findByUuid_PrevAndNext(long paymentFileId,
		String uuid, OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_PrevAndNext(paymentFileId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the payment files where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of payment files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching payment files
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the payment file where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByUUID_G(String uuid, long groupId)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the payment file where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the payment file that was removed
	*/
	public static PaymentFile removeByUUID_G(String uuid, long groupId)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of payment files where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching payment files
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching payment files
	*/
	public static List<PaymentFile> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public static List<PaymentFile> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the payment files before and after the current payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public static PaymentFile[] findByUuid_C_PrevAndNext(long paymentFileId,
		String uuid, long companyId,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(paymentFileId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the payment files where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of payment files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching payment files
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the payment file where dossierId = &#63; and referenceUid = &#63; or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByD_RUID(long dossierId, String referenceUid)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByD_RUID(dossierId, referenceUid);
	}

	/**
	* Returns the payment file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByD_RUID(long dossierId, String referenceUid) {
		return getPersistence().fetchByD_RUID(dossierId, referenceUid);
	}

	/**
	* Returns the payment file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByD_RUID(long dossierId,
		String referenceUid, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByD_RUID(dossierId, referenceUid, retrieveFromCache);
	}

	/**
	* Removes the payment file where dossierId = &#63; and referenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the payment file that was removed
	*/
	public static PaymentFile removeByD_RUID(long dossierId, String referenceUid)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().removeByD_RUID(dossierId, referenceUid);
	}

	/**
	* Returns the number of payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the number of matching payment files
	*/
	public static int countByD_RUID(long dossierId, String referenceUid) {
		return getPersistence().countByD_RUID(dossierId, referenceUid);
	}

	/**
	* Returns the payment file where groupId = &#63; and dossierId = &#63; or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByDossierId(long groupId, long dossierId)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByDossierId(groupId, dossierId);
	}

	/**
	* Returns the payment file where groupId = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByDossierId(long groupId, long dossierId) {
		return getPersistence().fetchByDossierId(groupId, dossierId);
	}

	/**
	* Returns the payment file where groupId = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByDossierId(long groupId, long dossierId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByDossierId(groupId, dossierId, retrieveFromCache);
	}

	/**
	* Removes the payment file where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the payment file that was removed
	*/
	public static PaymentFile removeByDossierId(long groupId, long dossierId)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().removeByDossierId(groupId, dossierId);
	}

	/**
	* Returns the number of payment files where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching payment files
	*/
	public static int countByDossierId(long groupId, long dossierId) {
		return getPersistence().countByDossierId(groupId, dossierId);
	}

	/**
	* Returns all the payment files where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @return the matching payment files
	*/
	public static List<PaymentFile> findByG_PT(long groupId, int paymentStatus) {
		return getPersistence().findByG_PT(groupId, paymentStatus);
	}

	/**
	* Returns a range of all the payment files where groupId = &#63; and paymentStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public static List<PaymentFile> findByG_PT(long groupId, int paymentStatus,
		int start, int end) {
		return getPersistence().findByG_PT(groupId, paymentStatus, start, end);
	}

	/**
	* Returns an ordered range of all the payment files where groupId = &#63; and paymentStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByG_PT(long groupId, int paymentStatus,
		int start, int end, OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .findByG_PT(groupId, paymentStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the payment files where groupId = &#63; and paymentStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByG_PT(long groupId, int paymentStatus,
		int start, int end, OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_PT(groupId, paymentStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first payment file in the ordered set where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByG_PT_First(long groupId, int paymentStatus,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByG_PT_First(groupId, paymentStatus, orderByComparator);
	}

	/**
	* Returns the first payment file in the ordered set where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByG_PT_First(long groupId,
		int paymentStatus, OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .fetchByG_PT_First(groupId, paymentStatus, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByG_PT_Last(long groupId, int paymentStatus,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByG_PT_Last(groupId, paymentStatus, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByG_PT_Last(long groupId, int paymentStatus,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence()
				   .fetchByG_PT_Last(groupId, paymentStatus, orderByComparator);
	}

	/**
	* Returns the payment files before and after the current payment file in the ordered set where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public static PaymentFile[] findByG_PT_PrevAndNext(long paymentFileId,
		long groupId, int paymentStatus,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByG_PT_PrevAndNext(paymentFileId, groupId,
			paymentStatus, orderByComparator);
	}

	/**
	* Removes all the payment files where groupId = &#63; and paymentStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	*/
	public static void removeByG_PT(long groupId, int paymentStatus) {
		getPersistence().removeByG_PT(groupId, paymentStatus);
	}

	/**
	* Returns the number of payment files where groupId = &#63; and paymentStatus = &#63;.
	*
	* @param groupId the group ID
	* @param paymentStatus the payment status
	* @return the number of matching payment files
	*/
	public static int countByG_PT(long groupId, int paymentStatus) {
		return getPersistence().countByG_PT(groupId, paymentStatus);
	}

	/**
	* Returns all the payment files where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching payment files
	*/
	public static List<PaymentFile> findByG(long groupId) {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the payment files where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public static List<PaymentFile> findByG(long groupId, int start, int end) {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the payment files where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByG(long groupId, int start, int end,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the payment files where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public static List<PaymentFile> findByG(long groupId, int start, int end,
		OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first payment file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByG_First(long groupId,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first payment file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByG_First(long groupId,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public static PaymentFile findByG_Last(long groupId,
		OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last payment file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public static PaymentFile fetchByG_Last(long groupId,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the payment files before and after the current payment file in the ordered set where groupId = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public static PaymentFile[] findByG_PrevAndNext(long paymentFileId,
		long groupId, OrderByComparator<PaymentFile> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence()
				   .findByG_PrevAndNext(paymentFileId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the payment files where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByG(long groupId) {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of payment files where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching payment files
	*/
	public static int countByG(long groupId) {
		return getPersistence().countByG(groupId);
	}

	/**
	* Caches the payment file in the entity cache if it is enabled.
	*
	* @param paymentFile the payment file
	*/
	public static void cacheResult(PaymentFile paymentFile) {
		getPersistence().cacheResult(paymentFile);
	}

	/**
	* Caches the payment files in the entity cache if it is enabled.
	*
	* @param paymentFiles the payment files
	*/
	public static void cacheResult(List<PaymentFile> paymentFiles) {
		getPersistence().cacheResult(paymentFiles);
	}

	/**
	* Creates a new payment file with the primary key. Does not add the payment file to the database.
	*
	* @param paymentFileId the primary key for the new payment file
	* @return the new payment file
	*/
	public static PaymentFile create(long paymentFileId) {
		return getPersistence().create(paymentFileId);
	}

	/**
	* Removes the payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file that was removed
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public static PaymentFile remove(long paymentFileId)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().remove(paymentFileId);
	}

	public static PaymentFile updateImpl(PaymentFile paymentFile) {
		return getPersistence().updateImpl(paymentFile);
	}

	/**
	* Returns the payment file with the primary key or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public static PaymentFile findByPrimaryKey(long paymentFileId)
		throws org.opencps.dossiermgt.exception.NoSuchPaymentFileException {
		return getPersistence().findByPrimaryKey(paymentFileId);
	}

	/**
	* Returns the payment file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file, or <code>null</code> if a payment file with the primary key could not be found
	*/
	public static PaymentFile fetchByPrimaryKey(long paymentFileId) {
		return getPersistence().fetchByPrimaryKey(paymentFileId);
	}

	public static java.util.Map<java.io.Serializable, PaymentFile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the payment files.
	*
	* @return the payment files
	*/
	public static List<PaymentFile> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of payment files
	*/
	public static List<PaymentFile> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment files
	*/
	public static List<PaymentFile> findAll(int start, int end,
		OrderByComparator<PaymentFile> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of payment files
	*/
	public static List<PaymentFile> findAll(int start, int end,
		OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the payment files from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment files.
	*
	* @return the number of payment files
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PaymentFilePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PaymentFilePersistence, PaymentFilePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PaymentFilePersistence.class);

		ServiceTracker<PaymentFilePersistence, PaymentFilePersistence> serviceTracker =
			new ServiceTracker<PaymentFilePersistence, PaymentFilePersistence>(bundle.getBundleContext(),
				PaymentFilePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}