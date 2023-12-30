package com.polymorphism;

public class Teacher {

		String teacherName;
		String teachingSubject;
		int experience;
		float salary;
		
		void accpet(String teacher_name,String Teaching_subject,int experience,float salary) {
			this.teacherName = teacher_name;
			this.teachingSubject = Teaching_subject;
			this.experience = experience;
			this.salary = salary;
		
		
		}

		void display() {
			System.out.println(">>> Teacher Details <<<");
			System.out.println(teacherName);
			System.out.println(teachingSubject);
			System.out.println(experience);
			System.out.println(salary);
		}

		
			
		}



