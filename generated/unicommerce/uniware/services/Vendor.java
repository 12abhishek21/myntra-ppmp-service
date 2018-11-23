
package com.unicommerce.uniware.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vendor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vendor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchaseExpiryPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AcceptsCForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
 *         &lt;element name="Agreements" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Agreement" type="{http://uniware.unicommerce.com/services/}VendorAgreement" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CstNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GSTNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredDealer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}WsPartyAddress"/&gt;
 *         &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}WsPartyAddress"/&gt;
 *         &lt;element name="PartyContacts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PartyContact" type="{http://uniware.unicommerce.com/services/}PartyContact" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendor", propOrder = {
    "purchaseExpiryPeriod",
    "acceptsCForm",
    "customFields",
    "agreements",
    "code",
    "name",
    "pan",
    "tin",
    "cstNumber",
    "gstNumber",
    "stNumber",
    "website",
    "enabled",
    "registeredDealer",
    "taxExempted",
    "shippingAddress",
    "billingAddress",
    "partyContacts"
})
public class Vendor {

    @XmlElement(name = "PurchaseExpiryPeriod")
    protected BigInteger purchaseExpiryPeriod;
    @XmlElement(name = "AcceptsCForm")
    protected Boolean acceptsCForm;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;
    @XmlElement(name = "Agreements")
    protected Vendor.Agreements agreements;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
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
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "RegisteredDealer")
    protected Boolean registeredDealer;
    @XmlElement(name = "TaxExempted")
    protected Boolean taxExempted;
    @XmlElement(name = "ShippingAddress", required = true)
    protected WsPartyAddress shippingAddress;
    @XmlElement(name = "BillingAddress", required = true)
    protected WsPartyAddress billingAddress;
    @XmlElement(name = "PartyContacts", required = true)
    protected Vendor.PartyContacts partyContacts;

    /**
     * Gets the value of the purchaseExpiryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseExpiryPeriod() {
        return purchaseExpiryPeriod;
    }

    /**
     * Sets the value of the purchaseExpiryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseExpiryPeriod(BigInteger value) {
        this.purchaseExpiryPeriod = value;
    }

    /**
     * Gets the value of the acceptsCForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptsCForm() {
        return acceptsCForm;
    }

    /**
     * Sets the value of the acceptsCForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsCForm(Boolean value) {
        this.acceptsCForm = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFields }
     *     
     */
    public CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFields }
     *     
     */
    public void setCustomFields(CustomFields value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor.Agreements }
     *     
     */
    public Vendor.Agreements getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor.Agreements }
     *     
     */
    public void setAgreements(Vendor.Agreements value) {
        this.agreements = value;
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
     * Gets the value of the partyContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor.PartyContacts }
     *     
     */
    public Vendor.PartyContacts getPartyContacts() {
        return partyContacts;
    }

    /**
     * Sets the value of the partyContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor.PartyContacts }
     *     
     */
    public void setPartyContacts(Vendor.PartyContacts value) {
        this.partyContacts = value;
    }


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
     *         &lt;element name="Agreement" type="{http://uniware.unicommerce.com/services/}VendorAgreement" minOccurs="0"/&gt;
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
        "agreement"
    })
    public static class Agreements {

        @XmlElement(name = "Agreement")
        protected VendorAgreement agreement;

        /**
         * Gets the value of the agreement property.
         * 
         * @return
         *     possible object is
         *     {@link VendorAgreement }
         *     
         */
        public VendorAgreement getAgreement() {
            return agreement;
        }

        /**
         * Sets the value of the agreement property.
         * 
         * @param value
         *     allowed object is
         *     {@link VendorAgreement }
         *     
         */
        public void setAgreement(VendorAgreement value) {
            this.agreement = value;
        }

    }


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
     *         &lt;element name="PartyContact" type="{http://uniware.unicommerce.com/services/}PartyContact" maxOccurs="unbounded"/&gt;
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
        "partyContact"
    })
    public static class PartyContacts {

        @XmlElement(name = "PartyContact", required = true)
        protected List<PartyContact> partyContact;

        /**
         * Gets the value of the partyContact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partyContact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartyContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PartyContact }
         * 
         * 
         */
        public List<PartyContact> getPartyContact() {
            if (partyContact == null) {
                partyContact = new ArrayList<PartyContact>();
            }
            return this.partyContact;
        }

    }

}
