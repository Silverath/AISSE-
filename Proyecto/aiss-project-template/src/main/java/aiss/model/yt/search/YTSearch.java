
package aiss.model.yt.search;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kind", "etag", "nextPageToken", "regionCode", "pageInfo", "items" })
public class YTSearch {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("nextPageToken")
	private String nextPageToken;
	@JsonProperty("regionCode")
	private String regionCode;
	@JsonProperty("pageInfo")
	private PageInfo pageInfo;
	@JsonProperty("items")
	private List<Item> items = null;

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("etag")
	public String getEtag() {
		return etag;
	}

	@JsonProperty("nextPageToken")
	public String getNextPageToken() {
		return nextPageToken;
	}

	@JsonProperty("regionCode")
	public String getRegionCode() {
		return regionCode;
	}

	@JsonProperty("pageInfo")
	public PageInfo getPageInfo() {
		return pageInfo;
	}

	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}

}
