package com.ppmp.uniware.api.myntra;

import java.util.Date;

/**
 * @author ankurpratik on 20/11/18.
 */
public class OrderLineEntry {

    private String  id;
    private Date    createdBy;
    private Date    createdOn;
    private Date    lastModifiedOn;
    private String  orderId;
    private String  sku;
    private Integer totalQuantity;
    private Integer cancelledQuantity;
    private Double  mrp;
    private Double  totalSellerDiscount;
    private Double  totalMarketplaceDiscount;
    private Double  totalPaymentReceived;
    private String  cancellationReason;
    private Double  unitTaxAmount;
    private Double  taxRate;
    private String  taxType;
    private String  orderLineId;
    private Integer quantity;
    private String  customizedMessage;
    private String  invoiceNumber;
    private Date    invoiceDate;
    private Double  unitSalePriceWithoutTax;
    private Double  unitOtherChargesWithoutTax;
    private Object  taxEntries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Integer getCancelledQuantity() {
        return cancelledQuantity;
    }

    public void setCancelledQuantity(Integer cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Double getTotalSellerDiscount() {
        return totalSellerDiscount;
    }

    public void setTotalSellerDiscount(Double totalSellerDiscount) {
        this.totalSellerDiscount = totalSellerDiscount;
    }

    public Double getTotalMarketplaceDiscount() {
        return totalMarketplaceDiscount;
    }

    public void setTotalMarketplaceDiscount(Double totalMarketplaceDiscount) {
        this.totalMarketplaceDiscount = totalMarketplaceDiscount;
    }

    public Double getTotalPaymentReceived() {
        return totalPaymentReceived;
    }

    public void setTotalPaymentReceived(Double totalPaymentReceived) {
        this.totalPaymentReceived = totalPaymentReceived;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Double getUnitTaxAmount() {
        return unitTaxAmount;
    }

    public void setUnitTaxAmount(Double unitTaxAmount) {
        this.unitTaxAmount = unitTaxAmount;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCustomizedMessage() {
        return customizedMessage;
    }

    public void setCustomizedMessage(String customizedMessage) {
        this.customizedMessage = customizedMessage;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Double getUnitSalePriceWithoutTax() {
        return unitSalePriceWithoutTax;
    }

    public void setUnitSalePriceWithoutTax(Double unitSalePriceWithoutTax) {
        this.unitSalePriceWithoutTax = unitSalePriceWithoutTax;
    }

    public Double getUnitOtherChargesWithoutTax() {
        return unitOtherChargesWithoutTax;
    }

    public void setUnitOtherChargesWithoutTax(Double unitOtherChargesWithoutTax) {
        this.unitOtherChargesWithoutTax = unitOtherChargesWithoutTax;
    }

    public Object getTaxEntries() {
        return taxEntries;
    }

    public void setTaxEntries(Object taxEntries) {
        this.taxEntries = taxEntries;
    }
}
