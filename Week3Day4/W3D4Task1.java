public class W3D4Task1 {

	public static int getMin2(int a, int b) {
		int min2 = Math.min(a, b);
		return min2;
	}

	public static int getMin3(int a, int b, int c) {
		int min3 = Math.min(getMin2(a, b), c);
		return min3;
	}

	public static void main(String[] args) {
		System.out.println("The lowest number is " + getMin2(28, 21));
		System.out.println("The lowest number is " + getMin3(111, 11, 1));
	}

}
