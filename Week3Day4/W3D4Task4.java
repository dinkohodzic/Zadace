import java.util.Scanner;

public class W3D4Task4 {

	public static double getPercentage(int N, int M) {

		double percent = (double) (N * 100.0 / M);

		return percent;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter zour score: ");
		int N = in.nextInt();
		System.out.println("Enter max score: ");
		int M = in.nextInt();
		System.out.println("You achieved " + getPercentage(N, M) + "%");

	}

}
