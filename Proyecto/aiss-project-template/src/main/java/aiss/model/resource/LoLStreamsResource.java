package aiss.model.resource;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.twitch.LoLStreams;

public class LoLStreamsResource {

	private String uri = "https://api.twitch.tv/kraken/streams/?game=";
	private String access_token = null;

	public LoLStreamsResource() {

	}

	public LoLStreams getStreams(String game) {

		ClientResource cr = null;
		LoLStreams res = null;
		String clientid = "ryj52pbjdene8exzhd0vjo8q73oze2";
		String secret = "7xqd59qxx3twofy3oz5r27rs1gqhtw";
		String urlParameters =
				  "client_id=" + clientid
				+ "&grant_type=authorization_code"
				+ "&redirect_uri=" + "http://localhost:8090"
				+ "&scopes=openid";
				

		try {
			cr = new ClientResource(uri + game + urlParameters);
			res = cr.get(LoLStreams.class);
		} catch (ResourceException re) {
			System.err.println("Status code:" + cr.getResponse().getStatus());
		}

		return res;
	}
}
