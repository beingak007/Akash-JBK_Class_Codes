package com.method;

public class OperationMain {
	public static void main(String[] args) {

		Operation op = new Operation(20, 5);


		System.out.println("Addition Result: " + op.add());
		
		System.out.println("Subtraction Result: " + op.subtract());

		System.out.println("Division Result: " + op.division());

		System.out.println("Multiplication Result: " + op.multiplication());
	}
}
