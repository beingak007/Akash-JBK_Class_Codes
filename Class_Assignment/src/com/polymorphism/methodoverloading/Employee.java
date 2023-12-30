package com.polymorphism.methodoverloading;

public class Employee {

	String name;
	int employeeId;

	public void displayInfo(String name, int employeeId) {
		this.name = name;
		System.out.println("Name: " + name);
		this.employeeId = employeeId;

		System.out.println(" Employee ID: " + employeeId);
	}

	public void displayInfo(String department, double salary) {
		System.out.println(" Department: " + department + ", Salary: " + salary);
	}

}
