package com.exception;

public class Test5 {
	
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        try {
	            int index = 6; // Attempting to access an element at index 6, which is out of bounds
	            int value = numbers[index]; // This line will throw an ArrayIndexOutOfBoundsException
	            System.out.println("Value: " + value); // This line will not be reached
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
	        }
	    }
	}


