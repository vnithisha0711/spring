package javacoding;
import java.util.*;
public class Vowels {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		String b=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u' ) {
				 count=count+1;
			}
		}
		System.out.println(count);
	}
}
