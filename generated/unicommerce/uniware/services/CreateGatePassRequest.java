
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
 *         &lt;element name="WsGatePass" type="{http://uniware.unicommerce.com/services/}WsGatePass"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PartyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "wsGatePass",
    "type",
    "partyCode"
})
@XmlRootElement(name = "CreateGatePassRequest")
public class CreateGatePassRequest {

    @XmlElement(name = "WsGatePass", required = true)
    protected WsGatePass wsGatePass;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "PartyCode", required = true)
    protected String partyCode;

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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the partyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCode() {
        return partyCode;
    }

    /**
     * Sets the value of the partyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCode(String value) {
        this.partyCode = value;
    }

}