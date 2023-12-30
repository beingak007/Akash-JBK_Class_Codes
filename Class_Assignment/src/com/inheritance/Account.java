package com.inheritance;

public class Account {

	String accountType;
	String bankName;

	Account(String acType, String bankName) {
		this.accountType = acType;
		this.bankName = bankName;
	}

	void display() {
		System.out.println("Account Type: " + accountType);
		System.out.println("Bank Name: " + bankName);
	}
}

class SavingAc extends Account {
	int acNo;
	String acHolderName;

	SavingAc(int acNo, String acHolderName, String accountType, String bankName) {
		super(accountType, bankName);
		this.acNo = acNo;
		this.acHolderName = acHolderName;
	}

	void displayAccountInfo() {
		display();
		System.out.println("Account Number: " + acNo);
		System.out.println("Account Holder Name: " + acHolderName);
	}
}
