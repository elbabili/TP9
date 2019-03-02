package co.simplon.peoples;

import co.simplon.towns.City;

public class Employee extends Person {
	private String company;
	private double salary;
	
	public Employee(String name, String fname, int age, String address, City cityBirth, String company, double salary) {
		super(name, fname, age, address, cityBirth);
		this.company = company;
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "\n company=" + company + " salary=" + salary;
	}	
}
