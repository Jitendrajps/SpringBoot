package com.springboot.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.springboot.app.service.EmployeeService;

@Configuration
@ApplicationPath("/API")
public class JerseyConfig extends ResourceConfig{
	 
	public JerseyConfig() {	        
	        register(EmployeeService.class);
	        //register(ReverseService.class);
	    }

}
