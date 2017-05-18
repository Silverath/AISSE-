package aiss.model.resource;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.util.Series;

import com.google.appengine.api.files.FileServicePb.CreateRequest.Parameter;

import aiss.model.dropbox.folder.ListFolder;

public class DropboxResource {
	private String uri = "https://api.dropboxapi.com/2/";
	private String access_token = null;
	
	public DropboxResource(String token){
		this.access_token = token;
	}
	
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
	
	public ListFolder getFolders(){
		ClientResource cr = null;
		ListFolder res = null;
		
		try{
			cr = new ClientResource(uri + "files/list_Folder");
			addHeader(cr, "Authorization", "Bearer" + access_token);
			addHeader(cr, "Content-Type", "application/json");
			
		} catch (ResourceException re){
			
		}
		return null;
		
	}
}
