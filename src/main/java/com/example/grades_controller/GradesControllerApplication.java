package com.example.grades_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradesControllerApplication implements CommandLineRunner {

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	public static void main(String[] args) {
		SpringApplication.run(GradesControllerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("H2 Database JDBC URL: " + datasourceUrl);
		System.out.println("You can access console at: http://localhost:8080/h2-console");
	}
}
