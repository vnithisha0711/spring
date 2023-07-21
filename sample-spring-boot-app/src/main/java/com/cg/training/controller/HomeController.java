package com.cg.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.entity.Employee;

//it defines the class as a Restful Service
@RestController //combo of controller of @Controller and @ResponseBody
@RequestMapping("/api")
public class HomeController {
	
	//REST End point
	//http://localhost:8081/api/hello
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello To Springboot REST API";
	}

	//http://localhost:8081/api/employee
	@GetMapping("/employee")
	public Employee employeeInfo() {
		return new Employee("admin@capgemini.com", "admin@123", "Super Admin", 25, 987657553L, "14 years", "Training", "Mumbai", 34000);
	}
}
