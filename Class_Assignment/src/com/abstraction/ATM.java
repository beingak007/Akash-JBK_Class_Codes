package com.abstraction;

public class ATM extends Bank {
	
	ATM(String bName,double balance){
		super(bName,balance);
	}
	
	
	
	@Override
	public double withdraw(double amount) {
		amount =super.balance-amount;
		return amount;
		
	}
	@Override
	public double deposit(double amount) {
		double a=super.balance+=amount;
		return a
				;
		
	}

}

