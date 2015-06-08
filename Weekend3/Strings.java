import java.util.Scanner;

public class Strings {

	public static void mix(String s1, String s2) {

		int first = s1.length();
		int second = s2.length();
		String mix = "";

		if (first < second) {

			for (int i = 0; i < first; i++) {

				mix = mix + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}

			mix = mix + s2.substring(second - (second - first));
			System.out.println(mix);
		}

		else if (second < first) {

			for (int i = 0; i < second; i++) {

				mix = mix + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}

			mix = mix + s1.substring(second - (first - second));
			System.out.println(mix);
		}

		else {

			for (int i = 0; i < second; i++) {

				mix = mix + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}

			System.out.println(mix);

		}

	}

	public static boolean sameLetters(String s1, String s2) {

		boolean hasTheSame = true;
		int counter = 0;

		if (s1.length() > s2.length()) {

			hasTheSame = false;
		}

		else {

			for (int i = 0; i < s1.length(); i++) {

				char letter = s1.charAt(i);
				int b = s2.indexOf(letter);

				if (b != 0) {

					counter++;

				}

			}

			if (counter == s1.length()) {

				hasTheSame = true;
			}

		}

		return hasTheSame;
	}

	public static void firstInAlphabet(String s1, String s2) {
		int a = s1.compareTo(s2);
		if (a < 0) {
			System.out.println("The first in the alphabet is : " + s1);
		} else {
			System.out.println("The first in the alphabet is : " + s2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first word");
		String first = in.nextLine();
		System.out.println("Enter the second word");
		String second = in.nextLine();
		System.out
				.println("Does the second contain all the letters of the first ? ");
		System.out.println(sameLetters(first, second));
		System.out.println("When you combine it you get : ");
		mix(first, second);
		firstInAlphabet(first, second);
	}
}