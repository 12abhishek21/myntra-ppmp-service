
package com.unicommerce.uniware.services;

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
 * <p>Java class for InflowReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InflowReceipt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PurchaseOrderDTO" type="{http://uniware.unicommerce.com/services/}PurchaseOrder"/&gt;
 *         &lt;element name="TotalReceivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalRejectedAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalRejectedQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InflowReceiptItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InflowReceiptItem" type="{http://uniware.unicommerce.com/services/}InflowReceiptItem" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InflowReceipt", propOrder = {
    "code",
    "statusCode",
    "created",
    "createdBy",
    "vendorInvoiceNumber",
    "vendorInvoiceDate",
    "purchaseOrderDTO",
    "totalReceivedAmount",
    "totalRejectedAmount",
    "totalQuantity",
    "totalRejectedQuantity",
    "inflowReceiptItems",
    "customFields"
})
public class InflowReceipt {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "CreatedBy", required = true)
    protected String createdBy;
    @XmlElement(name = "VendorInvoiceNumber", required = true)
    protected String vendorInvoiceNumber;
    @XmlElement(name = "VendorInvoiceDate", required = true)
    protected String vendorInvoiceDate;
    @XmlElement(name = "PurchaseOrderDTO", required = true)
    protected PurchaseOrder purchaseOrderDTO;
    @XmlElement(name = "TotalReceivedAmount", required = true)
    protected BigDecimal totalReceivedAmount;
    @XmlElement(name = "TotalRejectedAmount", required = true)
    protected String totalRejectedAmount;
    @XmlElement(name = "TotalQuantity", required = true)
    protected String totalQuantity;
    @XmlElement(name = "TotalRejectedQuantity", required = true)
    protected String totalRejectedQuantity;
    @XmlElement(name = "InflowReceiptItems")
    protected InflowReceipt.InflowReceiptItems inflowReceiptItems;
    @XmlElement(name = "CustomFields", required = true)
    protected CustomFields customFields;

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

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the vendorInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorInvoiceNumber() {
        return vendorInvoiceNumber;
    }

    /**
     * Sets the value of the vendorInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorInvoiceNumber(String value) {
        this.vendorInvoiceNumber = value;
    }

    /**
     * Gets the value of the vendorInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorInvoiceDate() {
        return vendorInvoiceDate;
    }

    /**
     * Sets the value of the vendorInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorInvoiceDate(String value) {
        this.vendorInvoiceDate = value;
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
     * Gets the value of the totalReceivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceivedAmount() {
        return totalReceivedAmount;
    }

    /**
     * Sets the value of the totalReceivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceivedAmount(BigDecimal value) {
        this.totalReceivedAmount = value;
    }

    /**
     * Gets the value of the totalRejectedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRejectedAmount() {
        return totalRejectedAmount;
    }

    /**
     * Sets the value of the totalRejectedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRejectedAmount(String value) {
        this.totalRejectedAmount = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalQuantity(String value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the totalRejectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRejectedQuantity() {
        return totalRejectedQuantity;
    }

    /**
     * Sets the value of the totalRejectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRejectedQuantity(String value) {
        this.totalRejectedQuantity = value;
    }

    /**
     * Gets the value of the inflowReceiptItems property.
     * 
     * @return
     *     possible object is
     *     {@link InflowReceipt.InflowReceiptItems }
     *     
     */
    public InflowReceipt.InflowReceiptItems getInflowReceiptItems() {
        return inflowReceiptItems;
    }

    /**
     * Sets the value of the inflowReceiptItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link InflowReceipt.InflowReceiptItems }
     *     
     */
    public void setInflowReceiptItems(InflowReceipt.InflowReceiptItems value) {
        this.inflowReceiptItems = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFields }
     *     
     */
    public CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFields }
     *     
     */
    public void setCustomFields(CustomFields value) {
        this.customFields = value;
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
     *         &lt;element name="InflowReceiptItem" type="{http://uniware.unicommerce.com/services/}InflowReceiptItem" maxOccurs="unbounded"/&gt;
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
        "inflowReceiptItem"
    })
    public static class InflowReceiptItems {

        @XmlElement(name = "InflowReceiptItem", required = true)
        protected List<InflowReceiptItem> inflowReceiptItem;

        /**
         * Gets the value of the inflowReceiptItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inflowReceiptItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInflowReceiptItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InflowReceiptItem }
         * 
         * 
         */
        public List<InflowReceiptItem> getInflowReceiptItem() {
            if (inflowReceiptItem == null) {
                inflowReceiptItem = new ArrayList<InflowReceiptItem>();
            }
            return this.inflowReceiptItem;
        }

    }

}
