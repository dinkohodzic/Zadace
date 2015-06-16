package task2;

public class Employee {
	//Initializing attributes
	private String nameOfEmployee;
	private String gender;
	private double salary;
	//Constructor
	public Employee(String nameOfEmployee, String gender, double salary) {
		super();
		this.nameOfEmployee = nameOfEmployee;
		this.gender = gender;
		this.salary = salary;
	}
	//Getter for employees names
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}
	//Getter for employees gender
	public String getGender() {
		return gender;
	}
	//Getter for employees salary
	public double getSalary() {
		return salary;
	}
	//Setter for employees salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//toString method
	public String toString() {
		return "\nEmployee: " + nameOfEmployee + "\nGender: " + gender
				+ "\nSalary=" + salary;
	}

}
