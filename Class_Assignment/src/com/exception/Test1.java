package com.exception;

public class Test1 {
	    public static void main(String[] args) {
	        int a= 10;
	        int b = 0;

	        try {
	            int result = a/ b; // This line will throw an ArithmeticException
	            System.out.println("Result: " + result); // This line will not be reached
	        } catch (ArithmeticException e) {
	            System.out.println("An ArithmeticException occurred: " + e.getMessage());
	        }
	    }
	}



