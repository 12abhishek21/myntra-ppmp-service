
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
 *         &lt;element name="GatePassCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "gatePassCode",
    "itemCode",
    "reason"
})
@XmlRootElement(name = "AddItemToGatePassRequest")
public class AddItemToGatePassRequest {

    @XmlElement(name = "GatePassCode", required = true)
    protected String gatePassCode;
    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;
    @XmlElement(name = "Reason")
    protected String reason;

    /**
     * Gets the value of the gatePassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatePassCode() {
        return gatePassCode;
    }

    /**
     * Sets the value of the gatePassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatePassCode(String value) {
        this.gatePassCode = value;
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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
