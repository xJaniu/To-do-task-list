package com.example.ToDo.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.persistence.Entity;

@SpringBootApplication
public class ToDoSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoSpringAppApplication.class, args);
	}

}
