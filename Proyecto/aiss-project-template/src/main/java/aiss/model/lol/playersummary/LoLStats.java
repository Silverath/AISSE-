//Devuelve una lista con estadísticas en cada tipo de partida

package aiss.model.lol.playersummary;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "playerStatSummaries", "summonerId" })
public class LoLStats {

	@JsonProperty("playerStatSummaries")
	private List<PlayerStatSummary> playerStatSummaries = null;
	@JsonProperty("summonerId")
	private Integer summonerId;

	@JsonProperty("playerStatSummaries")
	public List<PlayerStatSummary> getPlayerStatSummaries() {
		return playerStatSummaries;
	}

	@JsonProperty("summonerId")
	public Integer getSummonerId() {
		return summonerId;
	}
}