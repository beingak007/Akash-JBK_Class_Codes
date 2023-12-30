package com.inheritance;

public class Shape {
	
	    String color;
	    String name;

	    Shape(String color, String name) {
	        this.color = color;
	        this.name = name;
	    }
	}

	class Rectangle extends Shape {
	    double length;
	    double width;

	    Rectangle(String color, String name, double length, double width) {
	        super(color, name);
	        this.length = length;
	        this.width = width;
	    }

	    double area() {
	        return length * width;
	    }

	    void display() {
	        System.out.println("Shape: " + name);
	        System.out.println("Color: " + color);
	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);
	        System.out.println("Area: " + area());
	    }
	}

	
