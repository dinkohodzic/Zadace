package ba.bitcamp.vjezbeTask2;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {
		

		Glass g1 = new Glass(100);
		System.out.println("The current liquid is: "+g1.getLiquid());
		System.out.println("The max capacity is: "+ g1.getMaxCapacity());
		g1.addLiquid("Coca Cola", 35);
		System.out.println("The current capacity is: " + g1.getCurrentCapacity());
		g1.addLiquid("Coca Cola", 70);
		System.out.println("The current capacity is: " + g1.getCurrentCapacity());
		g1.emtyGlass();
		System.out.println("The current capacity is: " + g1.getCurrentCapacity());
		
	}

}
