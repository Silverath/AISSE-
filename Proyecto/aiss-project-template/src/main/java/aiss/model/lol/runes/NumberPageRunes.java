//Devuelve el número de páginas de runas

package aiss.model.lol.runes;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "summonerId", "pages" })
public class NumberPageRunes {

	@JsonProperty("summonerId")
	private Integer summonerId;
	@JsonProperty("pages")
	private List<ContentPageRunes> pageRunes = null;

	@JsonProperty("summonerId")
	public Integer getSummonerId() {
		return summonerId;
	}

	@JsonProperty("pages")
	public List<ContentPageRunes> getPages() {
		return pageRunes;
	}
}