import java.util.Arrays;

public class W3D3Task1 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int value = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
			if (value == 10) {
				value = value % 10;
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
