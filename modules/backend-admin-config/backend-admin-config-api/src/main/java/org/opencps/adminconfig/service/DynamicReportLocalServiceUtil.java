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

package org.opencps.adminconfig.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DynamicReport. This utility wraps
 * {@link org.opencps.adminconfig.service.impl.DynamicReportLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author binhth
 * @see DynamicReportLocalService
 * @see org.opencps.adminconfig.service.base.DynamicReportLocalServiceBaseImpl
 * @see org.opencps.adminconfig.service.impl.DynamicReportLocalServiceImpl
 * @generated
 */
@ProviderType
public class DynamicReportLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.adminconfig.service.impl.DynamicReportLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dynamic report to the database. Also notifies the appropriate model listeners.
	*
	* @param dynamicReport the dynamic report
	* @return the dynamic report that was added
	*/
	public static org.opencps.adminconfig.model.DynamicReport addDynamicReport(
		org.opencps.adminconfig.model.DynamicReport dynamicReport) {
		return getService().addDynamicReport(dynamicReport);
	}

	public static org.opencps.adminconfig.model.DynamicReport adminProcessData(
		com.liferay.portal.kernel.json.JSONObject objectData) {
		return getService().adminProcessData(objectData);
	}

	public static org.opencps.adminconfig.model.DynamicReport adminProcessDelete(
		Long id) {
		return getService().adminProcessDelete(id);
	}

	/**
	* Creates a new dynamic report with the primary key. Does not add the dynamic report to the database.
	*
	* @param dynamicReportId the primary key for the new dynamic report
	* @return the new dynamic report
	*/
	public static org.opencps.adminconfig.model.DynamicReport createDynamicReport(
		long dynamicReportId) {
		return getService().createDynamicReport(dynamicReportId);
	}

	/**
	* Deletes the dynamic report from the database. Also notifies the appropriate model listeners.
	*
	* @param dynamicReport the dynamic report
	* @return the dynamic report that was removed
	*/
	public static org.opencps.adminconfig.model.DynamicReport deleteDynamicReport(
		org.opencps.adminconfig.model.DynamicReport dynamicReport) {
		return getService().deleteDynamicReport(dynamicReport);
	}

	/**
	* Deletes the dynamic report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dynamicReportId the primary key of the dynamic report
	* @return the dynamic report that was removed
	* @throws PortalException if a dynamic report with the primary key could not be found
	*/
	public static org.opencps.adminconfig.model.DynamicReport deleteDynamicReport(
		long dynamicReportId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDynamicReport(dynamicReportId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.adminconfig.model.impl.DynamicReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.adminconfig.model.impl.DynamicReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.opencps.adminconfig.model.DynamicReport fetchByCode(
		long groupId, String reportCode) {
		return getService().fetchByCode(groupId, reportCode);
	}

	public static org.opencps.adminconfig.model.DynamicReport fetchByG_CODE(
		long groupId, String reportCode) {
		return getService().fetchByG_CODE(groupId, reportCode);
	}

	public static org.opencps.adminconfig.model.DynamicReport fetchDynamicReport(
		long dynamicReportId) {
		return getService().fetchDynamicReport(dynamicReportId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<org.opencps.adminconfig.model.DynamicReport> getByGroup(
		long groupId, int start, int end) {
		return getService().getByGroup(groupId, start, end);
	}

	public static java.util.List<org.opencps.adminconfig.model.DynamicReport> getByGroupType(
		long groupId, String reportType, int start, int end) {
		return getService().getByGroupType(groupId, reportType, start, end);
	}

	/**
	* Returns the dynamic report with the primary key.
	*
	* @param dynamicReportId the primary key of the dynamic report
	* @return the dynamic report
	* @throws PortalException if a dynamic report with the primary key could not be found
	*/
	public static org.opencps.adminconfig.model.DynamicReport getDynamicReport(
		long dynamicReportId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDynamicReport(dynamicReportId);
	}

	/**
	* Returns a range of all the dynamic reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.adminconfig.model.impl.DynamicReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dynamic reports
	* @param end the upper bound of the range of dynamic reports (not inclusive)
	* @return the range of dynamic reports
	*/
	public static java.util.List<org.opencps.adminconfig.model.DynamicReport> getDynamicReports(
		int start, int end) {
		return getService().getDynamicReports(start, end);
	}

	/**
	* Returns the number of dynamic reports.
	*
	* @return the number of dynamic reports
	*/
	public static int getDynamicReportsCount() {
		return getService().getDynamicReportsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the dynamic report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dynamicReport the dynamic report
	* @return the dynamic report that was updated
	*/
	public static org.opencps.adminconfig.model.DynamicReport updateDynamicReport(
		org.opencps.adminconfig.model.DynamicReport dynamicReport) {
		return getService().updateDynamicReport(dynamicReport);
	}

	public static org.opencps.adminconfig.model.DynamicReport updateDynamicReportDB(
		long userId, long groupId, String reportCode, String reportName,
		int sharing, String filterConfig, String tableConfig,
		String userConfig, String reportType)
		throws com.liferay.portal.kernel.exception.NoSuchUserException {
		return getService()
				   .updateDynamicReportDB(userId, groupId, reportCode,
			reportName, sharing, filterConfig, tableConfig, userConfig,
			reportType);
	}

	public static DynamicReportLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DynamicReportLocalService, DynamicReportLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DynamicReportLocalService.class);

		ServiceTracker<DynamicReportLocalService, DynamicReportLocalService> serviceTracker =
			new ServiceTracker<DynamicReportLocalService, DynamicReportLocalService>(bundle.getBundleContext(),
				DynamicReportLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}