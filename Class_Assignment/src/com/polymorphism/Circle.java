package com.polymorphism;

public class Circle {
	
		 float radius;
		 float pie;
		 
		 public Circle(float f,float p) {
			 radius=f;
			 pie=p;
		 }
		
		public float area() {
			float calculate = pie*radius*radius;
			return calculate;
		}
		
		public float perimeter() {
			float perimeter =2*pie*radius;
			return perimeter;

		}
	}



