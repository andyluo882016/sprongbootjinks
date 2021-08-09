package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsTestApplication.class, args);
	}
	
	@GetMapping(path="/test")
	public String MyTest() {
		return "<h1>Hello My Jenkin Web Demos</h1>"+"<br><h3>My adding new Statement </h3>";
	}
	
	@GetMapping(path="/show")
	public String MyShow() {
		return "<h1>Hello My Jenkin Adding new context</h1>"+"<br><h3>My adding new Say Hello </h3>";
	}

}
