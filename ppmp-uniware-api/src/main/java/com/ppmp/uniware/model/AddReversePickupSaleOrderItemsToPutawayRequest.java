
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
 *         &lt;element name="PutawayCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReversePickupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "putawayCode",
    "reversePickupCode"
})
@XmlRootElement(name = "AddReversePickupSaleOrderItemsToPutawayRequest")
public class AddReversePickupSaleOrderItemsToPutawayRequest {

    @XmlElement(name = "PutawayCode", required = true)
    protected String putawayCode;
    @XmlElement(name = "ReversePickupCode", required = true)
    protected String reversePickupCode;

    /**
     * Gets the value of the putawayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutawayCode() {
        return putawayCode;
    }

    /**
     * Sets the value of the putawayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutawayCode(String value) {
        this.putawayCode = value;
    }

    /**
     * Gets the value of the reversePickupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversePickupCode() {
        return reversePickupCode;
    }

    /**
     * Sets the value of the reversePickupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversePickupCode(String value) {
        this.reversePickupCode = value;
    }

}
