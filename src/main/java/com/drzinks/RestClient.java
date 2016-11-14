package com.drzinks;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


public class RestClient {

	private Client client = ClientBuilder.newClient();
	private WebTarget webtarget = client.target("http://localhost:8080");
	
	public String getSthFromServer() {
		String response;
		response = webtarget.path("sth")
				.request().get(String.class);
		return response;
	}
	
}
