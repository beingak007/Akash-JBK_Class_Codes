package com.interfaces;

public class Rectangle implements Shape{
	float l ;
	float b;
	Rectangle(float l,float b){
		this.b=b;
		this.l=l;
		
	}
	public float calArea() {
		return l*b;
		
	}
	public float calPeri() {
		return 2*(l+b);
		
	}

}
