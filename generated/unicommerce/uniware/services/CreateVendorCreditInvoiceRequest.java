
package com.unicommerce.uniware.services;

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
 *         &lt;element name="VendorInvoice" type="{http://uniware.unicommerce.com/services/}VendorInvoice"/&gt;
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
    "vendorInvoice"
})
@XmlRootElement(name = "CreateVendorCreditInvoiceRequest")
public class CreateVendorCreditInvoiceRequest {

    @XmlElement(name = "VendorInvoice", required = true)
    protected VendorInvoice vendorInvoice;

    /**
     * Gets the value of the vendorInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link VendorInvoice }
     *     
     */
    public VendorInvoice getVendorInvoice() {
        return vendorInvoice;
    }

    /**
     * Sets the value of the vendorInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorInvoice }
     *     
     */
    public void setVendorInvoice(VendorInvoice value) {
        this.vendorInvoice = value;
    }

}
