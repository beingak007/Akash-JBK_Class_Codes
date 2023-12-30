package com.star.looping;

public class Star {
	
	
	/*
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
	 
	 */

	public static void main(String[] args) {
		
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 10; col++) {
				if(col%2!=0)
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}