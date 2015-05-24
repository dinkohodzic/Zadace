package zadaci;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int broj = 35;
		
		if (((broj % 3) == 0) && ((broj % 5) == 0)){
			System.out.print("fizzbuzz"); 
		} else if ((broj % 3) == 0) {
			System.out.println("fizz");
		}else if ((broj % 5) == 0) {
			System.out.println("buzz");
		}else {
			System.out.println(broj);
		}
			
	}

}
