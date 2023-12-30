package com.polymorphism.methodoverriding;

public class Bank {

	String bName;
	double balance;
	Bank(String bName,double balance){
		
		this.bName=bName;
		this.balance=balance;
		
	}
	double getBalance() {
		return balance;
	}
	double withdraw(double amount) {
		amount =balance-amount;
		return balance;
		
	}
	double deposit(double amount) {
		balance+=amount;
		return balance;
		
	}

}
