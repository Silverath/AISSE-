//Información sobre el canal de Twitch

package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "broadcaster_language", "created_at", "display_name", "followers", "game", "language",
		"logo", "mature", "name", "partner", "profile_banner", "profile_banner_background_color", "status",
		"updated_at", "url", "video_banner", "views" })
public class Channel {

	@JsonProperty("_id")
	private Integer id;
	@JsonProperty("broadcaster_language")
	private String broadcasterLanguage;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("followers")
	private Integer followers;
	@JsonProperty("game")
	private String game;
	@JsonProperty("language")
	private String language;
	@JsonProperty("logo")
	private String logo;
	@JsonProperty("mature")
	private Boolean mature;
	@JsonProperty("name")
	private String name;
	@JsonProperty("partner")
	private Boolean partner;
	@JsonProperty("profile_banner")
	private String profileBanner;
	@JsonProperty("profile_banner_background_color")
	private Object profileBannerBackgroundColor;
	@JsonProperty("status")
	private String status;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("url")
	private String url;
	@JsonProperty("video_banner")
	private String videoBanner;
	@JsonProperty("views")
	private Integer views;

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("broadcaster_language")
	public String getBroadcasterLanguage() {
		return broadcasterLanguage;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("display_name")
	public String getDisplayName() {
		return displayName;
	}

	@JsonProperty("followers")
	public Integer getFollowers() {
		return followers;
	}

	@JsonProperty("game")
	public String getGame() {
		return game;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("logo")
	public String getLogo() {
		return logo;
	}

	@JsonProperty("mature")
	public Boolean getMature() {
		return mature;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("partner")
	public Boolean getPartner() {
		return partner;
	}

	@JsonProperty("profile_banner")
	public String getProfileBanner() {
		return profileBanner;
	}

	@JsonProperty("profile_banner_background_color")
	public Object getProfileBannerBackgroundColor() {
		return profileBannerBackgroundColor;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("video_banner")
	public String getVideoBanner() {
		return videoBanner;
	}

	@JsonProperty("views")
	public Integer getViews() {
		return views;
	}
}