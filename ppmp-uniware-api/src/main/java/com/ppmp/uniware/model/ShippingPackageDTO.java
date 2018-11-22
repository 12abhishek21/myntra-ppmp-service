package com.ppmp.uniware.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ankurpratik on 21/11/18.
 */
public class ShippingPackageDTO {
    private String                                  code;
    private String                                  saleOrderCode;
    private String                                  channel;
    private String                                  status;
    private String                                  shippingPackageType;
    private String                                  shippingProvider;
    private String                                  shippingMethod;
    private String                                  trackingNumber;
    private String                                  trackingStatus;
    private String                                  courierStatus;
    private Integer                                 estimatedWeight;
    private Integer                                 actualWeight;
    private String                                  customer;
    private Date                                    created;
    private Date                                    updated;
    private Date                                    dispatched;
    private Date                                    delivered;
    private int                                     invoice;
    private String                                  invoiceCode;
    private String                                  invoiceDisplayCode;
    private String                                  returnInvoiceCode;
    private String                                  returnInvoiceDisplayCode;
    private int                                     noOfItems;
    private String                                  city;
    private BigDecimal                              collectableAmount;
    private BigDecimal                              collectedAmount;
    private boolean                                 paymentReconciled;
    private String                                  podCode;
    private String                                  shippingManifestCode;
    private Map<String, ShippingPackageItemTypeDTO> items = new HashMap<String, ShippingPackageItemTypeDTO>();
    private List<CustomFieldMetadataDTO>            customFieldValues;

    public ShippingPackageDTO() {
    }

    public String getInvoiceDisplayCode() {
        return invoiceDisplayCode;
    }

    public void setInvoiceDisplayCode(String invoiceDisplayCode) {
        this.invoiceDisplayCode = invoiceDisplayCode;
    }

    public String getReturnInvoiceDisplayCode() {
        return returnInvoiceDisplayCode;
    }

    public void setReturnInvoiceDisplayCode(String returnInvoiceDisplayCode) {
        this.returnInvoiceDisplayCode = returnInvoiceDisplayCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the customFieldValues
     */
    public List<CustomFieldMetadataDTO> getCustomFieldValues() {
        return customFieldValues;
    }

    /**
     * @param customFieldValues the customFieldValues to set
     */
    public void setCustomFieldValues(List<CustomFieldMetadataDTO> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    /**
     * @return the noOfItems
     */
    public int getNoOfItems() {
        return noOfItems;
    }

    /**
     * @param noOfItems the noOfItems to set
     */
    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the shippingPackageType
     */
    public String getShippingPackageType() {
        return shippingPackageType;
    }

    /**
     * @param shippingPackageType the shippingPackageType to set
     */
    public void setShippingPackageType(String shippingPackageType) {
        this.shippingPackageType = shippingPackageType;
    }

    /**
     * @return the shippingProvider
     */
    public String getShippingProvider() {
        return shippingProvider;
    }

    /**
     * @param shippingProvider the shippingProvider to set
     */
    public void setShippingProvider(String shippingProvider) {
        this.shippingProvider = shippingProvider;
    }

    /**
     * @return the shippingMethod
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * @param shippingMethod the shippingMethod to set
     */
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    /**
     * @return the trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * @param trackingNumber the trackingNumber to set
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * @return the estimatedWeight
     */
    public Integer getEstimatedWeight() {
        return estimatedWeight;
    }

    /**
     * @param estimatedWeight the estimatedWeight to set
     */
    public void setEstimatedWeight(Integer estimatedWeight) {
        this.estimatedWeight = estimatedWeight;
    }

    /**
     * @return the actualWeight
     */
    public Integer getActualWeight() {
        return actualWeight;
    }

    /**
     * @param actualWeight the actualWeight to set
     */
    public void setActualWeight(Integer actualWeight) {
        this.actualWeight = actualWeight;
    }

    /**
     * @return the invoice
     */
    public int getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the dispatched
     */
    public Date getDispatched() {
        return dispatched;
    }

    /**
     * @param dispatched the dispatched to set
     */
    public void setDispatched(Date dispatched) {
        this.dispatched = dispatched;
    }

    /**
     * @return the invoiceCode
     */
    public String getInvoiceCode() {
        return invoiceCode;
    }

    /**
     * @param invoiceCode the invoiceCode to set
     */
    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public Date getDelivered() {
        return delivered;
    }

    public void setDelivered(Date delivered) {
        this.delivered = delivered;
    }

    /**
     * @return the saleOrderCode
     */
    public String getSaleOrderCode() {
        return saleOrderCode;
    }

    /**
     * @param saleOrderCode the saleOrderCode to set
     */
    public void setSaleOrderCode(String saleOrderCode) {
        this.saleOrderCode = saleOrderCode;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the trackingStatus
     */
    public String getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * @param trackingStatus the trackingStatus to set
     */
    public void setTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    /**
     * @return the courierStatus
     */
    public String getCourierStatus() {
        return courierStatus;
    }

    /**
     * @param courierStatus the courierStatus to set
     */
    public void setCourierStatus(String courierStatus) {
        this.courierStatus = courierStatus;
    }

    /**
     * @return the collectableAmount
     */
    public BigDecimal getCollectableAmount() {
        return collectableAmount;
    }

    /**
     * @param collectableAmount the collectableAmount to set
     */
    public void setCollectableAmount(BigDecimal collectableAmount) {
        this.collectableAmount = collectableAmount;
    }

    /**
     * @return the collectedAmount
     */
    public BigDecimal getCollectedAmount() {
        return collectedAmount;
    }

    /**
     * @param collectedAmount the collectedAmount to set
     */
    public void setCollectedAmount(BigDecimal collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    /**
     * @return the paymentReconciled
     */
    public boolean isPaymentReconciled() {
        return paymentReconciled;
    }

    /**
     * @param paymentReconciled the paymentReconciled to set
     */
    public void setPaymentReconciled(boolean paymentReconciled) {
        this.paymentReconciled = paymentReconciled;
    }

    public String getPodCode() {
        return podCode;
    }

    public void setPodCode(String podCode) {
        this.podCode = podCode;
    }

    public String getReturnInvoiceCode() {
        return returnInvoiceCode;
    }

    public void setReturnInvoiceCode(String returnInvoiceCode) {
        this.returnInvoiceCode = returnInvoiceCode;
    }

    public static class ShippingPackageItemTypeDTO {

        private String itemSku;
        private String itemName;
        private String itemTypeImageUrl;
        private String itemTypePageUrl;
        private int    quantity;

        /**
         * @return the itemSku
         */
        public String getItemSku() {
            return itemSku;
        }

        /**
         * @param itemSku the itemSku to set
         */
        public void setItemSku(String itemSku) {
            this.itemSku = itemSku;
        }

        /**
         * @return the itemName
         */
        public String getItemName() {
            return itemName;
        }

        /**
         * @param itemName the itemName to set
         */
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        /**
         * @return the itemTypeImageUrl
         */
        public String getItemTypeImageUrl() {
            return itemTypeImageUrl;
        }

        /**
         * @param itemTypeImageUrl the itemTypeImageUrl to set
         */
        public void setItemTypeImageUrl(String itemTypeImageUrl) {
            this.itemTypeImageUrl = itemTypeImageUrl;
        }

        /**
         * @return the itemTypePageUrl
         */
        public String getItemTypePageUrl() {
            return itemTypePageUrl;
        }

        /**
         * @param itemTypePageUrl the itemTypePageUrl to set
         */
        public void setItemTypePageUrl(String itemTypePageUrl) {
            this.itemTypePageUrl = itemTypePageUrl;
        }

        /**
         * @return the quantity
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * @param quantity the quantity to set
         */
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    /**
     * @return the items
     */
    public Map<String, ShippingPackageItemTypeDTO> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(Map<String, ShippingPackageItemTypeDTO> items) {
        this.items = items;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getShippingManifestCode() {
        return shippingManifestCode;
    }

    public void setShippingManifestCode(String shippingManifestCode) {
        this.shippingManifestCode = shippingManifestCode;
    }
}
