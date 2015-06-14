package school;

public class Director {

	public String directorName;
	public int yearOfBirth;

	public Director(String directorName, int yearOfBirth) {
		super();
		this.directorName = directorName;
		this.yearOfBirth = yearOfBirth;
	}

	public String toString() {
		String s = "\n";
		s += "Director: " + directorName + "\n";
		s += "Born: " + yearOfBirth + "\n";
		return s;
	}
}
