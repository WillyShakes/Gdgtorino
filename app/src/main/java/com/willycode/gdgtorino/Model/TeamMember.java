package com.willycode.gdgtorino.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonPropertyOrder({
        "facebook",
        "github",
        "gplus",
        "name",
        "overlay",
        "pic",
        "twitter"
})
public class TeamMember {

    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("github")
    private String github;
    @JsonProperty("gplus")
    private String gplus;
    @JsonProperty("name")
    private String name;
    @JsonProperty("overlay")
    private String overlay;
    @JsonProperty("pic")
    private String pic;
    @JsonProperty("twitter")
    private String twitter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public TeamMember() {
    }

    /**
     *
     * @param twitter
     * @param overlay
     * @param name
     * @param facebook
     * @param pic
     * @param gplus
     * @param github
     */
    public TeamMember(String facebook, String github, String gplus, String name, String overlay, String pic, String twitter) {
        this.facebook = facebook;
        this.github = github;
        this.gplus = gplus;
        this.name = name;
        this.overlay = overlay;
        this.pic = pic;
        this.twitter = twitter;
    }

    /**
     *
     * @return
     * The facebook
     */
    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    /**
     *
     * @param facebook
     * The facebook
     */
    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     *
     * @return
     * The github
     */
    @JsonProperty("github")
    public String getGithub() {
        return github;
    }

    /**
     *
     * @param github
     * The github
     */
    @JsonProperty("github")
    public void setGithub(String github) {
        this.github = github;
    }

    /**
     *
     * @return
     * The gplus
     */
    @JsonProperty("gplus")
    public String getGplus() {
        return gplus;
    }

    /**
     *
     * @param gplus
     * The gplus
     */
    @JsonProperty("gplus")
    public void setGplus(String gplus) {
        this.gplus = gplus;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The overlay
     */
    @JsonProperty("overlay")
    public String getOverlay() {
        return overlay;
    }

    /**
     *
     * @param overlay
     * The overlay
     */
    @JsonProperty("overlay")
    public void setOverlay(String overlay) {
        this.overlay = overlay;
    }

    /**
     *
     * @return
     * The pic
     */
    @JsonProperty("pic")
    public String getPic() {
        return pic;
    }

    /**
     *
     * @param pic
     * The pic
     */
    @JsonProperty("pic")
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     *
     * @return
     * The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     *
     * @param twitter
     * The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
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
