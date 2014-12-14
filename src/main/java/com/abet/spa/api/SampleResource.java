package com.abet.spa.api;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("sample")
public class SampleResource {

	@PostConstruct
	public void init() {
		System.out.println("Init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}

	@GET
	@Produces("text/plain")
	@Path("index")
	public String index() {
		return "sample";
	}

}
