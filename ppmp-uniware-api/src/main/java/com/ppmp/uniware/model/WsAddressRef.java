package com.ppmp.uniware.model;

import javax.validation.constraints.NotBlank;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsAddressRef {
    @NotBlank
    private String referenceId;

    /**
     *
     */
    public WsAddressRef() {
    }

    public WsAddressRef(String referenceId) {
        this.referenceId = referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceId() {
        return referenceId;
    }
}
