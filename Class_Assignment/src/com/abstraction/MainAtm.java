package com.abstraction;

public class MainAtm {
	public static void main(String[] args) {

		Bank a = new ATM("SBI", 50000);

		System.out.println("Deposit amount is " + a.deposit(5000));
		
		System.out.println("Withdraw amount is " + a.withdraw(9000));

		System.out.println("Withdraw amount is " + a.getBalance());
	}

}
