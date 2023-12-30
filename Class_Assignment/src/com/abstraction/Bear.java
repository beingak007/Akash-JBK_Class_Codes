package com.abstraction;

public class Bear extends Animal {
	Bear(String name, String location, String foodtype, String breed) {
		super(name, location, foodtype, breed);

	}

	@Override
	void sound() {
		System.out.println("Glimose up");

	}

	@Override
	void eat() {
		System.out.println(" I want to eat :"+foodtype);
	}

}