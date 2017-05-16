package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.FacebookResource;

public class FacebookController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6818025976353856770L;
	private static final Logger log = Logger.getLogger(FacebookController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String accessToken = (String) req.getSession().getAttribute("Facebook-token");
		if (accessToken != null && !"".equals(accessToken)) {
			FacebookResource fbResource = new FacebookResource(accessToken);
			if (req.getSession().getAttribute("message") != null) {
				fbResource.publishPost((String) req.getSession().getAttribute("message"));
			} else {
				fbResource.publishPost(req.getParameter("message"));
			}
			req.getRequestDispatcher("/PostSuccessfullyCreated.html").forward(req, resp);
		} else {
			req.getSession().setAttribute("message", req.getParameter("message"));
			log.info("Trying to acces to Facebook without an acces token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Facebook").forward(req, resp);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
}
