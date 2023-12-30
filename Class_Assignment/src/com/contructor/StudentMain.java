package com.contructor;

public class StudentMain {
	
	    public static void main(String[] args) {
	        Student student1 = new Student("Akash", 101, 10, 85, 90, 75);
	        Student student2 = new Student("Shailesh", 102, 10, 75, 80, 95);
	        Student student3 = new Student("Abhishek", 103, 10, 90, 85, 80);

	        System.out.println("Student 1:");
	        System.out.println("Total Marks: " + student1.total());
	        System.out.println("Percentage: " + student1.percentage() + "%\n");

	        System.out.println("Student 2:");
	        System.out.println("Total Marks: " + student2.total());
	        System.out.println("Percentage: " + student2.percentage() + "%\n");

	        System.out.println("Student 3:");
	        System.out.println("Total Marks: " + student3.total());
	        System.out.println("Percentage: " + student3.percentage() + "%");
	    }
	}



