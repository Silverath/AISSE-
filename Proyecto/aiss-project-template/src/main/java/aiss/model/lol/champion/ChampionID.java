//Devuelve el nombre del campeón

package aiss.model.lol.champion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "title", "id", "key", "name" })
public class ChampionID {

	@JsonProperty("title")
	private String title;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("key")
	private String key;
	@JsonProperty("name")
	private String name;

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}
}