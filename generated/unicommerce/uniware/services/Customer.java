
package com.unicommerce.uniware.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProvidesCForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DualCompanyRetail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredDealer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CstNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GSTNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}WsPartyAddress"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}WsPartyAddress"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "providesCForm",
    "dualCompanyRetail",
    "enabled",
    "taxExempted",
    "registeredDealer",
    "name",
    "code",
    "pan",
    "tin",
    "cstNumber",
    "gstNumber",
    "stNumber",
    "website",
    "billingAddress",
    "shippingAddress"
})
public class Customer {

    @XmlElement(name = "ProvidesCForm")
    protected boolean providesCForm;
    @XmlElement(name = "DualCompanyRetail")
    protected boolean dualCompanyRetail;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "TaxExempted")
    protected Boolean taxExempted;
    @XmlElement(name = "RegisteredDealer")
    protected Boolean registeredDealer;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Pan")
    protected String pan;
    @XmlElement(name = "Tin")
    protected String tin;
    @XmlElement(name = "CstNumber")
    protected String cstNumber;
    @XmlElement(name = "GSTNumber")
    protected String gstNumber;
    @XmlElement(name = "StNumber")
    protected String stNumber;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "BillingAddress", required = true)
    protected WsPartyAddress billingAddress;
    @XmlElement(name = "ShippingAddress", required = true)
    protected WsPartyAddress shippingAddress;

    /**
     * Gets the value of the providesCForm property.
     * 
     */
    public boolean isProvidesCForm() {
        return providesCForm;
    }

    /**
     * Sets the value of the providesCForm property.
     * 
     */
    public void setProvidesCForm(boolean value) {
        this.providesCForm = value;
    }

    /**
     * Gets the value of the dualCompanyRetail property.
     * 
     */
    public boolean isDualCompanyRetail() {
        return dualCompanyRetail;
    }

    /**
     * Sets the value of the dualCompanyRetail property.
     * 
     */
    public void setDualCompanyRetail(boolean value) {
        this.dualCompanyRetail = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the taxExempted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempted() {
        return taxExempted;
    }

    /**
     * Sets the value of the taxExempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempted(Boolean value) {
        this.taxExempted = value;
    }

    /**
     * Gets the value of the registeredDealer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegisteredDealer() {
        return registeredDealer;
    }

    /**
     * Sets the value of the registeredDealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegisteredDealer(Boolean value) {
        this.registeredDealer = value;
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
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WsPartyAddress }
     *     
     */
    public WsPartyAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPartyAddress }
     *     
     */
    public void setBillingAddress(WsPartyAddress value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WsPartyAddress }
     *     
     */
    public WsPartyAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPartyAddress }
     *     
     */
    public void setShippingAddress(WsPartyAddress value) {
        this.shippingAddress = value;
    }

}
