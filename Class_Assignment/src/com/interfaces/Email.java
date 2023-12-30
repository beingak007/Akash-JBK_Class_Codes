package com.interfaces;

public class Email implements Mail {

	String sendmail;
	String body;
	String sub;

	Email(String sendmail, String body, String sub) {
		this.body = body;
		this.sendmail = sendmail;
		this.sub = sub;
	}
	//@Override
	public boolean authentication() {
		if (sendmail != null) {
			return true;
		} else {
			return false;
		}
	}

	public void connecting() {
		System.out.println("connecting");
	}
	public void disconeecting() {
		System.out.println("disconnecting");

	}

	public void sendMail() {
		this.connecting();
		if (authentication()) {
			System.out.println(body);
			System.out.println(sub);
		}
		this.disconeecting();
	}

}
