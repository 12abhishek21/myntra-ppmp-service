
package com.unicommerce.uniware.services;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingPackageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ShippingBox" type="{http://uniware.unicommerce.com/services/}WsShippingBox" minOccurs="0"/&gt;
 *         &lt;element name="NoOfBoxes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
    "shippingPackageCode",
    "shippingProviderCode",
    "trackingNumber",
    "shippingPackageTypeCode",
    "actualWeight",
    "shippingBox",
    "noOfBoxes",
    "customFields"
})
@XmlRootElement(name = "EditShippingPackageRequest")
public class EditShippingPackageRequest {

    @XmlElement(name = "ShippingPackageCode", required = true)
    protected String shippingPackageCode;
    @XmlElement(name = "ShippingProviderCode")
    protected String shippingProviderCode;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ShippingPackageTypeCode")
    protected String shippingPackageTypeCode;
    @XmlElement(name = "ActualWeight")
    protected BigDecimal actualWeight;
    @XmlElement(name = "ShippingBox")
    protected WsShippingBox shippingBox;
    @XmlElement(name = "NoOfBoxes")
    protected BigInteger noOfBoxes;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;

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
     * Gets the value of the shippingPackageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPackageTypeCode() {
        return shippingPackageTypeCode;
    }

    /**
     * Sets the value of the shippingPackageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPackageTypeCode(String value) {
        this.shippingPackageTypeCode = value;
    }

    /**
     * Gets the value of the actualWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    /**
     * Sets the value of the actualWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualWeight(BigDecimal value) {
        this.actualWeight = value;
    }

    /**
     * Gets the value of the shippingBox property.
     * 
     * @return
     *     possible object is
     *     {@link WsShippingBox }
     *     
     */
    public WsShippingBox getShippingBox() {
        return shippingBox;
    }

    /**
     * Sets the value of the shippingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsShippingBox }
     *     
     */
    public void setShippingBox(WsShippingBox value) {
        this.shippingBox = value;
    }

    /**
     * Gets the value of the noOfBoxes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoOfBoxes() {
        return noOfBoxes;
    }

    /**
     * Sets the value of the noOfBoxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoOfBoxes(BigInteger value) {
        this.noOfBoxes = value;
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
