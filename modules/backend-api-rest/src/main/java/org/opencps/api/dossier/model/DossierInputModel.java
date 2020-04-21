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
 *         &lt;element name="serverNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "govAgencyCode",
    "dossierTemplateNo",
    "applicantName",
    "applicantIdType",
    "applicantIdNo",
    "applicantIdDate",
    "address",
    "cityCode",
    "districtCode",
    "wardCode",
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
    "submitDate",
    "receiveDate",
    "dueDate",
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
	"delegateCityName",	
	"delegateDistrictCode",
	"delegateDistrictName",
	"delegateWardCode",
	"delegateWardName",
	"sampleCount",
	"serviceName",
	"dossierName",
	"postalCityName",
	"postalServiceCode",
	"postalServiceName",
	"postalDistrictCode",
	"postalDistrictName",
	"postalWardCode",
	"postalWardName",
	"dossierMarkArr",
	"dossierFileArr",
	"dossiers",
	"payment",
	"importing",
	"serverNo",
	"metaData",
	"delegateType",
	"documentNo",
	"documentDate",
	"systemId",
	"dossierCounter",
	"dvcqgIntegration"
})
@XmlRootElement(name = "DossierInputModel")
public class DossierInputModel {
	@FormParam(value = "referenceUid")
    protected String referenceUid;
	@FormParam(value = "serviceCode")
    protected String serviceCode;
	@FormParam(value = "govAgencyCode")
    protected String govAgencyCode;
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
	@FormParam(value = "districtCode")
    protected String districtCode;
	@FormParam(value = "wardCode")
    protected String wardCode;
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
	protected Integer viaPostal;
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
	@FormParam(value = "submitDate")
	protected String submitDate;
	@FormParam(value = "receiveDate")
	protected String receiveDate;
	@FormParam(value = "dueDate")
	protected String dueDate;
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
	@FormParam(value = "delegateCityName")
	private String delegateCityName;
	@FormParam(value = "delegateDistrictCode")
	private String delegateDistrictCode;
	@FormParam(value = "delegateDistrictName")
	private String delegateDistrictName;
	@FormParam(value = "delegateWardCode")
	private String delegateWardCode;
	@FormParam(value = "delegateWardName")
	private String delegateWardName;
	@FormParam(value = "sampleCount")
	private Long sampleCount;
	@FormParam(value = "briefNote")
	private String briefNote;
	@FormParam(value = "serviceName")
	private String serviceName;
	@FormParam(value = "dossierName")
	private String dossierName;
	@FormParam(value = "postalCityName")
	private String postalCityName;
	@FormParam(value = "postalServiceCode")
	private String postalServiceCode;
	@FormParam(value = "postalServiceName")
	private String postalServiceName;
	@FormParam(value = "postalDistrictCode")
	private String postalDistrictCode;
	@FormParam(value = "postalDistrictName")
	private String postalDistrictName;
	@FormParam(value = "postalWardCode")
	private String postalWardCode;
	@FormParam(value = "postalWardName")
	private String postalWardName;
	@FormParam(value = "originDossierNo")
	private String originDossierNo;
	@FormParam(value = "dossierMarkArr")
	private String dossierMarkArr;
	@FormParam(value = "importing")
	@DefaultValue("false")
	private String importing;
	@FormParam(value = "dossierFileArr")
	private String dossierFileArr;
	@FormParam(value = "dossiers")
	private String dossiers;
	@FormParam(value = "payment")
	private String payment;
	@FormParam(value = "serverNo")
	private String serverNo;
	@FormParam(value = "metaData")
	private String metaData;
	@FormParam(value = "systemId")
	private Integer systemId;
	@FormParam(value = "dossierCounter")
	private String dossierCounter;
	@FormParam(value = "dvcqgIntegration")
	private Boolean dvcqgIntegration;
	@FormParam(value = "vnpostalStatus")
	protected Integer vnpostalStatus;
	@FormParam(value = "vnpostalProfile")
	protected String vnpostalProfile;

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

	public Boolean getDvcqgIntegration() {
		return dvcqgIntegration;
	}

	public void setDvcqgIntegration(Boolean dvcqgIntegration) {
		this.dvcqgIntegration = dvcqgIntegration;
	}

	public String getDossierCounter() {
		return dossierCounter;
	}

	public void setDossierCounter(String dossierCounter) {
		this.dossierCounter = dossierCounter;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public Integer getDelegateType() {
		return delegateType;
	}

	public void setDelegateType(Integer delegateType) {
		this.delegateType = delegateType;
	}

	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public Long getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Long documentDate) {
		this.documentDate = documentDate;
	}

	@FormParam(value = "delegateType")
	private Integer delegateType;
	@FormParam(value = "documentNo")
	private String documentNo;
	@FormParam(value = "documentDate")
	private Long documentDate;

	
	public Integer getViaPostal() {
		return viaPostal;
	}

	public void setViaPostal(Integer viaPostal) {
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

	public String getDelegateCityName() {
		return delegateCityName;
	}

	public void setDelegateCityName(String delegateCityName) {
		this.delegateCityName = delegateCityName;
	}
	
	public String getDelegateDistrictCode() {
		return delegateDistrictCode;
	}

	public void setDelegateDistrictCode(String delegateDistrictCode) {
		this.delegateDistrictCode = delegateDistrictCode;
	}

	public String getDelegateDistrictName() {
		return delegateDistrictName;
	}

	public void setDelegateDistrictName(String delegateDistrictName) {
		this.delegateDistrictName = delegateDistrictName;
	}
	
	public String getDelegateWardCode() {
		return delegateWardCode;
	}

	public void setDelegateWardCode(String delegateWardCode) {
		this.delegateWardCode = delegateWardCode;
	}

	public String getDelegateWardName() {
		return delegateWardName;
	}

	public void setDelegateWardName(String delegateWardName) {
		this.delegateWardName = delegateWardName;
	}
	
	public Long getSampleCount() {
		return sampleCount;
	}

	public void setSampleCount(Long sampleCount) {
		this.sampleCount = sampleCount;
	} 

	public String getBriefNote() {
		return briefNote;
	}
	
	public void setBriefNote(String value) {
		this.briefNote = value;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDossierName() {
		return dossierName;
	}

	public void setDossierName(String dossierName) {
		this.dossierName = dossierName;
	}

	public String getPostalCityName() {
		return postalCityName;
	}
	
	public void setPostalCityName(String value) {
		this.postalCityName = value;
	}

	public String getPostalServiceCode() {
		return postalServiceCode;
	}
	
	public void setPostalServiceCode(String value) {
		this.postalServiceCode = value;
	}

	public String getPostalServiceName() {
		return postalServiceName;
	}
	
	public void setPostalServiceName(String value) {
		this.postalServiceName = value;
	}

	public String getPostalDistrictCode() {
		return postalDistrictCode;
	}
	
	public void setPostalDistrictCode(String value) {
		this.postalDistrictCode = value;
	}

	public String getPostalDistrictName() {
		return postalDistrictName;
	}
	
	public void setPostalDistrictName(String value) {
		this.postalDistrictName = value;
	}

	public String getPostalWardCode() {
		return postalWardCode;
	}
	
	public void setPostalWardCode(String value) {
		this.postalWardCode = value;
	}

	public String getPostalWardName() {
		return postalWardName;
	}
	
	public void setPostalWardName(String value) {
		this.postalWardName = value;
	}

	public String getOriginDossierNo() {
		return originDossierNo;
	}
	
	public void setOriginDossierNo(String value) {
		this.originDossierNo = value;
	}

	public String getDossierMarkArr() {
		return dossierMarkArr;
	}

	public void setDossierMarkArr(String dossierMarkArr) {
		this.dossierMarkArr = dossierMarkArr;
	}

	public String getImporting() {
		return importing;
	}

	public void setImporting(String importing) {
		this.importing = importing;
	}

	public String getDossierFileArr() {
		return dossierFileArr;
	}

	public void setDossierFileArr(String dossierFileArr) {
		this.dossierFileArr = dossierFileArr;
	}

	public String getDossiers() {
		return dossiers;
	}

	public void setDossiers(String dossiers) {
		this.dossiers = dossiers;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getServerNo() {
		return serverNo;
	}

	public void setServerNo(String serverNo) {
		this.serverNo = serverNo;
	}
	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

}
