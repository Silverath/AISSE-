
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "next", "featured", "summary", "followed" })
@JsonIgnoreProperties(ignoreUnknown = true)
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

	@JsonProperty("next")
	public String getNext() {
		return next;
	}

	@JsonProperty("featured")
	public String getFeatured() {
		return featured;
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("followed")
	public String getFollowed() {
		return followed;
	}

}
