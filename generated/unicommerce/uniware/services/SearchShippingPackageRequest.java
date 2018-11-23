
package com.unicommerce.uniware.services;

import java.math.BigInteger;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Statuses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://uniware.unicommerce.com/services/}DateRange" minOccurs="0"/&gt;
 *         &lt;element name="DispatchTime" type="{http://uniware.unicommerce.com/services/}DateRange" minOccurs="0"/&gt;
 *         &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentReconciled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedSinceInMinutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SearchOptions" type="{http://uniware.unicommerce.com/services/}SearchOptions"/&gt;
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
    "shippingPackageCode",
    "saleOrderCode",
    "statuses",
    "channelCode",
    "createTime",
    "dispatchTime",
    "onHold",
    "shippingProvider",
    "shippingMethod",
    "trackingNumber",
    "invoiceCode",
    "cashOnDelivery",
    "paymentReconciled",
    "itemSKU",
    "updatedSinceInMinutes",
    "searchOptions"
})
@XmlRootElement(name = "SearchShippingPackageRequest")
public class SearchShippingPackageRequest {

    @XmlElement(name = "ShippingPackageCode")
    protected String shippingPackageCode;
    @XmlElement(name = "SaleOrderCode")
    protected String saleOrderCode;
    @XmlElement(name = "Statuses")
    protected SearchShippingPackageRequest.Statuses statuses;
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "CreateTime")
    protected DateRange createTime;
    @XmlElement(name = "DispatchTime")
    protected DateRange dispatchTime;
    @XmlElement(name = "OnHold")
    protected Boolean onHold;
    @XmlElement(name = "ShippingProvider")
    protected String shippingProvider;
    @XmlElement(name = "ShippingMethod")
    protected String shippingMethod;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "InvoiceCode")
    protected String invoiceCode;
    @XmlElement(name = "CashOnDelivery")
    protected Boolean cashOnDelivery;
    @XmlElement(name = "PaymentReconciled")
    protected Boolean paymentReconciled;
    @XmlElement(name = "ItemSKU")
    protected String itemSKU;
    @XmlElement(name = "UpdatedSinceInMinutes")
    protected BigInteger updatedSinceInMinutes;
    @XmlElement(name = "SearchOptions", required = true)
    protected SearchOptions searchOptions;

    /**
     * Gets the value of the shippingPackageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPackageCode() {
        return shippingPackageCode;
    }

    /**
     * Sets the value of the shippingPackageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPackageCode(String value) {
        this.shippingPackageCode = value;
    }

    /**
     * Gets the value of the saleOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleOrderCode() {
        return saleOrderCode;
    }

    /**
     * Sets the value of the saleOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleOrderCode(String value) {
        this.saleOrderCode = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * @return
     *     possible object is
     *     {@link SearchShippingPackageRequest.Statuses }
     *     
     */
    public SearchShippingPackageRequest.Statuses getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchShippingPackageRequest.Statuses }
     *     
     */
    public void setStatuses(SearchShippingPackageRequest.Statuses value) {
        this.statuses = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setCreateTime(DateRange value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the dispatchTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDispatchTime() {
        return dispatchTime;
    }

    /**
     * Sets the value of the dispatchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDispatchTime(DateRange value) {
        this.dispatchTime = value;
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
     * Gets the value of the shippingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingProvider() {
        return shippingProvider;
    }

    /**
     * Sets the value of the shippingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingProvider(String value) {
        this.shippingProvider = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the invoiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCode() {
        return invoiceCode;
    }

    /**
     * Sets the value of the invoiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCode(String value) {
        this.invoiceCode = value;
    }

    /**
     * Gets the value of the cashOnDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    /**
     * Sets the value of the cashOnDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashOnDelivery(Boolean value) {
        this.cashOnDelivery = value;
    }

    /**
     * Gets the value of the paymentReconciled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentReconciled() {
        return paymentReconciled;
    }

    /**
     * Sets the value of the paymentReconciled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentReconciled(Boolean value) {
        this.paymentReconciled = value;
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
     * Gets the value of the updatedSinceInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpdatedSinceInMinutes() {
        return updatedSinceInMinutes;
    }

    /**
     * Sets the value of the updatedSinceInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpdatedSinceInMinutes(BigInteger value) {
        this.updatedSinceInMinutes = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptions }
     *     
     */
    public SearchOptions getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptions }
     *     
     */
    public void setSearchOptions(SearchOptions value) {
        this.searchOptions = value;
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
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
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
        "status"
    })
    public static class Statuses {

        @XmlElement(name = "Status", required = true)
        protected List<Object> status;

        /**
         * Gets the value of the status property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getStatus() {
            if (status == null) {
                status = new ArrayList<Object>();
            }
            return this.status;
        }

    }

}
