
package com.unicommerce.uniware.services;

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
 *         &lt;element name="Invoice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="InvoiceItems"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InvoiceItem" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ChannelSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="AdditionalTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
    "invoice"
})
@XmlRootElement(name = "GetInvoiceDetailsResponse")
public class GetInvoiceDetailsResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected GetInvoiceDetailsResponse.Errors errors;
    @XmlElement(name = "Warnings")
    protected GetInvoiceDetailsResponse.Warnings warnings;
    @XmlElement(name = "Invoice")
    protected GetInvoiceDetailsResponse.Invoice invoice;

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
     *     {@link GetInvoiceDetailsResponse.Errors }
     *     
     */
    public GetInvoiceDetailsResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoiceDetailsResponse.Errors }
     *     
     */
    public void setErrors(GetInvoiceDetailsResponse.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoiceDetailsResponse.Warnings }
     *     
     */
    public GetInvoiceDetailsResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoiceDetailsResponse.Warnings }
     *     
     */
    public void setWarnings(GetInvoiceDetailsResponse.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoiceDetailsResponse.Invoice }
     *     
     */
    public GetInvoiceDetailsResponse.Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoiceDetailsResponse.Invoice }
     *     
     */
    public void setInvoice(GetInvoiceDetailsResponse.Invoice value) {
        this.invoice = value;
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
        protected List<Error> error;

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
         * {@link Error }
         * 
         * 
         */
        public List<Error> getError() {
            if (error == null) {
                error = new ArrayList<Error>();
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
     *         &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="InvoiceItems"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InvoiceItem" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ChannelSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="AdditionalTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "shippingPackageCode",
        "totalQuantity",
        "paymentMode",
        "sellingPrice",
        "subTotal",
        "totalPrice",
        "vat",
        "cst",
        "igst",
        "utgst",
        "sgst",
        "cgst",
        "compensationCess",
        "additionalTax",
        "discount",
        "shippingCharges",
        "shippingMethodCharges",
        "cashOnDeliveryCharges",
        "giftWrapCharges",
        "storeCredit",
        "prepaidAmount",
        "createdOn",
        "invoiceItems"
    })
    public static class Invoice {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "ShippingPackageCode", required = true)
        protected String shippingPackageCode;
        @XmlElement(name = "TotalQuantity")
        protected BigInteger totalQuantity;
        @XmlElement(name = "PaymentMode")
        protected String paymentMode;
        @XmlElement(name = "SellingPrice", required = true)
        protected BigDecimal sellingPrice;
        @XmlElement(name = "SubTotal")
        protected BigDecimal subTotal;
        @XmlElement(name = "TotalPrice", required = true)
        protected BigDecimal totalPrice;
        @XmlElement(name = "VAT")
        protected BigDecimal vat;
        @XmlElement(name = "CST")
        protected BigDecimal cst;
        @XmlElement(name = "IGST")
        protected BigDecimal igst;
        @XmlElement(name = "UTGST")
        protected BigDecimal utgst;
        @XmlElement(name = "SGST")
        protected BigDecimal sgst;
        @XmlElement(name = "CGST")
        protected BigDecimal cgst;
        @XmlElement(name = "CompensationCess")
        protected BigDecimal compensationCess;
        @XmlElement(name = "AdditionalTax")
        protected BigDecimal additionalTax;
        @XmlElement(name = "Discount")
        protected BigDecimal discount;
        @XmlElement(name = "ShippingCharges")
        protected BigDecimal shippingCharges;
        @XmlElement(name = "ShippingMethodCharges")
        protected BigDecimal shippingMethodCharges;
        @XmlElement(name = "CashOnDeliveryCharges")
        protected BigDecimal cashOnDeliveryCharges;
        @XmlElement(name = "GiftWrapCharges")
        protected BigDecimal giftWrapCharges;
        @XmlElement(name = "StoreCredit")
        protected BigDecimal storeCredit;
        @XmlElement(name = "PrepaidAmount")
        protected BigDecimal prepaidAmount;
        @XmlElement(name = "CreatedOn", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdOn;
        @XmlElement(name = "InvoiceItems", required = true)
        protected GetInvoiceDetailsResponse.Invoice.InvoiceItems invoiceItems;

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
         * Gets the value of the totalQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalQuantity() {
            return totalQuantity;
        }

        /**
         * Sets the value of the totalQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalQuantity(BigInteger value) {
            this.totalQuantity = value;
        }

        /**
         * Gets the value of the paymentMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentMode() {
            return paymentMode;
        }

        /**
         * Sets the value of the paymentMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentMode(String value) {
            this.paymentMode = value;
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
         * Gets the value of the subTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSubTotal() {
            return subTotal;
        }

        /**
         * Sets the value of the subTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSubTotal(BigDecimal value) {
            this.subTotal = value;
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
         * Gets the value of the vat property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVAT() {
            return vat;
        }

        /**
         * Sets the value of the vat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVAT(BigDecimal value) {
            this.vat = value;
        }

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCST(BigDecimal value) {
            this.cst = value;
        }

        /**
         * Gets the value of the igst property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIGST() {
            return igst;
        }

        /**
         * Sets the value of the igst property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIGST(BigDecimal value) {
            this.igst = value;
        }

        /**
         * Gets the value of the utgst property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUTGST() {
            return utgst;
        }

        /**
         * Sets the value of the utgst property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUTGST(BigDecimal value) {
            this.utgst = value;
        }

        /**
         * Gets the value of the sgst property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSGST() {
            return sgst;
        }

        /**
         * Sets the value of the sgst property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSGST(BigDecimal value) {
            this.sgst = value;
        }

        /**
         * Gets the value of the cgst property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCGST() {
            return cgst;
        }

        /**
         * Sets the value of the cgst property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCGST(BigDecimal value) {
            this.cgst = value;
        }

        /**
         * Gets the value of the compensationCess property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCompensationCess() {
            return compensationCess;
        }

        /**
         * Sets the value of the compensationCess property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCompensationCess(BigDecimal value) {
            this.compensationCess = value;
        }

        /**
         * Gets the value of the additionalTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAdditionalTax() {
            return additionalTax;
        }

        /**
         * Sets the value of the additionalTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAdditionalTax(BigDecimal value) {
            this.additionalTax = value;
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
         * Gets the value of the invoiceItems property.
         * 
         * @return
         *     possible object is
         *     {@link GetInvoiceDetailsResponse.Invoice.InvoiceItems }
         *     
         */
        public GetInvoiceDetailsResponse.Invoice.InvoiceItems getInvoiceItems() {
            return invoiceItems;
        }

        /**
         * Sets the value of the invoiceItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetInvoiceDetailsResponse.Invoice.InvoiceItems }
         *     
         */
        public void setInvoiceItems(GetInvoiceDetailsResponse.Invoice.InvoiceItems value) {
            this.invoiceItems = value;
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
         *         &lt;element name="InvoiceItem" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ChannelSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="AdditionalTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "invoiceItem"
        })
        public static class InvoiceItems {

            @XmlElement(name = "InvoiceItem", required = true)
            protected List<GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem> invoiceItem;

            /**
             * Gets the value of the invoiceItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the invoiceItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInvoiceItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem }
             * 
             * 
             */
            public List<GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem> getInvoiceItem() {
                if (invoiceItem == null) {
                    invoiceItem = new ArrayList<GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem>();
                }
                return this.invoiceItem;
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
             *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ChannelSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="GiftWrapCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="StoreCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="AdditionalTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "itemSKU",
                "channelSku",
                "quantity",
                "paymentMode",
                "unitPrice",
                "sellingPrice",
                "subTotal",
                "totalPrice",
                "vat",
                "cst",
                "igst",
                "utgst",
                "sgst",
                "cgst",
                "compensationCess",
                "additionalTax",
                "discount",
                "shippingCharges",
                "shippingMethodCharges",
                "cashOnDeliveryCharges",
                "giftWrapCharges",
                "storeCredit",
                "prepaidAmount",
                "voucherValue",
                "totalTax",
                "taxPercentage",
                "additionalTaxPercentage"
            })
            public static class InvoiceItem {

                @XmlElement(name = "ItemSKU", required = true)
                protected String itemSKU;
                @XmlElement(name = "ChannelSku")
                protected String channelSku;
                @XmlElement(name = "Quantity")
                protected BigInteger quantity;
                @XmlElement(name = "PaymentMode")
                protected String paymentMode;
                @XmlElement(name = "UnitPrice", required = true)
                protected BigDecimal unitPrice;
                @XmlElement(name = "SellingPrice", required = true)
                protected BigDecimal sellingPrice;
                @XmlElement(name = "SubTotal")
                protected BigDecimal subTotal;
                @XmlElement(name = "TotalPrice", required = true)
                protected BigDecimal totalPrice;
                @XmlElement(name = "VAT")
                protected BigDecimal vat;
                @XmlElement(name = "CST")
                protected BigDecimal cst;
                @XmlElement(name = "IGST")
                protected BigDecimal igst;
                @XmlElement(name = "UTGST")
                protected BigDecimal utgst;
                @XmlElement(name = "SGST")
                protected BigDecimal sgst;
                @XmlElement(name = "CGST")
                protected BigDecimal cgst;
                @XmlElement(name = "CompensationCess")
                protected BigInteger compensationCess;
                @XmlElement(name = "AdditionalTax")
                protected BigDecimal additionalTax;
                @XmlElement(name = "Discount")
                protected BigDecimal discount;
                @XmlElement(name = "ShippingCharges")
                protected BigDecimal shippingCharges;
                @XmlElement(name = "ShippingMethodCharges")
                protected BigDecimal shippingMethodCharges;
                @XmlElement(name = "CashOnDeliveryCharges")
                protected BigDecimal cashOnDeliveryCharges;
                @XmlElement(name = "GiftWrapCharges")
                protected BigDecimal giftWrapCharges;
                @XmlElement(name = "StoreCredit")
                protected BigDecimal storeCredit;
                @XmlElement(name = "PrepaidAmount")
                protected BigDecimal prepaidAmount;
                @XmlElement(name = "VoucherValue")
                protected BigDecimal voucherValue;
                @XmlElement(name = "TotalTax")
                protected BigDecimal totalTax;
                @XmlElement(name = "TaxPercentage")
                protected BigDecimal taxPercentage;
                @XmlElement(name = "AdditionalTaxPercentage")
                protected BigDecimal additionalTaxPercentage;

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
                 * Gets the value of the channelSku property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChannelSku() {
                    return channelSku;
                }

                /**
                 * Sets the value of the channelSku property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChannelSku(String value) {
                    this.channelSku = value;
                }

                /**
                 * Gets the value of the quantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setQuantity(BigInteger value) {
                    this.quantity = value;
                }

                /**
                 * Gets the value of the paymentMode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaymentMode() {
                    return paymentMode;
                }

                /**
                 * Sets the value of the paymentMode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaymentMode(String value) {
                    this.paymentMode = value;
                }

                /**
                 * Gets the value of the unitPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitPrice() {
                    return unitPrice;
                }

                /**
                 * Sets the value of the unitPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitPrice(BigDecimal value) {
                    this.unitPrice = value;
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
                 * Gets the value of the subTotal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSubTotal() {
                    return subTotal;
                }

                /**
                 * Sets the value of the subTotal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSubTotal(BigDecimal value) {
                    this.subTotal = value;
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
                 * Gets the value of the vat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVAT() {
                    return vat;
                }

                /**
                 * Sets the value of the vat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVAT(BigDecimal value) {
                    this.vat = value;
                }

                /**
                 * Gets the value of the cst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCST() {
                    return cst;
                }

                /**
                 * Sets the value of the cst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCST(BigDecimal value) {
                    this.cst = value;
                }

                /**
                 * Gets the value of the igst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getIGST() {
                    return igst;
                }

                /**
                 * Sets the value of the igst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setIGST(BigDecimal value) {
                    this.igst = value;
                }

                /**
                 * Gets the value of the utgst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUTGST() {
                    return utgst;
                }

                /**
                 * Sets the value of the utgst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUTGST(BigDecimal value) {
                    this.utgst = value;
                }

                /**
                 * Gets the value of the sgst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSGST() {
                    return sgst;
                }

                /**
                 * Sets the value of the sgst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSGST(BigDecimal value) {
                    this.sgst = value;
                }

                /**
                 * Gets the value of the cgst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCGST() {
                    return cgst;
                }

                /**
                 * Sets the value of the cgst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCGST(BigDecimal value) {
                    this.cgst = value;
                }

                /**
                 * Gets the value of the compensationCess property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCompensationCess() {
                    return compensationCess;
                }

                /**
                 * Sets the value of the compensationCess property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCompensationCess(BigInteger value) {
                    this.compensationCess = value;
                }

                /**
                 * Gets the value of the additionalTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAdditionalTax() {
                    return additionalTax;
                }

                /**
                 * Sets the value of the additionalTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAdditionalTax(BigDecimal value) {
                    this.additionalTax = value;
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
                 * Gets the value of the totalTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalTax() {
                    return totalTax;
                }

                /**
                 * Sets the value of the totalTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalTax(BigDecimal value) {
                    this.totalTax = value;
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
                 * Gets the value of the additionalTaxPercentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAdditionalTaxPercentage() {
                    return additionalTaxPercentage;
                }

                /**
                 * Sets the value of the additionalTaxPercentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAdditionalTaxPercentage(BigDecimal value) {
                    this.additionalTaxPercentage = value;
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
