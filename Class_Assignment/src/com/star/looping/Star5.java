package com.star.looping;

public class Star5 {
	
	
	
	
	/*
	 
	 
e d c b a 
e d c b a 
e d c b a 
e d c b a 
e d c b a
	 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
	for (int row = 1; row <= 5; row++) {
		for (char col = 'e'; col >= 'a'; col--) {
		System.out.print(col+" ");
		}
		System.out.println(); 
	}
}
}



