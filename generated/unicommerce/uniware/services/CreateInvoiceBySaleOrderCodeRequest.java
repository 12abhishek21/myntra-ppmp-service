
package com.unicommerce.uniware.services;

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
 *         &lt;element name="FacilityContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SaleOrderItemCodes"&gt;
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
 *         &lt;element name="CommitBlockedInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "facilityContext",
    "saleOrderCode",
    "saleOrderItemCodes",
    "commitBlockedInventory"
})
@XmlRootElement(name = "CreateInvoiceBySaleOrderCodeRequest")
public class CreateInvoiceBySaleOrderCodeRequest {

    @XmlElement(name = "FacilityContext")
    protected String facilityContext;
    @XmlElement(name = "SaleOrderCode", required = true)
    protected String saleOrderCode;
    @XmlElement(name = "SaleOrderItemCodes", required = true)
    protected CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes saleOrderItemCodes;
    @XmlElement(name = "CommitBlockedInventory")
    protected Boolean commitBlockedInventory;

    /**
     * Gets the value of the facilityContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContext() {
        return facilityContext;
    }

    /**
     * Sets the value of the facilityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContext(String value) {
        this.facilityContext = value;
    }

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
     * Gets the value of the saleOrderItemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes }
     *     
     */
    public CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes getSaleOrderItemCodes() {
        return saleOrderItemCodes;
    }

    /**
     * Sets the value of the saleOrderItemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes }
     *     
     */
    public void setSaleOrderItemCodes(CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes value) {
        this.saleOrderItemCodes = value;
    }

    /**
     * Gets the value of the commitBlockedInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitBlockedInventory() {
        return commitBlockedInventory;
    }

    /**
     * Sets the value of the commitBlockedInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitBlockedInventory(Boolean value) {
        this.commitBlockedInventory = value;
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
