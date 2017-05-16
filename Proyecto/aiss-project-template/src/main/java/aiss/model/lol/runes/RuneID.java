//Devuelve el nombre de la runa

package aiss.model.lol.runes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "description", "rune", "id", "name" })
public class RuneID {

	@JsonProperty("description")
	private String description;
	@JsonProperty("rune")
	private Rune rune;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("rune")
	public Rune getRune() {
		return rune;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

}