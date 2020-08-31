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

package org.opencps.datamgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WorkTime service. Represents a row in the &quot;opencps_workTime&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.datamgt.model.impl.WorkTimeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.datamgt.model.impl.WorkTimeImpl}.
 * </p>
 *
 * @author khoavu
 * @see WorkTime
 * @see org.opencps.datamgt.model.impl.WorkTimeImpl
 * @see org.opencps.datamgt.model.impl.WorkTimeModelImpl
 * @generated
 */
@ProviderType
public interface WorkTimeModel extends BaseModel<WorkTime>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a work time model instance should use the {@link WorkTime} interface instead.
	 */

	/**
	 * Returns the primary key of this work time.
	 *
	 * @return the primary key of this work time
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this work time.
	 *
	 * @param primaryKey the primary key of this work time
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this work time.
	 *
	 * @return the uuid of this work time
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this work time.
	 *
	 * @param uuid the uuid of this work time
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the work time ID of this work time.
	 *
	 * @return the work time ID of this work time
	 */
	public long getWorkTimeId();

	/**
	 * Sets the work time ID of this work time.
	 *
	 * @param workTimeId the work time ID of this work time
	 */
	public void setWorkTimeId(long workTimeId);

	/**
	 * Returns the company ID of this work time.
	 *
	 * @return the company ID of this work time
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this work time.
	 *
	 * @param companyId the company ID of this work time
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this work time.
	 *
	 * @return the group ID of this work time
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this work time.
	 *
	 * @param groupId the group ID of this work time
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this work time.
	 *
	 * @return the user ID of this work time
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this work time.
	 *
	 * @param userId the user ID of this work time
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this work time.
	 *
	 * @return the user uuid of this work time
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this work time.
	 *
	 * @param userUuid the user uuid of this work time
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this work time.
	 *
	 * @return the user name of this work time
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this work time.
	 *
	 * @param userName the user name of this work time
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this work time.
	 *
	 * @return the create date of this work time
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this work time.
	 *
	 * @param createDate the create date of this work time
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this work time.
	 *
	 * @return the modified date of this work time
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this work time.
	 *
	 * @param modifiedDate the modified date of this work time
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the day of this work time.
	 *
	 * @return the day of this work time
	 */
	public int getDay();

	/**
	 * Sets the day of this work time.
	 *
	 * @param day the day of this work time
	 */
	public void setDay(int day);

	/**
	 * Returns the hours of this work time.
	 *
	 * @return the hours of this work time
	 */
	@AutoEscape
	public String getHours();

	/**
	 * Sets the hours of this work time.
	 *
	 * @param hours the hours of this work time
	 */
	public void setHours(String hours);

	/**
	 * Returns the status of this work time.
	 *
	 * @return the status of this work time
	 */
	public int getStatus();

	/**
	 * Sets the status of this work time.
	 *
	 * @param status the status of this work time
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(WorkTime workTime);

	@Override
	public int hashCode();

	@Override
	public CacheModel<WorkTime> toCacheModel();

	@Override
	public WorkTime toEscapedModel();

	@Override
	public WorkTime toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}