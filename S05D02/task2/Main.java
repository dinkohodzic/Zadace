package task2;

public class Main {

	public static void main(String[] args) {
		//Initializing employees
		Employee e1 = new Employee("Ned Stark", "male", 1800);
		Employee e2 = new Employee("Cersei Lannister", "female", 1600);
		Employee e3 = new Employee("Arya Stark", "female", 1200);
		Employee e4 = new Employee("John Snow", "male", 600);
		Employee e5 = new Employee("Tyrion Lannister", "male", 3000);
		Employee e6 = new Employee("Daenerys Targaryen", "female", 1700);
		Employee e7 = new Employee("Theon Greyjoy", "male", 400);
		Employee e8 = new Employee("Joffrey Baratheon", "male", 750);
		Employee e9 = new Employee("Samwell Tarly", "male", 900);
		//Initializing array of employees
		Employee[] employees = new Employee[] { e2, e3, e4, e5, e6, e7, e8, e9 };
		//Initializing company
		Company c1 = new Company("Factory of Thrones", e1, employees);
		//Printing 
		System.out.println("The number of employees is: "
				+ c1.numberOfEmployees());
		System.out.println("The total amount of slaries is: "
				+ c1.getAllSalaries());
		c1.raiseSalaries(100);
		System.out.println("The salaries after the raise are: "
				+ c1.getAllSalaries());
		System.out.println("The total number of female employees is: "
				+ c1.numberOfFemaleEmployees());
		System.out.println(c1);

	}

}
