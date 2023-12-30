package com.polymorphism.methodoverloading;

public class Employee1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();

		emp1.displayInfo("Akash", 101);

		emp1.displayInfo("Engineering", 60000.0);
	}
}
