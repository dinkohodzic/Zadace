package zadaci;

public class W2D4Task2 {

	public static void main(String[] args) {

		// Reading the file
		TextIO.readFile("src/zadaci/input2.in");

		// Variables
		int n = 0;
		int sum = 0;

		//
		while (n != -1) {
			n = TextIO.getInt();
			sum = sum + n;

		}
		// Printing the result on the console
		System.out.println("The sum is: " + sum);

	}

}
