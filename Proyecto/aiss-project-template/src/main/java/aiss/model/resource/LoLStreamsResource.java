package aiss.model.resource;

import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.util.Series;

import aiss.model.twitch.LoLStreams;

public class LoLStreamsResource {

	private String uri = "https://api.twitch.tv/kraken/streams/?game=";

	public LoLStreamsResource() {

	}

	@SuppressWarnings("unchecked")
	public void addHeader(ClientResource cr, String headerName, String headerValue) {
		Series<Header> headers = (Series<Header>) cr.getRequest().getAttributes()
				.get(HeaderConstants.ATTRIBUTE_HEADERS);

		if (headers == null) {
			headers = new Series<Header>(Header.class);
			cr.getRequest().getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headers);
		}
		headers.add(headerName, headerValue);
	}

	public LoLStreams getStreams(String game) {

		ClientResource cr = null;
		LoLStreams res = null;

		try {
			cr = new ClientResource(uri + game);
			addHeader(cr, "Client-ID", "ryj52pbjdene8exzhd0vjo8q73oze2");
			res = cr.get(LoLStreams.class);
		} catch (ResourceException re) {
			System.err.println("Status code:" + cr.getResponse().getStatus());
		}

		return res;
	}
}
