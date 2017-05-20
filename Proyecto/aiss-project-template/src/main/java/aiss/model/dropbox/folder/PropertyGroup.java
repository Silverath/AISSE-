
package aiss.model.dropbox.folder;

import java.util.List;
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
    "template_id",
    "fields"
})
<<<<<<< HEAD
@JsonIgnoreProperties(ignoreUnknown=true)

=======
<<<<<<< HEAD
=======
@JsonIgnoreProperties(ignoreUnknown=true)

>>>>>>> master
>>>>>>> Figueroa
public class PropertyGroup {

    @JsonProperty("template_id")
    private String templateId;
    @JsonProperty("fields")
    private List<Field> fields = null;

    @JsonProperty("template_id")
    public String getTemplateId() {
        return templateId;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

}
