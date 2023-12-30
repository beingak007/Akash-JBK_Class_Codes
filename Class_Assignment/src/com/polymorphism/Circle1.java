package com.polymorphism;

public class Circle1 {

	public static void main(String[] args) {
		
		Circle c=new Circle(4,7);
		float A=c.area();
		
		System.out.println(A+"\n"+" Area");
		Circle c1=new Circle(4,7);
		
		float a=c1.perimeter();
		System.out.println(a);

		
	}

}
