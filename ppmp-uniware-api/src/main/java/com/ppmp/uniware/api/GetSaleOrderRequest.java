package com.ppmp.uniware.api;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import com.ppmp.uniware.base.ServiceRequest;

/**
 * @author ankurpratik on 21/11/18.
 */
@XmlRootElement
public class GetSaleOrderRequest extends ServiceRequest {

    @NotNull
    private String       code;

    private List<String> facilityCodes;

    @XmlElement(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement
    public List<String> getFacilityCodes() {
        return facilityCodes;
    }

    public void setFacilityCodes(List<String> facilityCodes) {
        this.facilityCodes = facilityCodes;
    }
}
