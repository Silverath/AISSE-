//Devuelve el rol en la partida

package aiss.model.lol.match;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "lane", "gameId", "champion", "platformId", "timestamp", "queue", "role", "season" })
public class Match {

	@JsonProperty("lane")
	private String lane;
	@JsonProperty("gameId")
	private Integer gameId;
	@JsonProperty("champion")
	private Integer champion;
	@JsonProperty("platformId")
	private String platformId;
	@JsonProperty("timestamp")
	private Integer timestamp;
	@JsonProperty("queue")
	private Integer queue;
	@JsonProperty("role")
	private String role;
	@JsonProperty("season")
	private Integer season;

	@JsonProperty("lane")
	public String getLane() {
		return lane;
	}

	@JsonProperty("gameId")
	public Integer getGameId() {
		return gameId;
	}

	@JsonProperty("champion")
	public Integer getChampion() {
		return champion;
	}

	@JsonProperty("platformId")
	public String getPlatformId() {
		return platformId;
	}

	@JsonProperty("timestamp")
	public Integer getTimestamp() {
		return timestamp;
	}

	@JsonProperty("queue")
	public Integer getQueue() {
		return queue;
	}

	@JsonProperty("role")
	public String getRole() {
		return role;
	}

	@JsonProperty("season")
	public Integer getSeason() {
		return season;
	}

}