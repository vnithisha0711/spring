package javacoding;
import java.util.*;
public class Palindrome {
	public static boolean isPalindrome(String s) {
		String rev="";
		boolean res= false;
		for (int i = s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			res=true;
		}
		return res;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		s.toLowerCase();
		boolean t= isPalindrome(s);
		if(t) {
			System.out.println("It is a Palindrome.");
		}
		else {
			System.out.println("It is not a Palindrome.");
		}
	}
}
