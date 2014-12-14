package com.abet.spa.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class ApiConfig extends ResourceConfig {

	public ApiConfig() {
		packages("com.abet.spa.api");

	}

}
