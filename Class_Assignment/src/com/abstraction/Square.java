package com.abstraction;

public class Square extends Shape {
	Square(String name,String color,int a){
		super(name,color,a);
	}
	
	@Override
	public void draw() {
		System.out.println("Draw method it will execute imagine thingswe won't");
		
			
	}
	@Override
	public  int calculate(int a) {
		int area=super.sides*super.sides;
		
		return area;
		
	}
	void showData() {
			System.out.println("Shape name is :"+super.name);
			System.out.println("Color name is :"+super.color);
			System.out.println("Side is : "+super.sides);
			System.out.println("Calculate Area is : "+this.calculate(sides));
	}

}
