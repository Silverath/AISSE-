
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "game", "viewers", "video_height", "average_fps", "delay", "created_at", "is_playlist",
		"stream_type", "preview", "channel", "_links" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stream {

	@JsonProperty("_id")
	private Integer id;
	@JsonProperty("game")
	private String game;
	@JsonProperty("viewers")
	private Integer viewers;
	@JsonProperty("video_height")
	private Integer videoHeight;
	@JsonProperty("average_fps")
	private Integer averageFps;
	@JsonProperty("delay")
	private Integer delay;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("is_playlist")
	private Boolean isPlaylist;
	@JsonProperty("stream_type")
	private String streamType;
	@JsonProperty("preview")
	private Preview preview;
	@JsonProperty("channel")
	private Channel channel;
	@JsonProperty("_links")
	private Links_ links;

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("game")
	public String getGame() {
		return game;
	}

	@JsonProperty("viewers")
	public Integer getViewers() {
		return viewers;
	}

	@JsonProperty("video_height")
	public Integer getVideoHeight() {
		return videoHeight;
	}

	@JsonProperty("average_fps")
	public Integer getAverageFps() {
		return averageFps;
	}

	@JsonProperty("delay")
	public Integer getDelay() {
		return delay;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("is_playlist")
	public Boolean getIsPlaylist() {
		return isPlaylist;
	}

	@JsonProperty("stream_type")
	public String getStreamType() {
		return streamType;
	}

	@JsonProperty("preview")
	public Preview getPreview() {
		return preview;
	}

	@JsonProperty("channel")
	public Channel getChannel() {
		return channel;
	}

	@JsonProperty("_links")
	public Links_ getLinks() {
		return links;
	}

}
