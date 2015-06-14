package school;

public class Main {

	public static void main(String[] args) {

		// Initializing classes
		Class javaClassA = new Class("Java Class A", 24);
		Class javaClassB = new Class("Java Class B", 26);
		Class dotNetClassA = new Class("dotNet Class A", 20);
		Class dotNetClassB = new Class("dotNet Class B", 25);

		// Initializing directors
		Director javaDirector = new Director("Zaid Zerdo", 1993);
		Director dotNetDirector = new Director("Benjamin Talic", 1992);

		// Initializing arrays of classes
		Class[] javaClasses = new Class[] { javaClassA, javaClassB };
		Class[] dotNetClasses = new Class[] { dotNetClassA, dotNetClassB };

		// Initializing schools
		School javaSchool = new School("The First School for JAVA",
				javaDirector, javaClasses);
		School dotNetSchool = new School("The First School for dotNet",
				dotNetDirector, dotNetClasses);

		// Initializing array of schools
		School[] bitCamp = new School[] { javaSchool, dotNetSchool };
		
		
		//System.out.println("The class with the most students in the school: " +javaSchool +" is: "+getNameOfClassWithTheMostStudents(javaSchool)+"\n");
		
		//System.out.println("The school with the youngest director is: "+getSchoolWithYoungestDirector(bitCamp));

		System.out.println("The school with the most students is: " + getNameOfSchoolWithMoreStudents(javaSchool, dotNetSchool));
		
		
	}

	/**
	 * <h1>Returns the class with the most students</h1> This method returns the
	 * name of the class that has the most students
	 * 
	 * @param s The school
	 *            
	 * @return The name of the class
	 */
	public static String getNameOfClassWithTheMostStudents(School s) {

		int num = 0;
		for (int i = 0; i < s.classes.length; i++) {
			if (num < s.classes[i].numberOfStudents) {
				num = s.classes[i].numberOfStudents;
			}
		}

		for (int i = 0; i < s.classes.length; i++) {
			if (s.classes[i].numberOfStudents == num) {
				return s.classes[i].className;
			}
		}
		return null;
	}
	/**
	 * <h1>Returns the school with the youngest director</h1>
	 * This method returns the name of the school that has the toungest director
	 * @param schools An array of schools
	 * @return school The school
	 */
	public static School getSchoolWithYoungestDirector(School[] schools){
		int num = 0;
		for (int i = 0; i < schools.length; i++) {
			if(schools[i].directorName.yearOfBirth > num){
				num = schools[i].directorName.yearOfBirth;	
			}
		}
		
		for (int i = 0; i < schools.length; i++) {
			if(schools[i].directorName.yearOfBirth == num){
				return schools[i];	
			}
		}
		
		return null;
	}
	
	/**
	 * <h1>Returns the school with the most students</h1>
	 * This method returns the name of the school that has the most students
	 * @param s1 The first school
	 * @param s2 The second school
	 * @return The school's name
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		int num1= 0;
		int num2= 0;
		
		for (int i = 0; i < s1.classes.length; i++) {
			num1 += s1.classes[i].numberOfStudents;
		}
		
		for (int i = 0; i < s2.classes.length; i++) {
			num2 += s2.classes[i].numberOfStudents;
		}
		
		if(num1>num2){
			return s1.schoolName;
		}else if(num2>num1){
			return s2.schoolName;
		}else{
			return "They have same number of students";
		}
	}
	
	
}
