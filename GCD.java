package zadaci;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int gcd = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a = in.nextInt();
		b = in.nextInt();
		while (a != 0) {
			gcd = a;
			a = b % a;
			b = gcd;
		}
		System.out.println("The greates common divisor is: " + gcd);

	}

}
