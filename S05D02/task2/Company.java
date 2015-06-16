package task2;

import java.util.Arrays;

public class Company {
	// Initializing attributes
	private String nameOfCompany;
	private Employee director;
	private Employee[] employees;

	// Constructor
	public Company(String nameOfCompany, Employee director, Employee[] employees) {
		super();
		this.nameOfCompany = nameOfCompany;
		this.director = director;
		this.employees = employees;
	}

	/**
	 * Returns the total number of employees
	 * @return The number of employees
	 */
	public int numberOfEmployees() {
		return employees.length;
	}
	/**
	 * Returns the total amount of salaries of all employees
	 * @return The sum of salaries
	 */
	public double getAllSalaries() {
		double sum = 0;
		for (int i = 0; i < employees.length; i++) {
			sum += employees[i].getSalary();
		}
		return sum;
	}
	/**
	 * Returns the total number of female employees
	 * @return The number of female employees
	 */
	public int numberOfFemaleEmployees() {
		int sum = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getGender().equals("female")) {
				sum++;
			}
		}
		return sum;
	}
	/**
	 * Raises the salary for all employees
	 * @param raise The amount by which the salary is raised
	 */
	public void raiseSalaries(double raise) {
		for (int i = 0; i < employees.length; i++) {
			employees[i].setSalary(employees[i].getSalary() + raise);
		}
	}
	//toString method
	public String toString() {
		return "Company: " + nameOfCompany + "\nDirector=" + director
				+ "\nEmployees=" + Arrays.toString(employees);
	}

}
