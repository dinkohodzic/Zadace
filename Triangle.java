package zadaci;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite stranicu ");

		int n = in.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		in.close();
	}

}
