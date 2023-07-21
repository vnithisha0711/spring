package MaxSum;

import java.util.Scanner;

public class MaxNum {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array length:");
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		findMaxNum(arr);
	}

	private static void findMaxNum(int[] a) {
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
			System.out.println("The largest number:" +max);
		
	}
}
	 
		//int arr[]= {2,5,78,4,1};
		
	


