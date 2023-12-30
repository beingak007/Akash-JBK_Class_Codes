package com.polymorphism.methodoverloading;

public class Operation {
	
	public int calculate(int a,int b) {
		int add=a+b;
		System.out.println("add >>>"+add);
		return add;
		
	}
	public float calculate(int a,float b) {
		float sub=a-b;
		System.out.println("sub >>>>"+sub);
		return sub;
		
	}
	public double calculate( float a,double  b) {
		double div=a/b;
		System.out.println("div >>>>"+div);
		return div;
		
	}
	public float calculate(float a,int b) {
		float mul=a*b;
		System.out.println("mul >>>>"+mul);
		return mul;
		
	}

}
