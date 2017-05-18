package aiss.model.dropbox.folder;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "id", "client_modified", "server_modified", "rev", "size", "path_lower", "path_display",
		"sharing_info", "property_groups", "has_explicit_shared_members", "content_hash" })
@JsonIgnoreProperties(ignoreUnknown=true)

public class Upload {

	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private String id;
	@JsonProperty("client_modified")
	private String clientModified;
	@JsonProperty("server_modified")
	private String serverModified;
	@JsonProperty("rev")
	private String rev;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("path_lower")
	private String pathLower;
	@JsonProperty("path_display")
	private String pathDisplay;
	@JsonProperty("sharing_info")
	private SharingInfo sharingInfo;
	@JsonProperty("property_groups")
	private List<PropertyGroup> propertyGroups = null;
	@JsonProperty("has_explicit_shared_members")
	private Boolean hasExplicitSharedMembers;
	@JsonProperty("content_hash")
	private String contentHash;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("client_modified")
	public String getClientModified() {
		return clientModified;
	}

	@JsonProperty("server_modified")
	public String getServerModified() {
		return serverModified;
	}

	@JsonProperty("rev")
	public String getRev() {
		return rev;
	}

	@JsonProperty("size")
	public Integer getSize() {
		return size;
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

	@JsonProperty("has_explicit_shared_members")
	public Boolean getHasExplicitSharedMembers() {
		return hasExplicitSharedMembers;
	}

	@JsonProperty("content_hash")
	public String getContentHash() {
		return contentHash;
	}

}