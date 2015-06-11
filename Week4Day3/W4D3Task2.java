package zadaci;

public class W4D3Task2 {

	
	/**
	 * <h1>Counts yero rows and columns</h1>
	 * Counts how many rows or columns are zero
	 * @param matrix
	 * @return integer result
	 */
	public static int getZero(int[][] matrix) {
		
		int counter = 0;
		int row = 0;
		int col = 0;
		//foor loop going trough the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				row += matrix[i][j];
				col += matrix[j][i];
				//Checking if one of the numbers is zero
				if (row == 0 || col == 0) {
					counter++;
				}
			}
		}
		return counter;
	}
	

	
	public static void main(String[] args) {
		
		int[][] arr = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };
		
		//printing the result
		System.out.println("Number of rows or columns that are zero is: "+ getZero(arr));

	}

	}


