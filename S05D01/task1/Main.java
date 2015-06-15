package task1;

public class Main {

	public static void main(String[] args) {

		// Initializing new cashbox
		CashBox s = new CashBox("Piggy Bank");

		//Printing the information
		s.printInformation();
		s.addMoney(30);
		s.printInformation();
		s.addMoney(100);
		s.printInformation();
		s.empty();
		s.printInformation();
	}

}
