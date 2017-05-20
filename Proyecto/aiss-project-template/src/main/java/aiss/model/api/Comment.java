package aiss.model.api;

import aiss.model.lol.LoLID;

public class Comment {

	private String title;
	private String body;
	private String id;
	private String author;

	public Comment() {
	}

	public Comment(String title) {
		this.title = title;
	}

	public Comment(String title, String body) {
		this.title = title;
		this.body = body;
	}

	public Comment(String title, String body, LoLID summoner) {
		this.title = title;
		this.body = body;
		this.author = summoner.getName();
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void setBody(String body) {
		this.body = body;

	}

	public void setAuthor(String summoner) {

		this.author = summoner;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public String getAuthor() {
		return author;
	}

}
