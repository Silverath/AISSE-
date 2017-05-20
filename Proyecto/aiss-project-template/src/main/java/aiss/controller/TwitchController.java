package aiss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.LoLStreamsResource;
import aiss.model.twitch.Channel;
import aiss.model.twitch.LoLStreams;
import aiss.model.twitch.Stream;

public class TwitchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TwitchController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoLStreamsResource info = new LoLStreamsResource();

		String lol = "League%20of%20Legends";

		LoLStreams stream = info.getStreams(lol);

		if (stream == null) {
			request.setAttribute("message", "No streams found");
		}

		Stream[] streams = stream.getStreams();

		System.out.println(streams);

		Stream primerStream = streams[0];

		System.out.println(primerStream);

		Channel canal = primerStream.getChannel();

		System.out.println(canal);

		String nombreCanal = canal.getDisplayName();

		System.out.println(nombreCanal);

		request.setAttribute("stream", stream.getStreams());
		request.setAttribute("nombreCanal", nombreCanal);
		request.getRequestDispatcher("/LoLMainPage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
