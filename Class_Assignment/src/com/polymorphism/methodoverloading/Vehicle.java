package com.polymorphism.methodoverloading;

public class Vehicle {
	String vehicleType;
	
	public void display(String vehicleType) {
		this.vehicleType = vehicleType;
		
		System.out.println("Type: " + vehicleType );
	}
}
