package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.model.api.Comment;
import aiss.model.api.SummonerComments;
import aiss.model.lol.LoLID;
import aiss.model.resource.LoLResource;

public class MapSummonerCommentsRepository implements SummonerCommentsRepository{

	Map<String, SummonerComments> summonerCommentsMap;
	Map<String, Comment> commentMap;
	private static MapSummonerCommentsRepository instance=null;
	private int index=0;			// Index to create summonerComments and comments' identifiers.
	
	
public static MapSummonerCommentsRepository getInstance() {
		
		if (instance==null) {
			instance = new MapSummonerCommentsRepository();
			instance.init();
		}
		
		return instance;
	}

public void init() {
	
	summonerCommentsMap = new HashMap<String,SummonerComments>();
	commentMap = new HashMap<String,Comment>();
	
	// Create songs
	Comment flameo=new Comment();
	flameo.setTitle("Manco");
	flameo.setAuthor("UnluckySilverath");
	flameo.setBody("pues eso tío, que eres un manco y a ver cuándo te compras una mano noob");
	addComment(flameo);
	
	Song one=new Song();
	one.setTitle("One");
	one.setArtist("U2");
	one.setYear("1992");
	one.setAlbum("Achtung Baby");
	addSong(one);
	
	Song losingMyReligion=new Song();
	losingMyReligion.setTitle("Losing my Religion");
	losingMyReligion.setArtist("REM");
	losingMyReligion.setYear("1991");
	losingMyReligion.setAlbum("Out of Time");
	addSong(losingMyReligion);
	
	Song smellLikeTeenSpirit=new Song();
	smellLikeTeenSpirit.setTitle("Smell Like Teen Spirit");
	smellLikeTeenSpirit.setArtist("Nirvana");
	smellLikeTeenSpirit.setAlbum("Nevermind");
	smellLikeTeenSpirit.setYear("1991");
	addSong(smellLikeTeenSpirit);
	
	Song gotye=new Song();
	gotye.setTitle("Someone that I used to know");
	gotye.setArtist("Gotye");
	gotye.setYear("2011");
	gotye.setAlbum("Making Mirrors");
	addSong(gotye);
	
	// Create playlists
	LoLResource info = new LoLResource();
	String name = request.getParameter("summonername");
	LoLID summoner = info.getSummoner(name);
	SummonerComments blae=new SummonerComments();
	blae.setSummoner(summoner);
	japlaylist.setDescription("AISS PlayList");
	addPlaylist(japlaylist);
	
	Playlist playlist = new Playlist();
	playlist.setName("Favourites");
	playlist.setDescription("A sample playlist");
	addPlaylist(playlist);
	
	// Add songs to playlists
	addSong(japlaylist.getId(), rollingInTheDeep.getId());
	addSong(japlaylist.getId(), one.getId());
	addSong(japlaylist.getId(), smellLikeTeenSpirit.getId());
	addSong(japlaylist.getId(), losingMyReligion.getId());
	
	addSong(playlist.getId(), losingMyReligion.getId());
	addSong(playlist.getId(), gotye.getId());
}
	
	@Override
	public void addComment(Comment c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getComment(String commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateComment(Comment c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(String songId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSummonerComments(SummonerComments sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<SummonerComments> getAllSummonerComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SummonerComments getPlaylist(String summonerCommentsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSummonerComments(SummonerComments sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSummonerComments(String summonerCommentsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Comment> getAll(String summonerCommentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComment(String summonerCommentId, String commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeComment(String summonerCommentId, String commentId) {
		// TODO Auto-generated method stub
		
	}

}
