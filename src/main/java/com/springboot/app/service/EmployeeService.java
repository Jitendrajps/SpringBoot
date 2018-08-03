package com.springboot.app.service;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
@Path("/EmployeeService")
public class EmployeeService {

	@GET
	@Path("/getHelloMessage")
	@Produces("text/plain")
	public String getHelloMessage() {
		System.out.println("hello Guest:");
		return "Hello Guest!";		
	}
	
	
}
