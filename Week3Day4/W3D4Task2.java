import java.util.Scanner;

public class W3D4Task2 {

	public static char getGrade(int score) {
		char grade;
		int num = 0;

		if (score >= 94 && score <= 100) {
			num = 0;
		} else if (score >= 84 && score <= 93) {
			num = 1;
		} else if (score >= 74 && score <= 83) {
			num = 2;
		} else if (score >= 64 && score <= 73) {
			num = 3;
		} else if (score >= 55 && score <= 63) {
			num = 4;
		} else if (score >= 0 && score <= 54) {
			num = 5;
		}

		switch (num) {

		case 0:
			return grade = 'A';
		case 1:
			return grade = 'B';
		case 2:
			return grade = 'C';
		case 3:
			return grade = 'D';
		case 4:
			return grade = 'E';
		case 5:
			return grade = 'F';
		}
		return '0';
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter points: ");
		
		char score = (char) in.nextInt();
		
		System.out.println("Your grade is: " + getGrade(score));
	}

}
