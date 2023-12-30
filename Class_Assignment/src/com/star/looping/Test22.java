package com.star.looping;

public class Test22 {
	
	
	
/*
	
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/
	    public static void main(String[] args) {
	        int n = 5; 

	        for (int i = 0; i < n; i++) {
	            int num = 5; 

	            for (int j = 0; j <= i; j++) {
	                System.out.print(num + " ");
	                num--;
	            }

	            System.out.println();
	        }
	    }
	}



