import java.util.Scanner;

public class W3D3Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length");

		int lenght = input.nextInt();

		int[] arr = new int[lenght];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the value of index:" + i);

			arr[i] = input.nextInt();
		}

		System.out.println("Enter Q:");

		int Q = input.nextInt();

		boolean isQ = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Q)
				isQ = true;
		}
		System.out.println(isQ);
		input.close();
	}

}
