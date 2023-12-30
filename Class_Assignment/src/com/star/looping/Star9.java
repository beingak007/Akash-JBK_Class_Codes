package com.star.looping;

public class Star9 {
	
	
	/*
	 
@ # # # # 
# @ # # # 
# # @ # # 
# # # @ # 
# # # # @ 
	 
	 
	 
	 
	 */
	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row == col) {
					System.out.print("@ ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

}
