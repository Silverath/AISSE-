import org.junit.Assert;
import org.junit.Test;

import aiss.model.resource.FacebookResource;

public class FacebookTest {

	static String res = "EAAU0xv9prkABAFqL309jjPfZAEmQXIUbfwjX16ZA9nYUX83zs98jQHBrwA981axeHEBYdImZAAhNhbZAO7ZCUwW7WsitWefYDAhi2Qgj7GiRUf0tHqZAPoJmFzpO5zPV4ZCdJaoYGYZAkYVF2GZAXEUhwGMEdc0wOA7pGNnYcbpy5SaVOZCUhr1mjrA15KXuZCqpoEZD";

	public void testFb() {
		FacebookResource fbResource = new FacebookResource(res);
		fbResource.publishPost("prueba");
		Assert.assertNotNull("El test no ha funcionado", fbResource);
	}

}
