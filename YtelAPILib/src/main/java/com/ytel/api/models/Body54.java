/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body54 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -1941773149206138651L;
    private Integer page;
    private Integer pageSize;
    private String from;
    private String to;
    private String dateSent;
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
        notifyObservers(this.page);
    }
 
    /** GETTER
     * The count of objects to return per page.
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
        notifyObservers(this.pageSize);
    }
 
    /** GETTER
     * Filter SMS message objects from this valid 10-digit phone number (E.164 format).
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Filter SMS message objects from this valid 10-digit phone number (E.164 format).
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * Filter SMS message objects to this valid 10-digit phone number (E.164 format).
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Filter SMS message objects to this valid 10-digit phone number (E.164 format).
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * Filter sms message objects by this date.
     */
    @JsonGetter("DateSent")
    public String getDateSent ( ) { 
        return this.dateSent;
    }
    
    /** SETTER
     * Filter sms message objects by this date.
     */
    @JsonSetter("DateSent")
    public void setDateSent (String value) { 
        this.dateSent = value;
        notifyObservers(this.dateSent);
    }
 
}
