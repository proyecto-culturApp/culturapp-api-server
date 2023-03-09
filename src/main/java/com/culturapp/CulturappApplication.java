package com.culturapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CulturappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CulturappApplication.class, args);
	}

}
