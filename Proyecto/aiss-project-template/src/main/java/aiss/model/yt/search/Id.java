
package aiss.model.yt.search;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kind", "videoId" })
public class Id {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("videoId")
	private String videoId;

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("videoId")
	public String getVideoId() {
		return videoId;
	}

}
