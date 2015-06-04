import java.util.Scanner;

public class W3D4Task3 {

	public static boolean hasNumbers(String s) {
		
		for (int i = 0; i < s.length(); i++) {
		
			Character ch = s.charAt(i);
			
			if (Character.isDigit(ch)) {
			
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Input something: ");
		
		String s = in.nextLine();
		
		System.out.println(hasNumbers(s));
	}

}
