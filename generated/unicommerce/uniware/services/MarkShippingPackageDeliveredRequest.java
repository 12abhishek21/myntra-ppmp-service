
package com.unicommerce.uniware.services;

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
 *         &lt;element name="PodCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "podCode"
})
@XmlRootElement(name = "MarkShippingPackageDeliveredRequest")
public class MarkShippingPackageDeliveredRequest {

    @XmlElement(name = "ShippingPackageCode", required = true)
    protected String shippingPackageCode;
    @XmlElement(name = "PodCode", required = true)
    protected String podCode;

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

}
