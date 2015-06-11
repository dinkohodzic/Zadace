package zadaci;


import java.util.Scanner;

public class W4D3Task1 {
	/**
	 *<h1> Sets values for 2D array</h1>
	 * <p>
	 * The method enters values for every position in the 2D array
	 * 
	 * @param matrix
	 *            
	 */
	public static void fillMatrix(int[][] matrix) {

		Scanner in = new Scanner(System.in);

		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Insert value for row:"+ (i+1)+" column:"+ (j+1));
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.println();
	}

	/**
	 *<h1> Prints 2D array</h1>
	 * 
	 * This method just prints 2D array.
	 * 
	 * @param matrix
	 */
	public static void printMatrix(int[][] matrix) {

		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print( matrix[i][j]+" ");
			}System.out.println();
		}

	}

	/**
	 * <h1> Counts how many times a number appears</h1>
	 * This method counts how many time a specific number appears in a 2D array.
	 * @param matrix
	 * @param num - The number we are looking for
	 * @return The result of the counting
	 */
	public static int numberCounter(int[][] matrix, int num) {
		
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] == num) {
					counter++;
				}
			}
		}
		
		return counter;
	}


		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			//Asking the user to set the values
			System.out.print("Enter number of rows: ");
			int row = in.nextInt();
			System.out.print("Enter number of columns: ");
			int col = in.nextInt();

			
			int[][] matrix = new int[row][col];

			System.out.println("Enter the number you want to search for: ");
			int num = in.nextInt();

			fillMatrix(matrix);
			printMatrix(matrix);

			System.out.println("The number "+num+" apears " +
					numberCounter(matrix, num));
			
		}

		
}