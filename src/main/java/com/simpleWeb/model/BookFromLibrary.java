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
        "key",
        "type",
        "name",
        "alternate_names",
        "birth_date",
        "death_date",
        "top_work",
        "work_count",
        "top_subjects",
        "_version_",
        "date"
})
@Generated("jsonschema2pojo")
public class BookFromLibrary {

    @JsonProperty("key")
    private String key;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("alternate_names")
    private List<String> alternateNames = null;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("death_date")
    private String deathDate;
    @JsonProperty("top_work")
    private String topWork;
    @JsonProperty("work_count")
    private Long workCount;
    @JsonProperty("top_subjects")
    private List<String> topSubjects = null;
    @JsonProperty("_version_")
    private Long version;
    @JsonProperty("date")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public BookFromLibrary withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public BookFromLibrary withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public BookFromLibrary withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("alternate_names")
    public List<String> getAlternateNames() {
        return alternateNames;
    }

    @JsonProperty("alternate_names")
    public void setAlternateNames(List<String> alternateNames) {
        this.alternateNames = alternateNames;
    }

    public BookFromLibrary withAlternateNames(List<String> alternateNames) {
        this.alternateNames = alternateNames;
        return this;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public BookFromLibrary withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @JsonProperty("death_date")
    public String getDeathDate() {
        return deathDate;
    }

    @JsonProperty("death_date")
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public BookFromLibrary withDeathDate(String deathDate) {
        this.deathDate = deathDate;
        return this;
    }

    @JsonProperty("top_work")
    public String getTopWork() {
        return topWork;
    }

    @JsonProperty("top_work")
    public void setTopWork(String topWork) {
        this.topWork = topWork;
    }

    public BookFromLibrary withTopWork(String topWork) {
        this.topWork = topWork;
        return this;
    }

    @JsonProperty("work_count")
    public Long getWorkCount() {
        return workCount;
    }

    @JsonProperty("work_count")
    public void setWorkCount(Long workCount) {
        this.workCount = workCount;
    }

    public BookFromLibrary withWorkCount(Long workCount) {
        this.workCount = workCount;
        return this;
    }

    @JsonProperty("top_subjects")
    public List<String> getTopSubjects() {
        return topSubjects;
    }

    @JsonProperty("top_subjects")
    public void setTopSubjects(List<String> topSubjects) {
        this.topSubjects = topSubjects;
    }

    public BookFromLibrary withTopSubjects(List<String> topSubjects) {
        this.topSubjects = topSubjects;
        return this;
    }

    @JsonProperty("_version_")
    public Long getVersion() {
        return version;
    }

    @JsonProperty("_version_")
    public void setVersion(Long version) {
        this.version = version;
    }

    public BookFromLibrary withVersion(Long version) {
        this.version = version;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public BookFromLibrary withDate(String date) {
        this.date = date;
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

    public BookFromLibrary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
