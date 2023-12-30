package com.polymorphism.methodoverriding.bigproblem;

public class Pet extends Domestic {
	    private String petName;

	    public Pet(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, String ownerName, String petName) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood, ownerName);
	        this.petName = petName;
	    }

	    @Override
	    public void myLifePeriod(int year) {
	        System.out.println("I am a pet and can live up to " + year + " years.");
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a pet and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void whoIsMyOwner() {
	        System.out.println("My owner is " );
	    }

	    public void whatIsMyName() {
	        System.out.println("My name is " + petName + ".");
	    }
	}




