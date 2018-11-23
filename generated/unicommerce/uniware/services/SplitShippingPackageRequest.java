
package com.unicommerce.uniware.services;

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
 *         &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SplitSaleOrderItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SplitSaleOrderItem" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SplitPacketNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "shippingPackageCode",
    "splitSaleOrderItems"
})
@XmlRootElement(name = "SplitShippingPackageRequest")
public class SplitShippingPackageRequest {

    @XmlElement(name = "ShippingPackageCode", required = true)
    protected String shippingPackageCode;
    @XmlElement(name = "SplitSaleOrderItems", required = true)
    protected SplitShippingPackageRequest.SplitSaleOrderItems splitSaleOrderItems;

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
     * Gets the value of the splitSaleOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link SplitShippingPackageRequest.SplitSaleOrderItems }
     *     
     */
    public SplitShippingPackageRequest.SplitSaleOrderItems getSplitSaleOrderItems() {
        return splitSaleOrderItems;
    }

    /**
     * Sets the value of the splitSaleOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitShippingPackageRequest.SplitSaleOrderItems }
     *     
     */
    public void setSplitSaleOrderItems(SplitShippingPackageRequest.SplitSaleOrderItems value) {
        this.splitSaleOrderItems = value;
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
     *         &lt;element name="SplitSaleOrderItem" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SplitPacketNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "splitSaleOrderItem"
    })
    public static class SplitSaleOrderItems {

        @XmlElement(name = "SplitSaleOrderItem", required = true)
        protected List<SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem> splitSaleOrderItem;

        /**
         * Gets the value of the splitSaleOrderItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the splitSaleOrderItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSplitSaleOrderItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem }
         * 
         * 
         */
        public List<SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem> getSplitSaleOrderItem() {
            if (splitSaleOrderItem == null) {
                splitSaleOrderItem = new ArrayList<SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem>();
            }
            return this.splitSaleOrderItem;
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
         *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SplitPacketNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "saleOrderItemCode",
            "splitPacketNumber"
        })
        public static class SplitSaleOrderItem {

            @XmlElement(name = "SaleOrderItemCode", required = true)
            protected String saleOrderItemCode;
            @XmlElement(name = "SplitPacketNumber")
            protected int splitPacketNumber;

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
             * Gets the value of the splitPacketNumber property.
             * 
             */
            public int getSplitPacketNumber() {
                return splitPacketNumber;
            }

            /**
             * Sets the value of the splitPacketNumber property.
             * 
             */
            public void setSplitPacketNumber(int value) {
                this.splitPacketNumber = value;
            }

        }

    }

}
