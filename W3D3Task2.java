import java.util.Arrays;
import java.util.Scanner;

public class W3D3Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = new int[5]; // first array
		int[] arr2 = new int[5]; // second array
		for (int i = 0; i < 5; i++) {
			System.out.println("Input value for array1 - index:" + i); // message
																		// for
																		// first
																		// input
			arr1[i] = input.nextInt();
			System.out.println("Input value for array2 - index:" + i); // message
																		// for
																		// second
																		// input
			arr2[i] = input.nextInt();
		}
		int counter = -1;
		for (int i = 0; i < 5; i++) {
			if (arr1[i] == arr2[i])
				counter++;
			if (counter != i)
				break;
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		if (counter == 4)
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");

		input.close();
	}

}
