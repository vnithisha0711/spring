package javacoding;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int b=a;
		int sum=0;
		while(b>9) {
			while(b>0) {
				int r=b%10;
				sum=sum+r;
				b=b/10;
				
			}
			b=sum;
			sum=0;
		}
		if(b==1) {
			System.out.println("It is a Magic number");
		}
		else {
			System.out.println("Not a magic number");
		}
	}

}
