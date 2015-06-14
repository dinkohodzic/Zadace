package book;

public class Main {

	public static void main(String[] args) {
		//Initializing books
		Book tolkienBook1 = new Book("The Fellowship of the Ring", 1954, "Fantasy", true);
		Book tolkienBook2 = new Book("The Two Towers", 1954, "Fantasy", true);
		Book tolkienBook3 = new Book("The Return of the King", 1955, "Fantasy", true);
		
		Book ecoBook1 = new Book("The Name of the Rose", 1980, "Historycal Novel", true);
		Book ecoBook2 = new Book("Foucault's Pendulum", 1988, "Fiction", true);
	
		Book martinBook1 = new Book("A Game of Thrones", 1996, "Fantasy", true);
		Book martinBook2 = new Book("A Clash of Kings", 1998, "Fantasy", true);
		Book martinBook3 = new Book("A Storm of Swords", 2000, "Fantasy", true);
		Book martinBook4 = new Book("A Feast for Crows", 2005, "Fantasy", true);
		Book martinBook5 = new Book("A Dance with Dragons", 2011, "Fantasy", true);

		//Initializing array of books
		Book[] theLordOfTheRings = new Book[] {tolkienBook1,tolkienBook2,tolkienBook3};
		Book[] ecoBooks = new Book[] {ecoBook1,ecoBook2};
		Book[] aSongOfIceAndFire = new Book[] { martinBook1, martinBook2,
				martinBook3, martinBook4, martinBook5 };
		
		
		
		//Initializing autors
		Autor tolkien = new Autor("J. R. R. Tolkien", 1892, theLordOfTheRings);
		Autor eco = new Autor("Umberto Eco", 1932, ecoBooks);
		Autor martin = new Autor("George R. R. Martin", 1948, aSongOfIceAndFire);
		
		//Initializing array of autors
		Autor[] autorList = new Autor[] {tolkien,eco,martin};
		
		System.out.println(martin.autor + " has written "
				+ countBestsellingBooks(martin) + " bestsellers");
		
		int year1 = 1953;
		int year2 = 1957;
		
		System.out.println(tolkien.autor + " wrote "
				+ getNumberOfWrittenBooks(tolkien, year1, year2) + " books between " + year1 + " and " + year2);
		
	}

	/**
	 * <h1>Returns bestsellers from autor</h1>
	 * This method returns the number of books that are bestseller from an author
	 * 
	 * @param a The Autor
	 *            
	 * @return The number of bestsellers
	 */
	public static int countBestsellingBooks(Autor a) {
		int counter = 0;
		for (int i = 0; i < a.booksByAutor.length; i++) {
			if (a.booksByAutor[i].isBestseller == true) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * <h1> Returns books written between two years</h1>
	 * This method returns a number that represents the sum of books that were
	 * written between two years by an autor
	 * 
	 * @param a The Autor
	 *           
	 * @param year1 The starting year
	 *            
	 * @param year2 The ending year
	 *            
	 * @return The number of books
	 */
	public static int getNumberOfWrittenBooks(Autor a, int year1, int year2) {
		int counter = 0;
		for (int i = 0; i < a.booksByAutor.length; i++) {
			if (a.booksByAutor[i].yearPublished >= year1
					&& a.booksByAutor[i].yearPublished <= year2) {
				counter++;
			}

		}
		return counter;
	}
	
}
