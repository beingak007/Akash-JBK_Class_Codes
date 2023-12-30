package com.polymorphism;

public class Operation1 {

	public static void main(String[] args) {

		Operation p1=new Operation();
		int a=p1.add();
		System.out.println(a);
		
		Operation p2=new Operation();
		int b=p2.division();
		System.out.println(b);
		Operation p3=new Operation();
			p3.multipliaction();
		Operation p4=new Operation();
			int c=p4.substract();
			System.out.println(c);
		
	}

}
