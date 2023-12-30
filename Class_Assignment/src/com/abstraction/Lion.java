package com.abstraction;

public class Lion extends Animal {
	Lion(String name,String location,String foodtype,String breed){
		super(name,location, foodtype,breed);
		
	}
	@Override
	void  sound() {
		System.out.println("Gyipping");
		
	}
	@Override
	void eat() {
		System.out.println(foodtype);
	}
  

}
