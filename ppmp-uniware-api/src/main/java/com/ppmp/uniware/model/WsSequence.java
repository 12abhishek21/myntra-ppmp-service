
package com.ppmp.uniware.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * <p>Java class for WsSequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsSequence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NextYearPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResetCounterNextYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsSequence", propOrder = {
    "prefix",
    "currentValue",
    "nextYearPrefix",
    "resetCounterNextYear"
})
public class WsSequence {

    @XmlElement(name = "Prefix", required = true)
    protected String prefix;
    @XmlElement(name = "CurrentValue")
    protected BigInteger currentValue;
    @XmlElement(name = "NextYearPrefix")
    protected String nextYearPrefix;
    @XmlElement(name = "ResetCounterNextYear")
    protected Boolean resetCounterNextYear;

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentValue(BigInteger value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the nextYearPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextYearPrefix() {
        return nextYearPrefix;
    }

    /**
     * Sets the value of the nextYearPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextYearPrefix(String value) {
        this.nextYearPrefix = value;
    }

    /**
     * Gets the value of the resetCounterNextYear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetCounterNextYear() {
        return resetCounterNextYear;
    }

    /**
     * Sets the value of the resetCounterNextYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetCounterNextYear(Boolean value) {
        this.resetCounterNextYear = value;
    }

}
