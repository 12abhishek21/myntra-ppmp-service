
package com.ppmp.uniware.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ReversePickupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleOrderItemCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "reversePickupCode",
    "saleOrderItemCodes"
})
@XmlRootElement(name = "CreateReversePickupResponse")
public class CreateReversePickupResponse {

    @XmlElement(name = "ReversePickupCode")
    protected String reversePickupCode;
    @XmlElement(name = "SaleOrderItemCodes")
    protected SaleOrderItemCodes saleOrderItemCodes;

    /**
     * Gets the value of the reversePickupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversePickupCode() {
        return reversePickupCode;
    }

    /**
     * Sets the value of the reversePickupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversePickupCode(String value) {
        this.reversePickupCode = value;
    }

    /**
     * Gets the value of the saleOrderItemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrderItemCodes }
     *     
     */
    public SaleOrderItemCodes getSaleOrderItemCodes() {
        return saleOrderItemCodes;
    }

    /**
     * Sets the value of the saleOrderItemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrderItemCodes }
     *     
     */
    public void setSaleOrderItemCodes(SaleOrderItemCodes value) {
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
     *         &lt;element name="SaleOrderItemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        protected List<String> saleOrderItemCode;

        /**
         * Gets the value of the saleOrderItemCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrderItemCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrderItemCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSaleOrderItemCode() {
            if (saleOrderItemCode == null) {
                saleOrderItemCode = new ArrayList<String>();
            }
            return this.saleOrderItemCode;
        }

    }

}
