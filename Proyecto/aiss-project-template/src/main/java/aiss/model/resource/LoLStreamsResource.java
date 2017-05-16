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

		try {
			cr = new ClientResource(uri + game);
		} catch (ResourceException re) {
			System.err.println("Status code:" + cr.getResponse().getStatus());
		}

		return res;
	}
}
