package zadaci;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an hour between 0 and 24");
		int time = in.nextInt();

		switch (time) {

		case 9:
			System.out.print("");
		case 10:
			System.out.print("");
		case 11:
			System.out.print("");
		case 12:
			System.out.print("");
		case 13:
			System.out.print("");
			break;

		case 14:
			System.out.print("");
		case 15:
			System.out.print("");
		case 16:
			System.out.print("");
		case 17:
			System.out.println("Exercises");
			break;

		case 18:
			System.out.print("");
		case 19:
			System.out.print("");
		case 20:
			System.out.print("");
		case 21:
			System.out.print("");
		case 22:
			System.out.print("");
		case 23:
			System.out.print("");
		case 24:
			System.out.print("");
		case 1:
			System.out.println("Homework");
			break;

		case 2:
			System.out.print("");
		case 3:
			System.out.print("");
		case 4:
			System.out.print("");
		case 5:
			System.out.print("");
		case 6:
			System.out.print("");
		case 7:
			System.out.print("");
		case 8:
			System.out.println("ZZZzzzzz");
			break;

		default:
			System.out.println("");
		}

		in.close();
	}

}
