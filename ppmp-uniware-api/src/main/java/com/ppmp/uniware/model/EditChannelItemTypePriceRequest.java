
package com.ppmp.uniware.model;

import java.math.BigDecimal;
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
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Msp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Mrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "channelCode",
    "channelProductId",
    "msp",
    "mrp",
    "sellingPrice",
    "currency"
})
@XmlRootElement(name = "EditChannelItemTypePriceRequest")
public class EditChannelItemTypePriceRequest {

    @XmlElement(name = "ChannelCode", required = true)
    protected String channelCode;
    @XmlElement(name = "ChannelProductId", required = true)
    protected String channelProductId;
    @XmlElement(name = "Msp")
    protected BigDecimal msp;
    @XmlElement(name = "Mrp")
    protected BigDecimal mrp;
    @XmlElement(name = "SellingPrice")
    protected BigDecimal sellingPrice;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the channelProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelProductId() {
        return channelProductId;
    }

    /**
     * Sets the value of the channelProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelProductId(String value) {
        this.channelProductId = value;
    }

    /**
     * Gets the value of the msp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsp() {
        return msp;
    }

    /**
     * Sets the value of the msp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsp(BigDecimal value) {
        this.msp = value;
    }

    /**
     * Gets the value of the mrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrp() {
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
    public void setMrp(BigDecimal value) {
        this.mrp = value;
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingPrice(BigDecimal value) {
        this.sellingPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
