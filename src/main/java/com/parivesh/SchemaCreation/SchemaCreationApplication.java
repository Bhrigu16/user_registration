package com.parivesh.SchemaCreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.parivesh.*")
public class SchemaCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaCreationApplication.class, args);
	}

}
