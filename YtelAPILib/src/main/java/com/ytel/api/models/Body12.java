/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body12 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -79897747117468460L;
    private String recordingsid;
    /** GETTER
     * The unique identifier for the recording.
     */
    @JsonGetter("recordingsid")
    public String getRecordingsid ( ) { 
        return this.recordingsid;
    }
    
    /** SETTER
     * The unique identifier for the recording.
     */
    @JsonSetter("recordingsid")
    public void setRecordingsid (String value) { 
        this.recordingsid = value;
        notifyObservers(this.recordingsid);
    }
 
}
