package com.cg.training.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.training.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Resource resource=new ClassPathResource("constructor-injection.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Employee employee = (Employee)beanFactory.getBean("employee");
//		employee.setUsername("superadmin");
//		System.out.println(employee);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee.getAddress());
		
	}

}
