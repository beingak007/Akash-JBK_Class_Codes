package com.abstraction;

public class Email extends Mail{
	Email(String sendMail,String subject,String body){
		super(sendMail, subject,body);
	}
	@Override
	boolean authentication(){
		if(sendMail!=null) {
			System.out.println("Authentication is failure....");
			return false;
		}else {
			System.out.println("Authentication is Successfully....");
			return true;
		}
		}
	@Override
	public boolean connecting() {
		System.out.println("Connecting.....");
		return true;
		
		
	}
	@Override
	public boolean disconeecting() {
		System.out.println("Disconnecting the server...");
		return true;  
	}
	@Override
	 public boolean sendmail() {
		connecting();
		disconeecting();
		if(authentication()) {
			System.out.println("Write the subject here...."+subject);
			System.out.println("Write the body here...."+body);
			return true;
		}
		else {
			System.out.println("Authentication is failed");
			return false;
		}
	
		
	}

}
