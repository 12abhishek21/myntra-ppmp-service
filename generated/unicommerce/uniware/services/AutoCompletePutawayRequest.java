
package com.unicommerce.uniware.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PurchaseOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InflowReceiptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OnlyPrepareGRN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InflowItemTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InflowItemType" type="{http://uniware.unicommerce.com/services/}WsInflowItemType" maxOccurs="unbounded"/&gt;
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
    "purchaseOrderCode",
    "inflowReceiptCode",
    "vendorInvoiceNumber",
    "vendorInvoiceDate",
    "onlyPrepareGRN",
    "inflowItemTypes"
})
@XmlRootElement(name = "AutoCompletePutawayRequest")
public class AutoCompletePutawayRequest {

    @XmlElement(name = "PurchaseOrderCode", required = true)
    protected String purchaseOrderCode;
    @XmlElement(name = "InflowReceiptCode")
    protected String inflowReceiptCode;
    @XmlElement(name = "VendorInvoiceNumber")
    protected String vendorInvoiceNumber;
    @XmlElement(name = "VendorInvoiceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vendorInvoiceDate;
    @XmlElement(name = "OnlyPrepareGRN")
    protected Boolean onlyPrepareGRN;
    @XmlElement(name = "InflowItemTypes")
    protected AutoCompletePutawayRequest.InflowItemTypes inflowItemTypes;

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
     * Gets the value of the inflowReceiptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInflowReceiptCode() {
        return inflowReceiptCode;
    }

    /**
     * Sets the value of the inflowReceiptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInflowReceiptCode(String value) {
        this.inflowReceiptCode = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVendorInvoiceDate() {
        return vendorInvoiceDate;
    }

    /**
     * Sets the value of the vendorInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVendorInvoiceDate(XMLGregorianCalendar value) {
        this.vendorInvoiceDate = value;
    }

    /**
     * Gets the value of the onlyPrepareGRN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyPrepareGRN() {
        return onlyPrepareGRN;
    }

    /**
     * Sets the value of the onlyPrepareGRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyPrepareGRN(Boolean value) {
        this.onlyPrepareGRN = value;
    }

    /**
     * Gets the value of the inflowItemTypes property.
     * 
     * @return
     *     possible object is
     *     {@link AutoCompletePutawayRequest.InflowItemTypes }
     *     
     */
    public AutoCompletePutawayRequest.InflowItemTypes getInflowItemTypes() {
        return inflowItemTypes;
    }

    /**
     * Sets the value of the inflowItemTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoCompletePutawayRequest.InflowItemTypes }
     *     
     */
    public void setInflowItemTypes(AutoCompletePutawayRequest.InflowItemTypes value) {
        this.inflowItemTypes = value;
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
     *         &lt;element name="InflowItemType" type="{http://uniware.unicommerce.com/services/}WsInflowItemType" maxOccurs="unbounded"/&gt;
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
        "inflowItemType"
    })
    public static class InflowItemTypes {

        @XmlElement(name = "InflowItemType", required = true)
        protected List<WsInflowItemType> inflowItemType;

        /**
         * Gets the value of the inflowItemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inflowItemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInflowItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WsInflowItemType }
         * 
         * 
         */
        public List<WsInflowItemType> getInflowItemType() {
            if (inflowItemType == null) {
                inflowItemType = new ArrayList<WsInflowItemType>();
            }
            return this.inflowItemType;
        }

    }

}
