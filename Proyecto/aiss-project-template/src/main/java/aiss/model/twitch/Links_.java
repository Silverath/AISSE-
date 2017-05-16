
package aiss.model.twitch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links_ {

	@JsonProperty("self")
	private String self;

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

}
