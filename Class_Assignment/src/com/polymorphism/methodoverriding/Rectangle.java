package com.polymorphism.methodoverriding;

public class Rectangle extends Shape{
	    double length;
	    double width;

	    public Rectangle(String name, double length, double width) {
	        super(name);
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public void area() {
	        double area = length * width;
	        System.out.println("Area of >>> " + name + " (Rectangle): " + area);
	    }
	}

