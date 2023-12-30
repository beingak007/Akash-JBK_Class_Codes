package com.polymorphism.methodoverriding;

public class Square extends Shape {
	double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }
    @Override
    public void area() {
        double area = Math.pow(side, 2);
     
        System.out.println("Area of >>>" + name + " (Square): " + area);
       
    }
}
    

