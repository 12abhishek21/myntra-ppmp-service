
package com.unicommerce.uniware.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoxLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BoxWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BoxHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BoxWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingPackageType", propOrder = {
    "code",
    "boxLength",
    "boxWidth",
    "boxHeight",
    "boxWeight"
})
public class ShippingPackageType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "BoxLength")
    protected int boxLength;
    @XmlElement(name = "BoxWidth")
    protected int boxWidth;
    @XmlElement(name = "BoxHeight")
    protected int boxHeight;
    @XmlElement(name = "BoxWeight")
    protected int boxWeight;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the boxLength property.
     * 
     */
    public int getBoxLength() {
        return boxLength;
    }

    /**
     * Sets the value of the boxLength property.
     * 
     */
    public void setBoxLength(int value) {
        this.boxLength = value;
    }

    /**
     * Gets the value of the boxWidth property.
     * 
     */
    public int getBoxWidth() {
        return boxWidth;
    }

    /**
     * Sets the value of the boxWidth property.
     * 
     */
    public void setBoxWidth(int value) {
        this.boxWidth = value;
    }

    /**
     * Gets the value of the boxHeight property.
     * 
     */
    public int getBoxHeight() {
        return boxHeight;
    }

    /**
     * Sets the value of the boxHeight property.
     * 
     */
    public void setBoxHeight(int value) {
        this.boxHeight = value;
    }

    /**
     * Gets the value of the boxWeight property.
     * 
     */
    public int getBoxWeight() {
        return boxWeight;
    }

    /**
     * Sets the value of the boxWeight property.
     * 
     */
    public void setBoxWeight(int value) {
        this.boxWeight = value;
    }

}
