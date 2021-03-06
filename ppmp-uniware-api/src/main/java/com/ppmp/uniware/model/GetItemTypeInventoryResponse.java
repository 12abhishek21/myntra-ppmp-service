
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
 *         &lt;element name="ItemTypeInventoryDetails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemTypeInventory" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Shelf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ProductPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="MRP" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="QuantityInPicking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "itemTypeInventoryDetails"
})
@XmlRootElement(name = "GetItemTypeInventoryResponse")
public class GetItemTypeInventoryResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElement(name = "ItemTypeInventoryDetails", required = true)
    protected ItemTypeInventoryDetails itemTypeInventoryDetails;

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
     * Gets the value of the itemTypeInventoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeInventoryDetails }
     *     
     */
    public ItemTypeInventoryDetails getItemTypeInventoryDetails() {
        return itemTypeInventoryDetails;
    }

    /**
     * Sets the value of the itemTypeInventoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeInventoryDetails }
     *     
     */
    public void setItemTypeInventoryDetails(ItemTypeInventoryDetails value) {
        this.itemTypeInventoryDetails = value;
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
     *         &lt;element name="ItemTypeInventory" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Shelf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ProductPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="MRP" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="QuantityInPicking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "itemTypeInventory"
    })
    public static class ItemTypeInventoryDetails {

        @XmlElement(name = "ItemTypeInventory")
        protected List<ItemTypeInventory> itemTypeInventory;

        /**
         * Gets the value of the itemTypeInventory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemTypeInventory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemTypeInventory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemTypeInventory }
         * 
         * 
         */
        public List<ItemTypeInventory> getItemTypeInventory() {
            if (itemTypeInventory == null) {
                itemTypeInventory = new ArrayList<ItemTypeInventory>();
            }
            return this.itemTypeInventory;
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
         *         &lt;element name="Shelf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ProductPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="MRP" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="QuantityInPicking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "shelf",
            "itemTypeName",
            "imageUrl",
            "productPageUrl",
            "quantity",
            "mrp",
            "quantityInPicking",
            "facilityCode",
            "facilityName",
            "type"
        })
        public static class ItemTypeInventory {

            @XmlElement(name = "Shelf", required = true)
            protected String shelf;
            @XmlElement(name = "ItemTypeName", required = true)
            protected String itemTypeName;
            @XmlElement(name = "ImageUrl")
            protected String imageUrl;
            @XmlElement(name = "ProductPageUrl")
            protected String productPageUrl;
            @XmlElement(name = "Quantity", required = true)
            protected BigInteger quantity;
            @XmlElement(name = "MRP")
            protected BigInteger mrp;
            @XmlElement(name = "QuantityInPicking")
            protected BigInteger quantityInPicking;
            @XmlElement(name = "FacilityCode", required = true)
            protected String facilityCode;
            @XmlElement(name = "FacilityName", required = true)
            protected String facilityName;
            @XmlElement(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the shelf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShelf() {
                return shelf;
            }

            /**
             * Sets the value of the shelf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShelf(String value) {
                this.shelf = value;
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
             * Gets the value of the productPageUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductPageUrl() {
                return productPageUrl;
            }

            /**
             * Sets the value of the productPageUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductPageUrl(String value) {
                this.productPageUrl = value;
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
             * Gets the value of the mrp property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMRP() {
                return mrp;
            }

            /**
             * Sets the value of the mrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMRP(BigInteger value) {
                this.mrp = value;
            }

            /**
             * Gets the value of the quantityInPicking property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantityInPicking() {
                return quantityInPicking;
            }

            /**
             * Sets the value of the quantityInPicking property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantityInPicking(BigInteger value) {
                this.quantityInPicking = value;
            }

            /**
             * Gets the value of the facilityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityCode() {
                return facilityCode;
            }

            /**
             * Sets the value of the facilityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityCode(String value) {
                this.facilityCode = value;
            }

            /**
             * Gets the value of the facilityName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityName() {
                return facilityName;
            }

            /**
             * Sets the value of the facilityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityName(String value) {
                this.facilityName = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

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
