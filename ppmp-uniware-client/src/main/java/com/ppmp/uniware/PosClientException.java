package com.ppmp.uniware;

import org.springframework.web.context.request.WebRequest;

import com.ppmp.uniware.api.PosExceptionResponse;

/**
 * @author ankurpratik on 21/11/18.
 */
public class PosClientException extends Exception {
    private Integer httpStatusCode;
    private String serviceMessage;
    private Object serviceResponse;

    public PosClientException() {
    }

    public PosClientException(Integer httpStatusCode, String serviceMessage) {
        this.httpStatusCode = httpStatusCode;
        this.serviceMessage = serviceMessage;
    }

    public PosClientException(Integer httpStatusCode, String serviceMessage, Object serviceResponse) {
        this.httpStatusCode = httpStatusCode;
        this.serviceMessage = serviceMessage;
        this.serviceResponse = serviceResponse;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getServiceMessage() {
        return serviceMessage;
    }

    public void setServiceMessage(String serviceMessage) {
        this.serviceMessage = serviceMessage;
    }

    public Object getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(Object serviceResponse) {
        this.serviceResponse = serviceResponse;
    }

    public PosExceptionResponse prepareExceptionResponse(WebRequest request){
        PosExceptionResponse response = new PosExceptionResponse();
        response.setInfo(request.getDescription(false));
        response.setMessage(this.getServiceMessage());
        return response;
    }
}
