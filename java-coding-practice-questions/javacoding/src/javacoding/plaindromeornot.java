package javacoding;
import java.util.*;
public class plaindromeornot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int count =0;
		Arrays.sort(arr);
		
		int l = arr[size-1];
		for(int i=0;i<size;i++) {
			if(l==arr[i]) {
				count++;
			}
		}
	
		if(count>=2) {
			System.out.println(l+"-"+l+"-"+"notPalindrome");
		}
		else {
			int sl= arr[size-2];
			int temp = sl,rev=0,r;
			while(sl>0) {
				r=sl%10;
				rev=(rev*10)+r;
				sl=sl/10;
			}
			if(temp==rev) {
				System.out.println(l+"-"+temp+"-"+"palindrome");
			}
			else {
				System.out.println(l+"-"+temp+"-"+"notPalindrome");
			}
		}
		}
}
