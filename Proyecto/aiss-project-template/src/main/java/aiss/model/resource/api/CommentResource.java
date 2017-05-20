package aiss.model.resource.api;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import aiss.model.api.Comment;
import aiss.model.repository.api.MapSummonerCommentsRepository;
import aiss.model.repository.api.SummonerCommentsRepository;

@Path("/comments")
public class CommentResource {

	public static CommentResource _instance = null;
	SummonerCommentsRepository repository;

	private CommentResource() {
		repository = MapSummonerCommentsRepository.getInstance();
	}

	public static CommentResource getInstance() {
		if (_instance == null)
			_instance = new CommentResource();
		return _instance;
	}

	@GET
	@Produces("application/json")
	public Collection<Comment> getAll() {
		return repository.getAllComments();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Comment get(@PathParam("id") String CommentId) {
		Comment Comment = repository.getComment(CommentId);
		return Comment;
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addComment(@Context UriInfo uriInfo, Comment Comment) {
		repository.addComment(Comment);
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(Comment.getId());
		ResponseBuilder res = Response.created(uri);
		res.entity(Comment);
		return res.build();
	}

	@PUT
	@Consumes("application/json")
	public Response updateComment(Comment Comment) {
		Comment oldComment = repository.getComment(Comment.getId());
		repository.updateComment(Comment);
		return Response.noContent().build();
	}

	@DELETE
	@Path("/{id}")
	public Response removeComment(@PathParam("id") String CommentId) {
		repository.deleteComment(CommentId);
		return Response.noContent().build();
	}

}
