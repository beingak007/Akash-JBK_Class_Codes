package com.encapsulation;

public class Employee {
	
	    private String name;
	    private int id;
	    private int age;
	    private float salary;
	    private long contactNo;

	   
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public float getSalary() {
	        return salary;
	    }

	    public void setSalary(float salary) {
	        this.salary = salary;
	    }

	    public long getContactNo() {
	        return contactNo;
	    }

	    public void setContactNo(long contactNo) {
	        this.contactNo = contactNo;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	        System.out.println("Contact No: " + contactNo);
	    }
	}



