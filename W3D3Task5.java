import java.util.Arrays;
import java.util.Scanner;

public class W3D3Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input array length: ");
		int length = input.nextInt();
		String arr1[] = new String[length];
		int[] arr2 = new int[10];

		System.out.println("Input arry elements: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextLine();
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length(); j++) {
				switch (arr1[i].charAt(j)) {
				case '0':
					arr2[0]++;
					break;
				case '1':
					arr2[1]++;
					break;
				case '2':
					arr2[2]++;
					break;
				case '3':
					arr2[3]++;
					break;
				case '4':
					arr2[4]++;
					break;
				case '5':
					arr2[5]++;
					break;
				case '6':
					arr2[6]++;
					break;
				case '7':
					arr2[7]++;
					break;
				case '8':
					arr2[8]++;
					break;
				case '9':
					arr2[9]++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		input.close();

	}

}
