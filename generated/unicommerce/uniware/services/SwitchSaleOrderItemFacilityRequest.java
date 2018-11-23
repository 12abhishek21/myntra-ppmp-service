
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
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SaleOrderItemCodes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "saleOrderCode",
    "facilityCode",
    "saleOrderItemCodes"
})
@XmlRootElement(name = "SwitchSaleOrderItemFacilityRequest")
public class SwitchSaleOrderItemFacilityRequest {

    @XmlElement(name = "SaleOrderCode", required = true)
    protected String saleOrderCode;
    @XmlElement(name = "FacilityCode", required = true)
    protected String facilityCode;
    @XmlElement(name = "SaleOrderItemCodes", required = true)
    protected SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes saleOrderItemCodes;

    /**
     * Gets the value of the saleOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleOrderCode() {
        return saleOrderCode;
    }

    /**
     * Sets the value of the saleOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleOrderCode(String value) {
        this.saleOrderCode = value;
    }

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    /**
     * Gets the value of the saleOrderItemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes }
     *     
     */
    public SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes getSaleOrderItemCodes() {
        return saleOrderItemCodes;
    }

    /**
     * Sets the value of the saleOrderItemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes }
     *     
     */
    public void setSaleOrderItemCodes(SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes value) {
        this.saleOrderItemCodes = value;
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
     *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "saleOrderItemCode"
    })
    public static class SaleOrderItemCodes {

        @XmlElement(name = "SaleOrderItemCode", required = true)
        protected String saleOrderItemCode;

        /**
         * Gets the value of the saleOrderItemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSaleOrderItemCode() {
            return saleOrderItemCode;
        }

        /**
         * Sets the value of the saleOrderItemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSaleOrderItemCode(String value) {
            this.saleOrderItemCode = value;
        }

    }

}
