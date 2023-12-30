package com.polymorphism.methodoverriding;

public class SavingAc extends Bank {
	String acctype;

	public SavingAc(String acctype, String bName, double balance) {
		super(bName, balance);
		this.acctype = acctype;

	}

	@Override
	double withdraw(double amount) {
		amount = balance - amount;
		System.out.println("Withdraw Amount is " + amount);
		return balance;

	}

	@Override
	double deposit(double amount) {

		balance += amount;
		System.out.println("Withdraw Amount is " + amount);
		return balance;

	}
	
	void display() {
		System.out.println();
	}

}
