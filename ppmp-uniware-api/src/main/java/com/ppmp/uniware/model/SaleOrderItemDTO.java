package com.ppmp.uniware.model;

import java.util.List;

/**
 * @author ankurpratik on 21/11/18.
 */
public class SaleOrderItemDTO {
    private int                          saleOrderItemId;
    private String                       code;
    private String                       itemSku;
    private String                       itemName;
    private String                       itemTypeImageUrl;
    private String                       itemTypePageUrl;
    private String                       shelfCode;
    private boolean                      onHold;
    private String                       saleOrderItemCode;
    private String                       statusCode;
    private String                       itemCode;
    private boolean                      requiresCustomization;
    private boolean                      giftWrap;
    private String                       giftMessage;
    private List<CustomFieldMetadataDTO> customFieldValues;

    /**
     *
     */
    public SaleOrderItemDTO() {
    }

    /**
     * @return the saleOrderItemId
     */
    public int getSaleOrderItemId() {
        return saleOrderItemId;
    }

    /**
     * @param saleOrderItemId the saleOrderItemId to set
     */
    public void setSaleOrderItemId(int saleOrderItemId) {
        this.saleOrderItemId = saleOrderItemId;
    }

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

    public String getItemTypeImageUrl() {
        return itemTypeImageUrl;
    }

    public void setItemTypeImageUrl(String itemTypeImageUrl) {
        this.itemTypeImageUrl = itemTypeImageUrl;
    }

    public String getItemTypePageUrl() {
        return itemTypePageUrl;
    }

    public void setItemTypePageUrl(String itemTypePageUrl) {
        this.itemTypePageUrl = itemTypePageUrl;
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
     * @return the shelfCode
     */
    public String getShelfCode() {
        return shelfCode;
    }

    /**
     * @param shelfCode the shelfCode to set
     */
    public void setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode;
    }

    /**
     * @return the statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return the saleOrderItemCode
     */
    public String getSaleOrderItemCode() {
        return saleOrderItemCode;
    }

    /**
     * @param saleOrderItemCode the saleOrderItemCode to set
     */
    public void setSaleOrderItemCode(String saleOrderItemCode) {
        this.saleOrderItemCode = saleOrderItemCode;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the onHold
     */
    public boolean isOnHold() {
        return onHold;
    }

    /**
     * @param onHold the onHold to set
     */
    public void setOnHold(boolean onHold) {
        this.onHold = onHold;
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

    public boolean isRequiresCustomization() {
        return requiresCustomization;
    }

    public void setRequiresCustomization(boolean requiresCustomization) {
        this.requiresCustomization = requiresCustomization;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public void setGiftWrap(boolean giftWrap) {
        this.giftWrap = giftWrap;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public List<CustomFieldMetadataDTO> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<CustomFieldMetadataDTO> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }
}
