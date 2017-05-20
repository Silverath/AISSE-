
package aiss.model.yt.video;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "url", "width", "height" })
public class Medium {

	@JsonProperty("url")
	private String url;
	@JsonProperty("width")
	private Long width;
	@JsonProperty("height")
	private Long height;

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("width")
	public Long getWidth() {
		return width;
	}

	@JsonProperty("height")
	public Long getHeight() {
		return height;
	}

}
