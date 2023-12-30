package com.star.looping;

public class Test24 {
	
	
	
/*
	
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6

*/
	
	    public static void main(String[] args) {
	     

	        for (int i = 0; i < 6; i++) {
	            int num = 1; 

	            for (int j = 0; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }

	            System.out.println();
	        }
	    }
	}



