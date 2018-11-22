/*
 *  Copyright 2011 Unicommerce eSolutions (P) Limited All Rights Reserved.
 *  UNICOMMERCE ESOLUTIONS PROPRIETARYARY/CONFIDENTIAL. Use is subject to license terms.
 *  
 *  @version     1.0, Dec 16, 2011
 *  @author singla
 */
package com.ppmp.uniware.base;

/**
 * @author singla
 */
public class WsWarning {
    private int    code;
    private String message;
    private String description;

    public WsWarning() {

    }

    /**
     * @param code
     * @param message
     */
    public WsWarning(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @param code
     * @param message
     * @param description
     */
    public WsWarning(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.setDescription(description);
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}
