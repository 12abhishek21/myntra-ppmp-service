package com.ppmp.uniware.mapper;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

/**
 * @author ankurpratik on 22/11/18.
 */
public class MyNamespaceMapper extends NamespacePrefixMapper {
    private static final String FOO_URI = "http://www.example.com/FOO";

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if(namespaceUri.equals(FOO_URI)){
            return "ser";
        }
        return "ser";
    }
}
