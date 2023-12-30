package com.encapsulation;

public class Person1 {
	    public static void main(String[] args) {
	    	
	        Person p = new Person();
	        p.setName("Yash");
	        p.setAge(30);
	        p.setAadharNo("1234-5678-9012");
	        System.out.println("---------------------------------");
	        
	        Person p1 = new Person();
	        p1.setName("Akash");
	        p1.setAge(25);
	        p1.setAadharNo("9876-5432-1098");

	        Person p2 = new Person();
	        p2.setName("Nagesh");
	        p2.setAge(35);
	        p2.setAadharNo("5678-4321-0987");

	        System.out.println("Person 1 Information:");
	        p.display();

	        System.out.println("Person 2 Information:");
	        p1.display();

	        System.out.println("Person 3 Information:");
	        p2.display();
	    }
	}



