package com.exceptionhandling;

public class InsufficientFund extends RuntimeException{
	
	public InsufficientFund(String msg) {

		super(msg);
		
	}

}
