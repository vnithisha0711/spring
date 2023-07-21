package javacoding;

public class PrimeNumber {

	public static void main(String args[]) {

		int i, j;

		for (i = 2; i <= 30; i++) {
			int count = 0;
			for (j = i; j >= 1; j--) {
				if (i % j == 0) {
					count=count+1;
				}

			}
			if (count == 2) {
				System.out.print(i + " ");
			}

		}

	}
}
