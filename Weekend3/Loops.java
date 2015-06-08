package zadaci;
import java.util.Scanner;

public class Loops {

	public static void comma(long n) {

		String numbers = Long.toString(n);
		String numbersComma = "";

		int counter = 0;
		int length = numbers.length();

		if (length > 3) {

			for (int i = length - 1; i >= 0; i--) {

				char digits = numbers.charAt(i);
				numbersComma = Character.toString(digits) + numbersComma;
				counter++;

				if (counter % 3 == 0 && i > 0) {

					numbersComma = "," + numbersComma;

				}
			}

			System.out.println(numbersComma);
		}

		else {

			System.out.println(numbers);
		}

	}

	public static void length(long n) {

		String numberN = Long.toString(n);

		int length = numberN.length();

		System.out.println("N has " + length + " digits");

	}

	public static long firstLast(long n) {

		String numberN = Long.toString(n);
		String firstDigit = numberN.substring(0, 1);
		String lastDigit = numberN.substring(numberN.length() - 1);
		String middle = numberN.substring(1, numberN.length() - 1);
		String newN = lastDigit + middle + firstDigit;
		long N = Long.parseLong(newN);
		return N;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter N: ");
		long N = in.nextLong();
		comma(N);
		length(N);
		System.out.println("When you change the first and last digit you get: "
				+ firstLast(N));
		in.close();
	}

}
