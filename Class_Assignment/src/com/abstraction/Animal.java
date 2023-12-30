package com.abstraction;

public abstract class Animal {
	
	String name , breed , location , foodtype;
	Animal(String name,String location,String foodtype,String breed){
		this.name=name;
		this.breed=breed;
		this.location=location;
		this.foodtype=foodtype;
	}
	abstract void  sound();
	abstract void eat ();
	
	

}
