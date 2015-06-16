package ba.bitcamp.vjezbeTask3;

public class Main {

	public static void main(String[] args) {
		Printer p1 = new Printer("HP LaserJet");

		System.out.println(p1);
		p1.addInk(100);
		p1.addPaper(80);
		System.out.println();
		System.out.println(p1);
		
		p1.printPages(15);
		System.out.println();
		System.out.println(p1);
		
		p1.printPages(2);
		System.out.println();
		System.out.println(p1);
		
		System.out.println();
		Printer p2 = new Printer("Lexmark");
		System.out.println(p2);
		p2.addInk(80);
		p2.addPaper(80);
		System.out.println();
		System.out.println(p2);
		
		p2.printPages(7);
		System.out.println();
		System.out.println(p2);
		
		p2.printPages(8);
		System.out.println();
		System.out.println(p2);
		
		System.out.println("Total pages printed: " + Printer.totalPrinted());
		
	}

}
