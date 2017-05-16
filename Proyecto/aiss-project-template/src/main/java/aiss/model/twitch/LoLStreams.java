
package aiss.model.twitch;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_total", "streams", "_links" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoLStreams {

	@JsonProperty("_total")
	private Integer total;
	@JsonProperty("streams")
	private List<Stream> streams = null;
	@JsonProperty("_links")
	private Links__ links;

	@JsonProperty("_total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("streams")
	public List<Stream> getStreams() {
		return streams;
	}

	@JsonProperty("_links")
	public Links__ getLinks() {
		return links;
	}

}
