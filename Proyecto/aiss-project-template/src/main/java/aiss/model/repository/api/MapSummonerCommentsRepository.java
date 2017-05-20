package aiss.model.repository.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.ls.LSOutput;

import aiss.model.api.Comment;
import aiss.model.api.SummonerComments;

public class MapSummonerCommentsRepository implements SummonerCommentsRepository {

	Map<String, SummonerComments> summonerCommentMap;
	Map<String, Comment> commentMap;
	private static MapSummonerCommentsRepository instance = null;
	private int index = 0; // Index to create playlists and songs' identifiers.

	public static MapSummonerCommentsRepository getInstance() {

		if (instance == null) {
			instance = new MapSummonerCommentsRepository();
			// instance.init();
		}

		return instance;
	}

	@Override
	public void addComment(Comment c) {
		String id = "c" + index++;
		c.setId(id);

		commentMap.put(id, c);

	}

	@Override
	public Collection<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return commentMap.values();
	}

	@Override
	public Comment getComment(String commentId) {
		// TODO Auto-generated method stub
		return commentMap.get(commentId);
	}

	@Override
	public void updateComment(Comment c) {
		commentMap.put(c.getId(), c);

	}

	@Override
	public void deleteComment(String commentId) {
		commentMap.remove(commentId);

	}

	@Override
	public void addSummonerComments(SummonerComments sc) {
		String id = "sc" + index++;
		sc.setId(id);
		summonerCommentMap.put(id, sc);

	}

	@Override
	public Collection<SummonerComments> getAllSummonerComments() {
		// TODO Auto-generated method stub
		return summonerCommentMap.values();
	}

	@Override
	public void updateSummonerComments(SummonerComments sc) {
		summonerCommentMap.put(sc.getId(), sc);

	}

	@Override
	public void deleteSummonerComments(String summonerCommentsId) {
		summonerCommentMap.remove(summonerCommentsId);
	}

	@Override
	public Collection<Comment> getAll(String summonerCommentId) {
		// TODO Auto-generated method stub
		return getSummonerComments(summonerCommentId).getComments();
	}

	@Override
	public void addComment(String summonerCommentId, String commentId) {
		SummonerComments summonerComments = getSummonerComments(summonerCommentId);
		summonerComments.addComment(commentMap.get(commentId));
	}

	@Override
	public void removeComment(String summonerCommentId, String commentId) {
		getSummonerComments(summonerCommentId).deleteComment(commentId);
	}

	@Override
	public SummonerComments getSummonerComments(String summonerCommentsId) {
		// TODO Auto-generated method stub
		return summonerCommentMap.get(summonerCommentsId);

	}

}
