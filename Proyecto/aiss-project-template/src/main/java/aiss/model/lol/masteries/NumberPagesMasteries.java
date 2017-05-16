//Devuelve el número de páginas de maestrías

package aiss.model.lol.masteries;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "summonerId", "pages" })
public class NumberPagesMasteries {

	@JsonProperty("summonerId")
	private Integer summonerId;
	@JsonProperty("pages")
	private List<ContentPageMasteries> pageMasteries = null;

	@JsonProperty("summonerId")
	public Integer getSummonerId() {
		return summonerId;
	}

	@JsonProperty("pages")
	public List<ContentPageMasteries> getPages() {
		return pageMasteries;
	}
}