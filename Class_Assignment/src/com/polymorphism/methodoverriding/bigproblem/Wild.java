package com.polymorphism.methodoverriding.bigproblem;

	public class Wild extends Animal {
	    private boolean isPredator;

	    public Wild(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, boolean isPredator) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood);
	        this.isPredator = isPredator;
	    }

	    @Override
	    public void myLifePeriod(int year) {
	        System.out.println("I am a wild animal and can live up to " + year + " years.");
	    }

	    @Override
	    public void myFoodType(String foodType) {
	        System.out.println("I am a wild animal and I eat " + foodType + ".");
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a wild animal and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void myGeoLocation(String geoLocation) {
	        System.out.println("I am commonly found in wild areas of " + geoLocation + ".");
	    }

	    @Override
	    public void myFavoriteFood(String favoriteFood) {
	        System.out.println("I am a wild animal and my favorite food is " + favoriteFood + ".");
	    }

	    public void amIPredator() {
	        if (isPredator) {
	            System.out.println("Yes, I am a predator.");
	        } else {
	            System.out.println("No, I am not a predator.");
	        }
	    }
	}



