package com.abstraction;

public abstract class Employee {
	  int id;
	  String name;
	  double salary;
	  
 public Employee(int id, String name,double salary) {
	 this.name=name;
	 this.id=id;
	 this.salary=salary;
	       
	    
 
}
 public abstract double getDA();
 public abstract double getHRA();
 public abstract double getTA();
 public abstract double getPT();
 public abstract double getPF();
 public abstract double getSalary();
 public abstract double grossSalary();
 public abstract double netSalary();
 
}
