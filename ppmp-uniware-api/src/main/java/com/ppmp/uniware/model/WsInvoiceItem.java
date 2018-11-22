package com.ppmp.uniware.model;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsInvoiceItem {

    private String                   skuCode;

    private String                   bundleSkuCode;

    private String                   channelProductId;

    private String                   sellerSkuCode;

    private List<String> saleOrderItemCodes;

    private List<WsSaleOrderItem>    saleOrderItems;

    @Min(value = 0)
    private BigDecimal unitPrice;

    @Min(value = 0)
    private BigDecimal               subtotal;

    @Min(value = 0)
    private BigDecimal               discount;

    @Min(value = 0)
    private BigDecimal               shippingCharges;

    @Min(value = 0)
    private BigDecimal               cashOnDeliveryCharges;

    @Min(value = 0)
    private BigDecimal               shippingMethodCharges;

    @NotNull
    @Min(value = 0)
    private BigDecimal               total;

    @Min(value = 0)
    private BigDecimal               prepaidAmount;

    @Min(value = 0)
    private BigDecimal               voucherValue;

    @Min(value = 0)
    private BigDecimal               serviceTax;

    @Min(value = 0)
    private BigDecimal               additionalTax;

    private BigDecimal               giftWrapCharges   = BigDecimal.ZERO;

    private BigDecimal               storeCredit       = BigDecimal.ZERO;

    private String                   additionalInfo;

    @NotNull
    private Integer                  quantity          = 0;

    private String                   itemDetails;

    @Valid
    private WsTaxPercentageDetail    taxPercentageDetail;

    @Valid
    private List<WsCustomFieldValue> customFieldValues = new ArrayList<>();

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String sellerSkuCode) {
        this.skuCode = sellerSkuCode;
    }

    public String getBundleSkuCode() {
        return bundleSkuCode;
    }

    public void setBundleSkuCode(String bundleSkuCode) {
        this.bundleSkuCode = bundleSkuCode;
    }

    public String getChannelProductId() {
        return channelProductId;
    }

    public void setChannelProductId(String sellerSkuCode) {
        this.channelProductId = sellerSkuCode;
    }

    public String getSellerSkuCode() {return sellerSkuCode;}

    public void setSellerSkuCode(String sellerSkuCode) {this.sellerSkuCode = sellerSkuCode;}

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = (unitPrice != null ? unitPrice : BigDecimal.ZERO);
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = (subtotal == null ? BigDecimal.ZERO : subtotal);
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = (discount != null ? discount : BigDecimal.ZERO);
    }

    public BigDecimal getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(BigDecimal shippingCharges) {
        this.shippingCharges = (shippingCharges != null ? shippingCharges : BigDecimal.ZERO);
    }

    public BigDecimal getCashOnDeliveryCharges() {
        return cashOnDeliveryCharges;
    }

    public void setCashOnDeliveryCharges(BigDecimal cashOnDeliveryCharges) {
        this.cashOnDeliveryCharges = (cashOnDeliveryCharges != null ? cashOnDeliveryCharges : BigDecimal.ZERO);
    }

    public BigDecimal getShippingMethodCharges() {
        return shippingMethodCharges;
    }

    public void setShippingMethodCharges(BigDecimal shippingMethodCharges) {
        this.shippingMethodCharges = (shippingMethodCharges != null ? shippingMethodCharges : BigDecimal.ZERO);
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = (total != null ? total : BigDecimal.ZERO);
    }

    public BigDecimal getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(BigDecimal prepaidAmount) {
        this.prepaidAmount = (prepaidAmount != null ? prepaidAmount : BigDecimal.ZERO);
    }

    public BigDecimal getVoucherValue() {
        return voucherValue;
    }

    public void setVoucherValue(BigDecimal voucherValue) {
        this.voucherValue = (voucherValue != null ? voucherValue : BigDecimal.ZERO);
    }

    public BigDecimal getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(BigDecimal serviceTax) {
        this.serviceTax = (serviceTax != null ? serviceTax : BigDecimal.ZERO);
    }

    public BigDecimal getAdditionalTax() {
        return additionalTax;
    }

    public void setAdditionalTax(BigDecimal additionalTax) {
        this.additionalTax = (additionalTax != null ? additionalTax : BigDecimal.ZERO);
    }

    public List<WsSaleOrderItem> getSaleOrderItems() {
        return saleOrderItems;
    }

    public void setSaleOrderItems(List<WsSaleOrderItem> saleOrderItems) {
        this.saleOrderItems = saleOrderItems;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getGiftWrapCharges() {
        return giftWrapCharges;
    }

    public void setGiftWrapCharges(BigDecimal giftWrapCharges) {
        this.giftWrapCharges = giftWrapCharges;
    }

    public BigDecimal getStoreCredit() {
        return storeCredit;
    }

    public void setStoreCredit(BigDecimal storeCredit) {
        this.storeCredit = storeCredit;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<String> getSaleOrderItemCodes() {
        if (saleOrderItemCodes != null && !saleOrderItemCodes.isEmpty()) {
            return saleOrderItemCodes;
        } else {
            saleOrderItemCodes = new ArrayList<>(saleOrderItems.size());
            for (WsSaleOrderItem wsSaleOrderItem : saleOrderItems) {
                saleOrderItemCodes.add(wsSaleOrderItem.getSaleOrderItemCode());
            }
            return saleOrderItemCodes;
        }
    }

    public void setSaleOrderItemCodes(List<String> saleOrderItemCodes) {
        this.saleOrderItemCodes = saleOrderItemCodes;
    }

    public WsTaxPercentageDetail getTaxPercentageDetail() {
        return taxPercentageDetail;
    }

    public void setTaxPercentageDetail(WsTaxPercentageDetail taxPercentageDetail) {
        this.taxPercentageDetail = taxPercentageDetail;
    }

    public List<WsCustomFieldValue> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<WsCustomFieldValue> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public static String generateInvoiceItemIdentifier(WsInvoice.Source source, String skuCode, String bundleSkuCode, BigDecimal price) {
        if(!WsInvoice.Source.SHIPPING_PACKAGE.equals(source) || (price == null && bundleSkuCode == null)){
            return skuCode;
        } else {
            List<String> list = new ArrayList<>();
            list.add(skuCode);
            if(price != null){
                list.add(price.toString());
            }
            if(bundleSkuCode != null){
                list.add(bundleSkuCode);
            }
            String identifier = join('|', list);
            return identifier;
        }
    }

    public static class WsSaleOrderItem {

        private String           saleOrderItemCode;

        private List<ItemDetail> itemDetails;

        public String getSaleOrderItemCode() {
            return saleOrderItemCode;
        }

        public void setSaleOrderItemCode(String saleOrderItemCode) {
            this.saleOrderItemCode = saleOrderItemCode;
        }

        public List<ItemDetail> getItemDetails() {
            return itemDetails;
        }

        public void setItemDetails(List<ItemDetail> itemDetails) {
            this.itemDetails = itemDetails;
        }
    }

    public static String join(char sep, Collection<String> strings) {
        if (strings == null || strings.size() == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s).append(sep);
        }
        return builder.deleteCharAt(builder.length() - 1).toString();
    }
}
