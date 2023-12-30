package com.encapsulation;

public class Person {

	    private String name;
	    private int age;
	    private String aadharNo;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getAadharNo() {
	        return aadharNo;
	    }

	    public void setAadharNo(String aadharNo) {
	        this.aadharNo = aadharNo;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Aadhar Number: " + aadharNo);
	        System.out.println();
	    }
	}

	