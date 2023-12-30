package com.polymorphism;

public class Bridge1 {

	public static void main(String[] args) {
	
				System.out.println("Bridges 1");
				Bridge b1=new Bridge();
				b1.display("Katraj", 134, "Vadgaon budruk", 23.11f  );
				
				
				System.out.println("Bridges 2");
				Bridge b2=new Bridge();
				b2.display("Pavan briage", 542, "Vadgaon budruk", 10.11f );
				
				System.out.println("\n" );
				System.out.println("Bridges 3");
				Bridge b3=new Bridge();
				b3.display(" briage", 3, "Vadgaon budruk", 33.11f);
				
				System.out.println( );
				System.out.println("Bridges 4");
				Bridge b4=new Bridge();
				b4.display("Navle briage", 4, "Vadgaon budruk", 43.11f);
			}

		

	}


