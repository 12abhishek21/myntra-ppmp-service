
package com.ppmp.uniware.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GRNCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PutawayNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreatedFacility" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentFacility" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="VendorSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PurchaseOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SaleOrderItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItem" type="{http://uniware.unicommerce.com/services/}SaleOrderItemDTO" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InflowReceiptItemDTO" type="{http://uniware.unicommerce.com/services/}InflowReceiptItemDTO" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderDTO" type="{http://uniware.unicommerce.com/services/}PurchaseOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDetail", propOrder = {
    "code",
    "status",
    "grnCode",
    "putawayNumber",
    "itemSku",
    "itemTypeName",
    "vendorCode",
    "vendorName",
    "createdOn",
    "updatedOn",
    "createdFacility",
    "currentFacility",
    "unitPrice",
    "vendorSkuCode",
    "color",
    "brand",
    "size",
    "purchaseOrderCode",
    "saleOrderItems",
    "inflowReceiptItemDTO",
    "purchaseOrderDTO"
})
public class ItemDetail {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "GRNCode", required = true)
    protected String grnCode;
    @XmlElement(name = "PutawayNumber", required = true)
    protected String putawayNumber;
    @XmlElement(name = "ItemSku", required = true)
    protected String itemSku;
    @XmlElement(name = "ItemTypeName", required = true)
    protected String itemTypeName;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;
    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "CreatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    @XmlElement(name = "UpdatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    @XmlElement(name = "CreatedFacility", required = true)
    protected String createdFacility;
    @XmlElement(name = "CurrentFacility", required = true)
    protected String currentFacility;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "VendorSkuCode", required = true)
    protected String vendorSkuCode;
    @XmlElement(name = "Color", required = true)
    protected String color;
    @XmlElement(name = "Brand", required = true)
    protected String brand;
    @XmlElement(name = "Size", required = true)
    protected String size;
    @XmlElement(name = "PurchaseOrderCode", required = true)
    protected String purchaseOrderCode;
    @XmlElement(name = "SaleOrderItems")
    protected SaleOrderItems saleOrderItems;
    @XmlElement(name = "InflowReceiptItemDTO")
    protected InflowReceiptItemDTO inflowReceiptItemDTO;
    @XmlElement(name = "PurchaseOrderDTO")
    protected PurchaseOrder purchaseOrderDTO;

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
     * Gets the value of the grnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRNCode() {
        return grnCode;
    }

    /**
     * Sets the value of the grnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRNCode(String value) {
        this.grnCode = value;
    }

    /**
     * Gets the value of the putawayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutawayNumber() {
        return putawayNumber;
    }

    /**
     * Sets the value of the putawayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutawayNumber(String value) {
        this.putawayNumber = value;
    }

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
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the updatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets the value of the updatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedOn(XMLGregorianCalendar value) {
        this.updatedOn = value;
    }

    /**
     * Gets the value of the createdFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedFacility() {
        return createdFacility;
    }

    /**
     * Sets the value of the createdFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedFacility(String value) {
        this.createdFacility = value;
    }

    /**
     * Gets the value of the currentFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFacility() {
        return currentFacility;
    }

    /**
     * Sets the value of the currentFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFacility(String value) {
        this.currentFacility = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the purchaseOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    /**
     * Sets the value of the purchaseOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderCode(String value) {
        this.purchaseOrderCode = value;
    }

    /**
     * Gets the value of the saleOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrderItems }
     *     
     */
    public SaleOrderItems getSaleOrderItems() {
        return saleOrderItems;
    }

    /**
     * Sets the value of the saleOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrderItems }
     *     
     */
    public void setSaleOrderItems(SaleOrderItems value) {
        this.saleOrderItems = value;
    }

    /**
     * Gets the value of the inflowReceiptItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link InflowReceiptItemDTO }
     *     
     */
    public InflowReceiptItemDTO getInflowReceiptItemDTO() {
        return inflowReceiptItemDTO;
    }

    /**
     * Sets the value of the inflowReceiptItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link InflowReceiptItemDTO }
     *     
     */
    public void setInflowReceiptItemDTO(InflowReceiptItemDTO value) {
        this.inflowReceiptItemDTO = value;
    }

    /**
     * Gets the value of the purchaseOrderDTO property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrder }
     *     
     */
    public PurchaseOrder getPurchaseOrderDTO() {
        return purchaseOrderDTO;
    }

    /**
     * Sets the value of the purchaseOrderDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrder }
     *     
     */
    public void setPurchaseOrderDTO(PurchaseOrder value) {
        this.purchaseOrderDTO = value;
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
     *         &lt;element name="SaleOrderItem" type="{http://uniware.unicommerce.com/services/}SaleOrderItemDTO" maxOccurs="unbounded"/&gt;
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
        protected List<SaleOrderItemDTO> saleOrderItem;

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
         * {@link SaleOrderItemDTO }
         * 
         * 
         */
        public List<SaleOrderItemDTO> getSaleOrderItem() {
            if (saleOrderItem == null) {
                saleOrderItem = new ArrayList<SaleOrderItemDTO>();
            }
            return this.saleOrderItem;
        }

    }

}
