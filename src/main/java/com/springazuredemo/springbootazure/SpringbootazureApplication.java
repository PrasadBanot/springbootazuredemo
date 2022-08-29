package com.springazuredemo.springbootazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootazureApplication {
	
	@GetMapping("/message")
	
	public String message() {
		return "Hi Azure bro and Sushi sweety";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootazureApplication.class, args);
	}

}
