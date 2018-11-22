
package com.ppmp.uniware.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventorySnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventorySnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Facility" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OpenSale" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="OpenPurchase" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PutawayPending" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InventoryBlocked" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventorySnapshot", propOrder = {
    "facility",
    "openSale",
    "inventory",
    "openPurchase",
    "putawayPending",
    "inventoryBlocked"
})
public class InventorySnapshot {

    @XmlElement(name = "Facility", required = true)
    protected String facility;
    @XmlElement(name = "OpenSale")
    protected long openSale;
    @XmlElement(name = "Inventory")
    protected long inventory;
    @XmlElement(name = "OpenPurchase")
    protected long openPurchase;
    @XmlElement(name = "PutawayPending")
    protected long putawayPending;
    @XmlElement(name = "InventoryBlocked")
    protected long inventoryBlocked;

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacility(String value) {
        this.facility = value;
    }

    /**
     * Gets the value of the openSale property.
     * 
     */
    public long getOpenSale() {
        return openSale;
    }

    /**
     * Sets the value of the openSale property.
     * 
     */
    public void setOpenSale(long value) {
        this.openSale = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     */
    public long getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     */
    public void setInventory(long value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the openPurchase property.
     * 
     */
    public long getOpenPurchase() {
        return openPurchase;
    }

    /**
     * Sets the value of the openPurchase property.
     * 
     */
    public void setOpenPurchase(long value) {
        this.openPurchase = value;
    }

    /**
     * Gets the value of the putawayPending property.
     * 
     */
    public long getPutawayPending() {
        return putawayPending;
    }

    /**
     * Sets the value of the putawayPending property.
     * 
     */
    public void setPutawayPending(long value) {
        this.putawayPending = value;
    }

    /**
     * Gets the value of the inventoryBlocked property.
     * 
     */
    public long getInventoryBlocked() {
        return inventoryBlocked;
    }

    /**
     * Sets the value of the inventoryBlocked property.
     * 
     */
    public void setInventoryBlocked(long value) {
        this.inventoryBlocked = value;
    }

}
