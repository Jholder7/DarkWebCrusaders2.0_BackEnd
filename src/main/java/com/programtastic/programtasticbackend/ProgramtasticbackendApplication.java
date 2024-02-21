package com.programtastic.programtasticbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProgramtasticbackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProgramtasticbackendApplication.class, args);
	}
}