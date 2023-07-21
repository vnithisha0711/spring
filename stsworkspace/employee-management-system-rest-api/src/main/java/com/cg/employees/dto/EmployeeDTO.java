package com.cg.employees.dto;

import java.util.Objects;

//import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeDTO {
	private int id;
	@NotBlank(message = "The email should not be blank, empty or Null")
	//@Email(message = "Please enter a valid email id", regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z.]{2,5}")
	private String username;
	@NotBlank(message = "The password field should not be blank")
	@Size(min=5,max=15)
	private String password;
	@NotBlank(message = "The name should not be blank")
	@Size(min=3,max=100)
	private String name;
	@NotNull
	@Min(value=20, message = "Age should not be lessthan 20")
	@Max(value=45, message="Age should not be greater than 45")
	private int age;
	@NotNull
	private long phone;
	private String experience;
	private String department;
	private String address;
	private double salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, age, department, experience, id, name, password, phone, salary, username);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(department, other.department) && Objects.equals(experience, other.experience)
				&& id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& phone == other.phone && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(username, other.username);
	}
	
	

}
