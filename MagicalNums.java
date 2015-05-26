package zadaci;

import java.util.Scanner;

public class MagicalNums {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj ");

		int unos = in.nextInt();

		for (int j = 1; j < unos; j++) {
			int n = j;

			int sum = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == n) {
				System.out.println(sum);

			}
		}

		in.close();

	}

}
