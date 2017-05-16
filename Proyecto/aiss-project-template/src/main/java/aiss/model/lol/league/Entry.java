//Devuelve las características de la liga en la qe se encuentra el jugador

package aiss.model.lol.league;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "isFreshBlood", "division", "isVeteran", "wins", "losses", "playerOrTeamId", "playerOrTeamName",
		"isInactive", "isHotStreak", "leaguePoints" })
public class Entry {

	@JsonProperty("isFreshBlood")
	private Boolean isFreshBlood;
	@JsonProperty("division")
	private String division;
	@JsonProperty("isVeteran")
	private Boolean isVeteran;
	@JsonProperty("wins")
	private Integer wins;
	@JsonProperty("losses")
	private Integer losses;
	@JsonProperty("playerOrTeamId")
	private String playerOrTeamId;
	@JsonProperty("playerOrTeamName")
	private String playerOrTeamName;
	@JsonProperty("isInactive")
	private Boolean isInactive;
	@JsonProperty("isHotStreak")
	private Boolean isHotStreak;
	@JsonProperty("leaguePoints")
	private Integer leaguePoints;

	@JsonProperty("isFreshBlood")
	public Boolean getIsFreshBlood() {
		return isFreshBlood;
	}

	@JsonProperty("division")
	public String getDivision() {
		return division;
	}

	@JsonProperty("isVeteran")
	public Boolean getIsVeteran() {
		return isVeteran;
	}

	@JsonProperty("wins")
	public Integer getWins() {
		return wins;
	}

	@JsonProperty("losses")
	public Integer getLosses() {
		return losses;
	}

	@JsonProperty("playerOrTeamId")
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}

	@JsonProperty("playerOrTeamName")
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}

	@JsonProperty("isInactive")
	public Boolean getIsInactive() {
		return isInactive;
	}

	@JsonProperty("isHotStreak")
	public Boolean getIsHotStreak() {
		return isHotStreak;
	}

	@JsonProperty("leaguePoints")
	public Integer getLeaguePoints() {
		return leaguePoints;
	}
}