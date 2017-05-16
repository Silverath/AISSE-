//Devuelve el contenido de las páginas de maestrías

package aiss.model.lol.masteries;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "current", "masteries", "id", "name" })
public class ContentPageMasteries {

	@JsonProperty("current")
	private Boolean current;
	@JsonProperty("masteries")
	private List<Mastery> masteries = null;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;

	@JsonProperty("current")
	public Boolean getCurrent() {
		return current;
	}

	@JsonProperty("masteries")
	public List<Mastery> getMasteries() {
		return masteries;
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