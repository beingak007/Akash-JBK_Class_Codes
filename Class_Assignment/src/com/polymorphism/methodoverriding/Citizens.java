package com.polymorphism.methodoverriding;

public class Citizens {
	String name;
	String state;
	int adharNum;
	
	Citizens(String name,String state,int adharNum){
		
	this.name=name;
	this.state=state;
	this.adharNum=adharNum;
	}
	void display() {
		System.out.println("Name is >>> "+this.name);
		System.out.println("State is >>> "+this.state);
		System.out.println("AdharNumber is >>> "+this.adharNum);
	}

}
