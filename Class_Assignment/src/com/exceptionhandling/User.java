package com.exceptionhandling;

import java.util.Scanner;

public class User {
	private String username;
	private String password;

	public User(String username, String password) {
		this.username = username;

		if (password.length() < 8) {
			throw new InvalidPasswordException("Password must be at least 8 characters long.");
		}

		this.password = password;
		System.out.println("User is registered successfully");
		System.out.println("Username: " + username);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		try {
			User user = new User(username, password);
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
