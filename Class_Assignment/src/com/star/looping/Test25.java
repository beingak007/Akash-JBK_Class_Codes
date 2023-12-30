package com.star.looping;

public class Test25 {
	
	
	
/*
	
   		A 
      A B 
    A B C 
  A B C D 
A B C D E

*/
	    public static void main(String[] args) {

	        for (int i = 0; i < 5; i++) {
	            
	            for (int j = 0; j < 5 - i - 1; j++) {
	                System.out.print("  ");
	            }

	            char ch = 'A'; 
	          
	            for (int k = 0; k <= i; k++) {
	                System.out.print(ch + " ");
	                ch++;
	            }

	            System.out.println();
	        }
	    }
	}



