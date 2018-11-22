package com.ppmp.uniware.model;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsSaleOrder {
    private String                           code;

    private String                           displayOrderCode;
    private Date                             displayOrderDateTime;

    private String                           customerCode;

    private String                           customerName;

    private String                           channel;

    private String                           notificationEmail;

    private String                           notificationMobile;

    @NotNull
    private Boolean                          cashOnDelivery;

    private PaymentInstrument                paymentInstrument;

    private String                           additionalInfo;

    private Boolean                          thirdPartyShipping;

    @Valid
    private List<WsShippingProvider>         shippingProviders;

    @Valid
    private List<WsSaleOrderItemCombination> saleOrderItemCombinations;

    @Valid
    private List<WsAddressDetail>            addresses;

    @Valid
    private WsAddressRef                     billingAddress;

    @Valid
    private WsAddressRef                     shippingAddress;

    @Valid
    @Size(max = 5000)
    private List<WsSaleOrderItem>            saleOrderItems;

    @Valid
    private List<WsCustomFieldValue>         customFieldValues;

    private String                           currencyCode;

    private Boolean                          taxExempted;

    private Boolean                          cformProvided;

    private Date                             fulfillmentTat;

    private Boolean                          verificationRequired;

    private Integer                          priority;

    @Min(value = 0)
    private BigDecimal                       totalDiscount;

    @Min(value = 0)
    private BigDecimal                       totalShippingCharges;

    @Min(value = 0)
    private BigDecimal                       totalCashOnDeliveryCharges;

    @Min(value = 0)
    private BigDecimal                       totalGiftWrapCharges;

    @Min(value = 0)
    private BigDecimal                       totalStoreCredit;

    @Min(value = 0)
    private BigDecimal                       totalPrepaidAmount;

    private boolean                          useVerifiedListings;

    private String                           customerGSTIN;

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
     * @return the email
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    /**
     * @return the cashOnDelivery
     */
    public Boolean getCashOnDelivery() {
        return cashOnDelivery;
    }

    /**
     * @param cashOnDelivery the cashOnDelivery to set
     */
    public void setCashOnDelivery(Boolean cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public PaymentInstrument getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    /**
     * @return the billingAddress
     */
    public WsAddressRef getBillingAddress() {
        return billingAddress;
    }

    /**
     * @param billingAddress the billingAddress to set
     */
    public void setBillingAddress(WsAddressRef billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * @return the shippingAddress
     */
    public WsAddressRef getShippingAddress() {
        return shippingAddress;
    }

    /**
     * @param shippingAddress the shippingAddress to set
     */
    public void setShippingAddress(WsAddressRef shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * @return the saleOrderItems
     */
    public List<WsSaleOrderItem> getSaleOrderItems() {
        return saleOrderItems;
    }

    /**
     * @param saleOrderItems the saleOrderItems to set
     */
    public void setSaleOrderItems(List<WsSaleOrderItem> saleOrderItems) {
        this.saleOrderItems = saleOrderItems;
    }

    public void setNotificationMobile(String notificationMobile) {
        this.notificationMobile = notificationMobile;
    }

    public String getNotificationMobile() {
        return notificationMobile;
    }

    /**
     * @return the displayOrderCode
     */
    public String getDisplayOrderCode() {
        return displayOrderCode;
    }

    /**
     * @param displayOrderCode the displayOrderCode to set
     */
    public void setDisplayOrderCode(String displayOrderCode) {
        this.displayOrderCode = displayOrderCode;
    }

    /**
     * @return the displayOrderDateTime
     */
    public Date getDisplayOrderDateTime() {
        return displayOrderDateTime;
    }

    /**
     * @param displayOrderDateTime the displayOrderDate to set
     */
    public void setDisplayOrderDate(Date displayOrderDateTime) {
        this.displayOrderDateTime = displayOrderDateTime;
    }

    public void setAddresses(List<WsAddressDetail> addresses) {
        this.addresses = addresses;
    }

    public List<WsAddressDetail> getAddresses() {
        return addresses;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "WsSaleOrder [code=" + code + ", displayOrderCode=" + displayOrderCode + ", displayOrderDateTime=" + displayOrderDateTime + ", notificationEmail="
                + notificationEmail + ", notificationMobile=" + notificationMobile + ", cashOnDelivery=" + cashOnDelivery + ", addresses=" + addresses + ", billingAddress="
                + billingAddress + ", shippingAddress=" + shippingAddress + ", saleOrderItems=" + saleOrderItems + "]";
    }

    /**
     * @return the shippingProviders
     */
    public List<WsShippingProvider> getShippingProviders() {
        return shippingProviders;
    }

    /**
     * @param shippingProviders the shippingProviders to set
     */
    public void setShippingProviders(List<WsShippingProvider> shippingProviders) {
        this.shippingProviders = shippingProviders;
    }

    /**
     * @return the additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * @param additionalInfo the additionalInfo to set
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boolean getThirdPartyShipping() {
        return thirdPartyShipping;
    }

    public void setThirdPartyShipping(Boolean thirdPartyShipping) {
        this.thirdPartyShipping = thirdPartyShipping;
    }

    /**
     * @return the customFieldValues
     */
    public List<WsCustomFieldValue> getCustomFieldValues() {
        return customFieldValues;
    }

    /**
     * @param customFieldValues the customFieldValues to set
     */
    public void setCustomFieldValues(List<WsCustomFieldValue> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    /**
     * @param displayOrderDateTime the displayOrderDateTime to set
     */
    public void setDisplayOrderDateTime(Date displayOrderDateTime) {
        this.displayOrderDateTime = displayOrderDateTime;
    }

    /**
     * @param wsShippingProvider
     */
    public void addShippingProvider(WsShippingProvider wsShippingProvider) {
        if (shippingProviders == null) {
            shippingProviders = new ArrayList<WsShippingProvider>();
        }
        shippingProviders.add(wsShippingProvider);
    }

    /**
     * @return the customerCode
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * @param customerCode the customerCode to set
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * @return the saleOrderItemCombinations
     */
    public List<WsSaleOrderItemCombination> getSaleOrderItemCombinations() {
        return saleOrderItemCombinations;
    }

    /**
     * @param saleOrderItemCombinations the saleOrderItemCombinations to set
     */
    public void setSaleOrderItemCombinations(List<WsSaleOrderItemCombination> saleOrderItemCombinations) {
        this.saleOrderItemCombinations = saleOrderItemCombinations;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the fulfillmentTat
     */
    public Date getFulfillmentTat() {
        return fulfillmentTat;
    }

    /**
     * @param fulfillmentTat the fulfillmentTat to set
     */
    public void setFulfillmentTat(Date fulfillmentTat) {
        this.fulfillmentTat = fulfillmentTat;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Boolean getTaxExempted() {
        return taxExempted;
    }

    public void setTaxExempted(Boolean taxExempted) {
        this.taxExempted = taxExempted;
    }

    public Boolean getCformProvided() {
        return cformProvided;
    }

    public void setCformProvided(Boolean cformProvided) {
        this.cformProvided = cformProvided;
    }

    public Boolean getVerificationRequired() {
        return verificationRequired;
    }

    public void setVerificationRequired(Boolean verificationRequired) {
        this.verificationRequired = verificationRequired;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getTotalShippingCharges() {
        return totalShippingCharges;
    }

    public void setTotalShippingCharges(BigDecimal totalShippingCharges) {
        this.totalShippingCharges = totalShippingCharges;
    }

    public BigDecimal getTotalCashOnDeliveryCharges() {
        return totalCashOnDeliveryCharges;
    }

    public void setTotalCashOnDeliveryCharges(BigDecimal totalCashOnDeliveryCharges) {
        this.totalCashOnDeliveryCharges = totalCashOnDeliveryCharges;
    }

    public BigDecimal getTotalGiftWrapCharges() {
        return totalGiftWrapCharges;
    }

    public void setTotalGiftWrapCharges(BigDecimal totalGiftWrapCharges) {
        this.totalGiftWrapCharges = totalGiftWrapCharges;
    }

    public BigDecimal getTotalStoreCredit() {
        return totalStoreCredit;
    }

    public void setTotalStoreCredit(BigDecimal totalStoreCredit) {
        this.totalStoreCredit = totalStoreCredit;
    }

    public BigDecimal getTotalPrepaidAmount() {
        return totalPrepaidAmount;
    }

    public void setTotalPrepaidAmount(BigDecimal totalPrepaidAmount) {
        this.totalPrepaidAmount = totalPrepaidAmount;
    }

    public boolean isUseVerifiedListings() {
        return useVerifiedListings;
    }

    public void setUseVerifiedListings(boolean useVerifiedListings) {
        this.useVerifiedListings = useVerifiedListings;
    }

    public String getCustomerGSTIN() {
        return customerGSTIN;
    }

    public void setCustomerGSTIN(String customerGSTIN) {
        this.customerGSTIN = customerGSTIN;
    }

    public enum PaymentInstrument {
        CASH,
        CREDIT_CARD,
        DEBIT_CARD,
        NET_BANKING,
        WALLET
    }
}
