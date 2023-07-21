package com.cg.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.training.model.Employee;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Employee getEmployeeBean() {
//		return new Employee(3001, "Kiran", "kiran@123", null, 22, null, 787654576, 30000); //empty obj from the config
	return new Employee();
	}

	
}
