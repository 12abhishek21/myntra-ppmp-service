
package com.unicommerce.uniware.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SaleOrderItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SaleOrderItemAlternates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItemAlternate" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AmountDifference" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "", propOrder = {
    "saleOrderItems",
    "saleOrderItemAlternates"
})
@XmlRootElement(name = "CreateSaleOrderItemAlternateRequest")
public class CreateSaleOrderItemAlternateRequest {

    @XmlElement(name = "SaleOrderItems", required = true)
    protected CreateSaleOrderItemAlternateRequest.SaleOrderItems saleOrderItems;
    @XmlElement(name = "SaleOrderItemAlternates", required = true)
    protected CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates saleOrderItemAlternates;

    /**
     * Gets the value of the saleOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSaleOrderItemAlternateRequest.SaleOrderItems }
     *     
     */
    public CreateSaleOrderItemAlternateRequest.SaleOrderItems getSaleOrderItems() {
        return saleOrderItems;
    }

    /**
     * Sets the value of the saleOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSaleOrderItemAlternateRequest.SaleOrderItems }
     *     
     */
    public void setSaleOrderItems(CreateSaleOrderItemAlternateRequest.SaleOrderItems value) {
        this.saleOrderItems = value;
    }

    /**
     * Gets the value of the saleOrderItemAlternates property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates }
     *     
     */
    public CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates getSaleOrderItemAlternates() {
        return saleOrderItemAlternates;
    }

    /**
     * Sets the value of the saleOrderItemAlternates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates }
     *     
     */
    public void setSaleOrderItemAlternates(CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates value) {
        this.saleOrderItemAlternates = value;
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
     *         &lt;element name="SaleOrderItemAlternate" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AmountDifference" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    @XmlType(name = "", propOrder = {
        "saleOrderItemAlternate"
    })
    public static class SaleOrderItemAlternates {

        @XmlElement(name = "SaleOrderItemAlternate", required = true)
        protected List<CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate> saleOrderItemAlternate;

        /**
         * Gets the value of the saleOrderItemAlternate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrderItemAlternate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrderItemAlternate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate }
         * 
         * 
         */
        public List<CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate> getSaleOrderItemAlternate() {
            if (saleOrderItemAlternate == null) {
                saleOrderItemAlternate = new ArrayList<CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate>();
            }
            return this.saleOrderItemAlternate;
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
         *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AmountDifference" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
            "itemSKU",
            "amountDifference"
        })
        public static class SaleOrderItemAlternate {

            @XmlElement(name = "ItemSKU", required = true)
            protected String itemSKU;
            @XmlElement(name = "AmountDifference", required = true)
            protected BigDecimal amountDifference;

            /**
             * Gets the value of the itemSKU property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemSKU() {
                return itemSKU;
            }

            /**
             * Sets the value of the itemSKU property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemSKU(String value) {
                this.itemSKU = value;
            }

            /**
             * Gets the value of the amountDifference property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountDifference() {
                return amountDifference;
            }

            /**
             * Sets the value of the amountDifference property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmountDifference(BigDecimal value) {
                this.amountDifference = value;
            }

        }

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
     *         &lt;element name="SaleOrderItem" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    @XmlType(name = "", propOrder = {
        "saleOrderItem"
    })
    public static class SaleOrderItems {

        @XmlElement(name = "SaleOrderItem", required = true)
        protected List<CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem> saleOrderItem;

        /**
         * Gets the value of the saleOrderItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrderItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrderItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem }
         * 
         * 
         */
        public List<CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem> getSaleOrderItem() {
            if (saleOrderItem == null) {
                saleOrderItem = new ArrayList<CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem>();
            }
            return this.saleOrderItem;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "code",
            "saleOrderCode"
        })
        public static class SaleOrderItem {

            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "SaleOrderCode", required = true)
            protected String saleOrderCode;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the saleOrderCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaleOrderCode() {
                return saleOrderCode;
            }

            /**
             * Sets the value of the saleOrderCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaleOrderCode(String value) {
                this.saleOrderCode = value;
            }

        }

    }

}
