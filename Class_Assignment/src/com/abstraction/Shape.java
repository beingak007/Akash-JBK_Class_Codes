package com.abstraction;

public abstract class Shape {
	String name;
	String color;
	int sides;
	
	Shape(String name,String color,int sides){
	this.name=name;
	this.color=color;
	this.sides=sides;
	
	}
	public  abstract void draw();
	
	public abstract int calculate(int a);
	
	
	

}
