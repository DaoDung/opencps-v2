//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.24 at 03:09:32 PM ICT 
//


package org.opencps.api.datamgtsync.model;

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
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dictCollectionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treeIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sibling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="metaData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "createDate",
    "modifiedDate",
    "dictCollectionCode",
    "itemCode",
    "itemName",
    "itemNameEN",
    "itemDescription",
    "parentItemCode",
    "treeIndex",
    "sibling",
    "level",
    "metaData"
})
@XmlRootElement(name = "DictItemModel")
public class DictItemModel {

    protected long createDate;
    protected long modifiedDate;
    @XmlElement(required = true)
    protected String dictCollectionCode;
    @XmlElement(required = true)
    protected String itemCode;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String itemNameEN;
    @XmlElement(required = true)
    protected String itemDescription;
    @XmlElement(required = true)
    protected String parentItemCode;
    @XmlElement(required = true)
    protected String treeIndex;
    @XmlElement(required = true)
    protected String sibling;
    protected int level;
    @XmlElement(required = true)
    protected String metaData;

    /**
     * Gets the value of the createDate property.
     * 
     */
    public long getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     */
    public void setCreateDate(long value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     */
    public long getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     */
    public void setModifiedDate(long value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the dictCollectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictCollectionCode() {
        return dictCollectionCode;
    }

    /**
     * Sets the value of the dictCollectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictCollectionCode(String value) {
        this.dictCollectionCode = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNameEN() {
        return itemNameEN;
    }

    /**
     * Sets the value of the itemNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNameEN(String value) {
        this.itemNameEN = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the parentItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentItemCode() {
        return parentItemCode;
    }

    /**
     * Sets the value of the parentItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentItemCode(String value) {
        this.parentItemCode = value;
    }

    /**
     * Gets the value of the treeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeIndex() {
        return treeIndex;
    }

    /**
     * Sets the value of the treeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeIndex(String value) {
        this.treeIndex = value;
    }

    /**
     * Gets the value of the sibling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSibling() {
        return sibling;
    }

    /**
     * Sets the value of the sibling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSibling(String value) {
        this.sibling = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaData(String value) {
        this.metaData = value;
    }

}
