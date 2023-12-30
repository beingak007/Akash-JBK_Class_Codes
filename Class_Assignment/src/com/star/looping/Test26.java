package com.star.looping;

public class Test26 {
	
	
/*	
	    1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5
*/
	    public static void main(String[] args) {
	        int n = 5; 

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print("  ");
	            }

	            int num = i + 1; 

	            for (int k = 0; k <= i; k++) {
	                System.out.print(num + " ");
	            }

	            System.out.println();
	        }
	    }
	}



