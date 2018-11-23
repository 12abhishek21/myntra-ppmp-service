package com.ppmp.uniware.web.controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import com.ppmp.uniware.UniwareClient;
import com.ppmp.uniware.model.GetSaleOrderRequest;
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
        String output = "";
        GetSaleOrderRequest getSaleOrderRequest = new GetSaleOrderRequest();
        getSaleOrderRequest.setSaleOrder(new GetSaleOrderRequest.SaleOrder());
        getSaleOrderRequest.getSaleOrder().setCode("ML/18-19/07/PO63687");

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(GetSaleOrderRequest.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(getSaleOrderRequest,writer);
            output = writer.toString();
            output = output.replaceFirst("<\\?xml version=\"1\\.0\" encoding=\"UTF-8\" standalone=\"yes\"\\?>", "").replaceFirst(" xmlns:ser=\"http://uniware.unicommerce.com/services/\"", "");
            output = wrapInSoapHeader(output);
            System.out.println(output);
            try {
                uniwareClient.invokeSoapRequest(output);
            } catch (IOException e) {
                e.printStackTrace();
                output = e.getMessage();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            output = e.getMessage();
        }
        return output;
    }

    private String wrapInSoapHeader(String requestXml) {
        return "<soapenv:Envelope xmlns:ser=\"http://uniware.unicommerce.com/services/\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "   <soapenv:Header>\n" +
                "      <wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
                "         <wsse:UsernameToken wsu:Id=\"UsernameToken-D4E4174B178A98447E15403622373201\">\n" +
                "            <wsse:Username>SYSTEM</wsse:Username>\n" +
                "            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">unicom123</wsse:Password>\n" +
                "            <wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">pNSE/cyKh+bQYIf/Cwnwvw==</wsse:Nonce>\n" +
                "            <wsu:Created>2018-10-24T06:23:52.316Z</wsu:Created>\n" +
                "         </wsse:UsernameToken>\n" +
                "      </wsse:Security>\n" +
                "   </soapenv:Header>\n" +
                "   <soapenv:Body>\n"+ requestXml +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}
