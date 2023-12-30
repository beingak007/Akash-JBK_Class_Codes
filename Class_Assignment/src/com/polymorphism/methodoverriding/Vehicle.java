package com.polymorphism.methodoverriding;

public class Vehicle {

	String name;
	Vehicle(String name){
		this.name=name;
	}
	void display() {
		System.out.println(this.name);
	}
}
