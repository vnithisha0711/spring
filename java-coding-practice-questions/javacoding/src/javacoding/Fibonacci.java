package javacoding;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0,y=1;
		System.out.print("enter the number:");
		int n = sc.nextInt();
		
		while(x<=n) {
			System.out.print(x + " ");
			int sum = x + y;
			x = y;
			y = sum;
			
		}


	}

}
