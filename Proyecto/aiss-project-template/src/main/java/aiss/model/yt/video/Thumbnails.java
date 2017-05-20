
package aiss.model.yt.video;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "default", "medium", "high", "standard", "maxres" })
public class Thumbnails {

	@JsonProperty("default")
	private Default _default;
	@JsonProperty("medium")
	private Medium medium;
	@JsonProperty("high")
	private High high;
	@JsonProperty("standard")
	private Standard standard;
	@JsonProperty("maxres")
	private Maxres maxres;

	@JsonProperty("default")
	public Default getDefault() {
		return _default;
	}

	@JsonProperty("medium")
	public Medium getMedium() {
		return medium;
	}

	@JsonProperty("high")
	public High getHigh() {
		return high;
	}

	@JsonProperty("standard")
	public Standard getStandard() {
		return standard;
	}

	@JsonProperty("maxres")
	public Maxres getMaxres() {
		return maxres;
	}

}
