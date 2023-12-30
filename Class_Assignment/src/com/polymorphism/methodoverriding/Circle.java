package com.polymorphism.methodoverriding;

public class Circle extends Shape {

	  double radius;

	    public Circle(String name, double radius) {
	        super(name);
	        this.radius = radius;
	    }
	    @Override
	    public void area() {
	        double area = Math.PI * Math.pow(radius, 2);
	        System.out.println("Area of >>> " + name + " (Circle): " + area);
	        	
}
	}

	


