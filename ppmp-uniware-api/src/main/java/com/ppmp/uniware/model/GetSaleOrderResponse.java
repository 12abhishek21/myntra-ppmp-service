
package com.ppmp.uniware.model;

import java.lang.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Errors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Warnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SaleOrder" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DisplayOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NotificationMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Addresses"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Address" type="{http://uniware.unicommerce.com/services/}Address" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
 *                   &lt;element name="SaleOrderItems"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ReplacementSaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ShelfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingMethodCode"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="STD"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="GiftWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="AlternateFacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="PacketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
 *                                       &lt;element name="Cancellable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ReversePickable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                                       &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                                       &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ShippingPackages" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ShippingPackage" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="TrackingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="CourierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="EstimatedWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                                       &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                                       &lt;element name="DispatchedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="DeliveredOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="PodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "successful",
    "errors",
    "warnings",
    "saleOrder"
})
@XmlRootElement(name = "GetSaleOrderResponse")
public class GetSaleOrderResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElement(name = "SaleOrder")
    protected SaleOrder saleOrder;

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the saleOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrder }
     *     
     */
    public SaleOrder getSaleOrder() {
        return saleOrder;
    }

    /**
     * Sets the value of the saleOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrder }
     *     
     */
    public void setSaleOrder(SaleOrder value) {
        this.saleOrder = value;
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
     *         &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
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
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", required = true)
        protected List<java.lang.Error> error;

        /**
         * Gets the value of the error property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the error property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link java.lang.Error }
         * 
         * 
         */
        public List<java.lang.Error> getError() {
            if (error == null) {
                error = new ArrayList<java.lang.Error>();
            }
            return this.error;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DisplayOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NotificationMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Addresses"&gt;
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
     *         &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
     *         &lt;element name="SaleOrderItems"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ReplacementSaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ShelfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingMethodCode"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="STD"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="GiftWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="AlternateFacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="PacketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
     *                             &lt;element name="Cancellable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ReversePickable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                             &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                             &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ShippingPackages" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ShippingPackage" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TrackingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CourierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="EstimatedWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                             &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                             &lt;element name="DispatchedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                             &lt;element name="DeliveredOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                             &lt;element name="PodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
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
        "displayOrderCode",
        "channel",
        "displayOrderDateTime",
        "status",
        "notificationEmail",
        "notificationMobile",
        "customerCode",
        "currencyCode",
        "createdOn",
        "updatedOn",
        "cashOnDelivery",
        "additionalInfo",
        "addresses",
        "billingAddress",
        "saleOrderItems",
        "shippingPackages",
        "customFields"
    })
    public static class SaleOrder {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "DisplayOrderCode", required = true)
        protected String displayOrderCode;
        @XmlElement(name = "Channel")
        protected String channel;
        @XmlElement(name = "DisplayOrderDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar displayOrderDateTime;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "NotificationEmail")
        protected String notificationEmail;
        @XmlElement(name = "NotificationMobile")
        protected String notificationMobile;
        @XmlElement(name = "CustomerCode")
        protected String customerCode;
        @XmlElement(name = "CurrencyCode")
        protected String currencyCode;
        @XmlElement(name = "CreatedOn", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdOn;
        @XmlElement(name = "UpdatedOn", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar updatedOn;
        @XmlElement(name = "CashOnDelivery")
        protected boolean cashOnDelivery;
        @XmlElement(name = "AdditionalInfo")
        protected String additionalInfo;
        @XmlElement(name = "Addresses", required = true)
        protected Addresses addresses;
        @XmlElement(name = "BillingAddress")
        protected AddressRef billingAddress;
        @XmlElement(name = "SaleOrderItems", required = true)
        protected SaleOrderItems saleOrderItems;
        @XmlElement(name = "ShippingPackages")
        protected ShippingPackages shippingPackages;
        @XmlElement(name = "CustomFields")
        protected CustomFields customFields;

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
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
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
         * Gets the value of the createdOn property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedOn() {
            return createdOn;
        }

        /**
         * Sets the value of the createdOn property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedOn(XMLGregorianCalendar value) {
            this.createdOn = value;
        }

        /**
         * Gets the value of the updatedOn property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUpdatedOn() {
            return updatedOn;
        }

        /**
         * Sets the value of the updatedOn property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUpdatedOn(XMLGregorianCalendar value) {
            this.updatedOn = value;
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
         * Gets the value of the addresses property.
         * 
         * @return
         *     possible object is
         *     {@link Addresses }
         *     
         */
        public Addresses getAddresses() {
            return addresses;
        }

        /**
         * Sets the value of the addresses property.
         * 
         * @param value
         *     allowed object is
         *     {@link Addresses }
         *     
         */
        public void setAddresses(Addresses value) {
            this.addresses = value;
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
         *     {@link SaleOrderItems }
         *     
         */
        public SaleOrderItems getSaleOrderItems() {
            return saleOrderItems;
        }

        /**
         * Sets the value of the saleOrderItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link SaleOrderItems }
         *     
         */
        public void setSaleOrderItems(SaleOrderItems value) {
            this.saleOrderItems = value;
        }

        /**
         * Gets the value of the shippingPackages property.
         * 
         * @return
         *     possible object is
         *     {@link ShippingPackages }
         *     
         */
        public ShippingPackages getShippingPackages() {
            return shippingPackages;
        }

        /**
         * Sets the value of the shippingPackages property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShippingPackages }
         *     
         */
        public void setShippingPackages(ShippingPackages value) {
            this.shippingPackages = value;
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
         *         &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ReplacementSaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ShelfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingMethodCode"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="STD"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="GiftWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="AlternateFacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="PacketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
         *                   &lt;element name="Cancellable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ReversePickable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *                   &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *                   &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
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
             *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ReplacementSaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ShelfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ShippingMethodCode"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="STD"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="GiftWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="AlternateFacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="PacketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
             *         &lt;element name="Cancellable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ReversePickable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
             *         &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
             *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
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
                "statusCode",
                "itemSKU",
                "channelProductId",
                "itemCode",
                "replacementSaleOrderCode",
                "color",
                "brand",
                "size",
                "shelfCode",
                "shippingMethodCode",
                "itemName",
                "giftWrap",
                "giftMessage",
                "totalPrice",
                "sellingPrice",
                "shippingCharges",
                "discount",
                "shippingPackageCode",
                "facilityCode",
                "facilityName",
                "alternateFacilityCode",
                "shippingMethodCharges",
                "cashOnDeliveryCharges",
                "giftWrapCharges",
                "packetNumber",
                "taxPercentage",
                "shippingAddress",
                "cancellable",
                "cancellationReason",
                "reversePickable",
                "onHold",
                "createdOn",
                "updatedOn",
                "customFields"
            })
            public static class SaleOrderItem {

                @XmlElement(name = "Code", required = true)
                protected String code;
                @XmlElement(name = "StatusCode", required = true)
                protected String statusCode;
                @XmlElement(name = "ItemSKU", required = true)
                protected String itemSKU;
                @XmlElement(name = "ChannelProductId", required = true)
                protected String channelProductId;
                @XmlElement(name = "ItemCode")
                protected String itemCode;
                @XmlElement(name = "ReplacementSaleOrderCode")
                protected String replacementSaleOrderCode;
                @XmlElement(name = "Color")
                protected String color;
                @XmlElement(name = "Brand")
                protected String brand;
                @XmlElement(name = "Size")
                protected String size;
                @XmlElement(name = "ShelfCode")
                protected String shelfCode;
                @XmlElement(name = "ShippingMethodCode", required = true)
                protected String shippingMethodCode;
                @XmlElement(name = "ItemName")
                protected String itemName;
                @XmlElement(name = "GiftWrap")
                protected Boolean giftWrap;
                @XmlElement(name = "GiftMessage")
                protected String giftMessage;
                @XmlElement(name = "TotalPrice", required = true)
                protected BigDecimal totalPrice;
                @XmlElement(name = "SellingPrice", required = true)
                protected BigDecimal sellingPrice;
                @XmlElement(name = "ShippingCharges")
                protected BigDecimal shippingCharges;
                @XmlElement(name = "Discount")
                protected BigDecimal discount;
                @XmlElement(name = "ShippingPackageCode")
                protected String shippingPackageCode;
                @XmlElement(name = "FacilityCode")
                protected String facilityCode;
                @XmlElement(name = "FacilityName")
                protected String facilityName;
                @XmlElement(name = "AlternateFacilityCode")
                protected String alternateFacilityCode;
                @XmlElement(name = "ShippingMethodCharges")
                protected BigDecimal shippingMethodCharges;
                @XmlElement(name = "CashOnDeliveryCharges")
                protected BigDecimal cashOnDeliveryCharges;
                @XmlElement(name = "GiftWrapCharges")
                protected BigDecimal giftWrapCharges;
                @XmlElement(name = "PacketNumber")
                protected BigInteger packetNumber;
                @XmlElement(name = "TaxPercentage")
                protected BigDecimal taxPercentage;
                @XmlElement(name = "ShippingAddress")
                protected AddressRef shippingAddress;
                @XmlElement(name = "Cancellable")
                protected boolean cancellable;
                @XmlElement(name = "CancellationReason")
                protected String cancellationReason;
                @XmlElement(name = "ReversePickable")
                protected boolean reversePickable;
                @XmlElement(name = "OnHold")
                protected boolean onHold;
                @XmlElement(name = "CreatedOn", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar createdOn;
                @XmlElement(name = "UpdatedOn", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar updatedOn;
                @XmlElement(name = "CustomFields")
                protected CustomFields customFields;

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
                 * Gets the value of the statusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusCode() {
                    return statusCode;
                }

                /**
                 * Sets the value of the statusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusCode(String value) {
                    this.statusCode = value;
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
                 * Gets the value of the replacementSaleOrderCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReplacementSaleOrderCode() {
                    return replacementSaleOrderCode;
                }

                /**
                 * Sets the value of the replacementSaleOrderCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReplacementSaleOrderCode(String value) {
                    this.replacementSaleOrderCode = value;
                }

                /**
                 * Gets the value of the color property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColor() {
                    return color;
                }

                /**
                 * Sets the value of the color property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColor(String value) {
                    this.color = value;
                }

                /**
                 * Gets the value of the brand property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrand() {
                    return brand;
                }

                /**
                 * Sets the value of the brand property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrand(String value) {
                    this.brand = value;
                }

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSize() {
                    return size;
                }

                /**
                 * Sets the value of the size property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSize(String value) {
                    this.size = value;
                }

                /**
                 * Gets the value of the shelfCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShelfCode() {
                    return shelfCode;
                }

                /**
                 * Sets the value of the shelfCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShelfCode(String value) {
                    this.shelfCode = value;
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
                 * Gets the value of the facilityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFacilityName() {
                    return facilityName;
                }

                /**
                 * Sets the value of the facilityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFacilityName(String value) {
                    this.facilityName = value;
                }

                /**
                 * Gets the value of the alternateFacilityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlternateFacilityCode() {
                    return alternateFacilityCode;
                }

                /**
                 * Sets the value of the alternateFacilityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlternateFacilityCode(String value) {
                    this.alternateFacilityCode = value;
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
                 * Gets the value of the taxPercentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTaxPercentage() {
                    return taxPercentage;
                }

                /**
                 * Sets the value of the taxPercentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTaxPercentage(BigDecimal value) {
                    this.taxPercentage = value;
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
                 * Gets the value of the cancellable property.
                 * 
                 */
                public boolean isCancellable() {
                    return cancellable;
                }

                /**
                 * Sets the value of the cancellable property.
                 * 
                 */
                public void setCancellable(boolean value) {
                    this.cancellable = value;
                }

                /**
                 * Gets the value of the cancellationReason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCancellationReason() {
                    return cancellationReason;
                }

                /**
                 * Sets the value of the cancellationReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCancellationReason(String value) {
                    this.cancellationReason = value;
                }

                /**
                 * Gets the value of the reversePickable property.
                 * 
                 */
                public boolean isReversePickable() {
                    return reversePickable;
                }

                /**
                 * Sets the value of the reversePickable property.
                 * 
                 */
                public void setReversePickable(boolean value) {
                    this.reversePickable = value;
                }

                /**
                 * Gets the value of the onHold property.
                 * 
                 */
                public boolean isOnHold() {
                    return onHold;
                }

                /**
                 * Sets the value of the onHold property.
                 * 
                 */
                public void setOnHold(boolean value) {
                    this.onHold = value;
                }

                /**
                 * Gets the value of the createdOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCreatedOn() {
                    return createdOn;
                }

                /**
                 * Sets the value of the createdOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCreatedOn(XMLGregorianCalendar value) {
                    this.createdOn = value;
                }

                /**
                 * Gets the value of the updatedOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getUpdatedOn() {
                    return updatedOn;
                }

                /**
                 * Sets the value of the updatedOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setUpdatedOn(XMLGregorianCalendar value) {
                    this.updatedOn = value;
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
         *         &lt;element name="ShippingPackage" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TrackingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CourierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="EstimatedWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *                   &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *                   &lt;element name="DispatchedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *                   &lt;element name="DeliveredOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *                   &lt;element name="PodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
        @XmlType(name = "", propOrder = {
            "shippingPackage"
        })
        public static class ShippingPackages {

            @XmlElement(name = "ShippingPackage", required = true)
            protected List<ShippingPackage> shippingPackage;

            /**
             * Gets the value of the shippingPackage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shippingPackage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShippingPackage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ShippingPackage }
             * 
             * 
             */
            public List<ShippingPackage> getShippingPackage() {
                if (shippingPackage == null) {
                    shippingPackage = new ArrayList<ShippingPackage>();
                }
                return this.shippingPackage;
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
             *         &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TrackingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CourierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="EstimatedWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
             *         &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
             *         &lt;element name="DispatchedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
             *         &lt;element name="DeliveredOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
             *         &lt;element name="PodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
                "shipmentCode",
                "statusCode",
                "shippingPackageType",
                "invoiceCode",
                "shippingProvider",
                "trackingNumber",
                "trackingStatus",
                "courierStatus",
                "estimatedWeight",
                "actualWeight",
                "dispatchedOn",
                "deliveredOn",
                "podCode",
                "createdOn"
            })
            public static class ShippingPackage {

                @XmlElement(name = "ShipmentCode", required = true)
                protected String shipmentCode;
                @XmlElement(name = "StatusCode", required = true)
                protected String statusCode;
                @XmlElement(name = "ShippingPackageType", required = true)
                protected String shippingPackageType;
                @XmlElement(name = "InvoiceCode")
                protected String invoiceCode;
                @XmlElement(name = "ShippingProvider")
                protected String shippingProvider;
                @XmlElement(name = "TrackingNumber")
                protected String trackingNumber;
                @XmlElement(name = "TrackingStatus")
                protected String trackingStatus;
                @XmlElement(name = "CourierStatus")
                protected String courierStatus;
                @XmlElement(name = "EstimatedWeight")
                protected Integer estimatedWeight;
                @XmlElement(name = "ActualWeight")
                protected Integer actualWeight;
                @XmlElement(name = "DispatchedOn")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar dispatchedOn;
                @XmlElement(name = "DeliveredOn")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar deliveredOn;
                @XmlElement(name = "PodCode")
                protected String podCode;
                @XmlElement(name = "CreatedOn", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar createdOn;

                /**
                 * Gets the value of the shipmentCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipmentCode() {
                    return shipmentCode;
                }

                /**
                 * Sets the value of the shipmentCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipmentCode(String value) {
                    this.shipmentCode = value;
                }

                /**
                 * Gets the value of the statusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusCode() {
                    return statusCode;
                }

                /**
                 * Sets the value of the statusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusCode(String value) {
                    this.statusCode = value;
                }

                /**
                 * Gets the value of the shippingPackageType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShippingPackageType() {
                    return shippingPackageType;
                }

                /**
                 * Sets the value of the shippingPackageType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShippingPackageType(String value) {
                    this.shippingPackageType = value;
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
                 * Gets the value of the trackingStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrackingStatus() {
                    return trackingStatus;
                }

                /**
                 * Sets the value of the trackingStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrackingStatus(String value) {
                    this.trackingStatus = value;
                }

                /**
                 * Gets the value of the courierStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCourierStatus() {
                    return courierStatus;
                }

                /**
                 * Sets the value of the courierStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCourierStatus(String value) {
                    this.courierStatus = value;
                }

                /**
                 * Gets the value of the estimatedWeight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEstimatedWeight() {
                    return estimatedWeight;
                }

                /**
                 * Sets the value of the estimatedWeight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEstimatedWeight(Integer value) {
                    this.estimatedWeight = value;
                }

                /**
                 * Gets the value of the actualWeight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getActualWeight() {
                    return actualWeight;
                }

                /**
                 * Sets the value of the actualWeight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setActualWeight(Integer value) {
                    this.actualWeight = value;
                }

                /**
                 * Gets the value of the dispatchedOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDispatchedOn() {
                    return dispatchedOn;
                }

                /**
                 * Sets the value of the dispatchedOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDispatchedOn(XMLGregorianCalendar value) {
                    this.dispatchedOn = value;
                }

                /**
                 * Gets the value of the deliveredOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDeliveredOn() {
                    return deliveredOn;
                }

                /**
                 * Sets the value of the deliveredOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDeliveredOn(XMLGregorianCalendar value) {
                    this.deliveredOn = value;
                }

                /**
                 * Gets the value of the podCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPodCode() {
                    return podCode;
                }

                /**
                 * Sets the value of the podCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPodCode(String value) {
                    this.podCode = value;
                }

                /**
                 * Gets the value of the createdOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCreatedOn() {
                    return createdOn;
                }

                /**
                 * Sets the value of the createdOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCreatedOn(XMLGregorianCalendar value) {
                    this.createdOn = value;
                }

            }

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
     *         &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", required = true)
        protected List<Warning> warning;

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Warning }
         * 
         * 
         */
        public List<Warning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<Warning>();
            }
            return this.warning;
        }

    }

}
