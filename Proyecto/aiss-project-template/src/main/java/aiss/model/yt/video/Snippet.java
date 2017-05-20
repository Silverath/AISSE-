
package aiss.model.yt.video;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "publishedAt", "channelId", "title", "description", "thumbnails", "channelTitle", "tags",
		"categoryId", "liveBroadcastContent", "defaultLanguage", "localized", "defaultAudioLanguage" })
public class Snippet {

	@JsonProperty("publishedAt")
	private String publishedAt;
	@JsonProperty("channelId")
	private String channelId;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("thumbnails")
	private Thumbnails thumbnails;
	@JsonProperty("channelTitle")
	private String channelTitle;
	@JsonProperty("tags")
	private List<String> tags = null;
	@JsonProperty("categoryId")
	private String categoryId;
	@JsonProperty("liveBroadcastContent")
	private String liveBroadcastContent;
	@JsonProperty("defaultLanguage")
	private String defaultLanguage;
	@JsonProperty("localized")
	private Localized localized;
	@JsonProperty("defaultAudioLanguage")
	private String defaultAudioLanguage;

	@JsonProperty("publishedAt")
	public String getPublishedAt() {
		return publishedAt;
	}

	@JsonProperty("channelId")
	public String getChannelId() {
		return channelId;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("thumbnails")
	public Thumbnails getThumbnails() {
		return thumbnails;
	}

	@JsonProperty("channelTitle")
	public String getChannelTitle() {
		return channelTitle;
	}

	@JsonProperty("tags")
	public List<String> getTags() {
		return tags;
	}

	@JsonProperty("categoryId")
	public String getCategoryId() {
		return categoryId;
	}

	@JsonProperty("liveBroadcastContent")
	public String getLiveBroadcastContent() {
		return liveBroadcastContent;
	}

	@JsonProperty("defaultLanguage")
	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	@JsonProperty("localized")
	public Localized getLocalized() {
		return localized;
	}

	@JsonProperty("defaultAudioLanguage")
	public String getDefaultAudioLanguage() {
		return defaultAudioLanguage;
	}

}
