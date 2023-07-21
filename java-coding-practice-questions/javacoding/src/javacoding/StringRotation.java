package javacoding;

import java.util.Scanner;

public class StringRotation {
	 static boolean checkRotation(String s1,String s2) {
		  if(s1.length() != s2.length())
		  return false;
		  String temp =s1 + s1;
		  if(temp.indexOf(s2) != -1) {
			  return true;
		  
		  } 
		  else {
			  return false;
		  }
		  
	 }

     public static void main(String[] args) {
		 
		  Scanner sc=new Scanner(System.in);
		  String str1=sc.nextLine();
		  String str2=sc.nextLine();
			 
		  
		  if(checkRotation(str1,str2)) {
			  System.out.println("Given Strings are rotations to each other");
		  }
			  
		  else {
			  System.out.println("Given Strings are not rotational to each other");
		  }
     }
}
