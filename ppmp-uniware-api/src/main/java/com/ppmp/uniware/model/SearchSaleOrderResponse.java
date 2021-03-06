
package com.ppmp.uniware.model;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Errors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Warnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SaleOrders"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaleOrder" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DisplayOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="NotificationMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "successful",
    "errors",
    "warnings",
    "totalRecords",
    "saleOrders"
})
@XmlRootElement(name = "SearchSaleOrderResponse")
public class SearchSaleOrderResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElement(name = "TotalRecords")
    protected long totalRecords;
    @XmlElement(name = "SaleOrders", required = true)
    protected SaleOrders saleOrders;

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public long getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(long value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the saleOrders property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrders }
     *     
     */
    public SaleOrders getSaleOrders() {
        return saleOrders;
    }

    /**
     * Sets the value of the saleOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrders }
     *     
     */
    public void setSaleOrders(SaleOrders value) {
        this.saleOrders = value;
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
     *         &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
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
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", required = true)
        protected List<java.lang.Error> error;

        /**
         * Gets the value of the error property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the error property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link java.lang.Error }
         * 
         * 
         */
        public List<java.lang.Error> getError() {
            if (error == null) {
                error = new ArrayList<java.lang.Error>();
            }
            return this.error;
        }

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
     *         &lt;element name="SaleOrder" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DisplayOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="NotificationMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
        "saleOrder"
    })
    public static class SaleOrders {

        @XmlElement(name = "SaleOrder")
        protected List<SaleOrder> saleOrder;

        /**
         * Gets the value of the saleOrder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saleOrder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaleOrder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaleOrder }
         * 
         * 
         */
        public List<SaleOrder> getSaleOrder() {
            if (saleOrder == null) {
                saleOrder = new ArrayList<SaleOrder>();
            }
            return this.saleOrder;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DisplayOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DisplayOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="NotificationMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
            "code",
            "displayOrderCode",
            "channel",
            "displayOrderDateTime",
            "notificationMobile",
            "notificationEmail",
            "status",
            "createdOn",
            "updatedOn"
        })
        public static class SaleOrder {

            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "DisplayOrderCode", required = true)
            protected String displayOrderCode;
            @XmlElement(name = "Channel", required = true)
            protected String channel;
            @XmlElement(name = "DisplayOrderDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar displayOrderDateTime;
            @XmlElement(name = "NotificationMobile", required = true)
            protected String notificationMobile;
            @XmlElement(name = "NotificationEmail", required = true)
            protected String notificationEmail;
            @XmlElement(name = "Status", required = true)
            protected String status;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "UpdatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar updatedOn;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the displayOrderCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayOrderCode() {
                return displayOrderCode;
            }

            /**
             * Sets the value of the displayOrderCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayOrderCode(String value) {
                this.displayOrderCode = value;
            }

            /**
             * Gets the value of the channel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChannel() {
                return channel;
            }

            /**
             * Sets the value of the channel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChannel(String value) {
                this.channel = value;
            }

            /**
             * Gets the value of the displayOrderDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDisplayOrderDateTime() {
                return displayOrderDateTime;
            }

            /**
             * Sets the value of the displayOrderDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDisplayOrderDateTime(XMLGregorianCalendar value) {
                this.displayOrderDateTime = value;
            }

            /**
             * Gets the value of the notificationMobile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotificationMobile() {
                return notificationMobile;
            }

            /**
             * Sets the value of the notificationMobile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotificationMobile(String value) {
                this.notificationMobile = value;
            }

            /**
             * Gets the value of the notificationEmail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotificationEmail() {
                return notificationEmail;
            }

            /**
             * Sets the value of the notificationEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotificationEmail(String value) {
                this.notificationEmail = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the createdOn property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Sets the value of the createdOn property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Gets the value of the updatedOn property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getUpdatedOn() {
                return updatedOn;
            }

            /**
             * Sets the value of the updatedOn property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setUpdatedOn(XMLGregorianCalendar value) {
                this.updatedOn = value;
            }

        }

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
     *         &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", required = true)
        protected List<Warning> warning;

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Warning }
         * 
         * 
         */
        public List<Warning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<Warning>();
            }
            return this.warning;
        }

    }

}
