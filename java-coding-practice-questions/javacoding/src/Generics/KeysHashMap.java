package Generics;

import java.util.HashMap;
import java.util.Scanner;

public class KeysHashMap {
	void m1()
	{
		HashMap<Integer,Double> map= new HashMap<Integer,Double>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("\nenter "+(i+1)+" th key");
			int key=sc.nextInt();
			System.out.println("\nenter " + (i+1) + " th value");
			double value=sc.nextDouble();
			map.put(key, value);
		}
		System.out.println(map);
		sc.close();
	}
	public static void main(String[] args) 
	{
		new KeysHashMap().m1();
	}


}
