
package com.unicommerce.uniware.services;

import java.math.BigInteger;
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
 *         &lt;element name="TaxTypeConfigurations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TaxTypeConfiguration" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CstFormC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "taxTypeConfigurations"
})
@XmlRootElement(name = "GetTaxTypeConfigurationResponse")
public class GetTaxTypeConfigurationResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected GetTaxTypeConfigurationResponse.Errors errors;
    @XmlElement(name = "Warnings")
    protected GetTaxTypeConfigurationResponse.Warnings warnings;
    @XmlElement(name = "TaxTypeConfigurations", required = true)
    protected GetTaxTypeConfigurationResponse.TaxTypeConfigurations taxTypeConfigurations;

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
     *     {@link GetTaxTypeConfigurationResponse.Errors }
     *     
     */
    public GetTaxTypeConfigurationResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxTypeConfigurationResponse.Errors }
     *     
     */
    public void setErrors(GetTaxTypeConfigurationResponse.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxTypeConfigurationResponse.Warnings }
     *     
     */
    public GetTaxTypeConfigurationResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxTypeConfigurationResponse.Warnings }
     *     
     */
    public void setWarnings(GetTaxTypeConfigurationResponse.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the taxTypeConfigurations property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxTypeConfigurationResponse.TaxTypeConfigurations }
     *     
     */
    public GetTaxTypeConfigurationResponse.TaxTypeConfigurations getTaxTypeConfigurations() {
        return taxTypeConfigurations;
    }

    /**
     * Sets the value of the taxTypeConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxTypeConfigurationResponse.TaxTypeConfigurations }
     *     
     */
    public void setTaxTypeConfigurations(GetTaxTypeConfigurationResponse.TaxTypeConfigurations value) {
        this.taxTypeConfigurations = value;
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
        protected List<Error> error;

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
         * {@link Error }
         * 
         * 
         */
        public List<Error> getError() {
            if (error == null) {
                error = new ArrayList<Error>();
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
     *         &lt;element name="TaxTypeConfiguration" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CstFormC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "taxTypeConfiguration"
    })
    public static class TaxTypeConfigurations {

        @XmlElement(name = "TaxTypeConfiguration")
        protected List<GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration> taxTypeConfiguration;

        /**
         * Gets the value of the taxTypeConfiguration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxTypeConfiguration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxTypeConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration }
         * 
         * 
         */
        public List<GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration> getTaxTypeConfiguration() {
            if (taxTypeConfiguration == null) {
                taxTypeConfiguration = new ArrayList<GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration>();
            }
            return this.taxTypeConfiguration;
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
         *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="IGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="UTGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="SGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CGST" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CompensationCess" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CstFormC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "stateCode",
            "vat",
            "cst",
            "igst",
            "utgst",
            "sgst",
            "cgst",
            "compensationCess",
            "quantity",
            "cstFormC"
        })
        public static class TaxTypeConfiguration {

            @XmlElement(name = "StateCode", required = true)
            protected String stateCode;
            @XmlElement(name = "VAT", required = true)
            protected BigInteger vat;
            @XmlElement(name = "CST", required = true)
            protected BigInteger cst;
            @XmlElement(name = "IGST", required = true)
            protected BigInteger igst;
            @XmlElement(name = "UTGST", required = true)
            protected BigInteger utgst;
            @XmlElement(name = "SGST", required = true)
            protected BigInteger sgst;
            @XmlElement(name = "CGST", required = true)
            protected BigInteger cgst;
            @XmlElement(name = "CompensationCess", required = true)
            protected BigInteger compensationCess;
            @XmlElement(name = "Quantity", required = true)
            protected BigInteger quantity;
            @XmlElement(name = "CstFormC", required = true)
            protected BigInteger cstFormC;

            /**
             * Gets the value of the stateCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateCode() {
                return stateCode;
            }

            /**
             * Sets the value of the stateCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateCode(String value) {
                this.stateCode = value;
            }

            /**
             * Gets the value of the vat property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getVAT() {
                return vat;
            }

            /**
             * Sets the value of the vat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setVAT(BigInteger value) {
                this.vat = value;
            }

            /**
             * Gets the value of the cst property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCST() {
                return cst;
            }

            /**
             * Sets the value of the cst property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCST(BigInteger value) {
                this.cst = value;
            }

            /**
             * Gets the value of the igst property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIGST() {
                return igst;
            }

            /**
             * Sets the value of the igst property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIGST(BigInteger value) {
                this.igst = value;
            }

            /**
             * Gets the value of the utgst property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUTGST() {
                return utgst;
            }

            /**
             * Sets the value of the utgst property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUTGST(BigInteger value) {
                this.utgst = value;
            }

            /**
             * Gets the value of the sgst property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSGST() {
                return sgst;
            }

            /**
             * Sets the value of the sgst property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSGST(BigInteger value) {
                this.sgst = value;
            }

            /**
             * Gets the value of the cgst property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCGST() {
                return cgst;
            }

            /**
             * Sets the value of the cgst property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCGST(BigInteger value) {
                this.cgst = value;
            }

            /**
             * Gets the value of the compensationCess property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCompensationCess() {
                return compensationCess;
            }

            /**
             * Sets the value of the compensationCess property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCompensationCess(BigInteger value) {
                this.compensationCess = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the cstFormC property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCstFormC() {
                return cstFormC;
            }

            /**
             * Sets the value of the cstFormC property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCstFormC(BigInteger value) {
                this.cstFormC = value;
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
