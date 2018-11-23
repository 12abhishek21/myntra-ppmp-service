
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
 *         &lt;element name="SelectedAlternateItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "selectedAlternateItemSKU",
    "saleOrderCode",
    "saleOrderItems"
})
@XmlRootElement(name = "AcceptSaleOrderItemAlternateRequest")
public class AcceptSaleOrderItemAlternateRequest {

    @XmlElement(name = "SelectedAlternateItemSKU", required = true)
    protected String selectedAlternateItemSKU;
    @XmlElement(name = "SaleOrderCode", required = true)
    protected String saleOrderCode;
    @XmlElement(name = "SaleOrderItems", required = true)
    protected AcceptSaleOrderItemAlternateRequest.SaleOrderItems saleOrderItems;

    /**
     * Gets the value of the selectedAlternateItemSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedAlternateItemSKU() {
        return selectedAlternateItemSKU;
    }

    /**
     * Sets the value of the selectedAlternateItemSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedAlternateItemSKU(String value) {
        this.selectedAlternateItemSKU = value;
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

    /**
     * Gets the value of the saleOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptSaleOrderItemAlternateRequest.SaleOrderItems }
     *     
     */
    public AcceptSaleOrderItemAlternateRequest.SaleOrderItems getSaleOrderItems() {
        return saleOrderItems;
    }

    /**
     * Sets the value of the saleOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptSaleOrderItemAlternateRequest.SaleOrderItems }
     *     
     */
    public void setSaleOrderItems(AcceptSaleOrderItemAlternateRequest.SaleOrderItems value) {
        this.saleOrderItems = value;
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
        protected List<AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem> saleOrderItem;

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
         * {@link AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem }
         * 
         * 
         */
        public List<AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem> getSaleOrderItem() {
            if (saleOrderItem == null) {
                saleOrderItem = new ArrayList<AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem>();
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
            "code"
        })
        public static class SaleOrderItem {

            @XmlElement(name = "Code", required = true)
            protected String code;

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

        }

    }

}
