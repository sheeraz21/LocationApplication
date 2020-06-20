package com.vgroup.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan("com.vgroup.app.*")
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	
	

	@Profile("test")
	@Bean
	public String testDatabaseConnection() {
		
		return "DB Connection to RDS_TEST - Low Cost Instance";
	}


}
