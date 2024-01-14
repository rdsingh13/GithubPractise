package com.example.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubApplication.class, args);
	}
	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello  World!!!";
	}

	@GetMapping("/hi")
	public String hi(){
		return "Hi!!!";
	}
}
