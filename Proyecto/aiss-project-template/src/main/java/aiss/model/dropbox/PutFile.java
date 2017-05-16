package aiss.model.dropbox;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "size", "rev", "thumb_exists", "bytes", "modified", "path", "is_dir", "icon", "root", "mime_type",
		"revision" })
public class PutFile {

	@JsonProperty("size")
	private String size;
	@JsonProperty("rev")
	private String rev;
	@JsonProperty("thumb_exists")
	private Boolean thumbExists;
	@JsonProperty("bytes")
	private Integer bytes;
	@JsonProperty("modified")
	private String modified;
	@JsonProperty("path")
	private String path;
	@JsonProperty("is_dir")
	private Boolean isDir;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("root")
	private String root;
	@JsonProperty("mime_type")
	private String mimeType;
	@JsonProperty("revision")
	private Integer revision;

	@JsonProperty("size")
	public String getSize() {
		return size;
	}

	@JsonProperty("rev")
	public String getRev() {
		return rev;
	}

	@JsonProperty("thumb_exists")
	public Boolean getThumbExists() {
		return thumbExists;
	}

	@JsonProperty("bytes")
	public Integer getBytes() {
		return bytes;
	}

	@JsonProperty("modified")
	public String getModified() {
		return modified;
	}

	@JsonProperty("path")
	public String getPath() {
		return path;
	}

	@JsonProperty("is_dir")
	public Boolean getIsDir() {
		return isDir;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("root")
	public String getRoot() {
		return root;
	}

	@JsonProperty("mime_type")
	public String getMimeType() {
		return mimeType;
	}

	@JsonProperty("revision")
	public Integer getRevision() {
		return revision;
	}

	@JsonProperty("revision")
	public void setRevision(Integer revision) {
		this.revision = revision;
	}

}