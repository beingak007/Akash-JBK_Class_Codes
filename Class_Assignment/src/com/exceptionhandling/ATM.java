package com.exceptionhandling;

import java.util.Scanner;

public class ATM {
	
 int pin;

 public void Pin(int amount ) {
	 this.pin=amount;
		if (pin !=1234) {
			
			throw new InsufficientFund("invalid Pin");
		}else {
			
			System.out.println(" Valid pin");
		}
		
	}
 public static void main(String[] args) {
	

	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a pin");
	 int a=sc.nextInt();
	ATM d =new ATM();
	d.Pin(a);
 }

}
