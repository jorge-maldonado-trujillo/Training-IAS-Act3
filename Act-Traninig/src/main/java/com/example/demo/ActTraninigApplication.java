package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class ActTraninigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActTraninigApplication.class, args);
	}

}
