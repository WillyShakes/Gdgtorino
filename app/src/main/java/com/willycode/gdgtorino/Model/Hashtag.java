package com.willycode.gdgtorino.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;


@JsonPropertyOrder({
        "hashtag1",
        "hashtag2",
        "hashtag3"
})
public class Hashtag {

    @JsonProperty("hashtag1")
    private String hashtag1;
    @JsonProperty("hashtag2")
    private String hashtag2;
    @JsonProperty("hashtag3")
    private String hashtag3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The hashtag1
     */
    @JsonProperty("hashtag1")
    public String getHashtag1() {
        return hashtag1;
    }

    /**
     *
     * @param hashtag1
     * The hashtag1
     */
    @JsonProperty("hashtag1")
    public void setHashtag1(String hashtag1) {
        this.hashtag1 = hashtag1;
    }

    /**
     *
     * @return
     * The hashtag2
     */
    @JsonProperty("hashtag2")
    public String getHashtag2() {
        return hashtag2;
    }

    /**
     *
     * @param hashtag2
     * The hashtag2
     */
    @JsonProperty("hashtag2")
    public void setHashtag2(String hashtag2) {
        this.hashtag2 = hashtag2;
    }

    /**
     *
     * @return
     * The hashtag3
     */
    @JsonProperty("hashtag3")
    public String getHashtag3() {
        return hashtag3;
    }

    /**
     *
     * @param hashtag3
     * The hashtag3
     */
    @JsonProperty("hashtag3")
    public void setHashtag3(String hashtag3) {
        this.hashtag3 = hashtag3;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

