package aiss.model.api;

public class Comment {

	private String title;
	private String body;
	private String id;

	// private Integer like;
	// private Integer dislike;

	public Comment() {
	}

	public Comment(String title) {
		this.title = title;
	}

	public Comment(String title, String body) {
		this.title = title;
		this.body = body;
	}

	protected void setTitle(String title) {
		title = this.title;

	}

	protected void setBody(String body) {
		body = this.body;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// public Integer getLike() {
	// return this.like;
	// }
	// public Integer getDislike() {
	// return this.dislike;
	// }

}
