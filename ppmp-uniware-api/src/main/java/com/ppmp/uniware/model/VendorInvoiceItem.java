
package com.ppmp.uniware.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorInvoiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorInvoiceItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemSkuCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AdditionalTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorInvoiceItem", propOrder = {
    "itemSkuCode",
    "description",
    "unitPrice",
    "discount",
    "quantity",
    "taxPercentage",
    "additionalTaxPercentage"
})
public class VendorInvoiceItem {

    @XmlElement(name = "ItemSkuCode")
    protected String itemSkuCode;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "TaxPercentage", required = true)
    protected BigDecimal taxPercentage;
    @XmlElement(name = "AdditionalTaxPercentage")
    protected BigDecimal additionalTaxPercentage;

    /**
     * Gets the value of the itemSkuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSkuCode() {
        return itemSkuCode;
    }

    /**
     * Sets the value of the itemSkuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSkuCode(String value) {
        this.itemSkuCode = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
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
     * Gets the value of the taxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets the value of the taxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPercentage(BigDecimal value) {
        this.taxPercentage = value;
    }

    /**
     * Gets the value of the additionalTaxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalTaxPercentage() {
        return additionalTaxPercentage;
    }

    /**
     * Sets the value of the additionalTaxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalTaxPercentage(BigDecimal value) {
        this.additionalTaxPercentage = value;
    }

}
