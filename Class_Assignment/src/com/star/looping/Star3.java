package com.star.looping;

public class Star3 {
	
	
	
	
	
	/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E
	 
	 
	 
	 
	 */
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (char col = 'A'; col <= 'E'; col++) {
			System.out.print(col+" ");
			}
			System.out.println(); 
		}
	}
}


