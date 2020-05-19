//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.23 at 09:44:18 AM ICT 
//


package org.opencps.api.dossier.model;

import javax.ws.rs.DefaultValue;
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
 *         &lt;element name="referenceUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantIdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactTelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "referenceUid",
    "serviceCode",
    "serviceName",
    "govAgencyCode",
    "govAgencyName",
    "dossierTemplateNo",
    "applicantName",
    "applicantIdType",
    "applicantIdNo",
    "applicantIdDate",
    "address",
    "cityCode",
    "cityName",
    "districtCode",
    "districtName",
    "wardCode",
    "wardName",
    "contactName",
    "contactTelNo",
    "contactEmail",
    "password",
    "online",
    "notification",
    "applicantNote",
    "viaPostal",
    "postalAddress",
    "postalCityCode",
    "postalTelNo",
    "originality",
    "dossierNo",
    "createDate",
    "modifiedDate",
    "submitDate",
    "receiveDate",
    "dueDate",
    "releaseDate",
    "finishDate",
    "cancellingDate",
    "correcttingDate",
    "endorsementDate",
    "extendDate",
    "processDate",
    "dossierStatus",
    "dossierStatusText",
    "dossierSubStatus",
    "dossierSubStatusText",
    "isSameAsApplicant",
    "delegateName",
    "delegateIdNo",
    "delegateTelNo",
    "delegateEmail",
	"delegateAddress",
	"delegateCityCode",
	"delegateDistrictCode",
	"delegateWardCode",
	"dossierActionId",
	"submissionNote",
	"lockState",
	"counter",
	"postalCityName",
	"delegateCityName",
	"delegateDistrictName",
	"delegateWardName",
	"processNo",
	"durationCount",
	"durationUnit",
	"sampleCount",
	"dossierName",
	"mataData",
	"dossierCounter",
	"vnpostalStatus",
	"vnpostalProfile",
	"fromViaPostal"
})
@XmlRootElement(name = "DossierInputModel")
public class DossierPublishModel {
	@FormParam(value = "referenceUid")
    protected String referenceUid;
	@FormParam(value = "serviceCode")
    protected String serviceCode;
	@FormParam(value = "serviceName")
    protected String serviceName;	
	@FormParam(value = "govAgencyCode")
    protected String govAgencyCode;
	@FormParam(value = "govAgencyName")
    protected String govAgencyName;	
	@FormParam(value = "dossierTemplateNo")
    protected String dossierTemplateNo;
	@FormParam(value = "applicantName")
    protected String applicantName;
	@FormParam(value = "applicantIdType")
    protected String applicantIdType;
	@FormParam(value = "applicantIdNo")
    protected String applicantIdNo;
	@FormParam(value = "applicantIdDate")
    protected String applicantIdDate;
	@FormParam(value = "address")
    protected String address;
	@FormParam(value = "cityCode")
    protected String cityCode;
	@FormParam(value = "cityName")
    protected String cityName;	
	@FormParam(value = "districtCode")
    protected String districtCode;
	@FormParam(value = "districtName")
    protected String districtName;
	@FormParam(value = "wardCode")
    protected String wardCode;
	@FormParam(value = "wardName")
    protected String wardName;
	@FormParam(value = "contactName")
    protected String contactName;
	@FormParam(value = "contactTelNo")
    protected String contactTelNo;
	@FormParam(value = "contactEmail")
    protected String contactEmail;
	@FormParam(value = "password")
    protected String password;
	@FormParam(value = "online")
    protected String online;
	@FormParam(value = "notification")
    protected String notification;
	@FormParam(value = "applicantNote")
    protected String applicantNote;
	@FormParam(value = "viaPostal")
	protected int viaPostal;
	@FormParam(value = "postalAddress")
	protected String postalAddress;
	@FormParam(value = "postalCityCode")
	protected String postalCityCode;
	@FormParam(value = "postalTelNo")
	protected String postalTelNo;
	@FormParam(value = "originality")
	protected String originality;
	@FormParam(value = "dossierNo")
	protected String dossierNo;
	@FormParam(value = "createDate")
	protected String createDate;
	@FormParam(value = "modifiedDate")
	protected String modifiedDate;	
	@FormParam(value = "submitDate")
	protected String submitDate;
	@FormParam(value = "receiveDate")
	protected String receiveDate;
	@FormParam(value = "dueDate")
	protected String dueDate;
	@FormParam(value = "releaseDate")
	protected String releaseDate;
	@FormParam(value = "finishDate")
	protected String finishDate;
	@FormParam(value = "cancellingDate")
	protected String cancellingDate;
	@FormParam(value = "correcttingDate")
	protected String correcttingDate;
	@FormParam(value = "endorsementDate")
	protected String endorsementDate;
	@FormParam(value = "extendDate")
	protected String extendDate;
	@FormParam(value = "processDate")
	protected String processDate;	
	@FormParam(value = "dossierStatus")
	protected String dossierStatus;
	@FormParam(value = "dossierStatusText")
	protected String dossierStatusText;
	@FormParam(value = "dossierSubStatus")
	protected String dossierSubStatus;
	@FormParam(value = "dossierSubStatusText")
	protected String dossierSubStatusText;
	@FormParam(value = "isSameAsApplicant")
	private boolean isSameAsApplicant;
	@FormParam(value = "delegateName")
	private String delegateName;
	@FormParam(value = "delegateIdNo")
	private String delegateIdNo;
	@FormParam(value = "delegateTelNo")
	private String delegateTelNo;
	@FormParam(value = "delegateEmail")
	private String delegateEmail;
	@FormParam(value = "delegateAddress")
	private String delegateAddress;
	@FormParam(value = "delegateCityCode")
	private String delegateCityCode;
	@FormParam(value = "delegateDistrictCode")
	private String delegateDistrictCode;
	@FormParam(value = "delegateWardCode")
	private String delegateWardCode;
	@FormParam(value = "dossierActionId")
	private Long dossierActionId;
	@FormParam(value = "submissionNote")
	private String submissionNote;
	@FormParam(value = "lockState")
	private String lockState;	
	@FormParam(value = "counter")
	private Integer counter;	
	@FormParam(value = "postalCityName")
	protected String postalCityName;
	@FormParam(value = "delegateCityName")
	protected String delegateCityName;
	@FormParam(value = "delegateDistrictName")
	protected String delegateDistrictName;
	@FormParam(value = "delegateWardName")
	protected String delegateWardName;
	@FormParam(value = "processNo")
	protected String processNo;
	@FormParam(value = "durationCount")
	@DefaultValue("0")
	protected Double durationCount;
	@DefaultValue("0")
	@FormParam(value = "durationUnit")
	protected Integer durationUnit;
	@FormParam(value = "sampleCount")
	protected Integer sampleCount;
	@FormParam(value = "dossierName")
	protected String dossierName;
	@FormParam(value = "metaData")
	protected String metaData;
	@FormParam(value = "dossierCounter")
	protected String dossierCounter;
	@FormParam(value = "vnpostalStatus")
	protected Integer vnpostalStatus;
	@FormParam(value = "vnpostalProfile")
	protected String vnpostalProfile;
	@FormParam(value = "fromViaPostal")
	protected Integer fromViaPostal;

	public Integer getFromViaPostal() {
		return fromViaPostal;
	}

	public void setFromViaPostal(Integer fromViaPostal) {
		this.fromViaPostal = fromViaPostal;
	}

	public Integer getVnpostalStatus() {
		return vnpostalStatus;
	}

	public void setVnpostalStatus(Integer vnpostalStatus) {
		this.vnpostalStatus = vnpostalStatus;
	}

	public String getVnpostalProfile() {
		return vnpostalProfile;
	}

	public void setVnpostalProfile(String vnpostalProfile) {
		this.vnpostalProfile = vnpostalProfile;
	}

	public String getDossierCounter() {
		return dossierCounter;
	}

	public void setDossierCounter(String dossierCounter) {
		this.dossierCounter = dossierCounter;
	}

	public int getViaPostal() {
		return viaPostal;
	}

	public void setViaPostal(int viaPostal) {
		this.viaPostal = viaPostal;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getPostalCityCode() {
		return postalCityCode;
	}

	public void setPostalCityCode(String postalCityCode) {
		this.postalCityCode = postalCityCode;
	}

	public String getPostalTelNo() {
		return postalTelNo;
	}

	public void setPostalTelNo(String postalTelNo) {
		this.postalTelNo = postalTelNo;
	}

	public String getApplicantNote() {
		return applicantNote;
	}

	public void setApplicantNote(String applicantNote) {
		this.applicantNote = applicantNote;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	/**
     * Gets the value of the referenceUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceUid() {
        return referenceUid;
    }

    /**
     * Sets the value of the referenceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceUid(String value) {
        this.referenceUid = value;
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
     * Gets the value of the govAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovAgencyCode() {
        return govAgencyCode;
    }

    /**
     * Sets the value of the govAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovAgencyCode(String value) {
        this.govAgencyCode = value;
    }

    /**
     * Gets the value of the govAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovAgencyName() {
        return govAgencyName;
    }

    /**
     * Sets the value of the govAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovAgencyName(String value) {
        this.govAgencyName = value;
    }
    
    /**
     * Gets the value of the dossierTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierTemplateNo() {
        return dossierTemplateNo;
    }

    /**
     * Sets the value of the dossierTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierTemplateNo(String value) {
        this.dossierTemplateNo = value;
    }

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantName(String value) {
        this.applicantName = value;
    }

    /**
     * Gets the value of the applicantIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantIdType() {
        return applicantIdType;
    }

    /**
     * Sets the value of the applicantIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantIdType(String value) {
        this.applicantIdType = value;
    }

    /**
     * Gets the value of the applicantIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantIdNo() {
        return applicantIdNo;
    }

    /**
     * Sets the value of the applicantIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantIdNo(String value) {
        this.applicantIdNo = value;
    }

    /**
     * Gets the value of the applicantIdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantIdDate() {
        return applicantIdDate;
    }

    /**
     * Sets the value of the applicantIdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantIdDate(String value) {
        this.applicantIdDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }
    
    /**
     * Gets the value of the districtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCode(String value) {
        this.districtCode = value;
    }

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }
    
    /**
     * Gets the value of the wardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardCode() {
        return wardCode;
    }

    /**
     * Sets the value of the wardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardCode(String value) {
        this.wardCode = value;
    }

    /**
     * Gets the value of the wardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * Sets the value of the wardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardName(String value) {
        this.wardName = value;
    }
    
    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactTelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelNo() {
        return contactTelNo;
    }

    /**
     * Sets the value of the contactTelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelNo(String value) {
        this.contactTelNo = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnline(String value) {
        this.online = value;
    }

    /**
     * Gets the value of the originality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginality() {
        return originality;
    }

    /**
     * Sets the value of the originality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginality(String value) {
        this.originality = value;
    } 

    /**
     * Gets the value of the dossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNo() {
        return dossierNo;
    }

    /**
     * Sets the value of the dossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNo(String value) {
        this.dossierNo = value;
    } 

    public String getCreateDate() {
    	return createDate;
    }
    
    public void setCreateDate(String value) {
    	this.createDate = value;
    }
    
    public String getModifiedDate() {
    	return modifiedDate;
    }
    
    public void setModifiedDate(String value) {
    	this.modifiedDate = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitDate(String value) {
        this.submitDate = value;
    } 

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(String value) {
        this.receiveDate = value;
    } 

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    public String getReleaseDate() {
    	return releaseDate;
    }
    
    public void setReleaseDate(String value) {
    	this.releaseDate = value;
    }
    
    public String getFinishDate() {
    	return finishDate;
    }
    
    public void setFinishDate(String value) {
    	this.finishDate = value;
    }
    
    public String getCancellingDate() {
    	return cancellingDate;
    }
    
    public void setCancellingDate(String value) {
    	this.cancellingDate = value;
    }
    
    public String getCorrecttingDate() {
    	return correcttingDate;
    }
    
    public void setCorrectingDate(String value) {
    	this.correcttingDate = value;
    }
    
    public String getEndorsementDate() {
    	return endorsementDate;
    }
    
    public void setEndorsementDate(String value) {
    	this.createDate = value;
    }
    
    public String getExtendDate() {
    	return extendDate;
    }
    
    public void setExtendDate(String value) {
    	this.extendDate = value;
    }
    
    public String getProcessDate() {
    	return processDate;
    }
    
    public void setProcessDate(String value) {
    	this.processDate = value;
    }
    
	public String getDossierStatus() {
		return dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		this.dossierStatus = dossierStatus;
	}

	public String getDossierStatusText() {
		return dossierStatusText;
	}

	public void setDossierStatusText(String dossierStatusText) {
		this.dossierStatusText = dossierStatusText;
	}

	public String getDossierSubStatus() {
		return dossierSubStatus;
	}

	public void setDossierSubStatus(String dossierSubStatus) {
		this.dossierSubStatus = dossierSubStatus;
	}

	public String getDossierSubStatusText() {
		return dossierSubStatusText;
	}

	public void setDossierSubStatusText(String dossierSubStatusText) {
		this.dossierSubStatusText = dossierSubStatusText;
	}

	public boolean isSameAsApplicant() {
		return isSameAsApplicant;
	}

	public void setSameAsApplicant(boolean isSameAsApplicant) {
		this.isSameAsApplicant = isSameAsApplicant;
	}

	public String getDelegateName() {
		return delegateName;
	}

	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}

	public String getDelegateIdNo() {
		return delegateIdNo;
	}

	public void setDelegateIdNo(String delegateIdNo) {
		this.delegateIdNo = delegateIdNo;
	}

	public String getDelegateTelNo() {
		return delegateTelNo;
	}

	public void setDelegateTelNo(String delegateTelNo) {
		this.delegateTelNo = delegateTelNo;
	}

	public String getDelegateEmail() {
		return delegateEmail;
	}

	public void setDelegateEmail(String delegateEmail) {
		this.delegateEmail = delegateEmail;
	}

	public String getDelegateAddress() {
		return delegateAddress;
	}

	public void setDelegateAddress(String delegateAddress) {
		this.delegateAddress = delegateAddress;
	}

	public String getDelegateCityCode() {
		return delegateCityCode;
	}

	public void setDelegateCityCode(String delegateCityCode) {
		this.delegateCityCode = delegateCityCode;
	}

	public String getDelegateDistrictCode() {
		return delegateDistrictCode;
	}

	public void setDelegateDistrictCode(String delegateDistrictCode) {
		this.delegateDistrictCode = delegateDistrictCode;
	}

	public String getDelegateWardCode() {
		return delegateWardCode;
	}

	public void setDelegateWardCode(String delegateWardCode) {
		this.delegateWardCode = delegateWardCode;
	}

	public Long getDossierActionId() {
		return dossierActionId;
	}

	public void setDossierActionId(Long dossierActionId) {
		this.dossierActionId = dossierActionId;
	} 

	public String getSubmissionNote() {
		return submissionNote;
	}

	public void setSubmissionNote(String value) {
		this.submissionNote = value;
	} 	
	
	public String getLockState() {
		return lockState;
	}

	public void setLockState(String value) {
		this.lockState = value;
	} 
	
	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer value) {
		this.counter = value;
	} 
	
	public String getPostalCityName() {
		return postalCityName;
	}

	public void setPostalCityName(String value) {
		this.postalCityName = value;
	} 
	
	public String getDelegateCityName() {
		return delegateCityName;
	}

	public void setDelegateCityName(String value) {
		this.delegateCityName = value;
	} 
	
	public String getDelegateDistrictName() {
		return delegateDistrictName;
	}

	public void setDelegateDistrictName(String value) {
		this.delegateDistrictName = value;
	} 
	
	public String getDelegateWardName() {
		return delegateWardName;
	}

	public void setDelegateWardName(String value) {
		this.delegateWardName = value;
	} 
	
	public String getProcessNo() {
		return processNo;
	}

	public void setProcessNo(String value) {
		this.processNo = value;
	}
	
	public Double getDurationCount() {
		return durationCount;
	}

	public void setDurationCount(Double value) {
		this.durationCount = value;
	}
	
	public Integer getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(Integer value) {
		this.durationUnit = value;
	}
	
	public Integer getSampleCount() {
		return sampleCount;
	}

	public void setSampleCount(Integer value) {
		this.sampleCount = value;
	}
	
	public String getDossierName() {
		return dossierName;
	}

	public void setDossierName(String value) {
		this.dossierName = value;
	}

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public void setCorrecttingDate(String correcttingDate) {
		this.correcttingDate = correcttingDate;
	}

}
