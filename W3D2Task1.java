import java.util.Scanner;

public class W3D2Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input day");
		int Day = input.nextInt();
		switch (Day) {
		case 1:
			System.out.println("Work day");
			break;
		case 2:
			System.out.println("Work day");
			break;
		case 3:
			System.out.println("Work day");
			break;
		case 4:
			System.out.println("Work day");
			break;
		case 5:
			System.out.println("Work day!");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Wrong input!");
			break;
		}

		input.close();

	}

}
