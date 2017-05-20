
package aiss.model.yt.video;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kind", "etag", "pageInfo", "items" })
public class Video {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("pageInfo")
	private PageInfo pageInfo;
	@JsonProperty("items")
	private List<ItemVideo> items = null;

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("etag")
	public String getEtag() {
		return etag;
	}

	@JsonProperty("pageInfo")
	public PageInfo getPageInfo() {
		return pageInfo;
	}

	@JsonProperty("items")
	public List<ItemVideo> getItems() {
		return items;
	}

}
