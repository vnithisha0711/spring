package Generics;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String department;
	
	public Employee(int id, String name, float salary, String department) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	private String displayDetails()
	{
		return "\nid- "+id+"   name- "+name+"   salary- "+salary+"   department-"+department;
	}
	
	@Override
	public String toString()
	{
		return displayDetails(); 
	}


}
