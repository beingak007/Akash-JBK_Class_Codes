package com.inheritance;

public class Vehicle {

	String type;

	Vehicle(String type) {
		this.type = type;
	}
}

class Car extends Vehicle {
	String brand;
	String carNo;

	Car(String type, String brand, String carNo) {
		super(type);
		this.brand = brand;
		this.carNo = carNo;
	}

	void display() {
		System.out.println("Type: " + type);
		System.out.println("Brand: " + brand);
		System.out.println("Car Number: " + carNo);
	}
}


	