package javacoding;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 System.out.print("Factors of given number are:");
		 
		 for (int i=1;i<=n;i++) {
			 if(n%i==0) {
				 System.out.print(i+" ");
			 }
		 }
	}
}
			 
		 
		 
	
