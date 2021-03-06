//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 11:53:08 AM ICT 
//


package org.opencps.api.serviceprocess.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processActionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowAssignUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDossierFiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDossierFiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="makeBriefNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rollbackable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processActionId",
    "actionCode",
    "actionName",
    "preStepCode",
    "postStepCode",
    "autoEvent",
    "preCondition",
    "allowAssignUser",
    "assignUserId",
    "assignUserName",
    "requestPayment",
    "paymentFee",
    "createDossierFiles",
    "returnDossierFiles",
    "makeBriefNote",
    "syncActionCode",
    "rollbackable",
    "createDossierNo",
    "eSignature",
    "configNote",
    "dossierTemplateNo",
    "createDossiers",
    "signatureType"
})
@XmlRootElement(name = "ProcessActionInputModel")
public class ProcessActionInputModel {
	@FormParam("processActionId")
    protected long processActionId;
	@FormParam("actionCode")
    protected String actionCode;
	@FormParam("actionName")
    protected String actionName;
	@FormParam("preStepCode")
    protected String preStepCode;
	@FormParam("postStepCode")
    protected String postStepCode;
	@FormParam("autoEvent")
    protected String autoEvent;
	@FormParam("preCondition")
    protected String preCondition;
	@FormParam("allowAssignUser")
    protected String allowAssignUser;
	@FormParam("assignUserId")
    protected String assignUserId;
	@FormParam("assignUserName")
    protected String assignUserName;
	@FormParam("requestPayment")
    protected String requestPayment;
	@FormParam("paymentFee")
    protected String paymentFee;
	@FormParam("createDossierFiles")
    protected String createDossierFiles;
	@FormParam("returnDossierFiles")
    protected String returnDossierFiles;
	@FormParam("makeBriefNote")
    protected String makeBriefNote;
	@FormParam("syncActionCode")
    protected String syncActionCode;
	@FormParam("rollbackable")
    protected String rollbackable;
	@FormParam("createDossierNo")
    protected boolean createDossierNo;
	@FormParam("eSignature")
    protected boolean eSignature;
	@FormParam("dossierTemplateNo")
	protected String dossierTemplateNo;
	@FormParam("createDossiers")
	protected String createDossiers;
	
	@FormParam("configNote")
	protected String configNote;
	@FormParam("signatureType")
	protected String signatureType;
	
	public String getDossierTemplateNo() {
		return dossierTemplateNo;
	}

	public void setDossierTemplateNo(String dossierTemplateNo) {
		this.dossierTemplateNo = dossierTemplateNo;
	}

	public String getConfigNote() {
		return configNote;
	}

	public void setConfigNote(String configNote) {
		this.configNote = configNote;
	}

	public boolean isCreateDossierNo() {
		return createDossierNo;
	}

	public void setCreateDossierNo(boolean createDossierNo) {
		this.createDossierNo = createDossierNo;
	}

	public boolean iseSignature() {
		return eSignature;
	}

	public void seteSignature(boolean eSignature) {
		this.eSignature = eSignature;
	}

	/**
     * Gets the value of the processActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public long getProcessActionId() {
        return processActionId;
    }

    /**
     * Sets the value of the processActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessActionId(long value) {
        this.processActionId = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the preStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreStepCode() {
        return preStepCode;
    }

    /**
     * Sets the value of the preStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreStepCode(String value) {
        this.preStepCode = value;
    }

    /**
     * Gets the value of the postStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostStepCode() {
        return postStepCode;
    }

    /**
     * Sets the value of the postStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostStepCode(String value) {
        this.postStepCode = value;
    }

    /**
     * Gets the value of the autoEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEvent() {
        return autoEvent;
    }

    /**
     * Sets the value of the autoEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEvent(String value) {
        this.autoEvent = value;
    }

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition(String value) {
        this.preCondition = value;
    }

    /**
     * Gets the value of the allowAssignUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAssignUser() {
        return allowAssignUser;
    }

    /**
     * Sets the value of the allowAssignUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAssignUser(String value) {
        this.allowAssignUser = value;
    }

    /**
     * Gets the value of the assignUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignUserId() {
        return assignUserId;
    }

    /**
     * Sets the value of the assignUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignUserId(String value) {
        this.assignUserId = value;
    }

    /**
     * Gets the value of the assignUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignUserName() {
        return assignUserName;
    }

    /**
     * Sets the value of the assignUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignUserName(String value) {
        this.assignUserName = value;
    }

    /**
     * Gets the value of the requestPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestPayment() {
        return requestPayment;
    }

    /**
     * Sets the value of the requestPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPayment(String value) {
        this.requestPayment = value;
    }

    /**
     * Gets the value of the paymentFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFee() {
        return paymentFee;
    }

    /**
     * Sets the value of the paymentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFee(String value) {
        this.paymentFee = value;
    }

    /**
     * Gets the value of the createDossierFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDossierFiles() {
        return createDossierFiles;
    }

    /**
     * Sets the value of the createDossierFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDossierFiles(String value) {
        this.createDossierFiles = value;
    }

    /**
     * Gets the value of the returnDossierFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDossierFiles() {
        return returnDossierFiles;
    }

    /**
     * Sets the value of the returnDossierFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDossierFiles(String value) {
        this.returnDossierFiles = value;
    }

    /**
     * Gets the value of the makeBriefNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeBriefNote() {
        return makeBriefNote;
    }

    /**
     * Sets the value of the makeBriefNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeBriefNote(String value) {
        this.makeBriefNote = value;
    }

    /**
     * Gets the value of the syncActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncActionCode() {
        return syncActionCode;
    }

    /**
     * Sets the value of the syncActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncActionCode(String value) {
        this.syncActionCode = value;
    }

    /**
     * Gets the value of the rollbackable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollbackable() {
        return rollbackable;
    }

    /**
     * Sets the value of the rollbackable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollbackable(String value) {
        this.rollbackable = value;
    }

    public String getCreateDossiers() {
    	return createDossiers;
    }
    
    public void setCreateDossies(String value) {
    	this.createDossiers = value;
    }

    public String getSignatureType() {
    	return signatureType;
    }
    
    public void setSignatureType(String value) {
    	this.signatureType = value;
    }
}
