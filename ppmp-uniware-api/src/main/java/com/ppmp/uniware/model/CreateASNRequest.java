
package com.ppmp.uniware.model;

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
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AsnItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AsnItem" type="{http://uniware.unicommerce.com/services/}AsnItem" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
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
    "vendorCode",
    "expectedDeliveryDate",
    "asnItems",
    "customFields"
})
@XmlRootElement(name = "CreateASNRequest")
public class CreateASNRequest {

    @XmlElement(name = "PurchaseOrderCode", required = true)
    protected String purchaseOrderCode;
    @XmlElement(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlElement(name = "ExpectedDeliveryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlElement(name = "AsnItems", required = true)
    protected AsnItems asnItems;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;

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
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the asnItems property.
     * 
     * @return
     *     possible object is
     *     {@link AsnItems }
     *     
     */
    public AsnItems getAsnItems() {
        return asnItems;
    }

    /**
     * Sets the value of the asnItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsnItems }
     *     
     */
    public void setAsnItems(AsnItems value) {
        this.asnItems = value;
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
     *         &lt;element name="AsnItem" type="{http://uniware.unicommerce.com/services/}AsnItem" maxOccurs="unbounded"/&gt;
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
        "asnItem"
    })
    public static class AsnItems {

        @XmlElement(name = "AsnItem", required = true)
        protected List<AsnItem> asnItem;

        /**
         * Gets the value of the asnItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asnItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsnItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AsnItem }
         * 
         * 
         */
        public List<AsnItem> getAsnItem() {
            if (asnItem == null) {
                asnItem = new ArrayList<AsnItem>();
            }
            return this.asnItem;
        }

    }

}
