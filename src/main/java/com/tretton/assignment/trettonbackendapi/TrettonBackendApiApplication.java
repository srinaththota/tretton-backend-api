package com.tretton.assignment.trettonbackendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tretton.assignment.*")
public class TrettonBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrettonBackendApiApplication.class, args);
	}

}
