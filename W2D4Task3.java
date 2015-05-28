package zadaci;

public class W2D4Task3 {

	public static void main(String[] args) {

		// Reading the file
		TextIO.readFile("src/zadaci/input3.in");
		int numbers = TextIO.getInt();
		int n = 0;
		int smallest = 0;

		// Making sure that the first number is not 0
		if (numbers != 0) {
			n = TextIO.getInt();
			smallest = n;
		}

		// If the next number is smaller than the previous smallest number it
		// becomes the smallest
		for (int i = 0; i < numbers - 1; i++) {
			n = TextIO.getInt();
			if (n < smallest) {
				smallest = n;
			}
		}

		// Printing the number
		System.out.println("The smallest number is: " + smallest);

	}

}
