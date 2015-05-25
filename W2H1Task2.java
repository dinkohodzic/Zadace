package zadaci;

public class W2H1Task2 {

	public static void main(String[] args) {
		int n = 12; // maximum range
		int even = 0; // even numbers
		int sum = 0; // sum of even numbers

		while (even < n) {
			sum = sum + even;
			even = even + 2;
		}
		System.out.println("Sum of even numbers is:" + (sum));

	}

}
