
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
 *         &lt;element name="FacilityItemTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FacilityItemType" type="{http://uniware.unicommerce.com/services/}WsFacilityItemType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "facilityItemTypes"
})
@XmlRootElement(name = "CreateOrEditFacilityItemTypeRequest")
public class CreateOrEditFacilityItemTypeRequest {

    @XmlElement(name = "FacilityItemTypes")
    protected FacilityItemTypes facilityItemTypes;

    /**
     * Gets the value of the facilityItemTypes property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityItemTypes }
     *     
     */
    public FacilityItemTypes getFacilityItemTypes() {
        return facilityItemTypes;
    }

    /**
     * Sets the value of the facilityItemTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityItemTypes }
     *     
     */
    public void setFacilityItemTypes(FacilityItemTypes value) {
        this.facilityItemTypes = value;
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
     *         &lt;element name="FacilityItemType" type="{http://uniware.unicommerce.com/services/}WsFacilityItemType"/&gt;
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
        "facilityItemType"
    })
    public static class FacilityItemTypes {

        @XmlElement(name = "FacilityItemType", required = true)
        protected WsFacilityItemType facilityItemType;

        /**
         * Gets the value of the facilityItemType property.
         * 
         * @return
         *     possible object is
         *     {@link WsFacilityItemType }
         *     
         */
        public WsFacilityItemType getFacilityItemType() {
            return facilityItemType;
        }

        /**
         * Sets the value of the facilityItemType property.
         * 
         * @param value
         *     allowed object is
         *     {@link WsFacilityItemType }
         *     
         */
        public void setFacilityItemType(WsFacilityItemType value) {
            this.facilityItemType = value;
        }

    }

}
