package com.inheritance;

public class Animal {
	
	    String name;
	    String species;

	    Animal(String name, String species) {
	        this.name = name;
	        this.species = species;
	    }
	}

	class Dog extends Animal {
	    int id;
	    String breed;

	   public  Dog(int id, String breed, String name, String species) {
	        super(name, species);
	        this.id = id;
	        this.breed = breed;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Species: " + species);
	        System.out.println("ID: " + id);
	        System.out.println("Breed: " + breed);
	    }
	}

	

		
		

