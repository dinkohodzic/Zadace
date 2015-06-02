package zadaci;

import java.util.Scanner;

public class Week3Day1 {

	public static void main(String[] args) {
		System.out.println("Enter a expression: ");
		Scanner input = new Scanner (System.in);
	
		String s1 = "";
		String s2 = "";
		int counter = 0;
		char operator='a';
		int n1 = 0;
		int n2 = 0;
		
		
		
		String  expression = input.nextLine();
		
		for(int i = 0; i < expression.length(); i++){
			char operatorIndex = expression.charAt(i);
			if(operatorIndex =='+' || operatorIndex == '-' || operatorIndex == '*' || operatorIndex == '/'){
				operator = expression.charAt(i);
				counter++;
			} else if (counter == 0) {
				s1 += operatorIndex;
			} else if (counter == 1) {
				s2 += operatorIndex;
			}
		}
		
		s1 = s1.trim();
		s2 = s2.trim();
		try{
		 n1 = Integer.parseInt(s1);
		 n2 = Integer.parseInt(s2);
		} catch (NumberFormatException ex){
			System.out.println("Wrong input!");
			ex.printStackTrace();
		}
		
		int result = 0; 
		
		switch (operator){
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
		result = n1 * n2;
				break;
		case '/':
			result = n1 / n2;
			break;
		}
		System.out.println("The result is: " + result);
		input.close();

	}

}
