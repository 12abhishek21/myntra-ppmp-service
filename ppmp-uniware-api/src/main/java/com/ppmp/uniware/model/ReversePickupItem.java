
package com.ppmp.uniware.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversePickupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReversePickupItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReversePickupAlternate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversePickupItem", propOrder = {
    "saleOrderItemCode",
    "reason",
    "reversePickupAlternate"
})
public class ReversePickupItem {

    @XmlElement(name = "SaleOrderItemCode", required = true)
    protected String saleOrderItemCode;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "ReversePickupAlternate")
    protected ReversePickupAlternate reversePickupAlternate;

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

    /**
     * Gets the value of the reversePickupAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePickupAlternate }
     *     
     */
    public ReversePickupAlternate getReversePickupAlternate() {
        return reversePickupAlternate;
    }

    /**
     * Sets the value of the reversePickupAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePickupAlternate }
     *     
     */
    public void setReversePickupAlternate(ReversePickupAlternate value) {
        this.reversePickupAlternate = value;
    }


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
     *         &lt;element name="ItemSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PrepaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "itemSku",
        "totalPrice",
        "sellingPrice",
        "discount",
        "shippingCharges",
        "prepaidAmount"
    })
    public static class ReversePickupAlternate {

        @XmlElement(name = "ItemSku", required = true)
        protected String itemSku;
        @XmlElement(name = "TotalPrice", required = true)
        protected BigDecimal totalPrice;
        @XmlElement(name = "SellingPrice", required = true)
        protected BigDecimal sellingPrice;
        @XmlElement(name = "Discount")
        protected BigDecimal discount;
        @XmlElement(name = "ShippingCharges")
        protected BigDecimal shippingCharges;
        @XmlElement(name = "PrepaidAmount")
        protected BigDecimal prepaidAmount;

        /**
         * Gets the value of the itemSku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemSku() {
            return itemSku;
        }

        /**
         * Sets the value of the itemSku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemSku(String value) {
            this.itemSku = value;
        }

        /**
         * Gets the value of the totalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalPrice() {
            return totalPrice;
        }

        /**
         * Sets the value of the totalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalPrice(BigDecimal value) {
            this.totalPrice = value;
        }

        /**
         * Gets the value of the sellingPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSellingPrice() {
            return sellingPrice;
        }

        /**
         * Sets the value of the sellingPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSellingPrice(BigDecimal value) {
            this.sellingPrice = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDiscount(BigDecimal value) {
            this.discount = value;
        }

        /**
         * Gets the value of the shippingCharges property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getShippingCharges() {
            return shippingCharges;
        }

        /**
         * Sets the value of the shippingCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setShippingCharges(BigDecimal value) {
            this.shippingCharges = value;
        }

        /**
         * Gets the value of the prepaidAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrepaidAmount() {
            return prepaidAmount;
        }

        /**
         * Sets the value of the prepaidAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrepaidAmount(BigDecimal value) {
            this.prepaidAmount = value;
        }

    }

}
