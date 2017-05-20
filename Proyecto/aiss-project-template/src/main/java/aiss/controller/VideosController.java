package aiss.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.LoLStreamsResource;
import aiss.model.resource.YTResource;
import aiss.model.twitch.LoLStreams;
import aiss.model.twitch.Stream;
import aiss.model.yt.search.Item;
import aiss.model.yt.search.YTSearch;
import aiss.model.yt.video.ItemVideo;
import aiss.model.yt.video.Video;

public class VideosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VideosController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoLStreamsResource infoTwitch = new LoLStreamsResource();
		YTResource infoYT = new YTResource();

		// Getting Twitch Stream
		String lol = "League%20of%20Legends";
		LoLStreams stream = infoTwitch.getStreams(lol);
		if (stream == null) {
			request.setAttribute("message", "No streams found");
		}
		Stream[] streams = stream.getStreams();
		System.out.println(streams);
		Stream primerStream = streams[0];
		System.out.println(primerStream);
		String nombreCanal = primerStream.getChannel().getDisplayName();
		System.out.println(nombreCanal);

		// Getting YT Videos
		YTSearch search = infoYT.searchVideos(nombreCanal);
		List<Item> videos = search.getItems();
		String ids[] = new String[5];
		String titles[] = new String[5];
		String urls[] = new String[5];
		int inc = 0;
		for (Item i : videos) {
			ids[inc] = i.getId().getVideoId();
			Video v = infoYT.getVideoDetails(ids[inc]);
			// List for items of the video obtained above
			// The list is always of length one because we initialize it each
			// time the loop starts.
			// Thus, we need to get the first(and only) item in the list
			List<ItemVideo> items = v.getItems();
			// Titles
			titles[inc] = items.get(0).getSnippet().getTitle();
			// Miniatures URLs
			urls[inc] = items.get(0).getSnippet().getThumbnails().getDefault().getUrl();
			System.out.println(i.getId());
			System.out.println("Title of the video");
			System.out.println(titles[inc]);
			System.out.println("Miniature URL");
			System.out.println(urls[inc]);
			inc++;
		}

		request.setAttribute("stream", stream.getStreams());
		request.setAttribute("nombreCanal", nombreCanal);
		request.setAttribute("ids", ids);
		request.setAttribute("titles", titles);
		request.setAttribute("miniatures", urls);
		request.getRequestDispatcher("/LoLMainPage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
