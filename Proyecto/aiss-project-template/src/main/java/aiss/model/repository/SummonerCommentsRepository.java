package aiss.model.repository;

import java.util.Collection;

import aiss.model.api.Comment;
import aiss.model.api.SummonerComments;

public interface SummonerCommentsRepository {
	
	
	// SummonerComments
	public void addComment(Comment c);
	public Collection<Comment> getAllComments();
	public Comment getComment(String commentId);
	public void updateComment(Comment c);
	public void deleteComment(String songId);
	
	// SummonerComments
	public void addSummonerComments(SummonerComments sc);
	public Collection<SummonerComments> getAllSummonerComments();
	public SummonerComments getPlaylist(String summonerCommentsId);
	public void updateSummonerComments(SummonerComments sc);
	public void deleteSummonerComments(String summonerCommentsId);
	public Collection<Comment> getAll(String summonerCommentId);
	public void addComment(String summonerCommentId, String commentId);
	public void removeComment(String summonerCommentId, String commentId); 

	
	
	
	

}