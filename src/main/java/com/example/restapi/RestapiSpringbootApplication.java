package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class RestapiSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiSpringbootApplication.class, args);
		System.out.println("Hello world");
		System.out.println("test sample");
	}

}
