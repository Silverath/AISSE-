//Detalles de un Stream

package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "average_fps", "channel", "created_at", "delay", "game", "is_playlist", "preview",
		"video_height", "viewers" })
public class Stream {

	@JsonProperty("_id")
	private Integer id;
	@JsonProperty("average_fps")
	private Integer averageFps;
	@JsonProperty("channel")
	private Channel channel;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("delay")
	private Integer delay;
	@JsonProperty("game")
	private String game;
	@JsonProperty("is_playlist")
	private Boolean isPlaylist;
	@JsonProperty("preview")
	private Preview preview;
	@JsonProperty("video_height")
	private Integer videoHeight;
	@JsonProperty("viewers")
	private Integer viewers;

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("average_fps")
	public Integer getAverageFps() {
		return averageFps;
	}

	@JsonProperty("channel")
	public Channel getChannel() {
		return channel;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("delay")
	public Integer getDelay() {
		return delay;
	}

	@JsonProperty("game")
	public String getGame() {
		return game;
	}

	@JsonProperty("is_playlist")
	public Boolean getIsPlaylist() {
		return isPlaylist;
	}

	@JsonProperty("preview")
	public Preview getPreview() {
		return preview;
	}

	@JsonProperty("video_height")
	public Integer getVideoHeight() {
		return videoHeight;
	}

	@JsonProperty("viewers")
	public Integer getViewers() {
		return viewers;
	}

}