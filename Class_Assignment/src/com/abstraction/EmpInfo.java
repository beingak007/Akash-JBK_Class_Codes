package com.abstraction;

public class EmpInfo extends Employee {
	
	  
		double da;  
	    double hra; 
	    double ta;  
	    double pt;  
	    double pf;  
	
	  public  EmpInfo(String name,int id,double salary){
	    	super(id,name,salary);
	    	
	    }
	  @Override
	  public  double getDA() {
		  da=(salary*20)/100;
		  return da;
	  }
	  @Override
	  public  double getHRA() {
		  hra=(salary*15)/100;
		  return da;
	  }
	  @Override
	  
	  public  double getTA() {
		  ta=(salary*12)/100;
		  return ta;
	  }
	  @Override
	  
	  public  double getPT() {
		  pt=(salary*1)/100;
		  return pt;
	  }
	  @Override
	  
	  public  double getPF() {
		  pt=(salary*10)/100;
		  return pt;
	  }
	  @Override
	  
	  public  double getSalary() {
		 
		  return salary;
	  }
	  @Override
	  public double grossSalary() {
	        double gross_salary = salary + (getDA() + getHRA() + getTA());
	        return gross_salary;
	  }
	  @Override
	  public double netSalary() {
		 double net_salary= (grossSalary() - (pf + pt));
		  return net_salary;
	  }
	 public  void display() {
		  System.out.println("Employee name is :"+super.name);
		  System.out.println("Employee ID is :"+super.id);
		  System.out.println("Employee salary is :"+super.salary);
		  System.out.println("Net salary is Rahul  :"+netSalary());
		  System.out.println("Gross salary is Rahul  :"+grossSalary());
	  }
}

