package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp2JenkinsApplication.class, args);

		
        System.out.println("Hello Jenkins!"); // Ajoutez ce message
	}

}
