
package aiss.model.dropbox.folder;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
=======
<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
>>>>>>> master
>>>>>>> Figueroa
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value"
})
<<<<<<< HEAD
@JsonIgnoreProperties(ignoreUnknown=true)

=======
<<<<<<< HEAD
=======
@JsonIgnoreProperties(ignoreUnknown=true)

>>>>>>> master
>>>>>>> Figueroa
public class Field {

    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

}
