package com.polymorphism.methodoverriding;

public class Animal {
	String name;
	String type;

	protected Animal(String name, String type) {

		this.name = name;
		this.type = type;
	}

	void display() {
		System.out.println(name);
		System.out.println(type);

	}

	
}
