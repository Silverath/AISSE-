//Devuelve tus estadísticas con cierto campeón

package aiss.model.lol.champion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "stats", "id" })
public class Champion {

	@JsonProperty("stats")
	private Stats stats;
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("stats")
	public Stats getStats() {
		return stats;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}
}