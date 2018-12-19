/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body10 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 116084264190730278L;
    private String recordingSid;
    /** GETTER
     * The unique identifier for a recording object.
     */
    @JsonGetter("recordingSid")
    public String getRecordingSid ( ) { 
        return this.recordingSid;
    }
    
    /** SETTER
     * The unique identifier for a recording object.
     */
    @JsonSetter("recordingSid")
    public void setRecordingSid (String value) { 
        this.recordingSid = value;
        notifyObservers(this.recordingSid);
    }
 
}
