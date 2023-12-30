package com.looping;

public class SumOfDivisible3 {
	public static void main(String[] args) {

		int sum = 0;
		int count = 0;

		for (int i = 300; i < 350; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
				count++;

			}
		}
		System.out.println("sum 0f number Divide by 3 :" + sum);
		System.out.println("Total 0f number Divide by 3 :" + count);
	}

}
