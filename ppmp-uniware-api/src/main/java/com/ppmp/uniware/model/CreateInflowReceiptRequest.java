
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
 *         &lt;element name="InflowReceipt" type="{http://uniware.unicommerce.com/services/}GRN"/&gt;
 *         &lt;element name="PurchaseOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "inflowReceipt",
    "purchaseOrderCode"
})
@XmlRootElement(name = "CreateInflowReceiptRequest")
public class CreateInflowReceiptRequest {

    @XmlElement(name = "InflowReceipt", required = true)
    protected GRN inflowReceipt;
    @XmlElement(name = "PurchaseOrderCode", required = true)
    protected String purchaseOrderCode;

    /**
     * Gets the value of the inflowReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link GRN }
     *     
     */
    public GRN getInflowReceipt() {
        return inflowReceipt;
    }

    /**
     * Sets the value of the inflowReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRN }
     *     
     */
    public void setInflowReceipt(GRN value) {
        this.inflowReceipt = value;
    }

    /**
     * Gets the value of the purchaseOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    /**
     * Sets the value of the purchaseOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderCode(String value) {
        this.purchaseOrderCode = value;
    }

}
