package com.exceptionhandling;

public class Bank {
	double balance;
	public Bank(double balance) {
		
		this.balance=balance;
	
	
	
	
}
	public void withdraw(double amount ) {
		if (amount >balance) {
			
			throw new InsufficientFund("Is Greater than amount");
		}else {
			balance-=amount;
			System.out.println(balance);
		}
		
	}
	public static void main(String[] args) {
		
		Bank b =new Bank(5000);
		b.withdraw(669797);
	}

}
