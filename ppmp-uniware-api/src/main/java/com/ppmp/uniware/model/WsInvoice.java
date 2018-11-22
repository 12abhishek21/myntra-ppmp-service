package com.ppmp.uniware.model;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsInvoice {
    private String              code;

    private String              displayCode;

    private Date channelCreated;

    private String              channelCode;

    private String              fromPartyCode;

    private String              toPartyCode;

    private Source              source;

    private String              destinationStateCode;

    private String              destinationCountryCode;

    private Type        type                         = Type.SALE;

    private Integer             userId;

    private Boolean             productManagementSwitchedOff = false;

    private Boolean             taxExempted                  = false;

    private Boolean             cformProvided                = false;

    private String              url;

    @Valid
    private List<WsInvoiceItem> invoiceItems                 = new ArrayList<>();

    public List<WsInvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<WsInvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getCode() {
        return code;
    }

    public String getDisplayCode() {
        return displayCode;
    }

    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFromPartyCode() {
        return fromPartyCode;
    }

    public void setFromPartyCode(String fromPartyCode) {
        this.fromPartyCode = fromPartyCode;
    }

    public String getToPartyCode() {
        return toPartyCode;
    }

    public void setToPartyCode(String toPartyCode) {
        this.toPartyCode = toPartyCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getCformProvided() {
        return cformProvided;
    }

    public void setCformProvided(Boolean cformProvided) {
        this.cformProvided = cformProvided;
    }

    public String getDestinationStateCode() {
        return destinationStateCode;
    }

    public void setDestinationStateCode(String destinationStateCode) {
        this.destinationStateCode = destinationStateCode;
    }

    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getProductManagementSwitchedOff() {
        return productManagementSwitchedOff;
    }

    public void setProductManagementSwitchedOff(Boolean productManagementSwitchedOff) {
        this.productManagementSwitchedOff = productManagementSwitchedOff;
    }

    public Boolean getTaxExempted() {
        return taxExempted;
    }

    public void setTaxExempted(Boolean taxExempted) {
        this.taxExempted = taxExempted;
    }

    public Date getChannelCreated() {
        return channelCreated;
    }

    public void setChannelCreated(Date channelCreated) {
        this.channelCreated = channelCreated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public enum Source {
        SHIPPING_PACKAGE,
        PURCHASE_ORDER,
        GATEPASS
    }

    public enum Type {
        SALE,
        PURCHASE,
        GATEPASS,
        SALE_RETURN,
        PURCHASE_RETURN,
        GATEPASS_RETURN,
        DELIVERY_CHALLAN;

        public boolean isReturn(){
            return this.equals(SALE_RETURN) || this.equals(PURCHASE_RETURN) || this.equals(GATEPASS_RETURN);
        }
    }
}
