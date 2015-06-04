import java.util.Scanner;


public class W3D4Task5 {

public static String getNumbersOnly (String s) {
		
		String nums="";
        
		for (int i = 0; i < s.length(); i++) {
           
			char c = s.charAt(i);              
            
			if (Character.isDigit(c))
              
				nums+=c;
			
		}
		return nums;
			
		}
		
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Input a something containing letters and numbers");
		
		String s = in.nextLine();
		
		System.out.println("Without the letters it looks like : " + getNumbersOnly(s));
		
		
		

	}

}
