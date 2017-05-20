package aiss.model.resource.api;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.api.Comment;
import aiss.model.api.SummonerComments;
import aiss.model.repository.api.MapSummonerCommentsRepository;
import aiss.model.repository.api.SummonerCommentsRepository;

@Path("/lists")
public class SummonerCommentsResource {

	/* Singleton */
	private static SummonerCommentsResource _instance = null;
	SummonerCommentsRepository repository;

	private SummonerCommentsResource() {
		repository = MapSummonerCommentsRepository.getInstance();

	}

	public static SummonerCommentsResource getInstance() {
		if (_instance == null)
			_instance = new SummonerCommentsResource();
		return _instance;
	}

	@GET
	@Produces("application/json")
	public Collection<SummonerComments> getAll() {
		return repository.getAllSummonerComments();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public SummonerComments get(@PathParam("id") String id) {
		SummonerComments list = repository.getSummonerComments(id);

		if (list == null) {
			throw new NotFoundException("The SummonerComments wit id=" + id + " was not found");
		}

		return list;
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addSummonerComments(@Context UriInfo uriInfo, SummonerComments SummonerComments) {

		if (SummonerComments.getComments() != null)
			throw new BadRequestException("The Comments property is not editable.");

		repository.addSummonerComments(SummonerComments);

		// Builds the response. Returns the SummonerComments the has just been
		// added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(SummonerComments.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(SummonerComments);
		return resp.build();
	}

	@PUT
	@Consumes("application/json")
	public Response updateSummonerComments(SummonerComments SummonerComments) {
		SummonerComments oldSummonerComments = repository.getSummonerComments(SummonerComments.getId());
		if (oldSummonerComments == null) {
			throw new NotFoundException("The SummonerComments with id=" + SummonerComments.getId() + " was not found");
		}

		if (SummonerComments.getComments() != null)
			throw new BadRequestException("The Comments property is not editable.");

		return Response.noContent().build();
	}

	@DELETE
	@Path("/{id}")
	public Response removeSummonerComments(@PathParam("id") String id) {
		SummonerComments toberemoved = repository.getSummonerComments(id);
		if (toberemoved == null)
			throw new NotFoundException("The SummonerComments with id=" + id + " was not found");
		else
			repository.deleteSummonerComments(id);

		return Response.noContent().build();
	}

	@POST
	@Path("/{SummonerCommentsId}/{CommentId}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Response addComment(@Context UriInfo uriInfo, @PathParam("SummonerCommentsId") String SummonerCommentsId,
			@PathParam("comentId") String CommentId) {

		SummonerComments SummonerComments = repository.getSummonerComments(SummonerCommentsId);
		Comment Comment = repository.getComment(CommentId);

		if (SummonerComments == null)
			throw new NotFoundException("The SummonerComments with id=" + SummonerCommentsId + " was not found");

		if (Comment == null)
			throw new NotFoundException("The Comment with id=" + CommentId + " was not found");

		if (SummonerComments.getComment(CommentId) != null)
			throw new BadRequestException("The Comment is already included in the SummonerComments.");

		repository.addComment(SummonerCommentsId, CommentId);

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(SummonerCommentsId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(SummonerComments);
		return resp.build();
	}

	@DELETE
	@Path("/{SummonerCommentsId}/{CommentId}")
	public Response removeComment(@PathParam("SummonerCommentsId") String SummonerCommentsId,
			@PathParam("CommentId") String CommentId) {
		SummonerComments SummonerComments = repository.getSummonerComments(SummonerCommentsId);
		Comment Comment = repository.getComment(CommentId);

		if (SummonerComments == null)
			throw new NotFoundException("The SummonerComments with id=" + SummonerCommentsId + " was not found");

		if (Comment == null)
			throw new NotFoundException("The Comment with id=" + CommentId + " was not found");

		repository.removeComment(SummonerCommentsId, CommentId);

		return Response.noContent().build();
	}
}
