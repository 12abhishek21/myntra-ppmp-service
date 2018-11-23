
package com.unicommerce.uniware.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailReversePickupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailReversePickupItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RetailReversePickupItem", propOrder = {
    "saleOrderCode",
    "itemCodes"
})
public class RetailReversePickupItem {

    @XmlElement(name = "SaleOrderCode", required = true)
    protected String saleOrderCode;
    @XmlElement(name = "ItemCodes")
    protected RetailReversePickupItem.ItemCodes itemCodes;

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
     * Gets the value of the itemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RetailReversePickupItem.ItemCodes }
     *     
     */
    public RetailReversePickupItem.ItemCodes getItemCodes() {
        return itemCodes;
    }

    /**
     * Sets the value of the itemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailReversePickupItem.ItemCodes }
     *     
     */
    public void setItemCodes(RetailReversePickupItem.ItemCodes value) {
        this.itemCodes = value;
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
     *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "itemCode"
    })
    public static class ItemCodes {

        @XmlElement(name = "ItemCode", required = true)
        protected List<String> itemCode;

        /**
         * Gets the value of the itemCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItemCode() {
            if (itemCode == null) {
                itemCode = new ArrayList<String>();
            }
            return this.itemCode;
        }

    }

}
