package com.star.looping;

public class Test23 {
	
	
	
/*
	
e 
e d 
e d c 
e d c b 
e d c b a 

*/
	    public static void main(String[] args) {
	        int n = 5; 

	        for (int i = 0; i < n; i++) {
	            char ch = 'e'; 

	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	                ch--;
	            }

	            System.out.println();
	        }
	    }
	}



