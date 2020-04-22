package org.opencps.api.vnpost.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VNPostGetOrderModel", propOrder = { "customerCode", "orderNumber", "govAgencyCode" })
public class VNPostCancelOrderModel {
	
	@FormParam(value = "customerCode")
	private String customerCode;
	
	@FormParam(value = "orderNumber")
	private String orderNumber;

	@FormParam(value = "govAgencyCode")
	private String govAgencyCode;
	
	public String getGovAgencyCode() {
		return govAgencyCode;
	}

	public void setGovAgencyCode(String govAgencyCode) {
		this.govAgencyCode = govAgencyCode;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
}
