
package com.ppmp.uniware.model;

import java.lang.*;
import java.math.BigInteger;
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
 *         &lt;element name="Successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Errors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Warnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="OpenSale" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="OpenPurchase" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="PutawayPending" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="InPicking" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="PendingGRN" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "successful",
    "errors",
    "warnings",
    "itemType"
})
@XmlRootElement(name = "GetItemTypeDetailResponse")
public class GetItemTypeDetailResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElement(name = "ItemType", required = true)
    protected ItemType itemType;

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItemType(ItemType value) {
        this.itemType = value;
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
     *         &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
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
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", required = true)
        protected List<java.lang.Error> error;

        /**
         * Gets the value of the error property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the error property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link java.lang.Error }
         * 
         * 
         */
        public List<java.lang.Error> getError() {
            if (error == null) {
                error = new ArrayList<java.lang.Error>();
            }
            return this.error;
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
     *         &lt;element name="SkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="OpenSale" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="OpenPurchase" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="PutawayPending" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="InPicking" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="PendingGRN" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "skuCode",
        "name",
        "categoryName",
        "imageUrl",
        "pageUrl",
        "inventory",
        "openSale",
        "openPurchase",
        "putawayPending",
        "inPicking",
        "pendingGRN",
        "enabled"
    })
    public static class ItemType {

        @XmlElement(name = "SkuCode", required = true)
        protected String skuCode;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "CategoryName", required = true)
        protected String categoryName;
        @XmlElement(name = "ImageUrl")
        protected String imageUrl;
        @XmlElement(name = "PageUrl")
        protected String pageUrl;
        @XmlElement(name = "Inventory", required = true)
        protected BigInteger inventory;
        @XmlElement(name = "OpenSale", required = true)
        protected BigInteger openSale;
        @XmlElement(name = "OpenPurchase", required = true)
        protected BigInteger openPurchase;
        @XmlElement(name = "PutawayPending", required = true)
        protected BigInteger putawayPending;
        @XmlElement(name = "InPicking", required = true)
        protected BigInteger inPicking;
        @XmlElement(name = "PendingGRN", required = true)
        protected BigInteger pendingGRN;
        @XmlElement(name = "Enabled")
        protected boolean enabled;

        /**
         * Gets the value of the skuCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkuCode() {
            return skuCode;
        }

        /**
         * Sets the value of the skuCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkuCode(String value) {
            this.skuCode = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the categoryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryName() {
            return categoryName;
        }

        /**
         * Sets the value of the categoryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryName(String value) {
            this.categoryName = value;
        }

        /**
         * Gets the value of the imageUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageUrl() {
            return imageUrl;
        }

        /**
         * Sets the value of the imageUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageUrl(String value) {
            this.imageUrl = value;
        }

        /**
         * Gets the value of the pageUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPageUrl() {
            return pageUrl;
        }

        /**
         * Sets the value of the pageUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPageUrl(String value) {
            this.pageUrl = value;
        }

        /**
         * Gets the value of the inventory property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInventory() {
            return inventory;
        }

        /**
         * Sets the value of the inventory property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInventory(BigInteger value) {
            this.inventory = value;
        }

        /**
         * Gets the value of the openSale property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOpenSale() {
            return openSale;
        }

        /**
         * Sets the value of the openSale property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOpenSale(BigInteger value) {
            this.openSale = value;
        }

        /**
         * Gets the value of the openPurchase property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOpenPurchase() {
            return openPurchase;
        }

        /**
         * Sets the value of the openPurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOpenPurchase(BigInteger value) {
            this.openPurchase = value;
        }

        /**
         * Gets the value of the putawayPending property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPutawayPending() {
            return putawayPending;
        }

        /**
         * Sets the value of the putawayPending property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPutawayPending(BigInteger value) {
            this.putawayPending = value;
        }

        /**
         * Gets the value of the inPicking property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInPicking() {
            return inPicking;
        }

        /**
         * Sets the value of the inPicking property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInPicking(BigInteger value) {
            this.inPicking = value;
        }

        /**
         * Gets the value of the pendingGRN property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPendingGRN() {
            return pendingGRN;
        }

        /**
         * Sets the value of the pendingGRN property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPendingGRN(BigInteger value) {
            this.pendingGRN = value;
        }

        /**
         * Gets the value of the enabled property.
         * 
         */
        public boolean isEnabled() {
            return enabled;
        }

        /**
         * Sets the value of the enabled property.
         * 
         */
        public void setEnabled(boolean value) {
            this.enabled = value;
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
     *         &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", required = true)
        protected List<Warning> warning;

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Warning }
         * 
         * 
         */
        public List<Warning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<Warning>();
            }
            return this.warning;
        }

    }

}