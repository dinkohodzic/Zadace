package task1;

public class CashBox {

	private String name;

	private Integer money;
	//Constructor
	public CashBox(String name) {
		this.name = name;
		this.money = 0;
	}
	
	
/**
 * This method adds money to the CashBox
 * @param money The added money
 */
	public void addMoney(int money) {
		this.money += money;
	}
/**
 * This method empties the CashBox
 */
	public void empty() {
		this.money = 0;
	}
/**
 * This method prints information about the CashBox balance
 */
	public void printInformation() {
		if (money == 0) {
			System.out.println("It is empty...");
		} else if (money > 0 && money <= 20) {
			System.out.println("There`s some, but not much.");
		} else if (money > 20 && money <= 100) {
			System.out.println("There`s some.");
		} else if (money > 100) {
			System.out.println("There`s a lot.");
		}else if (money<0){
			System.out.println("There can not be less than 0");
		}
	}
}