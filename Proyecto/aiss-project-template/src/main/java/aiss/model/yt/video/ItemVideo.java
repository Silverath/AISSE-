
package aiss.model.yt.video;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kind", "etag", "id", "snippet" })
public class ItemVideo {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("id")
	private String id;
	@JsonProperty("snippet")
	private Snippet snippet;

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("etag")
	public String getEtag() {
		return etag;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("snippet")
	public Snippet getSnippet() {
		return snippet;
	}

}
