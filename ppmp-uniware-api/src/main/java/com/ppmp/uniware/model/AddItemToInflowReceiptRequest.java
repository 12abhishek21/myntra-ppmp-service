
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
 *         &lt;element name="InflowReceiptCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "inflowReceiptCode",
    "itemCode"
})
@XmlRootElement(name = "AddItemToInflowReceiptRequest")
public class AddItemToInflowReceiptRequest {

    @XmlElement(name = "InflowReceiptCode", required = true)
    protected String inflowReceiptCode;
    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;

    /**
     * Gets the value of the inflowReceiptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInflowReceiptCode() {
        return inflowReceiptCode;
    }

    /**
     * Sets the value of the inflowReceiptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInflowReceiptCode(String value) {
        this.inflowReceiptCode = value;
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

}
