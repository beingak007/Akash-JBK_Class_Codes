package com.abstraction;

public class Fox extends Animal {
	Fox(String name,String location,String foodtype,String breed){
		super(name,location, foodtype,breed);
		
	}
	@Override
	void  sound() {
		System.out.println("Gyipping");
		
	}
	@Override
	void eat() {
		System.out.println("I want to Eat :"+foodtype);
	}
  
}
