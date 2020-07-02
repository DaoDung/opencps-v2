//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.27 at 11:42:22 AM ICT 
//


package org.opencps.api.v21.model;

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
 *         &lt;element name="ServiceConfig" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="govAgencyCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="govAgencyName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="serviceInstruction">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="serviceUrl">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="forCitizen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="forBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="postalService" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{}processes"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "serviceConfig"
})
@XmlRootElement(name = "configs")
public class Configs {

    @XmlElement(name = "ServiceConfig", required = true)
    protected List<Configs.ServiceConfig> serviceConfig;

    /**
     * Gets the value of the serviceConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configs.ServiceConfig }
     * 
     * 
     */
    public List<Configs.ServiceConfig> getServiceConfig() {
        if (serviceConfig == null) {
            serviceConfig = new ArrayList<Configs.ServiceConfig>();
        }
        return this.serviceConfig;
    }


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
     *         &lt;element name="govAgencyCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="govAgencyName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="serviceInstruction">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="serviceUrl">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="forCitizen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="forBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="postalService" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{}processes"/>
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
        "govAgencyCode",
        "govAgencyName",
        "serviceInstruction",
        "serviceLevel",
        "serviceUrl",
        "forCitizen",
        "forBusiness",
        "postalService",
        "registration",
        "processes"
    })
    public static class ServiceConfig {

        @XmlElement(required = true)
        protected String govAgencyCode;
        @XmlElement(required = true)
        protected String govAgencyName;
        @XmlElement(required = true)
        protected String serviceInstruction;
        protected int serviceLevel;
        @XmlElement(required = true)
        protected String serviceUrl;
        protected boolean forCitizen;
        protected boolean forBusiness;
        protected boolean postalService;
        protected boolean registration;
        @XmlElement(required = true)
        protected Processes processes;

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
         * Gets the value of the serviceInstruction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceInstruction() {
            return serviceInstruction;
        }

        /**
         * Sets the value of the serviceInstruction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceInstruction(String value) {
            this.serviceInstruction = value;
        }

        /**
         * Gets the value of the serviceLevel property.
         * 
         */
        public int getServiceLevel() {
            return serviceLevel;
        }

        /**
         * Sets the value of the serviceLevel property.
         * 
         */
        public void setServiceLevel(int value) {
            this.serviceLevel = value;
        }

        /**
         * Gets the value of the serviceUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceUrl() {
            return serviceUrl;
        }

        /**
         * Sets the value of the serviceUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceUrl(String value) {
            this.serviceUrl = value;
        }

        /**
         * Gets the value of the forCitizen property.
         * 
         */
        public boolean isForCitizen() {
            return forCitizen;
        }

        /**
         * Sets the value of the forCitizen property.
         * 
         */
        public void setForCitizen(boolean value) {
            this.forCitizen = value;
        }

        /**
         * Gets the value of the forBusiness property.
         * 
         */
        public boolean isForBusiness() {
            return forBusiness;
        }

        /**
         * Sets the value of the forBusiness property.
         * 
         */
        public void setForBusiness(boolean value) {
            this.forBusiness = value;
        }

        /**
         * Gets the value of the postalService property.
         * 
         */
        public boolean isPostalService() {
            return postalService;
        }

        /**
         * Sets the value of the postalService property.
         * 
         */
        public void setPostalService(boolean value) {
            this.postalService = value;
        }

        /**
         * Gets the value of the registration property.
         * 
         */
        public boolean isRegistration() {
            return registration;
        }

        /**
         * Sets the value of the registration property.
         * 
         */
        public void setRegistration(boolean value) {
            this.registration = value;
        }

        /**
         * Gets the value of the processes property.
         * 
         * @return
         *     possible object is
         *     {@link Processes }
         *     
         */
        public Processes getProcesses() {
            return processes;
        }

        /**
         * Sets the value of the processes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Processes }
         *     
         */
        public void setProcesses(Processes value) {
            this.processes = value;
        }

    }

}
