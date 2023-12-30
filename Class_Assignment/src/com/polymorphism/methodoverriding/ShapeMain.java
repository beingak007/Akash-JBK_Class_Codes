package com.polymorphism.methodoverriding;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 5.0, 3.0);
        Circle circle = new Circle("Circle", 4.0);
        Square square = new Square("Square", 6.0);

        rectangle.area();
        circle.area();
        square.area();
    }
}