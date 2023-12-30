package com.abstraction;

public abstract class Bank {
	String bName;
	double balance;
	Bank(String bName,double balance){
		
		this.bName=bName;
		this.balance=balance;
		
	}
	
	double getBalance() {
		return balance;
	}
	public abstract double withdraw(double amount); {
		
	}
	public abstract double deposit(double amount); {
		
	}

}


