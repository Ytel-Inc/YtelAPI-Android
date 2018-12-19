/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body9 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 115986686214451181L;
    private String transcriptionsid;
    /** GETTER
     * The unique identifier for a transcription object.
     */
    @JsonGetter("transcriptionsid")
    public String getTranscriptionsid ( ) { 
        return this.transcriptionsid;
    }
    
    /** SETTER
     * The unique identifier for a transcription object.
     */
    @JsonSetter("transcriptionsid")
    public void setTranscriptionsid (String value) { 
        this.transcriptionsid = value;
        notifyObservers(this.transcriptionsid);
    }
 
}