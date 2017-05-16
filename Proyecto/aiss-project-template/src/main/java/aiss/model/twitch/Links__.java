
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "next",
    "featured",
    "summary",
    "followed"
})
public class Links__ {

    @JsonProperty("self")
    private String self;
    @JsonProperty("next")
    private String next;
    @JsonProperty("featured")
    private String featured;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("followed")
    private String followed;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    @JsonProperty("featured")
    public String getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(String featured) {
        this.featured = featured;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("followed")
    public String getFollowed() {
        return followed;
    }

    @JsonProperty("followed")
    public void setFollowed(String followed) {
        this.followed = followed;
    }

}
