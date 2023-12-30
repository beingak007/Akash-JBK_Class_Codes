package com.associations.has.a.relation;

import java.util.Iterator;

public class CourseStudent {
	private Integer sID;
	private String sName;
	private Integer sAge;

	private Course[] courses;

	public CourseStudent(Integer sID, String sName, Integer sAge, Course[] courses) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAge = sAge;
		this.courses = courses;
	}

	public void display() {
		System.out.println("Student deatals are :: ");
		System.out.println("Student ID :" + sID);
		          System.out.println("Student Name :" + sName);
		   System.out.println("Student Age:" + sAge);

		System.out.println();

		for (Course courses : courses) {

		}

	}

}
