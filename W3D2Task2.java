import java.util.Scanner;

public class W3D2Task2 {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.print("Input file name");
			String file = input.next();
			TextIO.readFile(file);
			String s = TextIO.getWord();
			int n = Integer.parseInt(s);
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " + n + " is: " + factorial);
			input.close();
		} catch (NumberFormatException e) {
			System.out.println("Number is not first");
		} catch (IllegalArgumentException e) {
			System.out.println("File does not exist!");
		}

	}

}
