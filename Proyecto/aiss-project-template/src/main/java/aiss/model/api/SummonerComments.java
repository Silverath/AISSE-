package aiss.model.api;

import java.util.ArrayList;
import java.util.List;

public class SummonerComments {

	private String id;
	private List<Comment> comments;

	public SummonerComments() {

	}

	public SummonerComments(String id) {
		this.id = id;

	}

	protected void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public Comment getComment(String id) {

		if (comments == null)
			return null;

		Comment comment = null;
		for (Comment c : comments)
			if (c.getId().equals(id)) {
				comment = c;
				break;
			}

		return comment;
	}

	public void addComment(Comment c) {
		if (comments == null)
			comments = new ArrayList<Comment>();
		comments.add(c);
	}

	public void deleteComment(Comment c) {
		comments.remove(c);
	}

	public void deleteComment(String id) {
		Comment c = getComment(id);
		if (c != null)
			comments.remove(c);
	}

}
