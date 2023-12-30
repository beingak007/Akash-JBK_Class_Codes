package com.encapsulation;

public class MainBank {
	
	    public static void main(String[] args) {
	        Bank myAccount = new Bank();

	   
	        myAccount.setAccountNumber(123456789);
	        myAccount.setBalance(5000.0);

	        
	        System.out.println("Account Number >> " + myAccount.getAccountNumber());
	        System.out.println("Current Balance >> " + myAccount.getBalance());

	        myAccount.withdraw(2000.0);
	        myAccount.deposit(3000.0);
	        
	    }
	


}



