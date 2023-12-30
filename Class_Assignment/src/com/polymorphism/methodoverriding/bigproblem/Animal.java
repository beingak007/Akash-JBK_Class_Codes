package com.polymorphism.methodoverriding.bigproblem;

public class Animal {
	    // Properties
	    private int lifePeriod;
	    private String foodType;
	    private String sound;
	    private String geoLocation;
	    private String favoriteFood;

	    public Animal(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood) {
	        this.setLifePeriod(lifePeriod);
	        this.foodType = foodType;
	        this.sound = sound;
	        this.geoLocation = geoLocation;
	        this.favoriteFood = favoriteFood;
	    }

	    public void myLifePeriod(int year) {
	        System.out.println("I can live up to year  " + year );
	    }

	    public void myFoodType(String foodType) {
	        System.out.println("I eat " + foodType + ".");
	    }

	    public void mySound(String sound) {
	        System.out.println("I make the sound '" + sound + "'.");
	    }

	    public void myGeoLocation(String geoLocation) {
	        System.out.println("I am commonly found in " + geoLocation + ".");
	    }

	    public void myFavoriteFood(String favoriteFood) {
	        System.out.println("My favorite food is " + favoriteFood + ".");
	    }

		public int getLifePeriod() {
			return lifePeriod;
		}

		public void setLifePeriod(int lifePeriod) {
			this.lifePeriod = lifePeriod;
		}
	}



