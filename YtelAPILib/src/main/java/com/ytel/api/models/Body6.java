/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body6 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -3308252629149223742L;
    private String conferenceSid;
    private String participantSid;
    private Boolean muted;
    private Boolean deaf;
    /** GETTER
     * ID of the active conference
     */
    @JsonGetter("conferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * ID of the active conference
     */
    @JsonSetter("conferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
        notifyObservers(this.conferenceSid);
    }
 
    /** GETTER
     * ID of an active participant
     */
    @JsonGetter("ParticipantSid")
    public String getParticipantSid ( ) { 
        return this.participantSid;
    }
    
    /** SETTER
     * ID of an active participant
     */
    @JsonSetter("ParticipantSid")
    public void setParticipantSid (String value) { 
        this.participantSid = value;
        notifyObservers(this.participantSid);
    }
 
    /** GETTER
     * Mute a participant
     */
    @JsonGetter("Muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * Mute a participant
     */
    @JsonSetter("Muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
        notifyObservers(this.muted);
    }
 
    /** GETTER
     * Make it so a participant cant hear
     */
    @JsonGetter("Deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * Make it so a participant cant hear
     */
    @JsonSetter("Deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
        notifyObservers(this.deaf);
    }
 
}
