
package com.unicommerce.uniware.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutawayItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutawayItemDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShelfCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemTypeSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PutawayQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutawayItemDTO", propOrder = {
    "shelfCode",
    "itemTypeName",
    "itemTypeSkuCode",
    "inventoryType",
    "quantity",
    "putawayQuantity",
    "statusCode"
})
public class PutawayItemDTO {

    @XmlElement(name = "ShelfCode", required = true)
    protected String shelfCode;
    @XmlElement(name = "ItemTypeName", required = true)
    protected String itemTypeName;
    @XmlElement(name = "ItemTypeSkuCode", required = true)
    protected String itemTypeSkuCode;
    @XmlElement(name = "InventoryType", required = true)
    protected String inventoryType;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "PutawayQuantity")
    protected int putawayQuantity;
    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;

    /**
     * Gets the value of the shelfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfCode() {
        return shelfCode;
    }

    /**
     * Sets the value of the shelfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfCode(String value) {
        this.shelfCode = value;
    }

    /**
     * Gets the value of the itemTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * Sets the value of the itemTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeName(String value) {
        this.itemTypeName = value;
    }

    /**
     * Gets the value of the itemTypeSkuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeSkuCode() {
        return itemTypeSkuCode;
    }

    /**
     * Sets the value of the itemTypeSkuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeSkuCode(String value) {
        this.itemTypeSkuCode = value;
    }

    /**
     * Gets the value of the inventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * Sets the value of the inventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryType(String value) {
        this.inventoryType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the putawayQuantity property.
     * 
     */
    public int getPutawayQuantity() {
        return putawayQuantity;
    }

    /**
     * Sets the value of the putawayQuantity property.
     * 
     */
    public void setPutawayQuantity(int value) {
        this.putawayQuantity = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
