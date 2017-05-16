//Miniatura del Stream

package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "large", "medium", "small", "template" })
public class Preview {

	@JsonProperty("large")
	private String large;
	@JsonProperty("medium")
	private String medium;
	@JsonProperty("small")
	private String small;
	@JsonProperty("template")
	private String template;

	@JsonProperty("large")
	public String getLarge() {
		return large;
	}

	@JsonProperty("medium")
	public String getMedium() {
		return medium;
	}

	@JsonProperty("small")
	public String getSmall() {
		return small;
	}

	@JsonProperty("template")
	public String getTemplate() {
		return template;
	}

}