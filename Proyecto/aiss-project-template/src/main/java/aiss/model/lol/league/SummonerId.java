//Devuelve la liga en la que está el jugador

package aiss.model.lol.league;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "tier", "queue", "name", "entries" })
public class SummonerId {

	@JsonProperty("tier")
	private String tier;
	@JsonProperty("queue")
	private String queue;
	@JsonProperty("name")
	private String name;
	@JsonProperty("entries")
	private List<Entry> entries = null;

	@JsonProperty("tier")
	public String getTier() {
		return tier;
	}

	@JsonProperty("queue")
	public String getQueue() {
		return queue;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("entries")
	public List<Entry> getEntries() {
		return entries;
	}
}