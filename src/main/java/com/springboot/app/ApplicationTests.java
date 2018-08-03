package com.springboot.app;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.app.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@SpringBootTest
public class ApplicationTests {

	
	@Autowired
    private EmployeeService service;

	@Autowired
    private TestRestTemplate restTemplate;
	
	@LocalServerPort
	private int serverPort;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(service).isNotNull();

	}


	@Test
    public void getHelloMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + serverPort + "/API/EmployeeService/getHelloMessage",
                String.class)).contains("Hello Guest!");
    }

	@Test
    public void getHelloMessage1() throws Exception {
        assertThat(service.getHelloMessage().contentEquals("Hello Guest!"));
    }


}
