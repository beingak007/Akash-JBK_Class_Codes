package com.polymorphism.methodoverriding;

public class MainBank {
	
	public static void main(String[] args) {
		
		SavingAc s=new SavingAc("SBI", "Saving",5000);
		s.deposit(5000);
		s.withdraw(200);
		
	
	}

}
