
package com.unicommerce.uniware.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SaleOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CFormProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentTat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Addresses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Address" type="{http://uniware.unicommerce.com/services/}Address" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
 *         &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
 *         &lt;element name="SaleOrderItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItem" type="{http://uniware.unicommerce.com/services/}SaleOrderItem" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingProviders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ShippingProvider" type="{http://uniware.unicommerce.com/services/}ShippingProvider" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SaleOrderItemCombinations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItemCombination" type="{http://uniware.unicommerce.com/services/}SaleOrderItemCombination" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
 *         &lt;element name="VerificationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleOrder", propOrder = {
    "code",
    "displayOrderCode",
    "displayOrderDateTime",
    "channel",
    "notificationEmail",
    "notificationMobile",
    "cashOnDelivery",
    "additionalInfo",
    "currencyCode",
    "customerCode",
    "taxExempted",
    "cFormProvided",
    "fulfillmentTat",
    "addresses",
    "shippingAddress",
    "billingAddress",
    "saleOrderItems",
    "shippingProviders",
    "saleOrderItemCombinations",
    "customFields",
    "verificationRequired",
    "priority"
})
public class SaleOrder {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "DisplayOrderCode")
    protected String displayOrderCode;
    @XmlElement(name = "DisplayOrderDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar displayOrderDateTime;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "NotificationEmail")
    protected String notificationEmail;
    @XmlElement(name = "NotificationMobile")
    protected String notificationMobile;
    @XmlElement(name = "CashOnDelivery")
    protected boolean cashOnDelivery;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElement(name = "TaxExempted")
    protected Boolean taxExempted;
    @XmlElement(name = "CFormProvided")
    protected Boolean cFormProvided;
    @XmlElement(name = "FulfillmentTat")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fulfillmentTat;
    @XmlElement(name = "Addresses")
    protected SaleOrder.Addresses addresses;
    @XmlElement(name = "ShippingAddress")
    protected AddressRef shippingAddress;
    @XmlElement(name = "BillingAddress")
    protected AddressRef billingAddress;
    @XmlElement(name = "SaleOrderItems", required = true)
    protected SaleOrder.SaleOrderItems saleOrderItems;
    @XmlElement(name = "ShippingProviders")
    protected SaleOrder.ShippingProviders shippingProviders;
    @XmlElement(name = "SaleOrderItemCombinations")
    protected SaleOrder.SaleOrderItemCombinations saleOrderItemCombinations;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;
    @XmlElement(name = "VerificationRequired")
    protected Boolean verificationRequired;
    @XmlElement(name = "Priority")
    protected BigInteger priority;

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
     * Gets the value of the displayOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayOrderCode() {
        return displayOrderCode;
    }

    /**
     * Sets the value of the displayOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayOrderCode(String value) {
        this.displayOrderCode = value;
    }

    /**
     * Gets the value of the displayOrderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisplayOrderDateTime() {
        return displayOrderDateTime;
    }

    /**
     * Sets the value of the displayOrderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisplayOrderDateTime(XMLGregorianCalendar value) {
        this.displayOrderDateTime = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the notificationMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMobile() {
        return notificationMobile;
    }

    /**
     * Sets the value of the notificationMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMobile(String value) {
        this.notificationMobile = value;
    }

    /**
     * Gets the value of the cashOnDelivery property.
     * 
     */
    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    /**
     * Sets the value of the cashOnDelivery property.
     * 
     */
    public void setCashOnDelivery(boolean value) {
        this.cashOnDelivery = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
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
     * Gets the value of the cFormProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCFormProvided() {
        return cFormProvided;
    }

    /**
     * Sets the value of the cFormProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCFormProvided(Boolean value) {
        this.cFormProvided = value;
    }

    /**
     * Gets the value of the fulfillmentTat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFulfillmentTat() {
        return fulfillmentTat;
    }

    /**
     * Sets the value of the fulfillmentTat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFulfillmentTat(XMLGregorianCalendar value) {
        this.fulfillmentTat = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrder.Addresses }
     *     
     */
    public SaleOrder.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrder.Addresses }
     *     
     */
    public void setAddresses(SaleOrder.Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRef }
     *     
     */
    public AddressRef getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *     
     */
    public void setShippingAddress(AddressRef value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRef }
     *     
     */
    public AddressRef getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *     
     */
    public void setBillingAddress(AddressRef value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the saleOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrder.SaleOrderItems }
     *     
     */
    public SaleOrder.SaleOrderItems getSaleOrderItems() {
        return saleOrderItems;
    }

    /**
     * Sets the value of the saleOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrder.SaleOrderItems }
     *     
     */
    public void setSaleOrderItems(SaleOrder.SaleOrderItems value) {
        this.saleOrderItems = value;
    }

    /**
     * Gets the value of the shippingProviders property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrder.ShippingProviders }
     *     
     */
    public SaleOrder.ShippingProviders getShippingProviders() {
        return shippingProviders;
    }

    /**
     * Sets the value of the shippingProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrder.ShippingProviders }
     *     
     */
    public void setShippingProviders(SaleOrder.ShippingProviders value) {
        this.shippingProviders = value;
    }

    /**
     * Gets the value of the saleOrderItemCombinations property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrder.SaleOrderItemCombinations }
     *     
     */
    public SaleOrder.SaleOrderItemCombinations getSaleOrderItemCombinations() {
        return saleOrderItemCombinations;
    }

    /**
     * Sets the value of the saleOrderItemCombinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrder.SaleOrderItemCombinations }
     *     
     */
    public void setSaleOrderItemCombinations(SaleOrder.SaleOrderItemCombinations value) {
        this.saleOrderItemCombinations = value;
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
     * Gets the value of the verificationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationRequired() {
        return verificationRequired;
    }

    /**
     * Sets the value of the verificationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationRequired(Boolean value) {
        this.verificationRequired = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
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
     *         &lt;element name="Address" type="{http://uniware.unicommerce.com/services/}Address" maxOccurs="unbounded"/&gt;
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
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address", required = true)
        protected List<Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         * 
         * 
         */
        public List<Address> getAddress() {
            if (address == null) {
                address = new ArrayList<Address>();
            }
            return this.address;
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
     *         &lt;element name="SaleOrderItemCombination" type="{http://uniware.unicommerce.com/services/}SaleOrderItemCombination" maxOccurs="unbounded"/&gt;
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
        "saleOrderItemCombination"
    })
    public static class SaleOrderItemCombinations {

        @XmlElement(name = "SaleOrderItemCombination", required = true)
        protected List<SaleOrderItemCombination> saleOrderItemCombination;

        /**
         * Gets the value of the saleOrderItemCombination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrderItemCombination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrderItemCombination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaleOrderItemCombination }
         * 
         * 
         */
        public List<SaleOrderItemCombination> getSaleOrderItemCombination() {
            if (saleOrderItemCombination == null) {
                saleOrderItemCombination = new ArrayList<SaleOrderItemCombination>();
            }
            return this.saleOrderItemCombination;
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
     *         &lt;element name="SaleOrderItem" type="{http://uniware.unicommerce.com/services/}SaleOrderItem" maxOccurs="unbounded"/&gt;
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
        "saleOrderItem"
    })
    public static class SaleOrderItems {

        @XmlElement(name = "SaleOrderItem", required = true)
        protected List<SaleOrderItem> saleOrderItem;

        /**
         * Gets the value of the saleOrderItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrderItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrderItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaleOrderItem }
         * 
         * 
         */
        public List<SaleOrderItem> getSaleOrderItem() {
            if (saleOrderItem == null) {
                saleOrderItem = new ArrayList<SaleOrderItem>();
            }
            return this.saleOrderItem;
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
     *         &lt;element name="ShippingProvider" type="{http://uniware.unicommerce.com/services/}ShippingProvider" maxOccurs="unbounded"/&gt;
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
        "shippingProvider"
    })
    public static class ShippingProviders {

        @XmlElement(name = "ShippingProvider", required = true)
        protected List<ShippingProvider> shippingProvider;

        /**
         * Gets the value of the shippingProvider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shippingProvider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShippingProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShippingProvider }
         * 
         * 
         */
        public List<ShippingProvider> getShippingProvider() {
            if (shippingProvider == null) {
                shippingProvider = new ArrayList<ShippingProvider>();
            }
            return this.shippingProvider;
        }

    }

}
