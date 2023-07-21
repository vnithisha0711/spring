package javacoding;
import java.util.*;

public class SwapVariables {
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swaping:"+a+", "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After swaping:"+a+", "+b);
		
	}

}
