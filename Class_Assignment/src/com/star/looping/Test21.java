package com.star.looping;

public class Test21 {
	
	
	
	
/*
	
A 
A B 
A B C 
A B C D 
A B C D E 

*/
	    public static void main(String[] args) {
	        int n = 5; 

	        for (int i = 0; i < n; i++) {
	            char ch = 'A'; 

	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	                ch++;
	            }

	            System.out.println();
	        }
	    }
	}



