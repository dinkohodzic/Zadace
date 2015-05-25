package zadaci;

public class W2H1Task3 {

	public static void main(String[] args) {

		int n = 496; 	// the given number
		int i = 1; 		// divisor
		int sum = 0; 	// number of times divided by divisor

		while (i < n) {
			if (n % i == 0)
				sum = sum + i;
			i++;
		}
		if (sum == n)
			System.out.println("The number : " + i + " is a perfect number");
		else
			System.out.println("The number :" + i + " is not a perfect number");
	}

}
