
package com.ppmp.uniware.model;

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
 *         &lt;element name="WsFacility" type="{http://uniware.unicommerce.com/services/}WsFacilityCreate"/&gt;
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
    "wsFacility"
})
@XmlRootElement(name = "CreateFacilityRequest")
public class CreateFacilityRequest {

    @XmlElement(name = "WsFacility", required = true)
    protected WsFacilityCreate wsFacility;

    /**
     * Gets the value of the wsFacility property.
     * 
     * @return
     *     possible object is
     *     {@link WsFacilityCreate }
     *     
     */
    public WsFacilityCreate getWsFacility() {
        return wsFacility;
    }

    /**
     * Sets the value of the wsFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFacilityCreate }
     *     
     */
    public void setWsFacility(WsFacilityCreate value) {
        this.wsFacility = value;
    }

}
