
package com.unicommerce.uniware.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleOrderAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleOrderAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Addresses"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Address" type="{http://uniware.unicommerce.com/services/}Address" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef"/&gt;
 *         &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}AddressRef" minOccurs="0"/&gt;
 *         &lt;element name="SaleOrderAddressItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderAddressItem" type="{http://uniware.unicommerce.com/services/}SaleOrderAddressItem" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "SaleOrderAddress", propOrder = {
    "saleOrderCode",
    "addresses",
    "shippingAddress",
    "billingAddress",
    "saleOrderAddressItems"
})
public class SaleOrderAddress {

    @XmlElement(name = "SaleOrderCode", required = true)
    protected String saleOrderCode;
    @XmlElement(name = "Addresses", required = true)
    protected SaleOrderAddress.Addresses addresses;
    @XmlElement(name = "ShippingAddress", required = true)
    protected AddressRef shippingAddress;
    @XmlElement(name = "BillingAddress")
    protected AddressRef billingAddress;
    @XmlElement(name = "SaleOrderAddressItems")
    protected SaleOrderAddress.SaleOrderAddressItems saleOrderAddressItems;

    /**
     * Gets the value of the saleOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleOrderCode() {
        return saleOrderCode;
    }

    /**
     * Sets the value of the saleOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleOrderCode(String value) {
        this.saleOrderCode = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrderAddress.Addresses }
     *     
     */
    public SaleOrderAddress.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrderAddress.Addresses }
     *     
     */
    public void setAddresses(SaleOrderAddress.Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRef }
     *     
     */
    public AddressRef getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *     
     */
    public void setShippingAddress(AddressRef value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRef }
     *     
     */
    public AddressRef getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *     
     */
    public void setBillingAddress(AddressRef value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the saleOrderAddressItems property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrderAddress.SaleOrderAddressItems }
     *     
     */
    public SaleOrderAddress.SaleOrderAddressItems getSaleOrderAddressItems() {
        return saleOrderAddressItems;
    }

    /**
     * Sets the value of the saleOrderAddressItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrderAddress.SaleOrderAddressItems }
     *     
     */
    public void setSaleOrderAddressItems(SaleOrderAddress.SaleOrderAddressItems value) {
        this.saleOrderAddressItems = value;
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
     *         &lt;element name="Address" type="{http://uniware.unicommerce.com/services/}Address" maxOccurs="unbounded"/&gt;
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
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address", required = true)
        protected List<Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         * 
         * 
         */
        public List<Address> getAddress() {
            if (address == null) {
                address = new ArrayList<Address>();
            }
            return this.address;
        }

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
     *         &lt;element name="SaleOrderAddressItem" type="{http://uniware.unicommerce.com/services/}SaleOrderAddressItem" maxOccurs="unbounded"/&gt;
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
        "saleOrderAddressItem"
    })
    public static class SaleOrderAddressItems {

        @XmlElement(name = "SaleOrderAddressItem", required = true)
        protected List<SaleOrderAddressItem> saleOrderAddressItem;

        /**
         * Gets the value of the saleOrderAddressItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrderAddressItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrderAddressItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaleOrderAddressItem }
         * 
         * 
         */
        public List<SaleOrderAddressItem> getSaleOrderAddressItem() {
            if (saleOrderAddressItem == null) {
                saleOrderAddressItem = new ArrayList<SaleOrderAddressItem>();
            }
            return this.saleOrderAddressItem;
        }

    }

}
