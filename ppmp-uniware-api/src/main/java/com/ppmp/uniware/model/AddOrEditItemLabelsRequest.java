
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
 *         &lt;element name="ItemSKUCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemCodes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "itemSKUCode",
    "itemCodes"
})
@XmlRootElement(name = "AddOrEditItemLabelsRequest")
public class AddOrEditItemLabelsRequest {

    @XmlElement(name = "ItemSKUCode", required = true)
    protected String itemSKUCode;
    @XmlElement(name = "ItemCodes", required = true)
    protected ItemCodes itemCodes;

    /**
     * Gets the value of the itemSKUCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSKUCode() {
        return itemSKUCode;
    }

    /**
     * Sets the value of the itemSKUCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSKUCode(String value) {
        this.itemSKUCode = value;
    }

    /**
     * Gets the value of the itemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCodes }
     *     
     */
    public ItemCodes getItemCodes() {
        return itemCodes;
    }

    /**
     * Sets the value of the itemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCodes }
     *     
     */
    public void setItemCodes(ItemCodes value) {
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
        "itemCode"
    })
    public static class ItemCodes {

        @XmlElement(name = "ItemCode", required = true)
        protected String itemCode;

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

}
