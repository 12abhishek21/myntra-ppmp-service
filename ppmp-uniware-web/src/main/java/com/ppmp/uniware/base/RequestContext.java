package com.ppmp.uniware.base;

/**
 * @author ankurpratik on 21/11/18.
 */
public class RequestContext {
    private static ThreadLocal<RequestContext> ctx = new ThreadLocal<RequestContext>();

    private String                             merchantId;
    private String                             facilityCode;
    private String                             username;
    private String                             channelCode;
    private String                             authToken;

    public RequestContext() {
    }

    public RequestContext(RequestContext context) {
        this.merchantId = context.getMerchantId();
        this.facilityCode = context.getFacilityCode();
        this.username = context.getUsername();
        this.channelCode = context.getChannelCode();
        this.authToken = context.getAuthToken();
    }

    public static RequestContext current() {
        RequestContext requestContext = ctx.get();
        if (requestContext == null) {
            requestContext = new RequestContext();
            ctx.set(requestContext);
        }
        return requestContext;
    }

    public static ThreadLocal<RequestContext> getCtx() {
        return ctx;
    }

    public static void setCtx(ThreadLocal<RequestContext> ctx) {
        RequestContext.ctx = ctx;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
