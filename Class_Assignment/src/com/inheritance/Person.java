package com.inheritance;

public class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Employees extends Person {
	    int id;
	    double salary;

	    Employees(String name, int age, int id, double salary) {
	        super(name, age);
	        this.id = id;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: " + salary);
	    }
	}

	
