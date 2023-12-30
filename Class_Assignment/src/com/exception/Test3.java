package com.exception;

public class Test3 {
	    public static void main(String[] args) {
	        String numberStr = "abc123";

	        try {
	            int number = Integer.parseInt(numberStr); // This line will throw a NumberFormatException
	            System.out.println("Number: " + number); // This line will not be reached
	        } catch (NumberFormatException e) {
	            System.out.println("A NumberFormatException occurred: " + e.getMessage());
	        }
	    }
	}



