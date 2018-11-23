
package com.unicommerce.uniware.services;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GstTaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HSNCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemDetailFieldsText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name",
    "taxTypeCode",
    "gstTaxTypeCode",
    "hsnCode",
    "itemDetailFieldsText"
})
@XmlRootElement(name = "CreateOrEditCategoryRequest")
public class CreateOrEditCategoryRequest {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "TaxTypeCode", required = true)
    protected String taxTypeCode;
    @XmlElement(name = "GstTaxTypeCode", required = true)
    protected String gstTaxTypeCode;
    @XmlElement(name = "HSNCode", required = true)
    protected String hsnCode;
    @XmlElement(name = "ItemDetailFieldsText", required = true)
    protected String itemDetailFieldsText;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    /**
     * Gets the value of the gstTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstTaxTypeCode() {
        return gstTaxTypeCode;
    }

    /**
     * Sets the value of the gstTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstTaxTypeCode(String value) {
        this.gstTaxTypeCode = value;
    }

    /**
     * Gets the value of the hsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNCode() {
        return hsnCode;
    }

    /**
     * Sets the value of the hsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNCode(String value) {
        this.hsnCode = value;
    }

    /**
     * Gets the value of the itemDetailFieldsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDetailFieldsText() {
        return itemDetailFieldsText;
    }

    /**
     * Sets the value of the itemDetailFieldsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDetailFieldsText(String value) {
        this.itemDetailFieldsText = value;
    }

}
