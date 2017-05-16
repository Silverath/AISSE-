//Streams

package aiss.model.twitch;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_total", "streams" })
public class LoLStreams {

	@JsonProperty("_total")
	private Integer total;
	@JsonProperty("streams")
	private List<Stream> streams = null;

	@JsonProperty("_total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("streams")
	public List<Stream> getStreamList() {
		return streams;
	}
}