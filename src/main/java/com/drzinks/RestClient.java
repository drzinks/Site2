package com.drzinks;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.vaadin.spring.annotation.UIScope;

@UIScope
@Component
public class RestClient {

	private Client client = ClientBuilder.newClient();
	private WebTarget webtarget = client.target("http://localhost:8080");
	
	public String getSthFromServer() {
		String response;
		response = webtarget.path("server").path("sth")
				.request(MediaType.APPLICATION_JSON).get(String.class);
		return response;
	
	}
	
}
