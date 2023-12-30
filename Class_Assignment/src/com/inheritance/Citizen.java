package com.inheritance;

public class Citizen {
	
	    String name;
	    String aadharNo;
	    String state;

	    Citizen(String name, String aadharNo, String state) {
	        this.name = name;
	        this.aadharNo = aadharNo;
	        this.state = state;
	    }
	}

	class Employee extends Citizen {
	    int eid;
	    double salary;

	    Employee(String name, String aadharNo, String state, int eid, double salary) {
	        super(name, aadharNo, state);
	        this.eid = eid;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Aadhar Number: " + aadharNo);
	        System.out.println("State: " + state);
	        System.out.println("Employee ID: " + eid);
	        System.out.println("Salary: " + salary);
	    }
	}

	