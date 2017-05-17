
package aiss.model.dropbox.folder;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "id", "path_lower", "path_display", "sharing_info", "property_groups" })
public class CreateFolder {

	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private String id;
	@JsonProperty("path_lower")
	private String pathLower;
	@JsonProperty("path_display")
	private String pathDisplay;
	@JsonProperty("sharing_info")
	private SharingInfo sharingInfo;
	@JsonProperty("property_groups")
	private List<PropertyGroup> propertyGroups = null;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("path_lower")
	public String getPathLower() {
		return pathLower;
	}

	@JsonProperty("path_display")
	public String getPathDisplay() {
		return pathDisplay;
	}

	@JsonProperty("sharing_info")
	public SharingInfo getSharingInfo() {
		return sharingInfo;
	}

	@JsonProperty("property_groups")
	public List<PropertyGroup> getPropertyGroups() {
		return propertyGroups;
	}

}
