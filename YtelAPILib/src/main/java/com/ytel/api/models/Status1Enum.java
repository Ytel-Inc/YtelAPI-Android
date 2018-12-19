/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Status1Enum {
    CANCELED, //TODO: Write general description for this element
    COMPLETED; //TODO: Write general description for this element

    private static TreeMap<String, Status1Enum> valueMap = new TreeMap<String, Status1Enum>();
    private String value;

    static {
        CANCELED.value = "canceled";
        COMPLETED.value = "completed";

        valueMap.put("canceled", CANCELED);
        valueMap.put("completed", COMPLETED);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status1Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Status1Enum values to list of string values
     * @param toConvert The list of Status1Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Status1Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Status1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 