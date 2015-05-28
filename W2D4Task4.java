package zadaci;

public class W2D4Task4 {

	public static void main(String[] args) {

		// Reading the file
		TextIO.readFile("src/zadaci/input4.in");

		// Variables
		int n = TextIO.getInt();

		int m = TextIO.getInt();

		int num = 0;
		// Assuming that the number is not in the file
		boolean foundM = false;

		// If the number is found boolean becomes true
		if (n != 0) {
			num = TextIO.getInt();
			if (num == m) {
				foundM = true;
			}
		}
		// If the number is not zero and if there is a number, print it
		if (n != 0 && foundM) {
			System.out.println("There is a number " + m + " in the file");
		}
		// If not print that the number cannot be found
		else {
			System.out.println("There is no number " + m + " int the file");
		}

	}

}
