package school;

import java.util.Arrays;

public class School {

	public String schoolName;
	public Director directorName;
	public Class[] classes;

	public School(String schoolName, Director directorName,
			Class[] classes) {
		super();
		this.schoolName = schoolName;
		this.directorName = directorName;
		this.classes = classes;
	}

	public String toString() {
		String s = "";
		s += "School name: " + schoolName + "\n";
		s += "Director: " + directorName + "\n";
		s += "Classes: " + Arrays.toString(classes) + "\n";
		return s;
	}

}
