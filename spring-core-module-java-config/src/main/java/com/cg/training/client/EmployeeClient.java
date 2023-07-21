package com.cg.training.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.training.config.ApplicationConfig;
import com.cg.training.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.cg.training"); //give base package name
		context.refresh();

		Employee employee=context.getBean(Employee.class);
		System.out.println(employee);
		
		context.close();
	}

}
