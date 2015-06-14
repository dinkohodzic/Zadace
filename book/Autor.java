package book;

import java.util.Arrays;

public class Autor {
	public String autor;
	public int yearOfBirth;
	public Book[] booksByAutor;

	public Autor(String autor, int yearOfBirth, Book[] booksByAutor) {
		super();
		this.autor = autor;
		this.yearOfBirth = yearOfBirth;
		this.booksByAutor = booksByAutor;
	}

	public String toString() {

		String s = "";

		s += "Name: " + autor + "\n";
		s += "Born: " + yearOfBirth + "\n";
		s += "Books: " + Arrays.toString(booksByAutor) + "\n";

		return s;
	}
}
