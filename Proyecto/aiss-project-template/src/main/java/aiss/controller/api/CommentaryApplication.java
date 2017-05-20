package aiss.controller.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.model.resource.api.CommentResource;
import aiss.model.resource.api.SummonerCommentsResource;

public class CommentaryApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	// Loads all resources that are implemented in the application
	// so that they can be found by RESTEasy.
	public CommentaryApplication() {

		singletons.add(SummonerCommentsResource.getInstance());
		singletons.add(CommentResource.getInstance());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
