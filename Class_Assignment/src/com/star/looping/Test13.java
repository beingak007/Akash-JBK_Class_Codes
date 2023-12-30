package com.star.looping;

public class Test13 {
	
	
	
	/*
	 
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9
	 
	 */
	public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = row; col <= row+4 ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}


