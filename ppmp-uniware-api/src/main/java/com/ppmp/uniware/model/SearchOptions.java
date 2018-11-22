
package com.ppmp.uniware.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DisplayLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptions", propOrder = {
    "displayStart",
    "displayLength"
})
public class SearchOptions {

    @XmlElement(name = "DisplayStart")
    protected int displayStart;
    @XmlElement(name = "DisplayLength")
    protected Integer displayLength;

    /**
     * Gets the value of the displayStart property.
     * 
     */
    public int getDisplayStart() {
        return displayStart;
    }

    /**
     * Sets the value of the displayStart property.
     * 
     */
    public void setDisplayStart(int value) {
        this.displayStart = value;
    }

    /**
     * Gets the value of the displayLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayLength() {
        return displayLength;
    }

    /**
     * Sets the value of the displayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayLength(Integer value) {
        this.displayLength = value;
    }

}
