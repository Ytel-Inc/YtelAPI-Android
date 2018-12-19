/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body60 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4243998815219520677L;
    private Integer page;
    private Integer pagesize;
    private String keyword;
    private Integer shortcode;
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
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
        notifyObservers(this.pagesize);
    }
 
    /** GETTER
     * Only list keywords of keyword
     */
    @JsonGetter("Keyword")
    public String getKeyword ( ) { 
        return this.keyword;
    }
    
    /** SETTER
     * Only list keywords of keyword
     */
    @JsonSetter("Keyword")
    public void setKeyword (String value) { 
        this.keyword = value;
        notifyObservers(this.keyword);
    }
 
    /** GETTER
     * Only list keywords of shortcode
     */
    @JsonGetter("Shortcode")
    public Integer getShortcode ( ) { 
        return this.shortcode;
    }
    
    /** SETTER
     * Only list keywords of shortcode
     */
    @JsonSetter("Shortcode")
    public void setShortcode (Integer value) { 
        this.shortcode = value;
        notifyObservers(this.shortcode);
    }
 
}
