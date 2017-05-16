
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "small", "medium", "large", "template" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Preview {

	@JsonProperty("small")
	private String small;
	@JsonProperty("medium")
	private String medium;
	@JsonProperty("large")
	private String large;
	@JsonProperty("template")
	private String template;

	@JsonProperty("small")
	public String getSmall() {
		return small;
	}

	@JsonProperty("medium")
	public String getMedium() {
		return medium;
	}

	@JsonProperty("large")
	public String getLarge() {
		return large;
	}

	@JsonProperty("template")
	public String getTemplate() {
		return template;
	}

}
