package zadaci;

import java.util.Scanner;

public class Parameters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numInt;
		double numDouble;
		int num1Int;
		int num2Int;
		double num1Double;
		double num2Double;
		
		
		// Printing the message for the user
		System.out.print("Input an integer number: ");
		// Reading the input
		numInt = in.nextInt();
		//Printing the result
		System.out.println("The square is: " + squareOfInteger(numInt));
		System.out.println();
		

		// Printing the message for the user
		System.out.print("Input an decimal number: ");
		// Reading the input
		numDouble = in.nextDouble();
		//Printing the result
		System.out.println("The square is: " + squareOfDouble(numDouble));
		System.out.println();
		

		// Printing the message for the user
		System.out.print("Input the first integer number: ");
		// Reading the input
		num1Int = in.nextInt();
		// Printing the message for the user
		System.out.print("Input the second integer number: ");
		// Reading the input
		num2Int = in.nextInt();
		//Printing the result
		System.out.print("The product is: "
				+ productOfInteger(num1Int, num2Int));
		System.out.println();
		

		/// Printing the message for the user
		System.out.print("Input the first decimal number: ");
		// Reading the input
		num1Double = in.nextDouble();
		// Printing the message for the user
		System.out.print("Input the second decimal number: ");
		// Reading the input
		num2Double = in.nextDouble();
		//Printing the result
		System.out.print("The product is: "
				+ productOfDouble(num1Double, num2Double));
		
		
		in.close();
	}

	/**
	 * <h1>Returns the square of an integer number</h1>
	 * 
	 * @param num  - the input of the equation
	 * @return square - the output of the equation
	 */
	public static int squareOfInteger(int num) {
		int square = num * num;
		return square;
	}

	/**
	 * <h1>Returns the square of an double number</h1>
	 * 
	 * @param num - the input of the equation
	 * @return square - the output of the equation
	 */
	public static double squareOfDouble(double num) {
		double square = num * num;
		return square;
	}

	

	/**
	 *<h1> Returns the product of two integer numbers</h1>
	 * 
	 * @param num1 - the first number
	 * @param num2 - the second number
	 * @return product - the result of the equation
	 */
	public static int productOfInteger(int num1, int num2) {
		int prodduct = num1 * num2;
		return prodduct;

	}
/**
	 * <h1>Returns the product of two double numbers</h1>
	 * 
	 * @param num1 - the first number
	 * @param num2 - the second number
	 * @return product - the result of the equation
	 */
	public static double productOfDouble(double num1, double num2) {
		double prodduct = num1 * num2;
		return prodduct;
	}
	

}
