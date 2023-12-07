package com.example.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories
public class EmployeeServiceApplication {

	public static void main(String[] args) { 
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}
		
		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
	}

}
