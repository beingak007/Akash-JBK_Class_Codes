package com.abstraction;

public abstract class Bike {
	String name;
	String no;
	
	Bike(String name,String no){
	 this.name=name;
	 this.no=no;
}

public abstract int noOfGear(int a);

public abstract int milage(int a);

void Display() {
	System.out.println("Bike name is >>>> "+this.name);
	System.out.println("Bike number is >>>>> "+this.no);
}
}

