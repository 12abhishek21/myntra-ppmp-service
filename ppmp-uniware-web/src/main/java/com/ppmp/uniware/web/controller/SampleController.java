package com.ppmp.uniware.web.controller;

import com.ppmp.uniware.PosClientException;
import com.ppmp.uniware.UniwareClient;
import com.ppmp.uniware.api.GetSaleOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ankurpratik on 20/11/18.
 */
@RestController
public class SampleController {
    @Autowired
    public UniwareClient uniwareClient;

    @RequestMapping(value = "/")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/auth")
    public String getAuth(){
        String output;
        GetSaleOrderRequest getSaleOrderRequest = new GetSaleOrderRequest();
        getSaleOrderRequest.setCode("Ankur");
        try {
            output =  uniwareClient.getXmlResponse(getSaleOrderRequest).toString();
        }
        catch (PosClientException e) {
            output = e.getMessage();
        }
        System.out.println("output "+output);
        return output;
    }
}
