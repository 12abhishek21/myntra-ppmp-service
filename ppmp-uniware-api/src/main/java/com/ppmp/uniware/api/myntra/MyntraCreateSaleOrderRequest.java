package com.ppmp.uniware.api.myntra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ppmp.uniware.base.ServiceRequest;

/**
 * @author ankurpratik on 20/11/18.
 */
public class MyntraCreateSaleOrderRequest extends ServiceRequest {

    private String               id;
    private String               _id;
    private Date                 createdBy;
    private Date                 createdOn;
    private Date                 lastModifiedOn;
    private List<OrderLineEntry> orderLineEntries = new ArrayList<>();
    private Double               shippingCharge;
    private Double               giftCharge;
    private Double               amountDue;
    private String               receiverName;
    private String               address;
    private String               city;
    private String               locality;
    private String               state;
    private String               zipcode;
    private String               country;
    private String               mobile;
    private String               warehouse;
    private String               cancellationReason;
    private Boolean              onHold;
    private Date                 orderDate;                           // "yyyy-MM-dd HH:mm:ss
    private String               shippingMethod;                      //Normal, SameDayDelivery or NextDayDelivery.(string,100)
    private Date                 expectedDeliveryTime;                //yyyy-MM-dd HH:mm:ss
    private Date                 processingStartTime;
    private Date                 processingCutoffTime;
    private String               courierCode;
    private String               paymentMethod;                       //on for online and cod for cod.(string,10)
    private String               senderName;
    private String               senderEmail;
    private String               receiverEmail;
    private String               sellerId;
    private String               giftMessage;
    private String               trackingNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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

    public List<OrderLineEntry> getOrderLineEntries() {
        return orderLineEntries;
    }

    public void setOrderLineEntries(List<OrderLineEntry> orderLineEntries) {
        this.orderLineEntries = orderLineEntries;
    }

    public Double getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(Double shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public Double getGiftCharge() {
        return giftCharge;
    }

    public void setGiftCharge(Double giftCharge) {
        this.giftCharge = giftCharge;
    }

    public Double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Boolean getOnHold() {
        return onHold;
    }

    public void setOnHold(Boolean onHold) {
        this.onHold = onHold;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Date getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    public Date getProcessingStartTime() {
        return processingStartTime;
    }

    public void setProcessingStartTime(Date processingStartTime) {
        this.processingStartTime = processingStartTime;
    }

    public Date getProcessingCutoffTime() {
        return processingCutoffTime;
    }

    public void setProcessingCutoffTime(Date processingCutoffTime) {
        this.processingCutoffTime = processingCutoffTime;
    }

    public String getCourierCode() {
        return courierCode;
    }

    public void setCourierCode(String courierCode) {
        this.courierCode = courierCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
