package com.star.looping;

public class Test12 {
	
	/*
	 
	# # @ # # 
	# # @ # # 
	@ @ @ @ @ 
	# # @ # # 
	# # @ # # 
	
	 */ 
	 public static void main(String[] args) {

	        for (int row = 1; row < 6; row++) {
	            for (int col = 1; col < 6; col++) {
	                if (row == 3 || col == 3) {
	                    System.out.print("@ ");
	                } else {
	                    System.out.print("# ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


