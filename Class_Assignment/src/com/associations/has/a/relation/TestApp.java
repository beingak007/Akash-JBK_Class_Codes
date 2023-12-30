package com.associations.has.a.relation;

public class TestApp {
	//Driving code
	public static void main(String[] args) {
		
		//creating  a dependent object
		 Branch branch=new Branch("Bio908", "Solapur");
		 
		 //creating the target object
		 Student s1=new Student(10, "Akash", 23, branch);
		 Student s2=new Student(12, "Shailesh", 43, branch);
		 Student s3=new Student(10, "Rohit", 45, branch);
		 
		 s1.display();
		 System.out.println();
		 
		 s2.display();
		 System.out.println();
		 
		 s3.display();
		 System.out.println();
		 
		
		
	}

}
