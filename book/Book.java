package book;

public class Book {

	public String bookTitle;
	public int yearPublished;
	public String genre;
	public boolean isBestseller;

	public Book(String bookTitle, int yearPublished, String genre,
			boolean isBestseller) {
		super();
		this.bookTitle = bookTitle;
		this.yearPublished = yearPublished;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}

	public String toString() {

		String s = "\n";

		s += "Name of book: " + bookTitle + "\n";
		s += "Published : " + yearPublished + "\n";
		s += "Genre: " + genre + "\n";
		s += "Bestseller: " + isBestseller + "\n";

		return s;
	}
}
