//Devuelve el hueco en el que está la runa

package aiss.model.lol.runes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "runeSlotId", "runeId" })
public class Slot {

	@JsonProperty("runeSlotId")
	private Integer runeSlotId;
	@JsonProperty("runeId")
	private Integer runeId;

	@JsonProperty("runeSlotId")
	public Integer getRuneSlotId() {
		return runeSlotId;
	}

	@JsonProperty("runeId")
	public Integer getRuneId() {
		return runeId;
	}



}
