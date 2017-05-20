import org.junit.Test;
import static org.junit.Assert.*;

import aiss.model.resource.LoLStreamsResource;
import aiss.model.twitch.LoLStreams;

public class TestTwitch {

	static LoLStreamsResource twitchres = new LoLStreamsResource();
	String game = "League%20of%20Legends";

	@Test
	public void testTwitch() {
		LoLStreams res = twitchres.getStreams(game);
		System.out.println(res);
		assertNotNull("El test no ha funcionado", res);
	}
	
	

}
