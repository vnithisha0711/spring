package javacoding;

import java.util.Scanner;

public class LShapeStar {

	public static void main(String[] args) {

		int a =8;	

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				if (i >= 0 && i < a-1 && j == 0 || i == a-1 && j > 0) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
