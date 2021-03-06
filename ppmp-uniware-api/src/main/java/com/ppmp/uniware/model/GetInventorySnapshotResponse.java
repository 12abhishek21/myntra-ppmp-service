
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
 *         &lt;element name="InventorySnapshots"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InventorySnapshot" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PendingInventoryAssessment" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="OpenSale" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="OpenPurchase" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="InventoryBlocked" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="PutawayPending" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="PendingStockTransfer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="VendorInventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "inventorySnapshots"
})
@XmlRootElement(name = "GetInventorySnapshotResponse")
public class GetInventorySnapshotResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElement(name = "InventorySnapshots", required = true)
    protected InventorySnapshots inventorySnapshots;

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
     * Gets the value of the inventorySnapshots property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySnapshots }
     *     
     */
    public InventorySnapshots getInventorySnapshots() {
        return inventorySnapshots;
    }

    /**
     * Sets the value of the inventorySnapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySnapshots }
     *     
     */
    public void setInventorySnapshots(InventorySnapshots value) {
        this.inventorySnapshots = value;
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
     *         &lt;element name="InventorySnapshot" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PendingInventoryAssessment" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="OpenSale" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="OpenPurchase" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="InventoryBlocked" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="PutawayPending" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="PendingStockTransfer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="VendorInventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "inventorySnapshot"
    })
    public static class InventorySnapshots {

        @XmlElement(name = "InventorySnapshot", required = true)
        protected List<InventorySnapshot> inventorySnapshot;

        /**
         * Gets the value of the inventorySnapshot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inventorySnapshot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInventorySnapshot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InventorySnapshot }
         * 
         * 
         */
        public List<InventorySnapshot> getInventorySnapshot() {
            if (inventorySnapshot == null) {
                inventorySnapshot = new ArrayList<InventorySnapshot>();
            }
            return this.inventorySnapshot;
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
         *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PendingInventoryAssessment" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="OpenSale" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="OpenPurchase" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="InventoryBlocked" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="PutawayPending" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="PendingStockTransfer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="VendorInventory" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "itemSKU",
            "pendingInventoryAssessment",
            "inventory",
            "openSale",
            "openPurchase",
            "inventoryBlocked",
            "putawayPending",
            "pendingStockTransfer",
            "vendorInventory"
        })
        public static class InventorySnapshot {

            @XmlElement(name = "ItemSKU", required = true)
            protected String itemSKU;
            @XmlElement(name = "PendingInventoryAssessment", required = true)
            protected BigInteger pendingInventoryAssessment;
            @XmlElement(name = "Inventory", required = true)
            protected BigInteger inventory;
            @XmlElement(name = "OpenSale", required = true)
            protected BigInteger openSale;
            @XmlElement(name = "OpenPurchase", required = true)
            protected BigInteger openPurchase;
            @XmlElement(name = "InventoryBlocked", required = true)
            protected BigInteger inventoryBlocked;
            @XmlElement(name = "PutawayPending", required = true)
            protected BigInteger putawayPending;
            @XmlElement(name = "PendingStockTransfer", required = true)
            protected BigInteger pendingStockTransfer;
            @XmlElement(name = "VendorInventory", required = true)
            protected BigInteger vendorInventory;

            /**
             * Gets the value of the itemSKU property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemSKU() {
                return itemSKU;
            }

            /**
             * Sets the value of the itemSKU property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemSKU(String value) {
                this.itemSKU = value;
            }

            /**
             * Gets the value of the pendingInventoryAssessment property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPendingInventoryAssessment() {
                return pendingInventoryAssessment;
            }

            /**
             * Sets the value of the pendingInventoryAssessment property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPendingInventoryAssessment(BigInteger value) {
                this.pendingInventoryAssessment = value;
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
             * Gets the value of the inventoryBlocked property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getInventoryBlocked() {
                return inventoryBlocked;
            }

            /**
             * Sets the value of the inventoryBlocked property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setInventoryBlocked(BigInteger value) {
                this.inventoryBlocked = value;
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
             * Gets the value of the pendingStockTransfer property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPendingStockTransfer() {
                return pendingStockTransfer;
            }

            /**
             * Sets the value of the pendingStockTransfer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPendingStockTransfer(BigInteger value) {
                this.pendingStockTransfer = value;
            }

            /**
             * Gets the value of the vendorInventory property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getVendorInventory() {
                return vendorInventory;
            }

            /**
             * Sets the value of the vendorInventory property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setVendorInventory(BigInteger value) {
                this.vendorInventory = value;
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
