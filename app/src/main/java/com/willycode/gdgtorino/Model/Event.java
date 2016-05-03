package com.willycode.gdgtorino.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;




@JsonPropertyOrder({
        "content",
        "date",
        "hashtag",
        "summary",
        "title"
})
public class Event {

    @JsonProperty("content")
    private String content;
    @JsonProperty("date")
    private String date;
    @JsonProperty("hashtag")
    private Hashtag hashtag;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The content
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content
     * The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return
     * The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The hashtag
     */
    @JsonProperty("hashtag")
    public Hashtag getHashtag() {
        return hashtag;
    }

    /**
     *
     * @param hashtag
     * The hashtag
     */
    @JsonProperty("hashtag")
    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }

    /**
     *
     * @return
     * The summary
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     * The summary
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     * The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
