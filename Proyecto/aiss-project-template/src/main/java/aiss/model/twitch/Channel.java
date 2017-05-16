
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "mature", "partner", "status", "broadcaster_language", "display_name", "game", "language", "_id",
		"name", "created_at", "updated_at", "delay", "logo", "banner", "video_banner", "background", "profile_banner",
		"profile_banner_background_color", "url", "views", "followers", "_links" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {

	@JsonProperty("mature")
	private Boolean mature;
	@JsonProperty("partner")
	private Boolean partner;
	@JsonProperty("status")
	private String status;
	@JsonProperty("broadcaster_language")
	private String broadcasterLanguage;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("game")
	private String game;
	@JsonProperty("language")
	private String language;
	@JsonProperty("_id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("delay")
	private Object delay;
	@JsonProperty("logo")
	private String logo;
	@JsonProperty("banner")
	private Object banner;
	@JsonProperty("video_banner")
	private String videoBanner;
	@JsonProperty("background")
	private Object background;
	@JsonProperty("profile_banner")
	private String profileBanner;
	@JsonProperty("profile_banner_background_color")
	private String profileBannerBackgroundColor;
	@JsonProperty("url")
	private String url;
	@JsonProperty("views")
	private Integer views;
	@JsonProperty("followers")
	private Integer followers;
	@JsonProperty("_links")
	private Links links;

	@JsonProperty("mature")
	public Boolean getMature() {
		return mature;
	}

	@JsonProperty("partner")
	public Boolean getPartner() {
		return partner;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("broadcaster_language")
	public String getBroadcasterLanguage() {
		return broadcasterLanguage;
	}

	@JsonProperty("display_name")
	public String getDisplayName() {
		return displayName;
	}

	@JsonProperty("game")
	public String getGame() {
		return game;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("delay")
	public Object getDelay() {
		return delay;
	}

	@JsonProperty("logo")
	public String getLogo() {
		return logo;
	}

	@JsonProperty("banner")
	public Object getBanner() {
		return banner;
	}

	@JsonProperty("video_banner")
	public String getVideoBanner() {
		return videoBanner;
	}

	@JsonProperty("background")
	public Object getBackground() {
		return background;
	}

	@JsonProperty("profile_banner")
	public String getProfileBanner() {
		return profileBanner;
	}

	@JsonProperty("profile_banner_background_color")
	public String getProfileBannerBackgroundColor() {
		return profileBannerBackgroundColor;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("views")
	public Integer getViews() {
		return views;
	}

	@JsonProperty("followers")
	public Integer getFollowers() {
		return followers;
	}

	@JsonProperty("_links")
	public Links getLinks() {
		return links;
	}

}
