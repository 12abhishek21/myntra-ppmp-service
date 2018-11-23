
package com.unicommerce.uniware.services;

import java.math.BigDecimal;
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
 *         &lt;element name="VendorItemTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VendorItemType" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SellerSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="MaxRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "vendorItemTypes",
    "pageNumber",
    "pageSize",
    "totalRecords"
})
@XmlRootElement(name = "GetVendorItemTypesResponse")
public class GetVendorItemTypesResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected GetVendorItemTypesResponse.Errors errors;
    @XmlElement(name = "Warnings")
    protected GetVendorItemTypesResponse.Warnings warnings;
    @XmlElement(name = "VendorItemTypes")
    protected GetVendorItemTypesResponse.VendorItemTypes vendorItemTypes;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "TotalRecords")
    protected int totalRecords;

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
     *     {@link GetVendorItemTypesResponse.Errors }
     *     
     */
    public GetVendorItemTypesResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVendorItemTypesResponse.Errors }
     *     
     */
    public void setErrors(GetVendorItemTypesResponse.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link GetVendorItemTypesResponse.Warnings }
     *     
     */
    public GetVendorItemTypesResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVendorItemTypesResponse.Warnings }
     *     
     */
    public void setWarnings(GetVendorItemTypesResponse.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the vendorItemTypes property.
     * 
     * @return
     *     possible object is
     *     {@link GetVendorItemTypesResponse.VendorItemTypes }
     *     
     */
    public GetVendorItemTypesResponse.VendorItemTypes getVendorItemTypes() {
        return vendorItemTypes;
    }

    /**
     * Sets the value of the vendorItemTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVendorItemTypesResponse.VendorItemTypes }
     *     
     */
    public void setVendorItemTypes(GetVendorItemTypesResponse.VendorItemTypes value) {
        this.vendorItemTypes = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public int getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(int value) {
        this.totalRecords = value;
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
        protected List<Error> error;

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
         * {@link Error }
         * 
         * 
         */
        public List<Error> getError() {
            if (error == null) {
                error = new ArrayList<Error>();
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
     *         &lt;element name="VendorItemType" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SellerSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="MaxRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "vendorItemType"
    })
    public static class VendorItemTypes {

        @XmlElement(name = "VendorItemType", required = true)
        protected List<GetVendorItemTypesResponse.VendorItemTypes.VendorItemType> vendorItemType;

        /**
         * Gets the value of the vendorItemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorItemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetVendorItemTypesResponse.VendorItemTypes.VendorItemType }
         * 
         * 
         */
        public List<GetVendorItemTypesResponse.VendorItemTypes.VendorItemType> getVendorItemType() {
            if (vendorItemType == null) {
                vendorItemType = new ArrayList<GetVendorItemTypesResponse.VendorItemTypes.VendorItemType>();
            }
            return this.vendorItemType;
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
         *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SellerSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="MaxRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "vendorCode",
            "sellerSkuCode",
            "itemTypeName",
            "itemSKU",
            "imageUrl",
            "pageUrl",
            "color",
            "brand",
            "size",
            "unitPrice",
            "maxRetailPrice",
            "enabled"
        })
        public static class VendorItemType {

            @XmlElement(name = "VendorCode", required = true)
            protected String vendorCode;
            @XmlElement(name = "SellerSkuCode", required = true)
            protected String sellerSkuCode;
            @XmlElement(name = "ItemTypeName", required = true)
            protected String itemTypeName;
            @XmlElement(name = "ItemSKU", required = true)
            protected String itemSKU;
            @XmlElement(name = "ImageUrl")
            protected String imageUrl;
            @XmlElement(name = "PageUrl")
            protected String pageUrl;
            @XmlElement(name = "Color")
            protected String color;
            @XmlElement(name = "Brand")
            protected String brand;
            @XmlElement(name = "Size")
            protected String size;
            @XmlElement(name = "UnitPrice")
            protected BigDecimal unitPrice;
            @XmlElement(name = "MaxRetailPrice")
            protected BigDecimal maxRetailPrice;
            @XmlElement(name = "Enabled")
            protected boolean enabled;

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
             * Gets the value of the sellerSkuCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSellerSkuCode() {
                return sellerSkuCode;
            }

            /**
             * Sets the value of the sellerSkuCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSellerSkuCode(String value) {
                this.sellerSkuCode = value;
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
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColor(String value) {
                this.color = value;
            }

            /**
             * Gets the value of the brand property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrand() {
                return brand;
            }

            /**
             * Sets the value of the brand property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrand(String value) {
                this.brand = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSize(String value) {
                this.size = value;
            }

            /**
             * Gets the value of the unitPrice property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitPrice() {
                return unitPrice;
            }

            /**
             * Sets the value of the unitPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitPrice(BigDecimal value) {
                this.unitPrice = value;
            }

            /**
             * Gets the value of the maxRetailPrice property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxRetailPrice() {
                return maxRetailPrice;
            }

            /**
             * Sets the value of the maxRetailPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxRetailPrice(BigDecimal value) {
                this.maxRetailPrice = value;
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