
package com.ppmp.uniware.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PurchaseOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDateRange" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "purchaseOrderCode",
    "createdDateRange"
})
@XmlRootElement(name = "GetInflowReceiptsRequest")
public class GetInflowReceiptsRequest {

    @XmlElement(name = "PurchaseOrderCode")
    protected String purchaseOrderCode;
    @XmlElement(name = "CreatedDateRange")
    protected CreatedDateRange createdDateRange;

    /**
     * Gets the value of the purchaseOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    /**
     * Sets the value of the purchaseOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderCode(String value) {
        this.purchaseOrderCode = value;
    }

    /**
     * Gets the value of the createdDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link CreatedDateRange }
     *     
     */
    public CreatedDateRange getCreatedDateRange() {
        return createdDateRange;
    }

    /**
     * Sets the value of the createdDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatedDateRange }
     *     
     */
    public void setCreatedDateRange(CreatedDateRange value) {
        this.createdDateRange = value;
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
     *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
        "start",
        "end"
    })
    public static class CreatedDateRange {

        @XmlElement(name = "Start", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar start;
        @XmlElement(name = "End", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

    }

}
