package com.ppmp.uniware.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ankurpratik on 21/11/18.
 */
public class ItemDetail {

    private String name;

    private String value;

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

    public static Map<String, String> getItemDetailsMap(List<ItemDetail> itemDetails) {
        Map<String, String> itemDetailsMap = new HashMap<String, String>(itemDetails.size());
        for (ItemDetail itemDetail : itemDetails) {
            itemDetailsMap.put(itemDetail.getName(), itemDetail.getValue());
        }
        return itemDetailsMap;
    }
}
