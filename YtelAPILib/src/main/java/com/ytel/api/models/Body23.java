/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body23 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -587097642085903366L;
    private String callSid;
    private boolean record;
    private DirectionEnum direction;
    private Integer timeLimit;
    private String callBackUrl;
    private FileformatEnum fileformat;
    /** GETTER
     * The unique identifier of each call resource
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * The unique identifier of each call resource
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
        notifyObservers(this.callSid);
    }
 
    /** GETTER
     * Set true to initiate recording or false to terminate recording
     */
    @JsonGetter("Record")
    public boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * Set true to initiate recording or false to terminate recording
     */
    @JsonSetter("Record")
    public void setRecord (boolean value) { 
        this.record = value;
        notifyObservers(this.record);
    }
 
    /** GETTER
     * The leg of the call to record
     */
    @JsonGetter("Direction")
    public DirectionEnum getDirection ( ) { 
        return this.direction;
    }
    
    /** SETTER
     * The leg of the call to record
     */
    @JsonSetter("Direction")
    public void setDirection (DirectionEnum value) { 
        this.direction = value;
        notifyObservers(this.direction);
    }
 
    /** GETTER
     * Time in seconds the recording duration should not exceed
     */
    @JsonGetter("TimeLimit")
    public Integer getTimeLimit ( ) { 
        return this.timeLimit;
    }
    
    /** SETTER
     * Time in seconds the recording duration should not exceed
     */
    @JsonSetter("TimeLimit")
    public void setTimeLimit (Integer value) { 
        this.timeLimit = value;
        notifyObservers(this.timeLimit);
    }
 
    /** GETTER
     * URL consulted after the recording completes
     */
    @JsonGetter("CallBackUrl")
    public String getCallBackUrl ( ) { 
        return this.callBackUrl;
    }
    
    /** SETTER
     * URL consulted after the recording completes
     */
    @JsonSetter("CallBackUrl")
    public void setCallBackUrl (String value) { 
        this.callBackUrl = value;
        notifyObservers(this.callBackUrl);
    }
 
    /** GETTER
     * Format of the recording file. Can be .mp3 or .wav
     */
    @JsonGetter("Fileformat")
    public FileformatEnum getFileformat ( ) { 
        return this.fileformat;
    }
    
    /** SETTER
     * Format of the recording file. Can be .mp3 or .wav
     */
    @JsonSetter("Fileformat")
    public void setFileformat (FileformatEnum value) { 
        this.fileformat = value;
        notifyObservers(this.fileformat);
    }
 
}
