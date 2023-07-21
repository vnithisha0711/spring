package LambdaExpressions;

import java.util.Scanner;

interface Arithmetic {
    int operations(int a, int b);
}

public class ArithmeticOperations {
	public class Main
	{
		public static void main(String[] args) {
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter two numbers:");
		   int x=sc.nextInt();
		   int y=sc.nextInt();
			Arithmetic add= (a,b) -> (a+b);
			System.out.println("Addition: "+ add.operations(x,y));
			
			Arithmetic sub= (a,b) -> (a-b);
			System.out.println("Substraction: "+ sub.operations(x,y));
			
			Arithmetic mul= (a,b) -> (a*b);
			System.out.println("Multiplication: "+ mul.operations(x,y));
			
			Arithmetic div= (a,b) -> (a/b);
			System.out.println("Division: "+ div.operations(x,y));
		
		   
		}
	}


}
