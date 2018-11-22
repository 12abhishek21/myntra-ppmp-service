
package com.ppmp.uniware.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTypeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTypeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScanIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Upc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinOrderSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GstTaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HSNCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Features" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequiresCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemDetailFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tags" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ItemTypeRequest", propOrder = {
    "categoryCode",
    "itemSKU",
    "name",
    "description",
    "scanIdentifier",
    "length",
    "width",
    "height",
    "weight",
    "ean",
    "isbn",
    "upc",
    "minOrderSize",
    "color",
    "brand",
    "size",
    "mrp",
    "taxTypeCode",
    "gstTaxTypeCode",
    "hsnCode",
    "features",
    "imageURL",
    "productPageUrl",
    "requiresCustomization",
    "itemDetailFields",
    "tags",
    "customFields"
})
public class ItemTypeRequest {

    @XmlElement(name = "CategoryCode", required = true)
    protected String categoryCode;
    @XmlElement(name = "ItemSKU", required = true)
    protected String itemSKU;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ScanIdentifier")
    protected String scanIdentifier;
    @XmlElement(name = "Length")
    protected Integer length;
    @XmlElement(name = "Width")
    protected Integer width;
    @XmlElement(name = "Height")
    protected Integer height;
    @XmlElement(name = "Weight")
    protected Integer weight;
    @XmlElement(name = "Ean")
    protected String ean;
    @XmlElement(name = "Isbn")
    protected String isbn;
    @XmlElement(name = "Upc")
    protected String upc;
    @XmlElement(name = "MinOrderSize")
    protected Integer minOrderSize;
    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "MRP")
    protected BigDecimal mrp;
    @XmlElement(name = "TaxTypeCode")
    protected String taxTypeCode;
    @XmlElement(name = "GstTaxTypeCode", required = true)
    protected String gstTaxTypeCode;
    @XmlElement(name = "HSNCode", required = true)
    protected String hsnCode;
    @XmlElement(name = "Features")
    protected String features;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "ProductPageUrl")
    protected String productPageUrl;
    @XmlElement(name = "RequiresCustomization")
    protected Boolean requiresCustomization;
    @XmlElement(name = "ItemDetailFields")
    protected String itemDetailFields;
    @XmlElement(name = "Tags")
    protected Tags tags;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the scanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanIdentifier() {
        return scanIdentifier;
    }

    /**
     * Sets the value of the scanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanIdentifier(String value) {
        this.scanIdentifier = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpc() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpc(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the minOrderSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinOrderSize() {
        return minOrderSize;
    }

    /**
     * Sets the value of the minOrderSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinOrderSize(Integer value) {
        this.minOrderSize = value;
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
     * Gets the value of the mrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRP() {
        return mrp;
    }

    /**
     * Sets the value of the mrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRP(BigDecimal value) {
        this.mrp = value;
    }

    /**
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    /**
     * Gets the value of the gstTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstTaxTypeCode() {
        return gstTaxTypeCode;
    }

    /**
     * Sets the value of the gstTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstTaxTypeCode(String value) {
        this.gstTaxTypeCode = value;
    }

    /**
     * Gets the value of the hsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNCode() {
        return hsnCode;
    }

    /**
     * Sets the value of the hsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNCode(String value) {
        this.hsnCode = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatures(String value) {
        this.features = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
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
     * Gets the value of the requiresCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresCustomization() {
        return requiresCustomization;
    }

    /**
     * Sets the value of the requiresCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresCustomization(Boolean value) {
        this.requiresCustomization = value;
    }

    /**
     * Gets the value of the itemDetailFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDetailFields() {
        return itemDetailFields;
    }

    /**
     * Sets the value of the itemDetailFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDetailFields(String value) {
        this.itemDetailFields = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
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
     *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
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
        "tag"
    })
    public static class Tags {

        @XmlElement(name = "Tag", required = true)
        protected List<Object> tag;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getTag() {
            if (tag == null) {
                tag = new ArrayList<Object>();
            }
            return this.tag;
        }

    }

}
