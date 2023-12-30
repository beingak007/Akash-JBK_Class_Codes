package com.polymorphism.methodoverriding.bigproblem;

public class Non_FlyingBirds extends Bird {
	    private boolean canFly;

	    public Non_FlyingBirds(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, String ownerName, String species, boolean canFly) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood, ownerName, species);
	        this.canFly = canFly;
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a non-flying bird and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void whoIsMyOwner() {
	        System.out.println("I am a non-flying bird, and my owner is " + super.getOwnerName() + ".");
	    }

	    public void canIFly() {
	        if (canFly) {
	            System.out.println("Yes, I can fly.");
	        } else {
	            System.out.println("No, I cannot fly.");
	        }
	    }
	}



