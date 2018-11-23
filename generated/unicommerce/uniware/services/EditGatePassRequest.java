
package com.unicommerce.uniware.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WsGatePass" type="{http://uniware.unicommerce.com/services/}WsGatePass"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "wsGatePass"
})
@XmlRootElement(name = "EditGatePassRequest")
public class EditGatePassRequest {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "WsGatePass", required = true)
    protected WsGatePass wsGatePass;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the wsGatePass property.
     * 
     * @return
     *     possible object is
     *     {@link WsGatePass }
     *     
     */
    public WsGatePass getWsGatePass() {
        return wsGatePass;
    }

    /**
     * Sets the value of the wsGatePass property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGatePass }
     *     
     */
    public void setWsGatePass(WsGatePass value) {
        this.wsGatePass = value;
    }

}
