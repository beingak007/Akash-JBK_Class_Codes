package com.polymorphism.methodoverriding;

public class Vehicle1 extends Vehicle {
	
	String vType;
	
	Vehicle1(String vType ,String name){
		super(name);
		this.vType=vType;
	}
	@Override
	void display() {
		System.out.println(super.name);
		System.out.println(this.vType);
		
	}
	
	

}
