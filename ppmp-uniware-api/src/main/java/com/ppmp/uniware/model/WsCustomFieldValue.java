package com.ppmp.uniware.model;

import javax.validation.constraints.NotBlank;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsCustomFieldValue {
    @NotBlank
    private String name;

    private String value;

    public WsCustomFieldValue() {

    }

    public WsCustomFieldValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
