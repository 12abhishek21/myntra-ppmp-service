
package com.unicommerce.uniware.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleOrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VoucherCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PacketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CombinationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequiresCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
 *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
 *         &lt;element name="ItemDetailFields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemDetailField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "SaleOrderItem", propOrder = {
    "code",
    "itemSKU",
    "channelProductId",
    "shippingMethodCode",
    "giftWrap",
    "giftMessage",
    "totalPrice",
    "sellingPrice",
    "prepaidAmount",
    "shippingCharges",
    "shippingMethodCharges",
    "cashOnDeliveryCharges",
    "discount",
    "giftWrapCharges",
    "voucherCode",
    "voucherValue",
    "storeCredit",
    "packetNumber",
    "combinationIdentifier",
    "onHold",
    "facilityCode",
    "requiresCustomization",
    "shippingAddress",
    "customFields",
    "itemDetailFields"
})
public class SaleOrderItem {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "ItemSKU", required = true)
    protected String itemSKU;
    @XmlElement(name = "ChannelProductId")
    protected String channelProductId;
    @XmlElement(name = "ShippingMethodCode", required = true)
    protected String shippingMethodCode;
    @XmlElement(name = "GiftWrap")
    protected Boolean giftWrap;
    @XmlElement(name = "GiftMessage")
    protected String giftMessage;
    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "SellingPrice", required = true)
    protected BigDecimal sellingPrice;
    @XmlElement(name = "PrepaidAmount")
    protected BigDecimal prepaidAmount;
    @XmlElement(name = "ShippingCharges")
    protected BigDecimal shippingCharges;
    @XmlElement(name = "ShippingMethodCharges")
    protected BigDecimal shippingMethodCharges;
    @XmlElement(name = "CashOnDeliveryCharges")
    protected BigDecimal cashOnDeliveryCharges;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "GiftWrapCharges")
    protected BigDecimal giftWrapCharges;
    @XmlElement(name = "VoucherCode")
    protected String voucherCode;
    @XmlElement(name = "VoucherValue")
    protected BigDecimal voucherValue;
    @XmlElement(name = "StoreCredit")
    protected BigDecimal storeCredit;
    @XmlElement(name = "PacketNumber")
    protected BigInteger packetNumber;
    @XmlElement(name = "CombinationIdentifier")
    protected String combinationIdentifier;
    @XmlElement(name = "OnHold")
    protected Boolean onHold;
    @XmlElement(name = "FacilityCode")
    protected String facilityCode;
    @XmlElement(name = "RequiresCustomization")
    protected Boolean requiresCustomization;
    @XmlElement(name = "ShippingAddress")
    protected AddressRef shippingAddress;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;
    @XmlElement(name = "ItemDetailFields")
    protected SaleOrderItem.ItemDetailFields itemDetailFields;

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
     * Gets the value of the itemSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSKU() {
        return itemSKU;
    }

    /**
     * Sets the value of the itemSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSKU(String value) {
        this.itemSKU = value;
    }

    /**
     * Gets the value of the channelProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelProductId() {
        return channelProductId;
    }

    /**
     * Sets the value of the channelProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelProductId(String value) {
        this.channelProductId = value;
    }

    /**
     * Gets the value of the shippingMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodCode() {
        return shippingMethodCode;
    }

    /**
     * Sets the value of the shippingMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodCode(String value) {
        this.shippingMethodCode = value;
    }

    /**
     * Gets the value of the giftWrap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiftWrap() {
        return giftWrap;
    }

    /**
     * Sets the value of the giftWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiftWrap(Boolean value) {
        this.giftWrap = value;
    }

    /**
     * Gets the value of the giftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Sets the value of the giftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessage(String value) {
        this.giftMessage = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingPrice(BigDecimal value) {
        this.sellingPrice = value;
    }

    /**
     * Gets the value of the prepaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Sets the value of the prepaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepaidAmount(BigDecimal value) {
        this.prepaidAmount = value;
    }

    /**
     * Gets the value of the shippingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCharges() {
        return shippingCharges;
    }

    /**
     * Sets the value of the shippingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCharges(BigDecimal value) {
        this.shippingCharges = value;
    }

    /**
     * Gets the value of the shippingMethodCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingMethodCharges() {
        return shippingMethodCharges;
    }

    /**
     * Sets the value of the shippingMethodCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingMethodCharges(BigDecimal value) {
        this.shippingMethodCharges = value;
    }

    /**
     * Gets the value of the cashOnDeliveryCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashOnDeliveryCharges() {
        return cashOnDeliveryCharges;
    }

    /**
     * Sets the value of the cashOnDeliveryCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashOnDeliveryCharges(BigDecimal value) {
        this.cashOnDeliveryCharges = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the giftWrapCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGiftWrapCharges() {
        return giftWrapCharges;
    }

    /**
     * Sets the value of the giftWrapCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGiftWrapCharges(BigDecimal value) {
        this.giftWrapCharges = value;
    }

    /**
     * Gets the value of the voucherCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * Sets the value of the voucherCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherCode(String value) {
        this.voucherCode = value;
    }

    /**
     * Gets the value of the voucherValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoucherValue() {
        return voucherValue;
    }

    /**
     * Sets the value of the voucherValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoucherValue(BigDecimal value) {
        this.voucherValue = value;
    }

    /**
     * Gets the value of the storeCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoreCredit() {
        return storeCredit;
    }

    /**
     * Sets the value of the storeCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoreCredit(BigDecimal value) {
        this.storeCredit = value;
    }

    /**
     * Gets the value of the packetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPacketNumber() {
        return packetNumber;
    }

    /**
     * Sets the value of the packetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPacketNumber(BigInteger value) {
        this.packetNumber = value;
    }

    /**
     * Gets the value of the combinationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinationIdentifier() {
        return combinationIdentifier;
    }

    /**
     * Sets the value of the combinationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinationIdentifier(String value) {
        this.combinationIdentifier = value;
    }

    /**
     * Gets the value of the onHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnHold() {
        return onHold;
    }

    /**
     * Sets the value of the onHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnHold(Boolean value) {
        this.onHold = value;
    }

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    /**
     * Gets the value of the requiresCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresCustomization() {
        return requiresCustomization;
    }

    /**
     * Sets the value of the requiresCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresCustomization(Boolean value) {
        this.requiresCustomization = value;
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
     * Gets the value of the itemDetailFields property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrderItem.ItemDetailFields }
     *     
     */
    public SaleOrderItem.ItemDetailFields getItemDetailFields() {
        return itemDetailFields;
    }

    /**
     * Sets the value of the itemDetailFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrderItem.ItemDetailFields }
     *     
     */
    public void setItemDetailFields(SaleOrderItem.ItemDetailFields value) {
        this.itemDetailFields = value;
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
     *         &lt;element name="ItemDetailField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "itemDetailField"
    })
    public static class ItemDetailFields {

        @XmlElement(name = "ItemDetailField", required = true)
        protected List<String> itemDetailField;

        /**
         * Gets the value of the itemDetailField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemDetailField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemDetailField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItemDetailField() {
            if (itemDetailField == null) {
                itemDetailField = new ArrayList<String>();
            }
            return this.itemDetailField;
        }

    }

}
