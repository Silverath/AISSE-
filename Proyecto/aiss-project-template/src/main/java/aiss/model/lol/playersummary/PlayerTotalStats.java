//Devuelve las estadísticas generales totales del invocador(es un resumen total)

package aiss.model.lol.playersummary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "totalChampionKills", "totalTurretsKilled", "totalAssists", "totalMinionKills",
		"totalNeutralMinionsKilled", "averageNodeNeutralize", "maxTeamObjective", "maxNodeNeutralize",
		"averageChampionsKilled", "averageNodeNeutralizeAssist", "averageTeamObjective", "averageAssists",
		"maxChampionsKilled", "totalNodeCapture", "maxNodeNeutralizeAssist", "averageTotalPlayerScore",
		"maxTotalPlayerScore", "maxNodeCaptureAssist", "averageNodeCaptureAssist", "maxObjectivePlayerScore",
		"totalNodeNeutralize", "averageObjectivePlayerScore", "maxNodeCapture", "maxCombatPlayerScore",
		"averageNodeCapture", "maxAssists", "averageCombatPlayerScore", "averageNumDeaths" })
public class PlayerTotalStats {

	@JsonProperty("totalChampionKills")
	private Integer totalChampionKills;
	@JsonProperty("totalTurretsKilled")
	private Integer totalTurretsKilled;
	@JsonProperty("totalAssists")
	private Integer totalAssists;
	@JsonProperty("totalMinionKills")
	private Integer totalMinionKills;
	@JsonProperty("totalNeutralMinionsKilled")
	private Integer totalNeutralMinionsKilled;
	@JsonProperty("averageNodeNeutralize")
	private Integer averageNodeNeutralize;
	@JsonProperty("maxTeamObjective")
	private Integer maxTeamObjective;
	@JsonProperty("maxNodeNeutralize")
	private Integer maxNodeNeutralize;
	@JsonProperty("averageChampionsKilled")
	private Integer averageChampionsKilled;
	@JsonProperty("averageNodeNeutralizeAssist")
	private Integer averageNodeNeutralizeAssist;
	@JsonProperty("averageTeamObjective")
	private Integer averageTeamObjective;
	@JsonProperty("averageAssists")
	private Integer averageAssists;
	@JsonProperty("maxChampionsKilled")
	private Integer maxChampionsKilled;
	@JsonProperty("totalNodeCapture")
	private Integer totalNodeCapture;
	@JsonProperty("maxNodeNeutralizeAssist")
	private Integer maxNodeNeutralizeAssist;
	@JsonProperty("averageTotalPlayerScore")
	private Integer averageTotalPlayerScore;
	@JsonProperty("maxTotalPlayerScore")
	private Integer maxTotalPlayerScore;
	@JsonProperty("maxNodeCaptureAssist")
	private Integer maxNodeCaptureAssist;
	@JsonProperty("averageNodeCaptureAssist")
	private Integer averageNodeCaptureAssist;
	@JsonProperty("maxObjectivePlayerScore")
	private Integer maxObjectivePlayerScore;
	@JsonProperty("totalNodeNeutralize")
	private Integer totalNodeNeutralize;
	@JsonProperty("averageObjectivePlayerScore")
	private Integer averageObjectivePlayerScore;
	@JsonProperty("maxNodeCapture")
	private Integer maxNodeCapture;
	@JsonProperty("maxCombatPlayerScore")
	private Integer maxCombatPlayerScore;
	@JsonProperty("averageNodeCapture")
	private Integer averageNodeCapture;
	@JsonProperty("maxAssists")
	private Integer maxAssists;
	@JsonProperty("averageCombatPlayerScore")
	private Integer averageCombatPlayerScore;
	@JsonProperty("averageNumDeaths")
	private Integer averageNumDeaths;

	@JsonProperty("totalChampionKills")
	public Integer getTotalChampionKills() {
		return totalChampionKills;
	}

	@JsonProperty("totalTurretsKilled")
	public Integer getTotalTurretsKilled() {
		return totalTurretsKilled;
	}

	@JsonProperty("totalAssists")
	public Integer getTotalAssists() {
		return totalAssists;
	}

	@JsonProperty("totalMinionKills")
	public Integer getTotalMinionKills() {
		return totalMinionKills;
	}

	@JsonProperty("totalNeutralMinionsKilled")
	public Integer getTotalNeutralMinionsKilled() {
		return totalNeutralMinionsKilled;
	}

	@JsonProperty("averageNodeNeutralize")
	public Integer getAverageNodeNeutralize() {
		return averageNodeNeutralize;
	}

	@JsonProperty("maxTeamObjective")
	public Integer getMaxTeamObjective() {
		return maxTeamObjective;
	}

	@JsonProperty("maxNodeNeutralize")
	public Integer getMaxNodeNeutralize() {
		return maxNodeNeutralize;
	}

	@JsonProperty("averageChampionsKilled")
	public Integer getAverageChampionsKilled() {
		return averageChampionsKilled;
	}

	@JsonProperty("averageNodeNeutralizeAssist")
	public Integer getAverageNodeNeutralizeAssist() {
		return averageNodeNeutralizeAssist;
	}

	@JsonProperty("averageTeamObjective")
	public Integer getAverageTeamObjective() {
		return averageTeamObjective;
	}

	@JsonProperty("averageAssists")
	public Integer getAverageAssists() {
		return averageAssists;
	}

	@JsonProperty("maxChampionsKilled")
	public Integer getMaxChampionsKilled() {
		return maxChampionsKilled;
	}

	@JsonProperty("totalNodeCapture")
	public Integer getTotalNodeCapture() {
		return totalNodeCapture;
	}

	@JsonProperty("maxNodeNeutralizeAssist")
	public Integer getMaxNodeNeutralizeAssist() {
		return maxNodeNeutralizeAssist;
	}

	@JsonProperty("averageTotalPlayerScore")
	public Integer getAverageTotalPlayerScore() {
		return averageTotalPlayerScore;
	}

	@JsonProperty("maxTotalPlayerScore")
	public Integer getMaxTotalPlayerScore() {
		return maxTotalPlayerScore;
	}

	@JsonProperty("maxNodeCaptureAssist")
	public Integer getMaxNodeCaptureAssist() {
		return maxNodeCaptureAssist;
	}

	@JsonProperty("averageNodeCaptureAssist")
	public Integer getAverageNodeCaptureAssist() {
		return averageNodeCaptureAssist;
	}

	@JsonProperty("maxObjectivePlayerScore")
	public Integer getMaxObjectivePlayerScore() {
		return maxObjectivePlayerScore;
	}

	@JsonProperty("totalNodeNeutralize")
	public Integer getTotalNodeNeutralize() {
		return totalNodeNeutralize;
	}

	@JsonProperty("averageObjectivePlayerScore")
	public Integer getAverageObjectivePlayerScore() {
		return averageObjectivePlayerScore;
	}

	@JsonProperty("maxNodeCapture")
	public Integer getMaxNodeCapture() {
		return maxNodeCapture;
	}

	@JsonProperty("maxCombatPlayerScore")
	public Integer getMaxCombatPlayerScore() {
		return maxCombatPlayerScore;
	}

	@JsonProperty("averageNodeCapture")
	public Integer getAverageNodeCapture() {
		return averageNodeCapture;
	}

	@JsonProperty("maxAssists")
	public Integer getMaxAssists() {
		return maxAssists;
	}

	@JsonProperty("averageCombatPlayerScore")
	public Integer getAverageCombatPlayerScore() {
		return averageCombatPlayerScore;
	}

	@JsonProperty("averageNumDeaths")
	public Integer getAverageNumDeaths() {
		return averageNumDeaths;
	}
}