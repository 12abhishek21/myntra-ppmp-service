
package com.ppmp.uniware.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TaxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RetailInvoiceSequence" type="{http://uniware.unicommerce.com/services/}WsSequence"/&gt;
 *         &lt;element name="TaxInvoiceSequence" type="{http://uniware.unicommerce.com/services/}WsSequence"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CstNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GSTNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityDTO", propOrder = {
    "type",
    "displayName",
    "enabled",
    "taxExempted",
    "retailInvoiceSequence",
    "taxInvoiceSequence",
    "name",
    "code",
    "pan",
    "tin",
    "cstNumber",
    "gstNumber",
    "stNumber",
    "website",
    "logoUrl"
})
public class FacilityDTO {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "TaxExempted")
    protected boolean taxExempted;
    @XmlElement(name = "RetailInvoiceSequence", required = true)
    protected WsSequence retailInvoiceSequence;
    @XmlElement(name = "TaxInvoiceSequence", required = true)
    protected WsSequence taxInvoiceSequence;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Pan", required = true)
    protected String pan;
    @XmlElement(name = "Tin", required = true)
    protected String tin;
    @XmlElement(name = "CstNumber", required = true)
    protected String cstNumber;
    @XmlElement(name = "GSTNumber", required = true)
    protected String gstNumber;
    @XmlElement(name = "StNumber", required = true)
    protected String stNumber;
    @XmlElement(name = "Website", required = true)
    protected String website;
    @XmlElement(name = "LogoUrl", required = true)
    protected String logoUrl;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the taxExempted property.
     * 
     */
    public boolean isTaxExempted() {
        return taxExempted;
    }

    /**
     * Sets the value of the taxExempted property.
     * 
     */
    public void setTaxExempted(boolean value) {
        this.taxExempted = value;
    }

    /**
     * Gets the value of the retailInvoiceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link WsSequence }
     *     
     */
    public WsSequence getRetailInvoiceSequence() {
        return retailInvoiceSequence;
    }

    /**
     * Sets the value of the retailInvoiceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsSequence }
     *     
     */
    public void setRetailInvoiceSequence(WsSequence value) {
        this.retailInvoiceSequence = value;
    }

    /**
     * Gets the value of the taxInvoiceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link WsSequence }
     *     
     */
    public WsSequence getTaxInvoiceSequence() {
        return taxInvoiceSequence;
    }

    /**
     * Sets the value of the taxInvoiceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsSequence }
     *     
     */
    public void setTaxInvoiceSequence(WsSequence value) {
        this.taxInvoiceSequence = value;
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
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the cstNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstNumber() {
        return cstNumber;
    }

    /**
     * Sets the value of the cstNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstNumber(String value) {
        this.cstNumber = value;
    }

    /**
     * Gets the value of the gstNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTNumber() {
        return gstNumber;
    }

    /**
     * Sets the value of the gstNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTNumber(String value) {
        this.gstNumber = value;
    }

    /**
     * Gets the value of the stNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStNumber() {
        return stNumber;
    }

    /**
     * Sets the value of the stNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStNumber(String value) {
        this.stNumber = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

}
