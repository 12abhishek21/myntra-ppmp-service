
package com.ppmp.uniware.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingPackage", propOrder = {
    "shipmentCode",
    "statusCode",
    "shippingPackageType",
    "invoiceCode",
    "shippingProvider",
    "trackingNumber"
})
public class ShippingPackage {

    @XmlElement(name = "ShipmentCode")
    protected String shipmentCode;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "ShippingPackageType")
    protected String shippingPackageType;
    @XmlElement(name = "InvoiceCode")
    protected String invoiceCode;
    @XmlElement(name = "ShippingProvider")
    protected String shippingProvider;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;

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

}
