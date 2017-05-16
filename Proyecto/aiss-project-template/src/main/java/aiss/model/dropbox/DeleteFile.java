package aiss.model.dropbox;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "size", "is_deleted", "bytes", "thumb_exists", "rev", "modified", "path", "is_dir", "icon", "root",
		"mime_type", "revision" })
public class DeleteFile {

	@JsonProperty("size")
	private String size;
	@JsonProperty("is_deleted")
	private Boolean isDeleted;
	@JsonProperty("bytes")
	private Integer bytes;
	@JsonProperty("thumb_exists")
	private Boolean thumbExists;
	@JsonProperty("rev")
	private String rev;
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

	@JsonProperty("is_deleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("bytes")
	public Integer getBytes() {
		return bytes;
	}

	@JsonProperty("thumb_exists")
	public Boolean getThumbExists() {
		return thumbExists;
	}

	@JsonProperty("rev")
	public String getRev() {
		return rev;
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

}