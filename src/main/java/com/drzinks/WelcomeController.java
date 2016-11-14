package com.drzinks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/sth")
public class WelcomeController {

	@GET
	@Produces("text/plain")
	public String getSthElse(){
		return "sth elese";
	}
}
