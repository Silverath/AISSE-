
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "follows", "commercial", "stream_key", "chat", "features", "subscriptions", "editors",
		"teams", "videos" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

	@JsonProperty("self")
	private String self;
	@JsonProperty("follows")
	private String follows;
	@JsonProperty("commercial")
	private String commercial;
	@JsonProperty("stream_key")
	private String streamKey;
	@JsonProperty("chat")
	private String chat;
	@JsonProperty("features")
	private String features;
	@JsonProperty("subscriptions")
	private String subscriptions;
	@JsonProperty("editors")
	private String editors;
	@JsonProperty("teams")
	private String teams;
	@JsonProperty("videos")
	private String videos;

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("follows")
	public String getFollows() {
		return follows;
	}

	@JsonProperty("commercial")
	public String getCommercial() {
		return commercial;
	}

	@JsonProperty("stream_key")
	public String getStreamKey() {
		return streamKey;
	}

	@JsonProperty("chat")
	public String getChat() {
		return chat;
	}

	@JsonProperty("features")
	public String getFeatures() {
		return features;
	}

	@JsonProperty("subscriptions")
	public String getSubscriptions() {
		return subscriptions;
	}

	@JsonProperty("editors")
	public String getEditors() {
		return editors;
	}

	@JsonProperty("teams")
	public String getTeams() {
		return teams;
	}

	@JsonProperty("videos")
	public String getVideos() {
		return videos;
	}

}
