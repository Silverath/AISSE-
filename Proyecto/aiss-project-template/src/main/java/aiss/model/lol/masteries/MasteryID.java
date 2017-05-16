//Devuelve el nombre de cada maestría

package aiss.model.lol.masteries;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "description", "id", "name" })
public class MasteryID {

	@JsonProperty("description")
	private List<String> description = null;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	public List<String> getDescription() {
		return description;
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