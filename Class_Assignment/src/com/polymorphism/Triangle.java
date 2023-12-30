package com.polymorphism;

public class Triangle {
		 float base;
		 float heigth;
		 
		 public Triangle(float b,float h) {
			 base=b;
			 heigth=h;
		 }
		


		public float area() {
			float calculate = base*heigth/2;
			return calculate;
		}
		
		public float perimeter() {
			float perimeter =(base+heigth);
			return perimeter;
			
			
		}
	}




