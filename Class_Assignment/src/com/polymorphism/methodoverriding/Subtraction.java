package com.polymorphism.methodoverriding;

public class Subtraction extends Operation {
	public Subtraction(int a, int b) {
		super(a, b);
	}

	@Override
	public void performAction() {
		int result = a - b;
		System.out.println("Subtraction Is: " + result);
	}
}
