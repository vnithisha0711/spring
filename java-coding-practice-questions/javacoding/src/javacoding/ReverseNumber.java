package javacoding;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=n;
		int rev=0;
		while(b!=0) {
			int r=b%10;
			rev=rev*10+r;
			b=b/10;
		}
		System.out.println("Reverse of number:"+rev);

	}

}
