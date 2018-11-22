
package com.ppmp.uniware.model;

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
 *         &lt;element name="Pincode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "pincode",
    "cashOnDelivery"
})
@XmlRootElement(name = "GetServiceabilityRequest")
public class GetServiceabilityRequest {

    @XmlElement(name = "Pincode", required = true)
    protected String pincode;
    @XmlElement(name = "CashOnDelivery")
    protected boolean cashOnDelivery;

    /**
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
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

}
