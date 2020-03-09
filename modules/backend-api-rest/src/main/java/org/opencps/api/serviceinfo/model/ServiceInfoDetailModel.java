//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.20 at 06:27:33 PM ICT 
//


package org.opencps.api.serviceinfo.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="serviceInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regularText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administrationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="public_" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileTemplates" type="{}FileTemplates" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceConfigs" type="{}ServiceInfoServiceConfig" maxOccurs="unbounded" minOccurs="0"/>
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
    "serviceInfoId",
    "createDate",
    "modifiedDate",
    "serviceCode",
    "serviceName",
    "processText",
    "methodText",
    "dossierText",
    "conditionText",
    "durationText",
    "applicantText",
    "resultText",
    "regularText",
    "feeText",
    "administrationCode",
    "administrationName",
    "domainCode",
    "domainName",
    "maxLevel",
    "_public",
    "fileTemplates",
    "serviceConfigs",
    "active",
    "govAgencyText",
    "isNotarization"
})
@XmlRootElement(name = "ServiceInfoDetailModel")
public class ServiceInfoDetailModel {

    protected Long serviceInfoId;
    protected String createDate;
    protected String modifiedDate;
    protected String serviceCode;
    protected String serviceName;
    protected String processText;
    protected String methodText;
    protected String dossierText;
    protected String conditionText;
    protected String durationText;
    protected String applicantText;
    protected String resultText;
    protected String regularText;
    protected String feeText;
    protected String administrationCode;
    protected String administrationName;
    protected String domainCode;
    protected String domainName;
    protected Integer maxLevel;
    @XmlElement(name = "public")
    protected String _public;
    protected String govAgencyText;
    protected Boolean isNotarization;
    
    public Boolean getIsNotarization() {
		return isNotarization;
	}

	public void setIsNotarization(Boolean isNotarization) {
		this.isNotarization = isNotarization;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	protected String active;

    protected List<FileTemplates> fileTemplates;
    protected List<ServiceInfoServiceConfig> serviceConfigs;

    /**
     * Gets the value of the serviceInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceInfoId() {
        return serviceInfoId;
    }

    /**
     * Sets the value of the serviceInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceInfoId(Long value) {
        this.serviceInfoId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the processText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessText() {
        return processText;
    }

    /**
     * Sets the value of the processText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessText(String value) {
        this.processText = value;
    }

    /**
     * Gets the value of the methodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodText() {
        return methodText;
    }

    /**
     * Sets the value of the methodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodText(String value) {
        this.methodText = value;
    }

    /**
     * Gets the value of the dossierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierText() {
        return dossierText;
    }

    /**
     * Sets the value of the dossierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierText(String value) {
        this.dossierText = value;
    }

    /**
     * Gets the value of the conditionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionText() {
        return conditionText;
    }

    /**
     * Sets the value of the conditionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionText(String value) {
        this.conditionText = value;
    }

    /**
     * Gets the value of the durationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationText() {
        return durationText;
    }

    /**
     * Sets the value of the durationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationText(String value) {
        this.durationText = value;
    }

    /**
     * Gets the value of the applicantText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantText() {
        return applicantText;
    }

    /**
     * Sets the value of the applicantText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantText(String value) {
        this.applicantText = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

    /**
     * Gets the value of the regularText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularText() {
        return regularText;
    }

    /**
     * Sets the value of the regularText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularText(String value) {
        this.regularText = value;
    }

    /**
     * Gets the value of the feeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeText() {
        return feeText;
    }

    /**
     * Sets the value of the feeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeText(String value) {
        this.feeText = value;
    }

    /**
     * Gets the value of the administrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationCode() {
        return administrationCode;
    }

    /**
     * Sets the value of the administrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationCode(String value) {
        this.administrationCode = value;
    }

    /**
     * Gets the value of the administrationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationName() {
        return administrationName;
    }

    /**
     * Sets the value of the administrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationName(String value) {
        this.administrationName = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode(String value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the maxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Sets the value of the maxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLevel(Integer value) {
        this.maxLevel = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public String getPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublic(String value) {
        this._public = value;
    }

    /**
     * Gets the value of the fileTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileTemplates }
     * 
     * 
     */
    public List<FileTemplates> getFileTemplates() {
        if (fileTemplates == null) {
            fileTemplates = new ArrayList<FileTemplates>();
        }
        return this.fileTemplates;
    }

    /**
     * Gets the value of the serviceConfigs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConfigs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceConfigs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceInfoServiceConfig }
     * 
     * 
     */
    public List<ServiceInfoServiceConfig> getServiceConfigs() {
        if (serviceConfigs == null) {
            serviceConfigs = new ArrayList<ServiceInfoServiceConfig>();
        }
        return this.serviceConfigs;
    }

	public String getGovAgencyText() {
		return govAgencyText;
	}

	public void setGovAgencyText(String govAgencyText) {
		this.govAgencyText = govAgencyText;
	}

}
