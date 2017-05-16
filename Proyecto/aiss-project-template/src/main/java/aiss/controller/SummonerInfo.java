package aiss.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.lol.LoLID;
import aiss.model.resource.LoLResource;

public class SummonerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SummonerInfo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LoLResource info = new LoLResource();

		String name = request.getParameter("summonername");

		LoLID summoner = info.getSummoner(name);

		if (summoner == null) {
			request.setAttribute("message", "Summoner not found");
		}

		request.setAttribute("id", summoner.getId());
		request.getRequestDispatcher("/LoLSummonerView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
