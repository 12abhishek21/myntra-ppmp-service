
package com.unicommerce.uniware.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleOrderAddressItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleOrderAddressItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleOrderAddressItem", propOrder = {
    "saleOrderItemCode",
    "shippingAddress"
})
public class SaleOrderAddressItem {

    @XmlElement(name = "SaleOrderItemCode", required = true)
    protected String saleOrderItemCode;
    @XmlElement(name = "ShippingAddress", required = true)
    protected AddressRef shippingAddress;

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
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRef }
     *     
     */
    public AddressRef getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *     
     */
    public void setShippingAddress(AddressRef value) {
        this.shippingAddress = value;
    }

}
