package com.polymorphism.methodoverloading;

public class Car extends Vehicle {
	
	String brand;
	String vNum;


	
	void display(String brand,String vNum) {
		this.brand=brand;
		this.vNum=vNum;
		System.out.println("Brand is >>> "+this.brand);
		System.out.println("Vehicle Number  is >>> "+this.vNum);

}
}