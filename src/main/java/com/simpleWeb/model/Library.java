package com.simpleWeb.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "numFound",
        "start",
        "numFoundExact",
        "docs"
})
@Generated("jsonschema2pojo")
public class Library {

    @JsonProperty("numFound")
    private Long numFound;
    @JsonProperty("start")
    private Long start;
    @JsonProperty("numFoundExact")
    private Boolean numFoundExact;
    @JsonProperty("docs")
    private List<BookFromLibrary> bookFromLibraryList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numFound")
    public Long getNumFound() {
        return numFound;
    }

    @JsonProperty("numFound")
    public void setNumFound(Long numFound) {
        this.numFound = numFound;
    }

    public Library withNumFound(Long numFound) {
        this.numFound = numFound;
        return this;
    }

    @JsonProperty("start")
    public Long getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Long start) {
        this.start = start;
    }

    public Library withStart(Long start) {
        this.start = start;
        return this;
    }

    @JsonProperty("numFoundExact")
    public Boolean getNumFoundExact() {
        return numFoundExact;
    }

    @JsonProperty("numFoundExact")
    public void setNumFoundExact(Boolean numFoundExact) {
        this.numFoundExact = numFoundExact;
    }

    public Library withNumFoundExact(Boolean numFoundExact) {
        this.numFoundExact = numFoundExact;
        return this;
    }

    @JsonProperty("docs")
    public List<BookFromLibrary> getBookFromLibraryList() {
        return bookFromLibraryList;
    }

    @JsonProperty("docs")
    public void setBookFromLibraryList(List<BookFromLibrary> bookFromLibraryList) {
        this.bookFromLibraryList = bookFromLibraryList;
    }

    public Library withDocs(List<BookFromLibrary> docs) {
        this.bookFromLibraryList = docs;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Library withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}