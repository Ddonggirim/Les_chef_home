package com.example.LesChef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LesChefApplication {

	public static void main(String[] args) {
		SpringApplication.run(LesChefApplication.class, args);
	}

}
