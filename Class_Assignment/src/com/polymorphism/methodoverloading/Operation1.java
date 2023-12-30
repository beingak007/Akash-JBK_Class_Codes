package com.polymorphism.methodoverloading;

public class Operation1 {
	public static void main(String[] args) {
		
		Operation p=new Operation();
		p.calculate(1, 5);
		p.calculate(8, 0.5f);
		p.calculate(5.6f, 2.2);
		p.calculate(8.8f, 2);
		
		
	}

}
