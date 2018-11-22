
package com.ppmp.uniware.model;

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
 *         &lt;element name="RetailInvoiceSequence" type="{http://uniware.unicommerce.com/services/}WsSequence" minOccurs="0"/&gt;
 *         &lt;element name="TaxInvoiceSequence" type="{http://uniware.unicommerce.com/services/}WsSequence" minOccurs="0"/&gt;
 *         &lt;element name="WsFacility" type="{http://uniware.unicommerce.com/services/}WsFacility"/&gt;
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
    "retailInvoiceSequence",
    "taxInvoiceSequence",
    "wsFacility"
})
@XmlRootElement(name = "EditFacilityRequest")
public class EditFacilityRequest {

    @XmlElement(name = "RetailInvoiceSequence")
    protected WsSequence retailInvoiceSequence;
    @XmlElement(name = "TaxInvoiceSequence")
    protected WsSequence taxInvoiceSequence;
    @XmlElement(name = "WsFacility", required = true)
    protected WsFacility wsFacility;

    /**
     * Gets the value of the retailInvoiceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link WsSequence }
     *     
     */
    public WsSequence getRetailInvoiceSequence() {
        return retailInvoiceSequence;
    }

    /**
     * Sets the value of the retailInvoiceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsSequence }
     *     
     */
    public void setRetailInvoiceSequence(WsSequence value) {
        this.retailInvoiceSequence = value;
    }

    /**
     * Gets the value of the taxInvoiceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link WsSequence }
     *     
     */
    public WsSequence getTaxInvoiceSequence() {
        return taxInvoiceSequence;
    }

    /**
     * Sets the value of the taxInvoiceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsSequence }
     *     
     */
    public void setTaxInvoiceSequence(WsSequence value) {
        this.taxInvoiceSequence = value;
    }

    /**
     * Gets the value of the wsFacility property.
     * 
     * @return
     *     possible object is
     *     {@link WsFacility }
     *     
     */
    public WsFacility getWsFacility() {
        return wsFacility;
    }

    /**
     * Sets the value of the wsFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFacility }
     *     
     */
    public void setWsFacility(WsFacility value) {
        this.wsFacility = value;
    }

}
