/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body27 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -3212133928423559833L;
    private String callSid;
    private String playDtmf;
    private PlayDtmfDirectionEnum playDtmfDirection;
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
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
        notifyObservers(this.playDtmf);
    }
 
    /** GETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonGetter("PlayDtmfDirection")
    public PlayDtmfDirectionEnum getPlayDtmfDirection ( ) { 
        return this.playDtmfDirection;
    }
    
    /** SETTER
     * The leg of the call DTMF digits should be sent to
     */
    @JsonSetter("PlayDtmfDirection")
    public void setPlayDtmfDirection (PlayDtmfDirectionEnum value) { 
        this.playDtmfDirection = value;
        notifyObservers(this.playDtmfDirection);
    }
 
}
