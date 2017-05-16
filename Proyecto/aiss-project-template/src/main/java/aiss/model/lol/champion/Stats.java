//Devuelve las estadísticas con un campeón concreto

package aiss.model.lol.champion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "totalTurretsKilled", "totalSessionsPlayed", "totalAssists", "totalDamageDealt",
		"mostChampionKillsPerSession", "totalPentaKills", "totalDoubleKills", "maxChampionsKilled",
		"totalDeathsPerSession", "totalSessionsWon", "totalGoldEarned", "totalTripleKills", "totalChampionKills",
		"maxNumDeaths", "totalMinionKills", "totalQuadraKills", "totalDamageTaken", "totalSessionsLost",
		"rankedPremadeGamesPlayed", "killingSpree", "maxLargestCriticalStrike", "totalNeutralMinionsKilled",
		"maxTimeSpentLiving", "rankedSoloGamesPlayed", "maxLargestKillingSpree", "totalHeal", "normalGamesPlayed",
		"maxTimePlayed", "botGamesPlayed" })
public class Stats {

	@JsonProperty("totalTurretsKilled")
	private Integer totalTurretsKilled;
	@JsonProperty("totalSessionsPlayed")
	private Integer totalSessionsPlayed;
	@JsonProperty("totalAssists")
	private Integer totalAssists;
	@JsonProperty("totalDamageDealt")
	private Integer totalDamageDealt;
	@JsonProperty("mostChampionKillsPerSession")
	private Integer mostChampionKillsPerSession;
	@JsonProperty("totalPentaKills")
	private Integer totalPentaKills;
	@JsonProperty("totalDoubleKills")
	private Integer totalDoubleKills;
	@JsonProperty("maxChampionsKilled")
	private Integer maxChampionsKilled;
	@JsonProperty("totalDeathsPerSession")
	private Integer totalDeathsPerSession;
	@JsonProperty("totalSessionsWon")
	private Integer totalSessionsWon;
	@JsonProperty("totalGoldEarned")
	private Integer totalGoldEarned;
	@JsonProperty("totalTripleKills")
	private Integer totalTripleKills;
	@JsonProperty("totalChampionKills")
	private Integer totalChampionKills;
	@JsonProperty("maxNumDeaths")
	private Integer maxNumDeaths;
	@JsonProperty("totalMinionKills")
	private Integer totalMinionKills;
	@JsonProperty("totalQuadraKills")
	private Integer totalQuadraKills;
	@JsonProperty("totalDamageTaken")
	private Integer totalDamageTaken;
	@JsonProperty("totalSessionsLost")
	private Integer totalSessionsLost;
	@JsonProperty("rankedPremadeGamesPlayed")
	private Integer rankedPremadeGamesPlayed;
	@JsonProperty("killingSpree")
	private Integer killingSpree;
	@JsonProperty("maxLargestCriticalStrike")
	private Integer maxLargestCriticalStrike;
	@JsonProperty("totalNeutralMinionsKilled")
	private Integer totalNeutralMinionsKilled;
	@JsonProperty("maxTimeSpentLiving")
	private Integer maxTimeSpentLiving;
	@JsonProperty("rankedSoloGamesPlayed")
	private Integer rankedSoloGamesPlayed;
	@JsonProperty("maxLargestKillingSpree")
	private Integer maxLargestKillingSpree;
	@JsonProperty("totalHeal")
	private Integer totalHeal;
	@JsonProperty("normalGamesPlayed")
	private Integer normalGamesPlayed;
	@JsonProperty("maxTimePlayed")
	private Integer maxTimePlayed;
	@JsonProperty("botGamesPlayed")
	private Integer botGamesPlayed;

	@JsonProperty("totalTurretsKilled")
	public Integer getTotalTurretsKilled() {
		return totalTurretsKilled;
	}

	@JsonProperty("totalSessionsPlayed")
	public Integer getTotalSessionsPlayed() {
		return totalSessionsPlayed;
	}

	@JsonProperty("totalAssists")
	public Integer getTotalAssists() {
		return totalAssists;
	}

	@JsonProperty("totalDamageDealt")
	public Integer getTotalDamageDealt() {
		return totalDamageDealt;
	}

	@JsonProperty("mostChampionKillsPerSession")
	public Integer getMostChampionKillsPerSession() {
		return mostChampionKillsPerSession;
	}

	@JsonProperty("totalPentaKills")
	public Integer getTotalPentaKills() {
		return totalPentaKills;
	}

	@JsonProperty("totalDoubleKills")
	public Integer getTotalDoubleKills() {
		return totalDoubleKills;
	}

	@JsonProperty("maxChampionsKilled")
	public Integer getMaxChampionsKilled() {
		return maxChampionsKilled;
	}

	@JsonProperty("totalDeathsPerSession")
	public Integer getTotalDeathsPerSession() {
		return totalDeathsPerSession;
	}

	@JsonProperty("totalSessionsWon")
	public Integer getTotalSessionsWon() {
		return totalSessionsWon;
	}

	@JsonProperty("totalGoldEarned")
	public Integer getTotalGoldEarned() {
		return totalGoldEarned;
	}

	@JsonProperty("totalTripleKills")
	public Integer getTotalTripleKills() {
		return totalTripleKills;
	}

	@JsonProperty("totalChampionKills")
	public Integer getTotalChampionKills() {
		return totalChampionKills;
	}

	@JsonProperty("maxNumDeaths")
	public Integer getMaxNumDeaths() {
		return maxNumDeaths;
	}

	@JsonProperty("totalMinionKills")
	public Integer getTotalMinionKills() {
		return totalMinionKills;
	}

	@JsonProperty("totalQuadraKills")
	public Integer getTotalQuadraKills() {
		return totalQuadraKills;
	}

	@JsonProperty("totalDamageTaken")
	public Integer getTotalDamageTaken() {
		return totalDamageTaken;
	}

	@JsonProperty("totalSessionsLost")
	public Integer getTotalSessionsLost() {
		return totalSessionsLost;
	}

	@JsonProperty("rankedPremadeGamesPlayed")
	public Integer getRankedPremadeGamesPlayed() {
		return rankedPremadeGamesPlayed;
	}

	@JsonProperty("killingSpree")
	public Integer getKillingSpree() {
		return killingSpree;
	}

	@JsonProperty("maxLargestCriticalStrike")
	public Integer getMaxLargestCriticalStrike() {
		return maxLargestCriticalStrike;
	}

	@JsonProperty("totalNeutralMinionsKilled")
	public Integer getTotalNeutralMinionsKilled() {
		return totalNeutralMinionsKilled;
	}

	@JsonProperty("maxTimeSpentLiving")
	public Integer getMaxTimeSpentLiving() {
		return maxTimeSpentLiving;
	}

	@JsonProperty("rankedSoloGamesPlayed")
	public Integer getRankedSoloGamesPlayed() {
		return rankedSoloGamesPlayed;
	}

	@JsonProperty("maxLargestKillingSpree")
	public Integer getMaxLargestKillingSpree() {
		return maxLargestKillingSpree;
	}

	@JsonProperty("totalHeal")
	public Integer getTotalHeal() {
		return totalHeal;
	}

	@JsonProperty("normalGamesPlayed")
	public Integer getNormalGamesPlayed() {
		return normalGamesPlayed;
	}

	@JsonProperty("maxTimePlayed")
	public Integer getMaxTimePlayed() {
		return maxTimePlayed;
	}

	@JsonProperty("botGamesPlayed")
	public Integer getBotGamesPlayed() {
		return botGamesPlayed;
	}
}