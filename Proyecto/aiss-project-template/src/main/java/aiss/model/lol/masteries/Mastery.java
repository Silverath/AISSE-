//Devuelve el nivel de cada maestría

package aiss.model.lol.masteries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "rank" })
public class Mastery {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("rank")
	private Integer rank;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("rank")
	public Integer getRank() {
		return rank;
	}
}