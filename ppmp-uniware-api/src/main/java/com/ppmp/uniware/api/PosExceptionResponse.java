package com.ppmp.uniware.api;

/**
 * @author ankurpratik on 21/11/18.
 */
public class PosExceptionResponse {
    private String code;
    private String info;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
