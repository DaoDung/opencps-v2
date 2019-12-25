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

package org.opencps.usermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.opencps.usermgt.model.Question;
import org.opencps.usermgt.model.QuestionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Question service. Represents a row in the &quot;opencps_question&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link QuestionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuestionImpl}.
 * </p>
 *
 * @author khoavu
 * @see QuestionImpl
 * @see Question
 * @see QuestionModel
 * @generated
 */
@ProviderType
public class QuestionModelImpl extends BaseModelImpl<Question>
	implements QuestionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a question model instance should use the {@link Question} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_question";
	public static final Object[][] TABLE_COLUMNS = {
			{ "questionId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "fullname", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "content", Types.VARCHAR },
			{ "publish", Types.INTEGER },
			{ "domainCode", Types.VARCHAR },
			{ "domainName", Types.VARCHAR },
			{ "govAgencyCode", Types.VARCHAR },
			{ "govAgencyName", Types.VARCHAR },
			{ "questionType", Types.VARCHAR },
			{ "subDomainCode", Types.VARCHAR },
			{ "subDomainName", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "address", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("questionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fullname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("content", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("publish", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("domainCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("domainName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("govAgencyCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("govAgencyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("questionType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subDomainCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subDomainName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_question (questionId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,fullname VARCHAR(512) null,email VARCHAR(255) null,content TEXT null,publish INTEGER,domainCode VARCHAR(75) null,domainName VARCHAR(75) null,govAgencyCode VARCHAR(75) null,govAgencyName VARCHAR(75) null,questionType VARCHAR(75) null,subDomainCode VARCHAR(75) null,subDomainName VARCHAR(75) null,phone VARCHAR(75) null,address VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_question";
	public static final String ORDER_BY_JPQL = " ORDER BY question.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_question.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.usermgt.model.Question"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.usermgt.model.Question"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.usermgt.model.Question"),
			true);
	public static final long GOVAGENCYCODE_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long PUBLISH_COLUMN_BITMASK = 4L;
	public static final long QUESTIONTYPE_COLUMN_BITMASK = 8L;
	public static final long SUBDOMAINCODE_COLUMN_BITMASK = 16L;
	public static final long CREATEDATE_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.usermgt.model.Question"));

	public QuestionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _questionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuestionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _questionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Question.class;
	}

	@Override
	public String getModelClassName() {
		return Question.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("questionId", getQuestionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fullname", getFullname());
		attributes.put("email", getEmail());
		attributes.put("content", getContent());
		attributes.put("publish", getPublish());
		attributes.put("domainCode", getDomainCode());
		attributes.put("domainName", getDomainName());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("questionType", getQuestionType());
		attributes.put("subDomainCode", getSubDomainCode());
		attributes.put("subDomainName", getSubDomainName());
		attributes.put("phone", getPhone());
		attributes.put("address", getAddress());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer publish = (Integer)attributes.get("publish");

		if (publish != null) {
			setPublish(publish);
		}

		String domainCode = (String)attributes.get("domainCode");

		if (domainCode != null) {
			setDomainCode(domainCode);
		}

		String domainName = (String)attributes.get("domainName");

		if (domainName != null) {
			setDomainName(domainName);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String questionType = (String)attributes.get("questionType");

		if (questionType != null) {
			setQuestionType(questionType);
		}

		String subDomainCode = (String)attributes.get("subDomainCode");

		if (subDomainCode != null) {
			setSubDomainCode(subDomainCode);
		}

		String subDomainName = (String)attributes.get("subDomainName");

		if (subDomainName != null) {
			setSubDomainName(subDomainName);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}

	@Override
	public long getQuestionId() {
		return _questionId;
	}

	@Override
	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getFullname() {
		if (_fullname == null) {
			return "";
		}
		else {
			return _fullname;
		}
	}

	@Override
	public void setFullname(String fullname) {
		_fullname = fullname;
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return "";
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public int getPublish() {
		return _publish;
	}

	@Override
	public void setPublish(int publish) {
		_columnBitmask |= PUBLISH_COLUMN_BITMASK;

		if (!_setOriginalPublish) {
			_setOriginalPublish = true;

			_originalPublish = _publish;
		}

		_publish = publish;
	}

	public int getOriginalPublish() {
		return _originalPublish;
	}

	@Override
	public String getDomainCode() {
		if (_domainCode == null) {
			return "";
		}
		else {
			return _domainCode;
		}
	}

	@Override
	public void setDomainCode(String domainCode) {
		_domainCode = domainCode;
	}

	@Override
	public String getDomainName() {
		if (_domainName == null) {
			return "";
		}
		else {
			return _domainName;
		}
	}

	@Override
	public void setDomainName(String domainName) {
		_domainName = domainName;
	}

	@Override
	public String getGovAgencyCode() {
		if (_govAgencyCode == null) {
			return "";
		}
		else {
			return _govAgencyCode;
		}
	}

	@Override
	public void setGovAgencyCode(String govAgencyCode) {
		_columnBitmask |= GOVAGENCYCODE_COLUMN_BITMASK;

		if (_originalGovAgencyCode == null) {
			_originalGovAgencyCode = _govAgencyCode;
		}

		_govAgencyCode = govAgencyCode;
	}

	public String getOriginalGovAgencyCode() {
		return GetterUtil.getString(_originalGovAgencyCode);
	}

	@Override
	public String getGovAgencyName() {
		if (_govAgencyName == null) {
			return "";
		}
		else {
			return _govAgencyName;
		}
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	@Override
	public String getQuestionType() {
		if (_questionType == null) {
			return "";
		}
		else {
			return _questionType;
		}
	}

	@Override
	public void setQuestionType(String questionType) {
		_columnBitmask |= QUESTIONTYPE_COLUMN_BITMASK;

		if (_originalQuestionType == null) {
			_originalQuestionType = _questionType;
		}

		_questionType = questionType;
	}

	public String getOriginalQuestionType() {
		return GetterUtil.getString(_originalQuestionType);
	}

	@Override
	public String getSubDomainCode() {
		if (_subDomainCode == null) {
			return "";
		}
		else {
			return _subDomainCode;
		}
	}

	@Override
	public void setSubDomainCode(String subDomainCode) {
		_columnBitmask |= SUBDOMAINCODE_COLUMN_BITMASK;

		if (_originalSubDomainCode == null) {
			_originalSubDomainCode = _subDomainCode;
		}

		_subDomainCode = subDomainCode;
	}

	public String getOriginalSubDomainCode() {
		return GetterUtil.getString(_originalSubDomainCode);
	}

	@Override
	public String getSubDomainName() {
		if (_subDomainName == null) {
			return "";
		}
		else {
			return _subDomainName;
		}
	}

	@Override
	public void setSubDomainName(String subDomainName) {
		_subDomainName = subDomainName;
	}

	@Override
	public String getPhone() {
		if (_phone == null) {
			return "";
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Question.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Question toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Question)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QuestionImpl questionImpl = new QuestionImpl();

		questionImpl.setQuestionId(getQuestionId());
		questionImpl.setCompanyId(getCompanyId());
		questionImpl.setGroupId(getGroupId());
		questionImpl.setCreateDate(getCreateDate());
		questionImpl.setModifiedDate(getModifiedDate());
		questionImpl.setFullname(getFullname());
		questionImpl.setEmail(getEmail());
		questionImpl.setContent(getContent());
		questionImpl.setPublish(getPublish());
		questionImpl.setDomainCode(getDomainCode());
		questionImpl.setDomainName(getDomainName());
		questionImpl.setGovAgencyCode(getGovAgencyCode());
		questionImpl.setGovAgencyName(getGovAgencyName());
		questionImpl.setQuestionType(getQuestionType());
		questionImpl.setSubDomainCode(getSubDomainCode());
		questionImpl.setSubDomainName(getSubDomainName());
		questionImpl.setPhone(getPhone());
		questionImpl.setAddress(getAddress());

		questionImpl.resetOriginalValues();

		return questionImpl;
	}

	@Override
	public int compareTo(Question question) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), question.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Question)) {
			return false;
		}

		Question question = (Question)obj;

		long primaryKey = question.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		QuestionModelImpl questionModelImpl = this;

		questionModelImpl._originalGroupId = questionModelImpl._groupId;

		questionModelImpl._setOriginalGroupId = false;

		questionModelImpl._setModifiedDate = false;

		questionModelImpl._originalPublish = questionModelImpl._publish;

		questionModelImpl._setOriginalPublish = false;

		questionModelImpl._originalGovAgencyCode = questionModelImpl._govAgencyCode;

		questionModelImpl._originalQuestionType = questionModelImpl._questionType;

		questionModelImpl._originalSubDomainCode = questionModelImpl._subDomainCode;

		questionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Question> toCacheModel() {
		QuestionCacheModel questionCacheModel = new QuestionCacheModel();

		questionCacheModel.questionId = getQuestionId();

		questionCacheModel.companyId = getCompanyId();

		questionCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			questionCacheModel.createDate = createDate.getTime();
		}
		else {
			questionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			questionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			questionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		questionCacheModel.fullname = getFullname();

		String fullname = questionCacheModel.fullname;

		if ((fullname != null) && (fullname.length() == 0)) {
			questionCacheModel.fullname = null;
		}

		questionCacheModel.email = getEmail();

		String email = questionCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			questionCacheModel.email = null;
		}

		questionCacheModel.content = getContent();

		String content = questionCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			questionCacheModel.content = null;
		}

		questionCacheModel.publish = getPublish();

		questionCacheModel.domainCode = getDomainCode();

		String domainCode = questionCacheModel.domainCode;

		if ((domainCode != null) && (domainCode.length() == 0)) {
			questionCacheModel.domainCode = null;
		}

		questionCacheModel.domainName = getDomainName();

		String domainName = questionCacheModel.domainName;

		if ((domainName != null) && (domainName.length() == 0)) {
			questionCacheModel.domainName = null;
		}

		questionCacheModel.govAgencyCode = getGovAgencyCode();

		String govAgencyCode = questionCacheModel.govAgencyCode;

		if ((govAgencyCode != null) && (govAgencyCode.length() == 0)) {
			questionCacheModel.govAgencyCode = null;
		}

		questionCacheModel.govAgencyName = getGovAgencyName();

		String govAgencyName = questionCacheModel.govAgencyName;

		if ((govAgencyName != null) && (govAgencyName.length() == 0)) {
			questionCacheModel.govAgencyName = null;
		}

		questionCacheModel.questionType = getQuestionType();

		String questionType = questionCacheModel.questionType;

		if ((questionType != null) && (questionType.length() == 0)) {
			questionCacheModel.questionType = null;
		}

		questionCacheModel.subDomainCode = getSubDomainCode();

		String subDomainCode = questionCacheModel.subDomainCode;

		if ((subDomainCode != null) && (subDomainCode.length() == 0)) {
			questionCacheModel.subDomainCode = null;
		}

		questionCacheModel.subDomainName = getSubDomainName();

		String subDomainName = questionCacheModel.subDomainName;

		if ((subDomainName != null) && (subDomainName.length() == 0)) {
			questionCacheModel.subDomainName = null;
		}

		questionCacheModel.phone = getPhone();

		String phone = questionCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			questionCacheModel.phone = null;
		}

		questionCacheModel.address = getAddress();

		String address = questionCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			questionCacheModel.address = null;
		}

		return questionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{questionId=");
		sb.append(getQuestionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", fullname=");
		sb.append(getFullname());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", publish=");
		sb.append(getPublish());
		sb.append(", domainCode=");
		sb.append(getDomainCode());
		sb.append(", domainName=");
		sb.append(getDomainName());
		sb.append(", govAgencyCode=");
		sb.append(getGovAgencyCode());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", questionType=");
		sb.append(getQuestionType());
		sb.append(", subDomainCode=");
		sb.append(getSubDomainCode());
		sb.append(", subDomainName=");
		sb.append(getSubDomainName());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.opencps.usermgt.model.Question");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>questionId</column-name><column-value><![CDATA[");
		sb.append(getQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullname</column-name><column-value><![CDATA[");
		sb.append(getFullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publish</column-name><column-value><![CDATA[");
		sb.append(getPublish());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainCode</column-name><column-value><![CDATA[");
		sb.append(getDomainCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainName</column-name><column-value><![CDATA[");
		sb.append(getDomainName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionType</column-name><column-value><![CDATA[");
		sb.append(getQuestionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subDomainCode</column-name><column-value><![CDATA[");
		sb.append(getSubDomainCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subDomainName</column-name><column-value><![CDATA[");
		sb.append(getSubDomainName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Question.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Question.class, ModelWrapper.class
		};
	private long _questionId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _fullname;
	private String _email;
	private String _content;
	private int _publish;
	private int _originalPublish;
	private boolean _setOriginalPublish;
	private String _domainCode;
	private String _domainName;
	private String _govAgencyCode;
	private String _originalGovAgencyCode;
	private String _govAgencyName;
	private String _questionType;
	private String _originalQuestionType;
	private String _subDomainCode;
	private String _originalSubDomainCode;
	private String _subDomainName;
	private String _phone;
	private String _address;
	private long _columnBitmask;
	private Question _escapedModel;
}