package com.polymorphism.methodoverriding;

public class Employee  extends Citizens{
	int sallary;
	int eId;
	public Employee(int sallary,int eId,String name,String state,int adharNum) {
		super(state,name,adharNum);
		this.eId=eId;
		this.sallary=sallary;
	}
	@Override
	void display() {
		super.display();
		System.out.println("Employee ID is"+this.eId);
		System.out.println("Employee Salary is"+this.sallary);
		
	}

}
