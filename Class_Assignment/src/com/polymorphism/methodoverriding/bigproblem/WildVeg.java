package com.polymorphism.methodoverriding.bigproblem;

public class WildVeg extends Wild {
	    private String plantType;

	    public WildVeg(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, boolean isPredator, String plantType) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood, isPredator);
	        this.setPlantType(plantType);
	    }

	    @Override
	    public void myFoodType(String foodType) {
	        System.out.println("I am a wild vegetable-eating animal and I primarily eat " + foodType + ".");
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a wild vegetable-eating animal and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void myFavoriteFood(String favoriteFood) {
	        System.out.println("I am a wild vegetable-eating animal and my favorite food is " + favoriteFood + ".");
	    }

	    public void myPlantType(String plantType) {
	        System.out.println("I primarily consume " + plantType + " as my main food source.");
	    }

		public String getPlantType() {
			return plantType;
		}

		public void setPlantType(String plantType) {
			this.plantType = plantType;
		}
	}



