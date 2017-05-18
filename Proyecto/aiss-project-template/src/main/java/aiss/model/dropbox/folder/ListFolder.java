package aiss.model.dropbox.folder;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "entries", "cursor", "has_more" })
@JsonIgnoreProperties(ignoreUnknown=true)

public class ListFolder {

	@JsonProperty("entries")
	private Entry[] entries = null;
	@JsonProperty("cursor")
	private String cursor;
	@JsonProperty("has_more")
	private Boolean hasMore;

	@JsonProperty("entries")
	public Entry[] getEntries() {
		return entries;
	}

	@JsonProperty("cursor")
	public String getCursor() {
		return cursor;
	}

	@JsonProperty("has_more")
	public Boolean getHasMore() {
		return hasMore;
	}

}