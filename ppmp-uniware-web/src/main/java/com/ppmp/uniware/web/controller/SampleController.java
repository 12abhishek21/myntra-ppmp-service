package com.ppmp.uniware.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppmp.uniware.PosClientException;
import com.ppmp.uniware.UniwareClient;
import com.ppmp.uniware.mapper.MyNamespaceMapper;
import com.ppmp.uniware.model.GetSaleOrderRequest;

/**
 * @author ankurpratik on 20/11/18.
 */
@RestController
public class SampleController {
    @Autowired
    public UniwareClient uniwareClient;

    @Autowired
    public MyNamespaceMapper mapper;

    @RequestMapping(value = "/")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/auth")
    public String getAuth(){
        String output;
        GetSaleOrderRequest getSaleOrderRequest = new GetSaleOrderRequest();
        getSaleOrderRequest.setSaleOrder(new GetSaleOrderRequest.SaleOrder());
        getSaleOrderRequest.getSaleOrder().setCode("Ankur");
        try {
            output =  uniwareClient.getXmlResponse(getSaleOrderRequest).toString();
        }
        catch (PosClientException e) {
            output = e.getMessage();
        }
        System.out.println("output "+output);
        return output;
    }

    private String wrapInSoapHeader(String requestXml) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<soapenv:Header>"
                + "<wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">"
                + "<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">"
                + "<wsse:Username>" + "SYSTEM" + "</wsse:Username>"
                + "<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">"
                + "unicom123" + "</wsse:Password></wsse:UsernameToken></wsse:Security></soapenv:Header><soapenv:Body>" + requestXml
                + "</soapenv:Body></soapenv:Envelope>";
    }
}
