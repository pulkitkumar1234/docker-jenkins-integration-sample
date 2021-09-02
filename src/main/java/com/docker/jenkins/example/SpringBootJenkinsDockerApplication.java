package com.docker.jenkins.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsDockerApplication {

	@GetMapping("/message")
	public String get(){
		return "Test String";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDockerApplication.class, args);
	}

}
