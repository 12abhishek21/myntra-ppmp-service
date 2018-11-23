
package com.unicommerce.uniware.services;

import java.math.BigInteger;
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
 *         &lt;element name="FacilityContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ShelfCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransferToShelfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "facilityContext",
    "itemSKU",
    "quantity",
    "shelfCode",
    "transferToShelfCode",
    "adjustmentType",
    "inventoryType",
    "remarks",
    "sla"
})
@XmlRootElement(name = "InventoryAdjustmentRequest")
public class InventoryAdjustmentRequest {

    @XmlElement(name = "FacilityContext")
    protected String facilityContext;
    @XmlElement(name = "ItemSKU", required = true)
    protected String itemSKU;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "ShelfCode", required = true)
    protected String shelfCode;
    @XmlElement(name = "TransferToShelfCode")
    protected String transferToShelfCode;
    @XmlElement(name = "AdjustmentType", required = true)
    protected String adjustmentType;
    @XmlElement(name = "InventoryType")
    protected String inventoryType;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "SLA")
    protected String sla;

    /**
     * Gets the value of the facilityContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContext() {
        return facilityContext;
    }

    /**
     * Sets the value of the facilityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContext(String value) {
        this.facilityContext = value;
    }

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

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
     * Gets the value of the transferToShelfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToShelfCode() {
        return transferToShelfCode;
    }

    /**
     * Sets the value of the transferToShelfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToShelfCode(String value) {
        this.transferToShelfCode = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the sla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLA() {
        return sla;
    }

    /**
     * Sets the value of the sla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLA(String value) {
        this.sla = value;
    }

}
