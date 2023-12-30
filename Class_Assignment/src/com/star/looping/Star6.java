package com.star.looping;

public class Star6 {
	
	/*
50 52 54 56 58 60 62 64 66 68 70 
50 52 54 56 58 60 62 64 66 68 70 
50 52 54 56 58 60 62 64 66 68 70 
50 52 54 56 58 60 62 64 66 68 70 
50 52 54 56 58 60 62 64 66 68 70
	 
	 
	 
	 
	 */
	
	
	
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 50; col <= 70; col++) {
				if(col%2==0)
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
