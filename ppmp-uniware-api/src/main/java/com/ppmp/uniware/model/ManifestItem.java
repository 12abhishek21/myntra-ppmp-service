
package com.ppmp.uniware.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManifestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManifestItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirWayBillNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingPackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DeclaredValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CollectableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ShippingMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingPackageType" type="{http://uniware.unicommerce.com/services/}ShippingPackageType"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}ShippingAddress"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestItem", propOrder = {
    "airWayBillNumber",
    "shippingPackageCode",
    "displayOrderCode",
    "invoiceCode",
    "quantity",
    "weight",
    "declaredValue",
    "shippingCharges",
    "collectableAmount",
    "shippingMethodCode",
    "shippingPackageType",
    "shippingAddress"
})
public class ManifestItem {

    @XmlElement(name = "AirWayBillNumber", required = true)
    protected String airWayBillNumber;
    @XmlElement(name = "ShippingPackageCode", required = true)
    protected String shippingPackageCode;
    @XmlElement(name = "DisplayOrderCode", required = true)
    protected String displayOrderCode;
    @XmlElement(name = "InvoiceCode", required = true)
    protected String invoiceCode;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "Weight", required = true)
    protected BigInteger weight;
    @XmlElement(name = "DeclaredValue", required = true)
    protected BigDecimal declaredValue;
    @XmlElement(name = "ShippingCharges", required = true)
    protected BigDecimal shippingCharges;
    @XmlElement(name = "CollectableAmount", required = true)
    protected BigDecimal collectableAmount;
    @XmlElement(name = "ShippingMethodCode", required = true)
    protected String shippingMethodCode;
    @XmlElement(name = "ShippingPackageType", required = true)
    protected ShippingPackageType shippingPackageType;
    @XmlElement(name = "ShippingAddress", required = true)
    protected ShippingAddress shippingAddress;

    /**
     * Gets the value of the airWayBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirWayBillNumber() {
        return airWayBillNumber;
    }

    /**
     * Sets the value of the airWayBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirWayBillNumber(String value) {
        this.airWayBillNumber = value;
    }

    /**
     * Gets the value of the shippingPackageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPackageCode() {
        return shippingPackageCode;
    }

    /**
     * Sets the value of the shippingPackageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPackageCode(String value) {
        this.shippingPackageCode = value;
    }

    /**
     * Gets the value of the displayOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayOrderCode() {
        return displayOrderCode;
    }

    /**
     * Sets the value of the displayOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayOrderCode(String value) {
        this.displayOrderCode = value;
    }

    /**
     * Gets the value of the invoiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCode() {
        return invoiceCode;
    }

    /**
     * Sets the value of the invoiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCode(String value) {
        this.invoiceCode = value;
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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeight(BigInteger value) {
        this.weight = value;
    }

    /**
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredValue(BigDecimal value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the shippingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCharges() {
        return shippingCharges;
    }

    /**
     * Sets the value of the shippingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCharges(BigDecimal value) {
        this.shippingCharges = value;
    }

    /**
     * Gets the value of the collectableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectableAmount() {
        return collectableAmount;
    }

    /**
     * Sets the value of the collectableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectableAmount(BigDecimal value) {
        this.collectableAmount = value;
    }

    /**
     * Gets the value of the shippingMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodCode() {
        return shippingMethodCode;
    }

    /**
     * Sets the value of the shippingMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodCode(String value) {
        this.shippingMethodCode = value;
    }

    /**
     * Gets the value of the shippingPackageType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageType }
     *     
     */
    public ShippingPackageType getShippingPackageType() {
        return shippingPackageType;
    }

    /**
     * Sets the value of the shippingPackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageType }
     *     
     */
    public void setShippingPackageType(ShippingPackageType value) {
        this.shippingPackageType = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddress }
     *     
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddress }
     *     
     */
    public void setShippingAddress(ShippingAddress value) {
        this.shippingAddress = value;
    }

}
