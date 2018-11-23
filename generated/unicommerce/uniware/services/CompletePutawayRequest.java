
package com.unicommerce.uniware.services;

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
 *         &lt;element name="PutawayCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "putawayCode"
})
@XmlRootElement(name = "CompletePutawayRequest")
public class CompletePutawayRequest {

    @XmlElement(name = "PutawayCode", required = true)
    protected String putawayCode;

    /**
     * Gets the value of the putawayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutawayCode() {
        return putawayCode;
    }

    /**
     * Sets the value of the putawayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutawayCode(String value) {
        this.putawayCode = value;
    }

}
