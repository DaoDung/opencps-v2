
package org.opencps.api.controller.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.opencps.api.deliverable.model.DeliverableInputModel;
import org.opencps.api.deliverable.model.DeliverableModel;
import org.opencps.api.deliverable.model.DeliverableUpdateModel;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.dossiermgt.constants.DeliverableTerm;
import org.opencps.dossiermgt.model.Deliverable;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.Validator;

public class DeliverableUtils {

	public static List<DeliverableModel> mappingToDeliverableResultModel(
		List<Document> documents) {

		List<DeliverableModel> data = new ArrayList<DeliverableModel>();

		for (Document doc : documents) {
			DeliverableModel model = mappingToDeliverable(doc);
			data.add(model);
		}

		return data;
	}

	public static DeliverableModel mappingToDeliverable(Document doc) {

		DeliverableModel model = new DeliverableModel();

		model.setDeliverableId(
			Long.valueOf(doc.get(DeliverableTerm.DELIVERABLE_ID)));
		model.setUserId(Long.valueOf(doc.get(Field.USER_ID)));
		model.setUserName(doc.get(Field.USER_NAME));
		// Convert Date to String
		String strCreateDate = doc.get(Field.CREATE_DATE);
		Date createDate = null;
		if (Validator.isNotNull(strCreateDate)) {
			createDate = APIDateTimeUtils.convertStringToDate(
				strCreateDate, APIDateTimeUtils._LUCENE_PATTERN);
		}
		model.setCreateDate(
			createDate != null
				? APIDateTimeUtils.convertDateToString(
					createDate, APIDateTimeUtils._TIMESTAMP)
				: strCreateDate);

		String strModifiedDate = doc.get(Field.MODIFIED_DATE);
		Date modifiedDate = null;
		if (Validator.isNotNull(strModifiedDate)) {
			modifiedDate = APIDateTimeUtils.convertStringToDate(
				strModifiedDate, APIDateTimeUtils._LUCENE_PATTERN);
		}
		model.setModifiedDate(
			modifiedDate != null
				? APIDateTimeUtils.convertDateToString(
					modifiedDate, APIDateTimeUtils._TIMESTAMP)
				: strModifiedDate);

		model.setDeliverableCode(doc.get(DeliverableTerm.DELIVERABLE_CODE));
		model.setDeliverableName(doc.get(DeliverableTerm.DELIVERABLE_NAME));
		model.setDeliverableType(doc.get(DeliverableTerm.DELIVERABLE_TYPE));
		model.setGovAgencyCode(doc.get(DeliverableTerm.GOV_AGENCY_CODE));
		model.setGovAgencyName(doc.get(DeliverableTerm.GOV_AGENCY_NAME));
		model.setApplicantIdNo(doc.get(DeliverableTerm.APPLICANT_ID_NO));
		model.setApplicantName(doc.get(DeliverableTerm.APPLICANT_NAME));
		model.setSubject(doc.get(DeliverableTerm.SUBJECT));
		// Convert Date to String
		String strIssueDate = doc.get(DeliverableTerm.ISSUE_DATE);
		if (Validator.isNotNull(strIssueDate)) {
			// _log.info("SUBMIT_DATE_DATEEEEEE:
			// "+doc.get(DossierTerm.SUBMIT_DATE));
			Date issueDate = APIDateTimeUtils.convertStringToDate(
				strIssueDate, APIDateTimeUtils._LUCENE_PATTERN);
			// _log.info("SUBMIT_DATE_DATEEEEEE: "+submitDate);
			model.setIssueDate(
				APIDateTimeUtils.convertDateToString(
					issueDate, APIDateTimeUtils._NORMAL_PARTTERN));
			// _log.info("SUBMIT_DATE_CONVERT:
			// "+APIDateTimeUtils.convertDateToString(submitDate,
			// APIDateTimeUtils._NORMAL_PARTTERN));
		}
		else {
			model.setIssueDate(strIssueDate);
		}

		String strExpireDate = doc.get(DeliverableTerm.EXPIRE_DATE);
		if (Validator.isNotNull(strExpireDate)) {
			// _log.info("SUBMIT_DATE_DATEEEEEE:
			// "+doc.get(DossierTerm.SUBMIT_DATE));
			Date expireDate = APIDateTimeUtils.convertStringToDate(
				strExpireDate, APIDateTimeUtils._LUCENE_PATTERN);
			// _log.info("SUBMIT_DATE_DATEEEEEE: "+submitDate);
			model.setExpireDate(
				APIDateTimeUtils.convertDateToString(
					expireDate, APIDateTimeUtils._NORMAL_PARTTERN));
			// _log.info("SUBMIT_DATE_CONVERT:
			// "+APIDateTimeUtils.convertDateToString(submitDate,
			// APIDateTimeUtils._NORMAL_PARTTERN));
		}
		else {
			model.setExpireDate(strExpireDate);
		}

		String strRevalidate = doc.get(DeliverableTerm.REVALIDATE);
		Date revalidate = null;
		if (Validator.isNotNull(strRevalidate)) {
			revalidate = APIDateTimeUtils.convertStringToDate(
				strRevalidate, APIDateTimeUtils._LUCENE_PATTERN);
		}
		model.setRevalidate(
			revalidate != null
				? APIDateTimeUtils.convertDateToString(
					revalidate, APIDateTimeUtils._TIMESTAMP)
				: strRevalidate);

		model.setDeliverableState(doc.get(DeliverableTerm.DELIVERABLE_STATE));

		return model;
	}

	public static DeliverableInputModel mappingToDeliverablesModel(
		Deliverable deliverable) {

		if (deliverable == null) {
			return null;
		}
		DeliverableInputModel model = new DeliverableInputModel();

		model.setDeliverableType(deliverable.getDeliverableType());
		model.setDeliverableCode(deliverable.getDeliverableCode());
		model.setGovAgencyCode(deliverable.getGovAgencyCode());
		model.setApplicantIdNo(deliverable.getApplicantIdNo());
		model.setApplicantName(deliverable.getApplicantName());
		model.setSubject(deliverable.getSubject());
		model.setIssueDate(
			APIDateTimeUtils.convertDateToString(
				deliverable.getIssueDate(), APIDateTimeUtils._TIMESTAMP));
		model.setExpireDate(
			APIDateTimeUtils.convertDateToString(
				deliverable.getExpireDate(), APIDateTimeUtils._TIMESTAMP));
		model.setRevalidate(
			APIDateTimeUtils.convertDateToString(
				deliverable.getRevalidate(), APIDateTimeUtils._TIMESTAMP));
		model.setDeliverableState(
			String.valueOf(deliverable.getDeliverableState()));

		return model;
	}

	public static DeliverableModel mappingToDeliverableDetailModel(
		Deliverable deliverable) {

		if (deliverable != null) {
			DeliverableModel model = new DeliverableModel();

			model.setDeliverableId(deliverable.getDeliverableId());
			model.setUserId(deliverable.getUserId());
			model.setUserName(deliverable.getUserName());
			// Convert Date to String
			model.setCreateDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getCreateDate(), APIDateTimeUtils._TIMESTAMP));
			model.setModifiedDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getModifiedDate(),
					APIDateTimeUtils._TIMESTAMP));

			model.setDeliverableCode(deliverable.getDeliverableCode());
			model.setDeliverableName(deliverable.getDeliverableName());
			model.setDeliverableType(deliverable.getDeliverableType());
			model.setGovAgencyCode(deliverable.getGovAgencyCode());
			model.setGovAgencyName(deliverable.getGovAgencyName());
			model.setApplicantIdNo(deliverable.getApplicantIdNo());
			model.setApplicantName(deliverable.getApplicantName());
			model.setSubject(deliverable.getSubject());
			// Convert Date to String
			model.setModifiedDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getIssueDate(), APIDateTimeUtils._TIMESTAMP));
			model.setModifiedDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getExpireDate(), APIDateTimeUtils._TIMESTAMP));
			model.setModifiedDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getRevalidate(), APIDateTimeUtils._TIMESTAMP));

			model.setDeliverableState(
				String.valueOf(deliverable.getDeliverableState()));

			return model;
		}
		else {
			return null;
		}
	}

	public static DeliverableUpdateModel mappingToDeliverablesUpdateModel(
		Deliverable deliverable) {

		if (deliverable != null) {
			DeliverableUpdateModel model = new DeliverableUpdateModel();

			model.setSubject(deliverable.getSubject());
			model.setIssueDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getIssueDate(), APIDateTimeUtils._TIMESTAMP));
			model.setExpireDate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getExpireDate(), APIDateTimeUtils._TIMESTAMP));
			model.setRevalidate(
				APIDateTimeUtils.convertDateToString(
					deliverable.getRevalidate(), APIDateTimeUtils._TIMESTAMP));
			model.setDeliverableState(
				String.valueOf(deliverable.getDeliverableState()));

			model.setDeliverableState(
				String.valueOf(deliverable.getDeliverableState()));

			return model;
		}
		else {
			return null;
		}
	}

	public static String mappingToDeliverableFormDataModel(
		List<Document> documents) {

		Document doc = documents.get(0);
		if (doc != null) {
			return doc.get(DeliverableTerm.FORM_DATA);
		}
		else {
			return null;
		}

	}

	public static JSONArray readExcelDeliverable(InputStream excelInputStream) {

		Workbook workbook = null;
		JSONArray results = JSONFactoryUtil.createJSONArray();

		try {

			workbook = new XSSFWorkbook(excelInputStream);
			//
			Sheet datatypeSheetOne = workbook.getSheetAt(0);
			int nOfRows = datatypeSheetOne.getPhysicalNumberOfRows();
			int nOfColumns = 1000;
			_log.debug("nOfRows: " + nOfRows);

			if (nOfRows > 1) {

				JSONObject formDataFormat = JSONFactoryUtil.createJSONObject();
				for (int i = 0; i < nOfColumns; i++) {
					Cell celli = datatypeSheetOne.getRow(0).getCell(i);
					if (Validator.isNotNull(celli) &&
						Validator.isNotNull(celli.getStringCellValue())) {
						formDataFormat.put(
							String.valueOf(i),
							datatypeSheetOne.getRow(0).getCell(
								i).getStringCellValue());
					}
					else {
						nOfColumns = i - 1;
						break;
					}
				}
				_log.debug("====dataForm__" + formDataFormat);
				_log.debug("====nOfColumns===" + nOfColumns);
				for (int i = 1; i < nOfRows; i++) {
					Row currentRow = datatypeSheetOne.getRow(i);
					if (currentRow != null) {

						// todo convert
						JSONObject deliverable = convertRowToDeliverable(
							currentRow, nOfColumns, formDataFormat);
						if (Validator.isNotNull(deliverable)) {

							results.put(deliverable);
						}
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (workbook != null) {
				try {
					workbook.close();
				}
				catch (IOException e) {
					e.printStackTrace();
					// _log.debug(e);
				}
			}
		}
		return results;
	}

	public static JSONObject convertRowToDeliverable(
		Row currentRow, int nOfColumns, JSONObject formDataFormat) {

		JSONObject formData = JSONFactoryUtil.createJSONObject();
		JSONObject deliverableObj = JSONFactoryUtil.createJSONObject();

		try {
			for (int i = 0; i <= nOfColumns; i++) {

				formData.put(
					formDataFormat.getString(String.valueOf(i)),
					getCellValue(currentRow.getCell(i)));
				deliverableObj.put(
					formDataFormat.getString(String.valueOf(i)),
					getCellValue(currentRow.getCell(i)));
			}

			deliverableObj.put("formData", formData);
		}
		catch (Exception e) {
			e.printStackTrace();
			// _log.error(e);
		}

		return deliverableObj;
	}

	public static Object getCellValue(Cell cell) {

		if (cell == null) {

			return null;
		}
		else if (CellType.STRING == cell.getCellType()) {

			return cell.getStringCellValue();
		}
		else if (CellType.BOOLEAN == cell.getCellType()) {

			return cell.getBooleanCellValue();
		}
		else if (CellType.ERROR == cell.getCellType()) {

			return cell.getErrorCellValue();
		}
		else if (CellType.NUMERIC == cell.getCellType()) {

			return cell.getNumericCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {

			return new SimpleDateFormat(APIDateTimeUtils._NORMAL_DATE).format(
				cell.getDateCellValue());
		}
		else {

			return null;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DeliverableUtils.class);

}
