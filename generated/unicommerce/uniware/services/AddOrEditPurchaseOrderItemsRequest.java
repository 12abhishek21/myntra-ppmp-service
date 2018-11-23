
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
 *         &lt;element name="PurchaseOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PurchaseOrderItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PurchaseOrderItem" type="{http://uniware.unicommerce.com/services/}PurchaseOrderItem" maxOccurs="unbounded"/&gt;
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
    "purchaseOrderItems"
})
@XmlRootElement(name = "AddOrEditPurchaseOrderItemsRequest")
public class AddOrEditPurchaseOrderItemsRequest {

    @XmlElement(name = "PurchaseOrderCode", required = true)
    protected String purchaseOrderCode;
    @XmlElement(name = "PurchaseOrderItems", required = true)
    protected AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems purchaseOrderItems;

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
     * Gets the value of the purchaseOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems }
     *     
     */
    public AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems getPurchaseOrderItems() {
        return purchaseOrderItems;
    }

    /**
     * Sets the value of the purchaseOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems }
     *     
     */
    public void setPurchaseOrderItems(AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems value) {
        this.purchaseOrderItems = value;
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
     *         &lt;element name="PurchaseOrderItem" type="{http://uniware.unicommerce.com/services/}PurchaseOrderItem" maxOccurs="unbounded"/&gt;
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
        "purchaseOrderItem"
    })
    public static class PurchaseOrderItems {

        @XmlElement(name = "PurchaseOrderItem", required = true)
        protected List<PurchaseOrderItem> purchaseOrderItem;

        /**
         * Gets the value of the purchaseOrderItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchaseOrderItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchaseOrderItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PurchaseOrderItem }
         * 
         * 
         */
        public List<PurchaseOrderItem> getPurchaseOrderItem() {
            if (purchaseOrderItem == null) {
                purchaseOrderItem = new ArrayList<PurchaseOrderItem>();
            }
            return this.purchaseOrderItem;
        }

    }

}
