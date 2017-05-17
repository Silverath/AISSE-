package aiss.model.resource;

import org.restlet.resource.ClientResource;

public class FacebookResource {
	private String uri = "https://graph.facebook.com/me/feed";
	private String access_token = null;

	public FacebookResource(String access_token) {
		this.access_token = access_token;
	}

	public boolean publishPost(String message) {
		String normalizedMessage = message.replace(' ', '+');
		String uri_post = uri + "?access_token=" + access_token;
		System.out.println("Facebook URI: " + uri_post);
		System.out.println("Message: "+ message);
		ClientResource cr = new ClientResource(uri + "?access_token=" + access_token);
		cr.post("message=" + normalizedMessage);
		return true;
	}
}