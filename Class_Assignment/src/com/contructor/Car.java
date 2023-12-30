package com.contructor;

public class Car {
	String name;
	String model;
	int year;
	Car(String name, String model,int year){
		this.name=name;
		this.model=model;
		this.year=year;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(model);
		System.out.println(year);
	}

}
