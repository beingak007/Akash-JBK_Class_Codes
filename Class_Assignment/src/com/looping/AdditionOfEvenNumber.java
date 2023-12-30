package com.looping;

public class AdditionOfEvenNumber {

	public static void main(String[] args) {
		System.out.println("Even Number Addition");
		
		int sum = 0;
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("Addition : " + sum);
		System.out.println("Odd Number addition ");
		
		int sum1 = 0;
		for (int a = 20; a <= 30; a++) {
			if (a % 2 != 0) {
				System.out.println(a);
				sum1 = sum1 + a;
			}
		}
		System.out.println("Addition : " + sum1);
	}

}
