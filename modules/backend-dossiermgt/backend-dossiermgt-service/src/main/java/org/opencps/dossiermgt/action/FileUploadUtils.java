package org.opencps.dossiermgt.action;

import com.liferay.counter.kernel.model.Counter;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import org.opencps.auth.utils.DLFolderUtil;

public class FileUploadUtils {

	public static final String FOLDER_NAME_DOSSIER_FILE = "DOSSIER_FILE";
	public static final String FOLDER_NAME_PAYMENT_FILE = "PAYMENT_FILE";

	private static Log _log = LogFactoryUtil.getLog(FileUploadUtils.class);
	
	public static FileEntry uploadFile(long userId, long companyId, long groupId, InputStream inputStream,
			String fileName, String fileType, long fileSize, String destination, String desc,
			ServiceContext serviceContext, String... counterName) throws Exception {
		FileEntry fileEntry = null;
		try {
			if (inputStream != null && fileSize > 0 && Validator.isNotNull(fileName)) {

				serviceContext.setAddGroupPermissions(true);
				serviceContext.setAddGuestPermissions(true);

				Calendar calendar = Calendar.getInstance();

				calendar.setTime(new Date());

//				destination += calendar.get(Calendar.YEAR) + StringPool.SLASH;
//				destination += calendar.get(Calendar.MONTH) + StringPool.SLASH;
//				destination += calendar.get(Calendar.DAY_OF_MONTH);

//				DLFolder dlFolder = DLFolderUtil.getTargetFolder(userId, groupId, groupId, false, 0, destination,
//						"Comment attactment", false, serviceContext);

				User user = UserLocalServiceUtil.getUser(serviceContext.getUserId());

				PermissionChecker checker = PermissionCheckerFactoryUtil.create(user);
				PermissionThreadLocal.setPermissionChecker(checker);
				fileEntry = DLAppServiceUtil.addFileEntry(groupId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, fileName, fileType,
						System.currentTimeMillis() + StringPool.DASH + fileName, desc, StringPool.BLANK, inputStream,
						fileSize, serviceContext);

			}
		} catch (Exception e) {

			_log.debug("==dossierfile dossierId===zzzz" + counterName + e);
			e.printStackTrace();
			String counterNameGen = "";
			if (Validator.isNull(counterName)) {
				counterNameGen = userId + FOLDER_NAME_DOSSIER_FILE + companyId + FOLDER_NAME_DOSSIER_FILE + groupId +FOLDER_NAME_DOSSIER_FILE + new Date().getTime();
			} else {
				counterNameGen = counterName[0];
			}
			long counterNum = countByCertConfigName(counterNameGen);
			if (counterNum < 9) {
				return uploadFile(userId, companyId, groupId, inputStream,
						fileName, fileType, fileSize, destination, desc,
						serviceContext, counterName);
			}
		}
		return fileEntry;
	}
	
	public static FileEntry uploadDossierFile(long userId, long groupId, 
			InputStream inputStream, String sourceFileName,
			String fileType, long fileSize, ServiceContext serviceContext) 
		throws Exception {
		
		return uploadFile(userId, groupId, 0, inputStream, sourceFileName, 
				fileType, fileSize, FOLDER_NAME_DOSSIER_FILE, serviceContext);
	}
	
	public static FileEntry uploadDossierFile(long userId, long groupId, long fileEntryId,
			InputStream inputStream, String sourceFileName,
			String fileType, long fileSize, ServiceContext serviceContext) 
		throws Exception {
		
		return uploadFile(userId, groupId, fileEntryId, inputStream, sourceFileName, 
				fileType, fileSize, FOLDER_NAME_DOSSIER_FILE, serviceContext);
	}
	
	public static FileEntry uploadDossierFile(long userId, long groupId, 
			File file, String sourceFileName, ServiceContext serviceContext) 
		throws Exception {
		
		return uploadFile(userId, groupId, 0, file, sourceFileName, null, FOLDER_NAME_DOSSIER_FILE, serviceContext);
	}
	
	public static FileEntry cloneDossierFile(long userId, long groupId, 
			long fileEntryId, ServiceContext serviceContext) 
		throws Exception {
		
		return cloneFile(userId, groupId, fileEntryId, FOLDER_NAME_DOSSIER_FILE, serviceContext);
	}
	
	public static FileEntry cloneFile(long userId, long groupId, long fileEntryId, 
			String destination, ServiceContext serviceContext) 
		throws Exception {
		
		FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);

		serviceContext.setAddGroupPermissions(true);
		serviceContext.setAddGuestPermissions(true);

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(new Date());
		
		if(Validator.isNull(destination)) {
			destination = StringPool.BLANK;
		} else if(destination.indexOf(StringPool.SLASH) < 0) {
		    destination += StringPool.SLASH;
		}

		destination += calendar.get(Calendar.YEAR) + StringPool.SLASH;
		destination += calendar.get(Calendar.MONTH) + StringPool.SLASH;
		destination += calendar.get(Calendar.DAY_OF_MONTH);

		DLFolder dlFolder = DLFolderUtil.getTargetFolder(userId, groupId, groupId, false, 0, destination,
				StringPool.BLANK, false, serviceContext);

		User user = UserLocalServiceUtil.getUser(serviceContext.getUserId());

		PermissionChecker checker = PermissionCheckerFactoryUtil.create(user);
		PermissionThreadLocal.setPermissionChecker(checker);
		
		String title = getFileName(fileEntry.getTitle());
		
		return DLAppLocalServiceUtil.addFileEntry(userId, groupId, dlFolder.getFolderId(), title,
				fileEntry.getMimeType(), System.currentTimeMillis() + StringPool.DASH + title, title,
				StringPool.BLANK, fileEntry.getContentStream(), fileEntry.getSize(), serviceContext);
	}
	
	/**
	 * 
	 * @param userId
	 * @param groupId
	 * @param inputStream
	 * @param sourceFileName
	 * @param fileType
	 * @param fileSize
	 * @param destination
	 * @param serviceContext
	 * @return null if inputStream is null or sourceFileName is null
	 * @throws Exception
	 */
	public static FileEntry uploadFile(long userId, long groupId, long fileEntryId, InputStream inputStream, String sourceFileName,
			String fileType, long fileSize, String destination, ServiceContext serviceContext, String... counterName) 
		throws Exception {
		
		FileEntry fileEntry = null;
		try {
			if (inputStream != null && Validator.isNotNull(sourceFileName)) {
				
				if(Validator.isNull(fileType)) {
					fileType = MimeTypesUtil.getContentType(sourceFileName);
				}
				
				if(fileSize == 0) {
					fileSize = inputStream.available();
					//byte[] bytes = FileUtil.getBytes(inputStream, -1, false);
					//fileSize = bytes.length;
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
		} catch (Exception e) {
			System.out.println("==dossierfile dossierId===" + counterName + e);
			e.printStackTrace();
			String counterNameGen = "";
			if (Validator.isNull(counterName)) {
				counterNameGen = userId + FOLDER_NAME_DOSSIER_FILE + groupId +FOLDER_NAME_DOSSIER_FILE + new Date().getTime();
			} else {
				counterNameGen = counterName[0];
			}
			long counterNum = countByCertConfigName(counterNameGen);
			if (counterNum < 9) {
				return uploadFile(userId, groupId, fileEntryId, inputStream, sourceFileName,
						fileType, fileSize, destination, serviceContext, counterName);
			}
		}

		return fileEntry;
	}
	
	/**
	 * 
	 * @param userId
	 * @param groupId
	 * @param file
	 * @param sourceFileName
	 * @param fileType
	 * @param destination
	 * @param serviceContext
	 * @return null if inputStream is null or sourceFileName is null
	 * @throws Exception
	 */
	public static FileEntry uploadFile(long userId, long groupId, long fileEntryId, 
			File file, String sourceFileName,
			String fileType, String destination, ServiceContext serviceContext, String... counterName) 
		throws Exception {
		
		FileEntry fileEntry = null;

		try {
			if (file != null && Validator.isNotNull(sourceFileName)) {
				
				if(Validator.isNull(fileType)) {
					// fileType = MimeTypesUtil.getContentType(sourceFileName);
					fileType = MimeTypesUtil.getContentType(file);
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
					fileEntry = DLAppLocalServiceUtil.updateFileEntry(userId, fileEntryId, 
							sourceFileName, fileType, title,
							title, title, true, file, serviceContext);
				} else {
					fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, groupId, dlFolder.getFolderId(), title,
						fileType, title, title,
						StringPool.BLANK, file, serviceContext);
				}
	
			}
		} catch (Exception e) {
			_log.debug("==dossierfile dossierId===" + counterName + e);
			e.printStackTrace();
			String counterNameGen = "";
			if (Validator.isNull(counterName)) {
				counterNameGen = userId + FOLDER_NAME_DOSSIER_FILE + groupId +FOLDER_NAME_DOSSIER_FILE + new Date().getTime();
			} else {
				counterNameGen = counterName[0];
			}
			long counterNum = countByCertConfigName(counterNameGen);
			if (counterNum < 9) {
				return uploadFile(userId, groupId, fileEntryId, 
						file, sourceFileName,
						fileType, destination, serviceContext, counterName);
			}
		}


		return fileEntry;
	}
	
	/**
	 * Auto generate filename for comunicate with multi system
	 * 
	 * @param sourceFileName
	 * @return
	 */
	private static String getFileName(String sourceFileName) {
		String ext = FileUtil.getExtension(sourceFileName);
		
		return Validator.isNotNull(ext) ? (System.currentTimeMillis() + StringPool.PERIOD + ext) :  String.valueOf(System.currentTimeMillis());
	}

	// Upload Payment File
	public static FileEntry uploadPaymentFile(long userId, long groupId, 
			InputStream inputStream, String sourceFileName,
			String fileType, long fileSize, ServiceContext serviceContext) 
		throws Exception {
		
		return uploadFile(userId, groupId, 0, inputStream, sourceFileName, 
				fileType, fileSize, FOLDER_NAME_PAYMENT_FILE, serviceContext);
	}
	
	public static long countByCertConfigName(String certConfigName) {
		
		long _counterNumber = 0;

		try {
			
			Counter counterConfig = CounterLocalServiceUtil.fetchCounter(certConfigName);

			if (Validator.isNotNull(counterConfig)) {
				// create counter config
				_counterNumber = counterConfig.getCurrentId() + 1;
				//
				counterConfig.setCurrentId(_counterNumber);
				CounterLocalServiceUtil.updateCounter(counterConfig);
			} else {
				counterConfig = CounterLocalServiceUtil.createCounter(certConfigName);
				//increment CurrentCounter 
				counterConfig.setCurrentId(1);
				_counterNumber = 1;
				CounterLocalServiceUtil.updateCounter(counterConfig);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return _counterNumber;

	}
}
