package Generics;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeObjHashSet {
	void m1()
	{
		HashSet<Employee> set=new HashSet<Employee>();
		Scanner sc= new Scanner(System.in);
		
		int a;
		do
		{	
		System.out.println("\nenter employee details");
		
		System.out.println("\nenter id:");
		int id=sc.nextInt();
		
		System.out.println("\nenter name:");
		String name=sc.next();
		
		System.out.println("\nenter salary:");
		float salary=sc.nextFloat();
		
		System.out.println("\nenter department:");
		String department= sc.next();
		
	   set.add(new Employee(id,name,salary,department));
	   
	   System.out.println("enter '1' to enter an other employee details otherwise enter '0'");
		a=sc.nextInt();
		
		}
		while(a==1);
		System.out.println(set);
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		new EmployeeObjHashSet().m1();
	}


}
