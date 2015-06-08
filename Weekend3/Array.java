import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static boolean equal(int arr1[], int arr2[]) {

		if (arr2.length != arr1.length) {

			return false;

		} else {

			int counter = 0;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i])
					counter++;

				else
					return false;
			}
		}

		return true;
	}

	public static int[] sum(int arr1[], int arr2[]) {

		if (arr1.length < arr2.length) {

			int arrInt[] = new int[arr2.length];

			for (int i = 0; i < arr1.length; i++) {

				arrInt[i] = arr1[i] + arr2[i];
			}
			for (int i = arr1.length; i < arr2.length; i++) {

				arrInt[i] = arrInt[i] + arr2[i];

				return arrInt;
			}

		} else {

			int arrInt[] = new int[arr1.length];

			for (int i = 0; i < arr2.length; i++) {

				arrInt[i] = arr1[i] + arr2[i];
			}
			for (int i = arr2.length; i < arr1.length; i++) {

				arrInt[i] = arrInt[i] + arr1[i];
			}
			return arrInt;
		}
		return arr1;
	}

	public static int[] arrayAfterArray(int arr1[], int arr2[]) {

		int num = arr1.length;
		int newArray[] = Arrays.copyOf(arr1, arr1.length + arr2.length);

		for (int i = num, j = 0; i < newArray.length; i++, j++) {
			newArray[i] = +arr2[j] + newArray[i];

		}
		return newArray;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of the first array");
		int length1 = input.nextInt();
		System.out.println("Enter the length of the second array");
		int length2 = input.nextInt();

		int arr1[] = new int[length1];
		int arr2[] = new int[length2];

		for (int i = 0; i < length1; i++) {
			System.out.println("Enter element number " + (i + 1)
					+ " of the first array:");
			int num1 = input.nextInt();
			arr1[i] = num1;
		}

		for (int i = 0; i < length2; i++) {
			System.out.println("Enter element number  " + (i + 1)
					+ " of the second array:");
			int num2 = input.nextInt();
			arr2[i] = num2;
		}

		System.out.println("Are the arrays equal ?");
		System.out.println(equal(arr1, arr2));

		System.out.println("The sum of the array's is : ");
		System.out.println(Arrays.toString(sum(arr1, arr2)));

		System.out.println("Written one after another : ");
		System.out.println(Arrays.toString(arrayAfterArray(arr1, arr2)));

	}

}