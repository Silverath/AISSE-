//Devuelve el summonerId de la persona en cuestión

package aiss.model.lol.league;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "summonerId" })
public class League {

	@JsonProperty("summonerId")
	private List<SummonerId> summonerId = null;

	@JsonProperty("summonerId")
	public List<SummonerId> getSummonerId() {
		return summonerId;
	}

}