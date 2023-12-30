package com.polymorphism;

public class Square {
	float side;
	
	public Square(int a) {
		side=a;
	}
	
	public float area() {
		 float calculate =side*side;
		return calculate;
	}
	
	public float perimeter() {
		float calculate =4*side;
		return calculate;
	}


}
