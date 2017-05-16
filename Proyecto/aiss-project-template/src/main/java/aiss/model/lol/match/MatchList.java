//Devuelve las últimas 20 partidas(según el "endIndex") PAAAAAAM

package aiss.model.lol.match;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "matches", "endIndex", "startIndex", "totalGames" })
public class MatchList {

	@JsonProperty("matches")
	private List<Match> matches = null;
	@JsonProperty("endIndex")
	private Integer endIndex;
	@JsonProperty("startIndex")
	private Integer startIndex;
	@JsonProperty("totalGames")
	private Integer totalGames;

	@JsonProperty("matches")
	public List<Match> getMatches() {
		return matches;
	}

	@JsonProperty("endIndex")
	public Integer getEndIndex() {
		return endIndex;
	}

	@JsonProperty("startIndex")
	public Integer getStartIndex() {
		return startIndex;
	}

	@JsonProperty("totalGames")
	public Integer getTotalGames() {
		return totalGames;
	}

}