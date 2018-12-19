/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body33 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 6225121048642334125L;
    private String offset;
    private String limit;
    /** GETTER
     * The starting point of the list of blocked emails that should be returned.
     */
    @JsonGetter("Offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The starting point of the list of blocked emails that should be returned.
     */
    @JsonSetter("Offset")
    public void setOffset (String value) { 
        this.offset = value;
        notifyObservers(this.offset);
    }
 
    /** GETTER
     * The count of results that should be returned.
     */
    @JsonGetter("Limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The count of results that should be returned.
     */
    @JsonSetter("Limit")
    public void setLimit (String value) { 
        this.limit = value;
        notifyObservers(this.limit);
    }
 
}
