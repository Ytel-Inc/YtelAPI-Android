/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body71 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 7131774507728090293L;
    private String phoneNumber;
    private String voiceUrl;
    private String friendlyName;
    private String voiceMethod;
    private String voiceFallbackUrl;
    private String voiceFallbackMethod;
    private String hangupCallback;
    private String hangupCallbackMethod;
    private String heartbeatUrl;
    private String heartbeatMethod;
    private String smsUrl;
    private String smsMethod;
    private String smsFallbackUrl;
    private String smsFallbackMethod;
    /** GETTER
     * A valid comma(,) separated Ytel numbers. (E.164 format).
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * A valid comma(,) separated Ytel numbers. (E.164 format).
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
        notifyObservers(this.phoneNumber);
    }
 
    /** GETTER
     * The URL returning InboundXML incoming calls should execute when connected.
     */
    @JsonGetter("VoiceUrl")
    public String getVoiceUrl ( ) { 
        return this.voiceUrl;
    }
    
    /** SETTER
     * The URL returning InboundXML incoming calls should execute when connected.
     */
    @JsonSetter("VoiceUrl")
    public void setVoiceUrl (String value) { 
        this.voiceUrl = value;
        notifyObservers(this.voiceUrl);
    }
 
    /** GETTER
     * A human-readable value for labeling the number.
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * A human-readable value for labeling the number.
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
        notifyObservers(this.friendlyName);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
     */
    @JsonGetter("VoiceMethod")
    public String getVoiceMethod ( ) { 
        return this.voiceMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
     */
    @JsonSetter("VoiceMethod")
    public void setVoiceMethod (String value) { 
        this.voiceMethod = value;
        notifyObservers(this.voiceMethod);
    }
 
    /** GETTER
     * URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
     */
    @JsonGetter("VoiceFallbackUrl")
    public String getVoiceFallbackUrl ( ) { 
        return this.voiceFallbackUrl;
    }
    
    /** SETTER
     * URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
     */
    @JsonSetter("VoiceFallbackUrl")
    public void setVoiceFallbackUrl (String value) { 
        this.voiceFallbackUrl = value;
        notifyObservers(this.voiceFallbackUrl);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
     */
    @JsonGetter("VoiceFallbackMethod")
    public String getVoiceFallbackMethod ( ) { 
        return this.voiceFallbackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
     */
    @JsonSetter("VoiceFallbackMethod")
    public void setVoiceFallbackMethod (String value) { 
        this.voiceFallbackMethod = value;
        notifyObservers(this.voiceFallbackMethod);
    }
 
    /** GETTER
     * URL that can be requested to receive notification when and how incoming call has ended.
     */
    @JsonGetter("HangupCallback")
    public String getHangupCallback ( ) { 
        return this.hangupCallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when and how incoming call has ended.
     */
    @JsonSetter("HangupCallback")
    public void setHangupCallback (String value) { 
        this.hangupCallback = value;
        notifyObservers(this.hangupCallback);
    }
 
    /** GETTER
     * The HTTP method Ytel will use when requesting the HangupCallback URL.
     */
    @JsonGetter("HangupCallbackMethod")
    public String getHangupCallbackMethod ( ) { 
        return this.hangupCallbackMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when requesting the HangupCallback URL.
     */
    @JsonSetter("HangupCallbackMethod")
    public void setHangupCallbackMethod (String value) { 
        this.hangupCallbackMethod = value;
        notifyObservers(this.hangupCallbackMethod);
    }
 
    /** GETTER
     * URL that can be used to monitor the phone number.
     */
    @JsonGetter("HeartbeatUrl")
    public String getHeartbeatUrl ( ) { 
        return this.heartbeatUrl;
    }
    
    /** SETTER
     * URL that can be used to monitor the phone number.
     */
    @JsonSetter("HeartbeatUrl")
    public void setHeartbeatUrl (String value) { 
        this.heartbeatUrl = value;
        notifyObservers(this.heartbeatUrl);
    }
 
    /** GETTER
     * The HTTP method Ytel will use when requesting the HeartbeatUrl.
     */
    @JsonGetter("HeartbeatMethod")
    public String getHeartbeatMethod ( ) { 
        return this.heartbeatMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when requesting the HeartbeatUrl.
     */
    @JsonSetter("HeartbeatMethod")
    public void setHeartbeatMethod (String value) { 
        this.heartbeatMethod = value;
        notifyObservers(this.heartbeatMethod);
    }
 
    /** GETTER
     * URL requested when an SMS is received.
     */
    @JsonGetter("SmsUrl")
    public String getSmsUrl ( ) { 
        return this.smsUrl;
    }
    
    /** SETTER
     * URL requested when an SMS is received.
     */
    @JsonSetter("SmsUrl")
    public void setSmsUrl (String value) { 
        this.smsUrl = value;
        notifyObservers(this.smsUrl);
    }
 
    /** GETTER
     * The HTTP method Ytel will use when requesting the SmsUrl.
     */
    @JsonGetter("SmsMethod")
    public String getSmsMethod ( ) { 
        return this.smsMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when requesting the SmsUrl.
     */
    @JsonSetter("SmsMethod")
    public void setSmsMethod (String value) { 
        this.smsMethod = value;
        notifyObservers(this.smsMethod);
    }
 
    /** GETTER
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    @JsonGetter("SmsFallbackUrl")
    public String getSmsFallbackUrl ( ) { 
        return this.smsFallbackUrl;
    }
    
    /** SETTER
     * URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
     */
    @JsonSetter("SmsFallbackUrl")
    public void setSmsFallbackUrl (String value) { 
        this.smsFallbackUrl = value;
        notifyObservers(this.smsFallbackUrl);
    }
 
    /** GETTER
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    @JsonGetter("SmsFallbackMethod")
    public String getSmsFallbackMethod ( ) { 
        return this.smsFallbackMethod;
    }
    
    /** SETTER
     * The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
     */
    @JsonSetter("SmsFallbackMethod")
    public void setSmsFallbackMethod (String value) { 
        this.smsFallbackMethod = value;
        notifyObservers(this.smsFallbackMethod);
    }
 
}
