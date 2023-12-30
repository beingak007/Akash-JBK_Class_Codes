package com.polymorphism.methodoverriding.bigproblem;

public class Domestic extends Animal {
	    private String ownerName;

	    // Parameterized Constructor for Domestic
	    public Domestic(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, String ownerName) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood);
	        this.ownerName = ownerName;
	    }

	    // Override methods from parent class
	    @Override
	    public void myLifePeriod(int year) {
	        System.out.println("I am a domestic animal and can live up to " + year + " years.");
	    }

	    @Override
	    public void myFoodType(String foodType) {
	        System.out.println("I am a domestic animal and I eat " + foodType + ".");
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a domestic animal and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void myGeoLocation(String geoLocation) {
	        System.out.println("I am commonly found in households in " + geoLocation + ".");
	    }

	    @Override
	    public void myFavoriteFood(String favoriteFood) {
	        System.out.println("I am a domestic animal and my favorite food is " + favoriteFood + ".");
	    }

	    public void whoIsMyOwner() {
	        System.out.println("My owner is " + ownerName + ".");
	    }

		public String getOwnerName() {
			return ownerName;
		}
	}


