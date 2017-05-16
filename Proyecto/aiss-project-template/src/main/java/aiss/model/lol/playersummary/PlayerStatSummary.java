//Devuelve estadísticas generales sobre el invocador

package aiss.model.lol.playersummary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "wins", "aggregatedStats", "modifyDate", "playerStatSummaryType", "losses" })
public class PlayerStatSummary {

	@JsonProperty("wins")
	private Integer wins;
	@JsonProperty("aggregatedStats")
	private PlayerTotalStats aggregatedStats;
	@JsonProperty("modifyDate")
	private Integer modifyDate;
	@JsonProperty("playerStatSummaryType")
	private String playerStatSummaryType;
	@JsonProperty("losses")
	private Integer losses;

	@JsonProperty("wins")
	public Integer getWins() {
		return wins;
	}

	@JsonProperty("aggregatedStats")
	public PlayerTotalStats getAggregatedStats() {
		return aggregatedStats;
	}

	@JsonProperty("modifyDate")
	public Integer getModifyDate() {
		return modifyDate;
	}

	@JsonProperty("playerStatSummaryType")
	public String getPlayerStatSummaryType() {
		return playerStatSummaryType;
	}

	@JsonProperty("losses")
	public Integer getLosses() {
		return losses;
	}
}