
package aiss.model.yt.search;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "totalResults", "resultsPerPage" })
public class PageInfo {

	@JsonProperty("totalResults")
	private Long totalResults;
	@JsonProperty("resultsPerPage")
	private Long resultsPerPage;

	@JsonProperty("totalResults")
	public Long getTotalResults() {
		return totalResults;
	}

	@JsonProperty("resultsPerPage")
	public Long getResultsPerPage() {
		return resultsPerPage;
	}

}
