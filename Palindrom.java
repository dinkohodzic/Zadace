package zadaci;

public class Palindrom {

	public static void main(String[] args) {
		
			int n = 122575221;
			
			int normalNumber = n;
			int reverseNumber = 0;
			
			while (n != 0) {
				reverseNumber = reverseNumber * 10 + (n % 10);
				n /= 10;
			}
			
			
			if (normalNumber == reverseNumber) {
				System.out.println("Palindrome!");
			} else {
				System.out.println("Not a palindrome!");
			}

	}

}
