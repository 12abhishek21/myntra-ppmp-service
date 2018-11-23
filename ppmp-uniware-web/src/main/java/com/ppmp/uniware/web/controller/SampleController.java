package com.ppmp.uniware.web.controller;

import com.ppmp.uniware.PosClientException;
import com.ppmp.uniware.UniwareClient;
import com.ppmp.uniware.api.GetSaleOrderRequest;
import com.ppmp.uniware.web.CodeClass;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ankurpratik on 20/11/18.
 */
@RestController
public class SampleController {
    @Autowired
    public UniwareClient uniwareClient;

    @Autowired
    FreeMarkerConfigurer freeMarkerConfigurer;






    public String templateToString(String templateName, Map<String, Object> templateInput) {
        if (templateName == null || templateName.isEmpty()) {
            return "No email template available.";
        }
        StringWriter result = new StringWriter();
        try {

            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(templateName);
            template.process(templateInput,result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  result.toString();
    }
    public String templateToString(String templateName, Object object) {
        if (templateName == null || templateName.isEmpty()) {
            return "No email template available.";
        }
        StringWriter result = new StringWriter();
        try {

            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(templateName);
            template.process(object,result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  result.toString();
    }
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
            Map<String, Object> map = new HashMap<>();

            CodeClass value = new CodeClass();
            value.setCode("&gt;ML/18-19/08/PO74421");
            map.put("code",value);

            //map.put("code", "&gt;ML/18-19/08/PO74421");

            System.out.print(templateToString("test.ftl",value));

            try {
                saop(templateToString("test.ftl",value));
            } catch (IOException e) {
                e.printStackTrace();
            }
            output =  uniwareClient.getXmlResponse(getSaleOrderRequest).toString();
        }
        catch (PosClientException e) {
            output = e.getMessage();
        }
        System.out.println("output "+output);
        return output;
    }


    void saop(String xmlInput)throws MalformedURLException,
            IOException{
        String responseString = "";
        String outputString = "";
        String wsURL = "https://brandstudio.unicommerce.com/services/soap/?version=1.8";
        URL url = new URL(wsURL);
        URLConnection connection = url.openConnection();
        HttpURLConnection httpConn = (HttpURLConnection)connection;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();


        byte[] buffer = new byte[xmlInput.length()];
        buffer = xmlInput.getBytes();
        bout.write(buffer);
        byte[] b = bout.toByteArray();
        String SOAPAction =
                "http://litwinconsulting.com/webservices/GetWeather";
        // Set the appropriate HTTP parameters.
        httpConn.setRequestProperty("Content-Length",
                String.valueOf(b.length));
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        httpConn.setRequestProperty("SOAPAction", SOAPAction);
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        OutputStream out = httpConn.getOutputStream();
        //Write the content of the request to the outputstream of the HTTP Connection.
        out.write(b);
        out.close();

        //Read the response.
        InputStreamReader isr =
                new InputStreamReader(httpConn.getInputStream());
        BufferedReader in = new BufferedReader(isr);

        //Write the SOAP message response to a String.
        while ((responseString = in.readLine()) != null) {
            outputString = outputString + responseString;
        }
        System.out.println("******************start****************");

        System.out.println(outputString);

        System.out.println("******************end****************");
    }
}
