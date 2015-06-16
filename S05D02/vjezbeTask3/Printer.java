package ba.bitcamp.vjezbeTask3;

public class Printer {

	private String name;
	private int paper;
	private int ink;
	private int printed;
	private static int maxPaper = 100;
	private static int maxInk = 100;
	public static int printedAll;

	// Constructor
	public Printer() {
		super();
		this.name = "Default printer";
		this.paper = 0;
		this.ink = 0;
		this.printed = 0;
	}
	//Constructor
	public Printer(String name) {
		super();
		this.name = name;
		this.paper = 0;
		this.ink = 0;
		this.printed = 0;

	}

	/**
	 * Returns if the printer has ink or not
	 * 
	 * @return True if it has ink, otherwise false
	 */
	public boolean hasInk() {
		if (this.ink == 0) {
			return false;
		}
		return true;
	}

	/**
	 * Returns if the printer has paper or not
	 * 
	 * @return True if it has paper, otherwise false
	 */
	public boolean hasPaper() {
		if (this.paper == 0) {
			return false;
		}
		return true;
	}

	/**
	 * Returns how many pages have been printed
	 * 
	 * @return The number of papers
	 */
	public int hasPrinted() {
		return this.printed;
	}

	/**
	 * Adds paper to the printer
	 * 
	 * @param newPaper
	 *            The number of papers
	 */
	public void addPaper(int newPaper) {
		if ((this.paper + newPaper) <= maxPaper) {
			this.paper += newPaper;
		}

	}

	/**
	 * Adds Ink to the printer
	 * 
	 * @param newInk
	 *            The amount of Ink
	 */
	public void addInk(int newInk) {
		if ((this.ink + newInk) <= maxInk) {
			this.ink += newInk;
		}
	}

	/**
	 * Prints a number of papers given by the user. For every printed paper we
	 * reduce the amount of paper in the printer by1 and the ink by3
	 * 
	 * @param pages
	 *            The number of pages
	 */
	public void printPages(int pages) {
		if ((paper - pages >= 0) && (ink - 3 * pages >= 0)) {
			this.paper -= pages;
			this.ink -= 3 * pages;
			this.printed = pages;
			printedAll += pages;

		}

	}
/**
 * Return the total amount of printed pages
 * @return
 */
	public static int totalPrinted() {
		return printedAll;
	}

	public String toString() {
		return "Printer: " + name + "\nPaper: " + paper + "\nInk: " + ink
				+ "\nPrinted: " + printed;
	}

}
