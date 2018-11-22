package com.ppmp.uniware.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ankurpratik on 21/11/18.
 */
public class SaleOrderDetailDTO {
    public SaleOrderDetailDTO() {
    }

    private boolean                      cod;
    private int                          priority;
    private String                       currencyCode;
    private String                       customerCode;
    private WsAddressDetail              billingAddress;
    private List<WsAddressDetail>        addresses        = new ArrayList<WsAddressDetail>();
    private List<ShippingPackageDTO>     shippingPackages = new ArrayList<ShippingPackageDTO>();
    private List<SaleOrderItemDTO>       saleOrderItems   = new ArrayList<SaleOrderItemDTO>();
    private List<CustomFieldMetadataDTO> customFieldValues;

    private boolean                      cancellable;
    private boolean                      reversePickable;
    private boolean                      packetConfigurable;
    private boolean                      cFormProvided;
    private BigDecimal                   totalDiscount;
    private BigDecimal                   totalShippingCharges;
    private String                       additionalInfo;

    /**
     * @return the cod
     */
    public boolean isCod() {
        return cod;
    }

    /**
     * @return the billingAddress
     */
    public WsAddressDetail getBillingAddress() {
        return billingAddress;
    }

    /**
     * @param billingAddress the billingAddress to set
     */
    public void setBillingAddress(WsAddressDetail billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void addShippingPackage(ShippingPackageDTO shippingPackage) {
        shippingPackages.add(shippingPackage);
    }

    /**
     * @return the shippingPackages
     */
    public List<ShippingPackageDTO> getShippingPackages() {
        return shippingPackages;
    }

    /**
     * @param shippingPackages the shippingPackages to set
     */
    public void setShippingPackages(List<ShippingPackageDTO> shippingPackages) {
        this.shippingPackages = shippingPackages;
    }

    /**
     * @return the cancellable
     */
    public boolean isCancellable() {
        return cancellable;
    }

    /**
     * @param cancellable the cancellable to set
     */
    public void setCancellable(boolean cancellable) {
        this.cancellable = cancellable;
    }

    /**
     * @return the reversePickable
     */
    public boolean isReversePickable() {
        return reversePickable;
    }

    /**
     * @param reversePickable the reversePickable to set
     */
    public void setReversePickable(boolean reversePickable) {
        this.reversePickable = reversePickable;
    }

    /**
     * @return the saleOrderItems
     */
    public List<SaleOrderItemDTO> getSaleOrderItems() {
        return saleOrderItems;
    }

    /**
     * @param saleOrderItems the saleOrderItems to set
     */
    public void setSaleOrderItems(List<SaleOrderItemDTO> saleOrderItems) {
        this.saleOrderItems = saleOrderItems;
    }

    /**
     * @return the packetConfigurable
     */
    public boolean isPacketConfigurable() {
        return packetConfigurable;
    }

    /**
     * @param packetConfigurable the packetConfigurable to set
     */
    public void setPacketConfigurable(boolean packetConfigurable) {
        this.packetConfigurable = packetConfigurable;
    }

    /**
     * @return the addresses
     */
    public List<WsAddressDetail> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(List<WsAddressDetail> addresses) {
        this.addresses = addresses;
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
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(boolean cod) {
        this.cod = cod;
    }

    /**
     * @return the cFormProvided
     */
    public boolean iscFormProvided() {
        return cFormProvided;
    }

    /**
     * @param cFormProvided the cFormProvided to set
     */
    public void setcFormProvided(boolean cFormProvided) {
        this.cFormProvided = cFormProvided;
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

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
