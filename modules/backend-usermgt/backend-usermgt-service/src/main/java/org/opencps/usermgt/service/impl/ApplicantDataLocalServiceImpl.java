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

package org.opencps.usermgt.service.impl;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import org.opencps.auth.utils.DLFolderUtil;
import org.opencps.usermgt.exception.NoSuchApplicantDataException;
import org.opencps.usermgt.model.ApplicantData;
import org.opencps.usermgt.service.base.ApplicantDataLocalServiceBaseImpl;

/**
 * The implementation of the applicant data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.usermgt.service.ApplicantDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavu
 * @see ApplicantDataLocalServiceBaseImpl
 * @see org.opencps.usermgt.service.ApplicantDataLocalServiceUtil
 */
public class ApplicantDataLocalServiceImpl
	extends ApplicantDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.usermgt.service.ApplicantDataLocalServiceUtil} to access the applicant data local service.
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ApplicantData createApplicantData(ServiceContext context, long groupId, 
			String fileTemplateNo,
			String fileNo,
			String fileName,
			long fileEntryId,
			String metadata,
			int status,
			String applicantIdNo,
			int applicantDataType) throws PortalException, SystemException {
		ApplicantData applicantData = null;

		Date now = new Date();
		User auditUser = userPersistence.fetchByPrimaryKey(context.getUserId());
		long applicantDataId = counterLocalService.increment(ApplicantData.class.getName());
		
		applicantData = applicantDataPersistence.create(applicantDataId);
		applicantData.setModifiedDate(now);
		applicantData.setCreateDate(now);
		applicantData.setCompanyId(context.getCompanyId());
		applicantData.setGroupId(groupId);
		applicantData.setUserId(auditUser.getUserId());
		applicantData.setUserName(auditUser.getScreenName());
		applicantData.setFileTemplateNo(fileTemplateNo);
		applicantData.setFileNo(fileNo);
		applicantData.setFileName(fileName);
		applicantData.setFileEntryId(fileEntryId);
		applicantData.setMetadata(metadata);
		applicantData.setStatus(status);
		applicantData.setApplicantIdNo(applicantIdNo);
		applicantData.setApplicantDataType(applicantDataType);
		
		return applicantData;
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public ApplicantData updateApplicantData(ServiceContext context, long groupId, 
			long applicantDataId,
			String fileTemplateNo,
			String fileNo,
			String fileName,
			long fileEntryId,
			String metadata,
			int status,
			String applicantIdNo,
			int applicantDataType) throws PortalException, SystemException {
		ApplicantData applicantData = null;

		Date now = new Date();
		User auditUser = userPersistence.fetchByPrimaryKey(context.getUserId());
		applicantData = applicantDataPersistence.fetchByPrimaryKey(applicantDataId);
		
		applicantData.setModifiedDate(now);
		applicantData.setCreateDate(now);
		applicantData.setCompanyId(context.getCompanyId());
		applicantData.setGroupId(groupId);
		applicantData.setUserId(auditUser.getUserId());
		applicantData.setUserName(auditUser.getScreenName());
		applicantData.setFileTemplateNo(fileTemplateNo);
		applicantData.setFileNo(fileNo);
		applicantData.setFileName(fileName);
		applicantData.setFileEntryId(fileEntryId);
		applicantData.setMetadata(metadata);
		applicantData.setStatus(status);
		applicantData.setApplicantIdNo(applicantIdNo);
		applicantData.setApplicantDataType(applicantDataType);
		
		return applicantData;
	}
	
	public ApplicantData fetchApplicantData(long applicantDataId) {
		return applicantDataPersistence.fetchByPrimaryKey(applicantDataId);
	}
	
	@Indexable(type = IndexableType.DELETE)
	public ApplicantData deleteApplicantData(long applicantDataId) {
		try {
			ApplicantData applicantData = applicantDataPersistence.remove(applicantDataId);
			return applicantData;
		}
		catch (NoSuchApplicantDataException e) {
			_log.debug(e);
		}
		return null;
	}

	@Indexable(type = IndexableType.REINDEX)
	public ApplicantData createApplicantData(long groupId, 
			String fileNo,
			String fileName,
			String applicantIdNo,
			String sourceFileName, InputStream inputStream,
			ServiceContext serviceContext) throws PortalException, SystemException {
		ApplicantData applicantData = null;

		Date now = new Date();
		User auditUser = userPersistence.fetchByPrimaryKey(serviceContext.getUserId());
		long applicantDataId = counterLocalService.increment(ApplicantData.class.getName());
		
		applicantData = applicantDataPersistence.create(applicantDataId);
		applicantData.setModifiedDate(now);
		applicantData.setCreateDate(now);
		applicantData.setCompanyId(serviceContext.getCompanyId());
		applicantData.setGroupId(groupId);
		applicantData.setUserId(auditUser.getUserId());
		applicantData.setUserName(auditUser.getScreenName());
		applicantData.setFileNo(fileNo);
		applicantData.setFileName(fileName);
		applicantData.setApplicantIdNo(applicantIdNo);
		applicantData.setStatus(1);
		applicantData.setApplicantDataType(0);
		
		long fileEntryId = 0;
		if (inputStream != null) {
			try {
				FileEntry fileEntry = uploadApplicantDataFile(serviceContext.getUserId(), groupId, inputStream, sourceFileName, StringPool.BLANK,
					0, serviceContext);

				if (fileEntry != null) {
					fileEntryId = fileEntry.getFileEntryId();
				}
			}
			catch (Exception e) {
				_log.debug(e);
			}
		}

		if (fileEntryId != 0) {
			applicantData.setFileEntryId(fileEntryId);
		}
		if (Validator.isNull(fileName) && !Validator.isNotNull(sourceFileName)) {
			applicantData.setFileName(sourceFileName);
		}
		return applicantData;
	}
	
	private String getFileName(String sourceFileName) {
		String ext = FileUtil.getExtension(sourceFileName);
		
		return Validator.isNotNull(ext) ? (System.currentTimeMillis() + StringPool.PERIOD + ext) :  String.valueOf(System.currentTimeMillis());
	}

	private FileEntry uploadApplicantDataFile(long userId, long groupId, 
			InputStream inputStream, String sourceFileName,
			String fileType, long fileSize, ServiceContext serviceContext) 
		throws Exception {
		
		return uploadFile(userId, groupId, 0, inputStream, sourceFileName, 
				fileType, fileSize, FOLDER_NAME_APPLICANT_DATA_FILE, serviceContext);
	}

	private FileEntry uploadFile(long userId, long groupId, long fileEntryId, InputStream inputStream, String sourceFileName,
			String fileType, long fileSize, String destination, ServiceContext serviceContext) 
		throws Exception {
		
		FileEntry fileEntry = null;
		if (inputStream != null && Validator.isNotNull(sourceFileName)) {
			
			if(Validator.isNull(fileType)) {
				fileType = MimeTypesUtil.getContentType(sourceFileName);
			}
			
			if(fileSize == 0) {
				fileSize = inputStream.available();
			}
			
			String title = getFileName(sourceFileName);

			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);

			Calendar calendar = Calendar.getInstance();

			calendar.setTime(new Date());
			
			if(destination == null) {
				destination = StringPool.BLANK;
			}

			destination += calendar.get(Calendar.YEAR) + StringPool.SLASH;
			destination += calendar.get(Calendar.MONTH) + StringPool.SLASH;
			destination += calendar.get(Calendar.DAY_OF_MONTH);

			DLFolder dlFolder = DLFolderUtil.getTargetFolder(userId, groupId, groupId, false, 0, destination,
					StringPool.BLANK, false, serviceContext);
			User user = UserLocalServiceUtil.getUser(serviceContext.getUserId());

			PermissionChecker checker = PermissionCheckerFactoryUtil.create(user);
			PermissionThreadLocal.setPermissionChecker(checker);
			
			if(fileEntryId > 0) {
				fileEntry = DLAppLocalServiceUtil.updateFileEntry(userId, fileEntryId, sourceFileName, 
						fileType, title, title, title, true, inputStream, fileSize, serviceContext);
			} else {
				fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, groupId, dlFolder.getFolderId(), title,
					fileType, title, title,
					StringPool.BLANK, inputStream, fileSize, serviceContext);
			}

		}

		return fileEntry;
	}

	private static final String FOLDER_NAME_APPLICANT_DATA_FILE = "PAYMENT_FILE";

	private static Log _log =
			LogFactoryUtil.getLog(ApplicantDataLocalServiceImpl.class);
}