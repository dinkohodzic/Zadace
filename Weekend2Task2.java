package zadaci;

public class Weekend2Task2 {

	public static void main(String[] args) {
		String brackets = ("{{{}");

		int b = brackets.length();

		int countFirst = 0;
		int countSecond = 0;

		for (int i = 0; i < b; i++) {
			char c = brackets.charAt(i);
			char first = '{';
			char second = '}';

			if (c == first) {
				countFirst++;
			} else if (c == second) {
				countSecond++;
			}

		}

		if (countFirst != countSecond) {
			System.out.println("Bracket is not closed.");
		} else {
			System.out.println("All closed.");
		}
	}

}
