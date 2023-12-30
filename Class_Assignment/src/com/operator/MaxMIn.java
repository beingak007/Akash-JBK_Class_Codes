package com.operator;

public class MaxMIn {

	public static void main(String[] args) {

		int num1 = 13;
		int num2 = 36;
		int num3 = 44;

		if (num1 < num2 && num1 < num3) {

			System.out.println("num1 is Smaller");

		} else if (num2 < num1 && num2 < num3) {
			System.out.println("num2 is Smaller");
		} else {
			System.out.println("num3 is Smaller");
		}

	}
}
