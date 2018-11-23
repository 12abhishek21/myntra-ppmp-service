
package com.unicommerce.uniware.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InflowReceiptItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InflowReceiptItemDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemTypeImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemTypePageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RejectedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PendingQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PurchaseOrderItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ItemsLabelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DetailedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Expiry" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InflowReceiptItemDTO", propOrder = {
    "id",
    "itemSKU",
    "itemTypeImageUrl",
    "itemTypePageUrl",
    "itemTypeName",
    "vendorSkuCode",
    "quantity",
    "rejectedQuantity",
    "pendingQuantity",
    "unitPrice",
    "maxRetailPrice",
    "discount",
    "discountPercentage",
    "purchaseOrderItemId",
    "itemsLabelled",
    "detailedQuantity",
    "rejectionReason",
    "expiry",
    "status",
    "additionalCost",
    "batchCode"
})
public class InflowReceiptItemDTO {

    @XmlElement(name = "Id", required = true)
    protected BigInteger id;
    @XmlElement(name = "ItemSKU", required = true)
    protected String itemSKU;
    @XmlElement(name = "ItemTypeImageUrl")
    protected String itemTypeImageUrl;
    @XmlElement(name = "ItemTypePageUrl")
    protected String itemTypePageUrl;
    @XmlElement(name = "ItemTypeName", required = true)
    protected String itemTypeName;
    @XmlElement(name = "VendorSkuCode", required = true)
    protected String vendorSkuCode;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "RejectedQuantity", required = true)
    protected BigInteger rejectedQuantity;
    @XmlElement(name = "PendingQuantity", required = true)
    protected BigInteger pendingQuantity;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "MaxRetailPrice")
    protected BigDecimal maxRetailPrice;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "DiscountPercentage", required = true)
    protected BigDecimal discountPercentage;
    @XmlElement(name = "PurchaseOrderItemId")
    protected BigInteger purchaseOrderItemId;
    @XmlElement(name = "ItemsLabelled")
    protected Boolean itemsLabelled;
    @XmlElement(name = "DetailedQuantity")
    protected BigInteger detailedQuantity;
    @XmlElement(name = "RejectionReason")
    protected String rejectionReason;
    @XmlElement(name = "Expiry")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiry;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "AdditionalCost")
    protected BigDecimal additionalCost;
    @XmlElement(name = "BatchCode")
    protected String batchCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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
     * Gets the value of the itemTypeImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeImageUrl() {
        return itemTypeImageUrl;
    }

    /**
     * Sets the value of the itemTypeImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeImageUrl(String value) {
        this.itemTypeImageUrl = value;
    }

    /**
     * Gets the value of the itemTypePageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypePageUrl() {
        return itemTypePageUrl;
    }

    /**
     * Sets the value of the itemTypePageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypePageUrl(String value) {
        this.itemTypePageUrl = value;
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
     * Gets the value of the vendorSkuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorSkuCode() {
        return vendorSkuCode;
    }

    /**
     * Sets the value of the vendorSkuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorSkuCode(String value) {
        this.vendorSkuCode = value;
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
     * Gets the value of the rejectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRejectedQuantity() {
        return rejectedQuantity;
    }

    /**
     * Sets the value of the rejectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRejectedQuantity(BigInteger value) {
        this.rejectedQuantity = value;
    }

    /**
     * Gets the value of the pendingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPendingQuantity() {
        return pendingQuantity;
    }

    /**
     * Sets the value of the pendingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPendingQuantity(BigInteger value) {
        this.pendingQuantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the maxRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRetailPrice() {
        return maxRetailPrice;
    }

    /**
     * Sets the value of the maxRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxRetailPrice(BigDecimal value) {
        this.maxRetailPrice = value;
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
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercentage(BigDecimal value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the purchaseOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderItemId() {
        return purchaseOrderItemId;
    }

    /**
     * Sets the value of the purchaseOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderItemId(BigInteger value) {
        this.purchaseOrderItemId = value;
    }

    /**
     * Gets the value of the itemsLabelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemsLabelled() {
        return itemsLabelled;
    }

    /**
     * Sets the value of the itemsLabelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemsLabelled(Boolean value) {
        this.itemsLabelled = value;
    }

    /**
     * Gets the value of the detailedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDetailedQuantity() {
        return detailedQuantity;
    }

    /**
     * Sets the value of the detailedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDetailedQuantity(BigInteger value) {
        this.detailedQuantity = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiry(XMLGregorianCalendar value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the additionalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalCost() {
        return additionalCost;
    }

    /**
     * Sets the value of the additionalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalCost(BigDecimal value) {
        this.additionalCost = value;
    }

    /**
     * Gets the value of the batchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * Sets the value of the batchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
    }

}
