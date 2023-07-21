package com.cg.training.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee 
{
   private int id;
   private String name;
   private String username;
   private String password;
   private int age;
//   private String address;
   private Address address;
   private long phone;
   private double salary;
   
   public Employee() {
	   System.out.println("Constructor");
   }
   
   
   
public Employee(int id, String name, String username, String password, int age, Address address, long phone,
		double salary) {
	super();
	this.id = id;
	this.name = name;
	this.username = username;
	this.password = password;
	this.age = age;
	this.address = address;
	this.phone = phone;
	this.salary = salary;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", age="
			+ age + ", address=" + address + ", phone=" + phone + ", salary=" + salary + "]";
}
   
@PostConstruct  
public void init() {
	System.out.println("Initialization");
}

@PreDestroy
public void preDestroy() {
	System.out.println("Destroy!");
}
}
