package zadaci;

public class W4D1Task3 {

	public static void main(String[] args) {
		try {
			if (args.length > 1) {
				throw new IndexOutOfBoundsException();
			} else {
				String str = "";
				if (args[0].equals(str)) {
					throw new NullPointerException();
				} else
					System.out.println(args[0] + ": has "
							+ getCountOfNumbers(args) + " digits");

			}
		} catch (NullPointerException ex1) {
			System.out.println("Please pass one String to programm");
		} catch (IndexOutOfBoundsException ex2) {
			System.out.println("Please pass only one String to the programm");
		}

	}

	/**
	 * <h1>Prints how many digits an array contains</h1>
	 * This method checks how many digits are in an array 
	 * @param array
	 * @return The number of digits
	 */
	public static int getCountOfNumbers(String[] array) {

		char c = ' ';
		int sum = 0;
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i];
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (Character.isDigit(c)) {
				sum++;
			}
		}

		return sum;
	}

}
