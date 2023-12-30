package com.contructor;

public class Student {
	    String name;
	    int id;
	    int std;
	    int sub1;
	    int sub2;
	    int sub3;
	  

	    public Student(String name, int id, int std, int sub1, int sub2, int sub3) {
	        this.name = name;
	        this.id = id;
	        this.std = std;
	        this.sub1 = sub1;
	        this.sub2 = sub2;
	        this.sub3 = sub3;
	        this.sub3 = sub3;
	        this.sub3 = sub3;
	        this.sub3 = sub3;
	    }


		public int total() {
	        return sub1 + sub2 + sub3;
	    }

	    public double percentage() {
	    	int totalMarks=total();
	    	double a=(totalMarks / 300) * 100.0 ;
	        return a;
	    }
	}

	