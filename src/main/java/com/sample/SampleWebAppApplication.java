package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleWebAppApplication {
	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to sample web app.";
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleWebAppApplication.class, args);
	}

}
