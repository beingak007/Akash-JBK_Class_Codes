package com.star.looping;

public class Test27 {
	
	
		    public static void main(String[] args) {
		        int n = 5; 
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < i; j++) {
		                System.out.print("  ");
		            }

		            int num = 5 - i; 

		            for (int k = 0; k < n - i; k++) {
		                System.out.print(num + " "); 
		            }

		            System.out.println();
		        }
		    }
		}




