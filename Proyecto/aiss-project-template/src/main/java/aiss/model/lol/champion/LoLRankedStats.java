//Devuelve estadísticas sober el campeón en rankeds

package aiss.model.lol.champion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "modifyDate", "summonerId", "champions" })
public class LoLRankedStats {

	@JsonProperty("modifyDate")
	private Integer modifyDate;
	@JsonProperty("summonerId")
	private Integer summonerId;
	@JsonProperty("champions")
	private List<Champion> champions = null;

	@JsonProperty("modifyDate")
	public Integer getModifyDate() {
		return modifyDate;
	}

	@JsonProperty("summonerId")
	public Integer getSummonerId() {
		return summonerId;
	}

	@JsonProperty("champions")
	public List<Champion> getChampions() {
		return champions;
	}
}