package com.abstraction;

public abstract class Mail {
	String sendMail;
	String subject;
	String body;
	
	Mail(String sendMail, String subject, String body){
		this.body=sendMail;
		this.subject=subject;
		this.body=body;
		
	}
	abstract boolean authentication();
	abstract boolean connecting();
	abstract boolean disconeecting();
	abstract boolean sendmail();
	
	
}
