
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
 *         &lt;element name="ShipmentBatchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "shipmentBatchCode"
})
@XmlRootElement(name = "CreateBatchRequest")
public class CreateBatchRequest {

    @XmlElement(name = "ShipmentBatchCode", required = true)
    protected String shipmentBatchCode;

    /**
     * Gets the value of the shipmentBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentBatchCode() {
        return shipmentBatchCode;
    }

    /**
     * Sets the value of the shipmentBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentBatchCode(String value) {
        this.shipmentBatchCode = value;
    }

}
