import java.util.Scanner;

public class Weekend2Task3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input a number");
		int num = input.nextInt();
		int fakt = 1;
		int digit = 0;
		int newNum = 0;
		for (int i = 1; i <= num; i++) {
			fakt *= i;
			if (fakt > 99) {
				digit = fakt % 10;
				if (digit == 0) {
					while (fakt > 99) {
						digit = fakt % 10;
						if (digit == 0)
							fakt /= 10;
						else
							break;
					}
				} else if (digit != 0) {
					while (fakt > 9999) {
						newNum = fakt % 10;
						newNum *= 10;
						fakt /= 10;
						newNum += fakt % 10;
						fakt = newNum % 10;
						fakt *= 10;
						newNum /= 10;
						fakt += newNum % 10;
					}
				}

			}

		}
		if (fakt > 99) {
			newNum = fakt % 10;
			newNum *= 10;
			fakt /= 10;
			newNum += fakt % 10;
			fakt = newNum % 10;
			fakt *= 10;
			newNum /= 10;
			fakt += newNum % 10;
		}
		System.out.println(fakt);

	}

}
