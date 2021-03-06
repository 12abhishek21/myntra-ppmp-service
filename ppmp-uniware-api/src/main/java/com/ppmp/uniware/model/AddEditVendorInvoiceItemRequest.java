
package com.ppmp.uniware.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="VendorInvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorInvoiceItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VendorInvoiceItem" type="{http://uniware.unicommerce.com/services/}VendorInvoiceItem" maxOccurs="unbounded"/&gt;
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
    "vendorInvoiceCode",
    "vendorInvoiceItems"
})
@XmlRootElement(name = "AddEditVendorInvoiceItemRequest")
public class AddEditVendorInvoiceItemRequest {

    @XmlElement(name = "VendorInvoiceCode", required = true)
    protected String vendorInvoiceCode;
    @XmlElement(name = "VendorInvoiceItems", required = true)
    protected VendorInvoiceItems vendorInvoiceItems;

    /**
     * Gets the value of the vendorInvoiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorInvoiceCode() {
        return vendorInvoiceCode;
    }

    /**
     * Sets the value of the vendorInvoiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorInvoiceCode(String value) {
        this.vendorInvoiceCode = value;
    }

    /**
     * Gets the value of the vendorInvoiceItems property.
     * 
     * @return
     *     possible object is
     *     {@link VendorInvoiceItems }
     *     
     */
    public VendorInvoiceItems getVendorInvoiceItems() {
        return vendorInvoiceItems;
    }

    /**
     * Sets the value of the vendorInvoiceItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorInvoiceItems }
     *     
     */
    public void setVendorInvoiceItems(VendorInvoiceItems value) {
        this.vendorInvoiceItems = value;
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
     *         &lt;element name="VendorInvoiceItem" type="{http://uniware.unicommerce.com/services/}VendorInvoiceItem" maxOccurs="unbounded"/&gt;
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
        "vendorInvoiceItem"
    })
    public static class VendorInvoiceItems {

        @XmlElement(name = "VendorInvoiceItem", required = true)
        protected List<VendorInvoiceItem> vendorInvoiceItem;

        /**
         * Gets the value of the vendorInvoiceItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorInvoiceItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorInvoiceItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VendorInvoiceItem }
         * 
         * 
         */
        public List<VendorInvoiceItem> getVendorInvoiceItem() {
            if (vendorInvoiceItem == null) {
                vendorInvoiceItem = new ArrayList<VendorInvoiceItem>();
            }
            return this.vendorInvoiceItem;
        }

    }

}
