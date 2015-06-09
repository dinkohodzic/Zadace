package zadaci;

public class W4D1Task2 {

	public static void main(String[] args) {

		printSmallestNum(args);

	}

	/**
	 * <h1>Prints the smallest number</h1> 
	 * This method prints the smallest number from an array of integers
	 * 
	 * @param args
	 */

	public static void printSmallestNum(String[] args) {
		int smallest = 0;
		try {
			if (args.length != 0) {
				smallest = Integer.parseInt(args[0]);
			}
			for (int i = 1; i < args.length; i++) {
				if (smallest > Integer.parseInt(args[i])) {
					smallest = Integer.parseInt(args[i]);
				}
			}
			if (args.length != 0) {
				System.out.println("The smallest number is: " + smallest);
			}
		} catch (Exception ex) {
			System.out.println("Please enter only numbers!");
		}
	}

}
