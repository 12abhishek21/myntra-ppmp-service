
package com.unicommerce.uniware.services;

import java.math.BigDecimal;
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
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Invoice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                                       &lt;element name="SkuCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="SaleOrderItemCodes" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SaleOrderItems" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ItemDetails" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;complexContent&gt;
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                             &lt;sequence&gt;
 *                                                                               &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                               &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                             &lt;/sequence&gt;
 *                                                                           &lt;/restriction&gt;
 *                                                                         &lt;/complexContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
    "saleOrderCode",
    "shippingProviderCode",
    "trackingNumber",
    "invoice"
})
@XmlRootElement(name = "CreateInvoiceWithDetailsRequest")
public class CreateInvoiceWithDetailsRequest {

    @XmlElement(name = "SaleOrderCode", required = true)
    protected String saleOrderCode;
    @XmlElement(name = "ShippingProviderCode")
    protected String shippingProviderCode;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "Invoice")
    protected CreateInvoiceWithDetailsRequest.Invoice invoice;

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
     * Gets the value of the shippingProviderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingProviderCode() {
        return shippingProviderCode;
    }

    /**
     * Sets the value of the shippingProviderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingProviderCode(String value) {
        this.shippingProviderCode = value;
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
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link CreateInvoiceWithDetailsRequest.Invoice }
     *     
     */
    public CreateInvoiceWithDetailsRequest.Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateInvoiceWithDetailsRequest.Invoice }
     *     
     */
    public void setInvoice(CreateInvoiceWithDetailsRequest.Invoice value) {
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                             &lt;element name="SkuCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="SaleOrderItemCodes" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="SaleOrderItems" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="ItemDetails" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;complexContent&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                   &lt;sequence&gt;
     *                                                                     &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                                     &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                                   &lt;/sequence&gt;
     *                                                                 &lt;/restriction&gt;
     *                                                               &lt;/complexContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "invoiceItems"
    })
    public static class Invoice {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "InvoiceItems", required = true)
        protected CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems invoiceItems;

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
         * Gets the value of the invoiceItems property.
         * 
         * @return
         *     possible object is
         *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems }
         *     
         */
        public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems getInvoiceItems() {
            return invoiceItems;
        }

        /**
         * Sets the value of the invoiceItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems }
         *     
         */
        public void setInvoiceItems(CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems value) {
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
         *                   &lt;element name="SkuCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="SaleOrderItemCodes" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="SaleOrderItems" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="ItemDetails" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;complexContent&gt;
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                         &lt;sequence&gt;
         *                                                           &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                         &lt;/sequence&gt;
         *                                                       &lt;/restriction&gt;
         *                                                     &lt;/complexContent&gt;
         *                                                   &lt;/complexType&gt;
         *                                                 &lt;/element&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
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
         *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            protected List<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem> invoiceItem;

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
             * {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem }
             * 
             * 
             */
            public List<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem> getInvoiceItem() {
                if (invoiceItem == null) {
                    invoiceItem = new ArrayList<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem>();
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
             *         &lt;element name="SkuCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="SaleOrderItemCodes" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SaleOrderItems" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="ItemDetails" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;complexContent&gt;
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                               &lt;sequence&gt;
             *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                               &lt;/sequence&gt;
             *                                             &lt;/restriction&gt;
             *                                           &lt;/complexContent&gt;
             *                                         &lt;/complexType&gt;
             *                                       &lt;/element&gt;
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
             *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="AdditionalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ShippingMethodCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CashOnDeliveryCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="VoucherValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "skuCode",
                "channelProductId",
                "saleOrderItemCodes",
                "saleOrderItems",
                "unitPrice",
                "subTotal",
                "totalPrice",
                "vat",
                "cst",
                "igst",
                "utgst",
                "sgst",
                "cgst",
                "compensationCess",
                "serviceTax",
                "additionalTax",
                "discount",
                "shippingCharges",
                "shippingMethodCharges",
                "cashOnDeliveryCharges",
                "prepaidAmount",
                "voucherValue"
            })
            public static class InvoiceItem {

                @XmlElement(name = "SkuCode")
                protected String skuCode;
                @XmlElement(name = "ChannelProductId")
                protected String channelProductId;
                @XmlElement(name = "SaleOrderItemCodes")
                protected CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes saleOrderItemCodes;
                @XmlElement(name = "SaleOrderItems")
                protected CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems saleOrderItems;
                @XmlElement(name = "UnitPrice", required = true)
                protected BigDecimal unitPrice;
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
                @XmlElement(name = "ServiceTax")
                protected BigDecimal serviceTax;
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
                @XmlElement(name = "PrepaidAmount")
                protected BigDecimal prepaidAmount;
                @XmlElement(name = "VoucherValue")
                protected BigDecimal voucherValue;

                /**
                 * Gets the value of the skuCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSkuCode() {
                    return skuCode;
                }

                /**
                 * Sets the value of the skuCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSkuCode(String value) {
                    this.skuCode = value;
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
                 * Gets the value of the saleOrderItemCodes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes }
                 *     
                 */
                public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes getSaleOrderItemCodes() {
                    return saleOrderItemCodes;
                }

                /**
                 * Sets the value of the saleOrderItemCodes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes }
                 *     
                 */
                public void setSaleOrderItemCodes(CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes value) {
                    this.saleOrderItemCodes = value;
                }

                /**
                 * Gets the value of the saleOrderItems property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems }
                 *     
                 */
                public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems getSaleOrderItems() {
                    return saleOrderItems;
                }

                /**
                 * Sets the value of the saleOrderItems property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems }
                 *     
                 */
                public void setSaleOrderItems(CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems value) {
                    this.saleOrderItems = value;
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
                 * Gets the value of the serviceTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getServiceTax() {
                    return serviceTax;
                }

                /**
                 * Sets the value of the serviceTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setServiceTax(BigDecimal value) {
                    this.serviceTax = value;
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
                    "saleOrderItemCode"
                })
                public static class SaleOrderItemCodes {

                    @XmlElement(name = "SaleOrderItemCode", required = true)
                    protected List<String> saleOrderItemCode;

                    /**
                     * Gets the value of the saleOrderItemCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the saleOrderItemCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSaleOrderItemCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSaleOrderItemCode() {
                        if (saleOrderItemCode == null) {
                            saleOrderItemCode = new ArrayList<String>();
                        }
                        return this.saleOrderItemCode;
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
                 *                   &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="ItemDetails" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;complexContent&gt;
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                     &lt;sequence&gt;
                 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "saleOrderItem"
                })
                public static class SaleOrderItems {

                    @XmlElement(name = "SaleOrderItem", required = true)
                    protected List<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem> saleOrderItem;

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
                     * {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem }
                     * 
                     * 
                     */
                    public List<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem> getSaleOrderItem() {
                        if (saleOrderItem == null) {
                            saleOrderItem = new ArrayList<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem>();
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
                     *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="ItemDetails" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;sequence&gt;
                     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                        "saleOrderItemCode",
                        "itemDetails"
                    })
                    public static class SaleOrderItem {

                        @XmlElement(name = "SaleOrderItemCode", required = true)
                        protected String saleOrderItemCode;
                        @XmlElement(name = "ItemDetails")
                        protected CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails itemDetails;

                        /**
                         * Gets the value of the saleOrderItemCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSaleOrderItemCode() {
                            return saleOrderItemCode;
                        }

                        /**
                         * Sets the value of the saleOrderItemCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSaleOrderItemCode(String value) {
                            this.saleOrderItemCode = value;
                        }

                        /**
                         * Gets the value of the itemDetails property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails }
                         *     
                         */
                        public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails getItemDetails() {
                            return itemDetails;
                        }

                        /**
                         * Sets the value of the itemDetails property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails }
                         *     
                         */
                        public void setItemDetails(CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails value) {
                            this.itemDetails = value;
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
                         *         &lt;element name="ItemDetail" maxOccurs="unbounded"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;sequence&gt;
                         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                            "itemDetail"
                        })
                        public static class ItemDetails {

                            @XmlElement(name = "ItemDetail", required = true)
                            protected List<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail> itemDetail;

                            /**
                             * Gets the value of the itemDetail property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the itemDetail property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getItemDetail().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail }
                             * 
                             * 
                             */
                            public List<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail> getItemDetail() {
                                if (itemDetail == null) {
                                    itemDetail = new ArrayList<CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail>();
                                }
                                return this.itemDetail;
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
                             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                             *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                                "name",
                                "value"
                            })
                            public static class ItemDetail {

                                @XmlElement(name = "Name", required = true)
                                protected String name;
                                @XmlElement(name = "Value", required = true)
                                protected String value;

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
                                 * Gets the value of the value property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * Sets the value of the value property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
