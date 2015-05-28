package zadaci;

public class W2D4Task1 {

	public static void main(String[] args) {
		
		//Reading the file
		TextIO.readFile("src/zadaci/input1.in"); 
		
		//Variables
		int n = TextIO.getInt();
		int m = TextIO.getInt();

		//generating files from n to m
		for (int i = n + 1; i < m; i++) {
			
			//printing files from n to m
			System.out.println("The numbers are : " + i);
		}

	}
}