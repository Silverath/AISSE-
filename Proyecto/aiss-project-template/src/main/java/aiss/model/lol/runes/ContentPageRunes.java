//Devuelve el contenido de cada página de runaas

package aiss.model.lol.runes;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "current", "slots", "id", "name" })
public class ContentPageRunes {

	@JsonProperty("current")
	private Boolean current;
	@JsonProperty("slots")
	private List<Slot> slots = null;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;

	@JsonProperty("current")
	public Boolean getCurrent() {
		return current;
	}

	@JsonProperty("slots")
	public List<Slot> getSlots() {
		return slots;
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