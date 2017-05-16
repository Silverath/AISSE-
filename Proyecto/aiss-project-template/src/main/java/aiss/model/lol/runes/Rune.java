//Devuelve el tipo de runa PAAAAAAM

package aiss.model.lol.runes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "tier", "type", "isRune" })
public class Rune {

	@JsonProperty("tier")
	private String tier;
	@JsonProperty("type")
	private String type;
	@JsonProperty("isRune")
	private Boolean isRune;

	@JsonProperty("tier")
	public String getTier() {
		return tier;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

}