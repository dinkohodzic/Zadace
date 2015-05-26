package zadaci;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj ");

		int n = in.nextInt();
		int sum = 0;
		int i;
		while (n != 0) {
			i = n % 10;
			sum = sum + i;
			n = n / 10;
		}
		System.out.println("Suma cifara je " + sum);

		in.close();
	}

}
