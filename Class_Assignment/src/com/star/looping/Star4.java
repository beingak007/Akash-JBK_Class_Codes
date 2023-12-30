package com.star.looping;

public class Star4 {
	
	
	/*
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1
	  
	 */
	
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= 1; col--) {
			System.out.print(col+" ");
			}
			System.out.println(); 
		}
	}
}


