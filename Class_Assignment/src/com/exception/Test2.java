package com.exception;

public class Test2 {
	    public static void main(String[] args) {
	        String str = null;

	        try {
	            int length = str.length(); // This line will throw a NullPointerException
	            System.out.println("Length of the string: " + length); // This line will not be reached
	        } catch (NullPointerException e) {
	            System.out.println("A NullPointerException occurred: " + e.getMessage());
	        }
	    }
	}


