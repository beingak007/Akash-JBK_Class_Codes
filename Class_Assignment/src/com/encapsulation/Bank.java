package com.encapsulation;

public class Bank {
	
	    private int accountNumber;
	    private double balance;
	    private int pin;

	    public void setAccountNumber(int accountNumber) {
	    	this.accountNumber = accountNumber;
	    }
	    public int getAccountNumber() {
	        return accountNumber;
	    }
	   
	    public void setPinNumber(int pin) {
	    	this.pin = pin;
	    }
	    public int getPinNumber() {
	    	return pin;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	 
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Updated balance: " + balance);
	        } else {
	            System.out.println("Amount is greater than balance.");
	        }
	    }

	 
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit successful. Updated balance: " + balance);
	    }
	    public void pin(int pin) {
	    	this.pin=pin;
	    	System.out.println("pin is Succesfull");
	    }
	}


	