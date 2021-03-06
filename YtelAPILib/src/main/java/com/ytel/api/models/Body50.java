/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body50 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 556387865238747047L;
    private Integer page;
    private Integer pagesize;
    private StatusEnum status;
    private String dateTranscribed;
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * The count of objects to return per page.
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * The state of the transcription.
     */
    @JsonGetter("status")
    public StatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The state of the transcription.
     */
    @JsonSetter("status")
    public void setStatus (StatusEnum value) { 
        this.status = value;
        notifyObservers(this.status);
    }
 
    /** GETTER
     * The date the transcription took place.
     */
    @JsonGetter("dateTranscribed")
    public String getDateTranscribed ( ) { 
        return this.dateTranscribed;
    }
    
    /** SETTER
     * The date the transcription took place.
     */
    @JsonSetter("dateTranscribed")
    public void setDateTranscribed (String value) { 
        this.dateTranscribed = value;
        notifyObservers(this.dateTranscribed);
    }
 
}
