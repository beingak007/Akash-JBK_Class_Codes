package com.polymorphism.methodoverloading;

public class Shape {

	public double area(float side) {
		
	float square=side*side;
	System.out.println("Area Of Square is :>>>"+square);
	return square;
	}
	public double area(double l,double w) {
		
		double rectangle=l*w;
		System.out.println("Area Of Rectangle is :>>>"+rectangle);
		return rectangle;
	}
		
		public double area(double r) {
			
			double circle=Math.PI*r*r;
			System.out.println("Area Of Rectangle is :>>>"+circle);
			return circle ;
		}
			
			public double area(float b,double h) {
				
				double triangle=0.5*b*h;
				System.out.println("Area Of Rectangle is :>>>"+triangle);
				return triangle;
	

}
}