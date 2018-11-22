
package com.ppmp.uniware.model;

import java.math.BigInteger;
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
 *         &lt;element name="ShippingProviderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingMethodName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pincode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RoutingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FilterExpression" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "shippingProviderCode",
    "shippingMethodName",
    "name",
    "pincode",
    "routingCode",
    "priority",
    "enabled",
    "filterExpression",
    "customFields"
})
@XmlRootElement(name = "AddOrEditShippingProviderLocationRequest")
public class AddOrEditShippingProviderLocationRequest {

    @XmlElement(name = "ShippingProviderCode", required = true)
    protected String shippingProviderCode;
    @XmlElement(name = "ShippingMethodName", required = true)
    protected String shippingMethodName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Pincode", required = true)
    protected String pincode;
    @XmlElement(name = "RoutingCode")
    protected String routingCode;
    @XmlElement(name = "Priority", required = true)
    protected BigInteger priority;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "FilterExpression")
    protected BigInteger filterExpression;
    @XmlElement(name = "CustomFields")
    protected CustomFields customFields;

    /**
     * Gets the value of the shippingProviderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingProviderCode() {
        return shippingProviderCode;
    }

    /**
     * Sets the value of the shippingProviderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingProviderCode(String value) {
        this.shippingProviderCode = value;
    }

    /**
     * Gets the value of the shippingMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    /**
     * Sets the value of the shippingMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodName(String value) {
        this.shippingMethodName = value;
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
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the filterExpression property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilterExpression() {
        return filterExpression;
    }

    /**
     * Sets the value of the filterExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilterExpression(BigInteger value) {
        this.filterExpression = value;
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

}
