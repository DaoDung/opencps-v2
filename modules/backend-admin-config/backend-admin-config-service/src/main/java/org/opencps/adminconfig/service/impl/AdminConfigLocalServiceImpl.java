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

package org.opencps.adminconfig.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.Validator;

import org.opencps.adminconfig.model.AdminConfig;
import org.opencps.adminconfig.service.base.AdminConfigLocalServiceBaseImpl;

/**
 * The implementation of the admin config local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.opencps.adminconfig.service.AdminConfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author binhth
 * @see AdminConfigLocalServiceBaseImpl
 * @see org.opencps.adminconfig.service.AdminConfigLocalServiceUtil
 */
public class AdminConfigLocalServiceImpl extends AdminConfigLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * org.opencps.adminconfig.service.AdminConfigLocalServiceUtil} to access the
	 * admin config local service.
	 */

	public AdminConfig fetchByCode(String code) {

		AdminConfig adminConfig = adminConfigPersistence.fetchByF_Code(code);

		if (Validator.isNull(adminConfig)) {
			return null;
		}

		return adminConfig;
	}

	@Indexable(type = IndexableType.DELETE)
	public AdminConfig adminProcessDelete(Long id) {

		AdminConfig adminConfig = adminConfigPersistence.fetchByPrimaryKey(id);

		if (Validator.isNull(adminConfig)) {
			return null;
		} else {
			adminConfigPersistence.remove(adminConfig);
		}

		return adminConfig;
	}

	@Indexable(type = IndexableType.REINDEX)
	public AdminConfig adminProcessData(JSONObject adminConfigData) {

		AdminConfig adminConfig = null;

		if (adminConfigData.getLong("id") > 0) {

			adminConfig = adminConfigPersistence.fetchByPrimaryKey(adminConfigData.getLong("id"));

		} else {

			long id = CounterLocalServiceUtil.increment(AdminConfig.class.getName());

			adminConfig = adminConfigPersistence.create(id);

		}

		adminConfig.setCode(adminConfigData.getString("code"));

		adminConfig.setName(adminConfigData.getString("name"));

		adminConfig.setBundleName(adminConfigData.getString("bundleName"));

		adminConfig.setModelName(adminConfigData.getString("modelName"));

		adminConfig.setServiceUtilName(adminConfigData.getString("serviceUtilName"));

		adminConfig.setHeadersName(adminConfigData.getString("headersName"));

		adminConfig.setColumns(adminConfigData.getString("columns"));

		adminConfig.setDetailColumns(adminConfigData.getString("detailColumns"));

		adminConfig.setExtForm(adminConfigData.getBoolean("extForm"));

		adminConfig.setGroupFilter(adminConfigData.getBoolean("groupFilter"));
		
		adminConfigPersistence.update(adminConfig);

		return adminConfig;
	}
}