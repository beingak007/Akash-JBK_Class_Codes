package com.method;

public class VehicleMain {
	public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.display("Car", "TATA", "MH-13-8878", "Blue");

        Vehicle vehicle2 = new Vehicle();
        vehicle2.display("Motorcycle", "Sports", "MH-12-5678", "Red");

        Vehicle vehicle3 = new Vehicle();
        vehicle3.display("Truck", "Heavy Duty", "MH-12-9012", "Green");

        Vehicle vehicle4 = new Vehicle();
        vehicle4.display("Scooter", "Electric", "MH-09-1312", "Black");
    }
}


