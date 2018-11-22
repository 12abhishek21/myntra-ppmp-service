package com.ppmp.uniware.model;

import java.util.Date;
import java.util.List;

/**
 * @author ankurpratik on 21/11/18.
 */
public class CustomFieldMetadataDTO {

    private String       fieldName;
    private Object       fieldValue;
    private String       valueType;
    private String       displayName;
    private boolean      required;
    private List<String> possibleValues;

    /**
     * @param fieldName
     * @param fieldValue
     * @param valueType
     * @param displayName
     */
    public CustomFieldMetadataDTO(String fieldName, Object fieldValue, String valueType, String displayName, boolean required, List<String> possibleValues) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.valueType = valueType;
        this.displayName = displayName;
        this.required = required;
        this.possibleValues = possibleValues;
    }

    /**
     * @return the fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName the fieldName to set
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * @return the fieldValue
     */
    public Object getFieldValue() {
        return fieldValue;
    }

    /**
     * @param fieldValue the fieldValue to set
     */
    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * @return the valueType
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * @param valueType the valueType to set
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the required
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * @return the possibleValues
     */
    public List<String> getPossibleValues() {
        return possibleValues;
    }

    /**
     * @param possibleValues the possibleValues to set
     */
    public void setPossibleValues(List<String> possibleValues) {
        this.possibleValues = possibleValues;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CustomFieldMetadataDTO [fieldName=" + fieldName + ", fieldValue=" + fieldValue + ", valueType=" + valueType + ", displayName=" + displayName + ", required="
                + required + ", possibleValues=" + possibleValues + "]";
    }

    public static String serializeToString(Object value) {
        if (value != null) {
            if (value instanceof Date) {
                return String.valueOf(((Date) value).getTime());
            }
            return value.toString();
        }
        return null;
    }

    public static Object deserializeToObject(String value) {
        return value;
    }
}
