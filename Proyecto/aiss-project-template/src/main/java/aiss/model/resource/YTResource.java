package aiss.model.resource;

import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.util.Series;

import aiss.model.yt.search.YTSearch;
import aiss.model.yt.video.Video;

public class YTResource {

	private String URI_LIST = "https://www.googleapis.com/youtube/v3/search?part=id&type=video&maxResults=5&q=";
	private String API_KEY = "&key=AIzaSyDrerYwyqjpADTYzJehyAxLJQ2WeN0ignQ";
	private String URI_VIDEO = "https://www.googleapis.com/youtube/v3/videos?part=snippet&id=";

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

	public YTSearch searchVideos(String nombre) {
		ClientResource cr = null;
		YTSearch search = null;
		try {
			cr = new ClientResource(URI_LIST + nombre + API_KEY);
			search = cr.get(YTSearch.class);
		} catch (ResourceException re) {
			System.out.println("Error while searching: " + cr.getResponse().getStatus());
		}
		return search;
	}

	public Video getVideoDetails(String videoId) {
		ClientResource cr = null;
		Video video = null;
		try {
			cr = new ClientResource(URI_VIDEO + videoId + API_KEY);
			video = cr.get(Video.class);
		} catch (ResourceException re) {
			System.out.println("Error while retrieving the video: " + cr.getResponse().getStatus());
		}

		return video;
	}
}
