package school;

public class Class {
	public String className;
	public int numberOfStudents;

	public Class(String className, int numberOfStudents) {
		super();
		this.className = className;
		this.numberOfStudents = numberOfStudents;
	}

	public String toString() {
		String s = "\n";
		s += "Class: " + className + "\n";
		s += "Number of students: " + numberOfStudents + "\n";
		return s;
	}
}
