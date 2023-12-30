package com.polymorphism.methodoverriding.bigproblem;

public class WildNon_Veg extends Wild {
	    // Additional property specific to Wild_Non_Veg
	    private String prey;

	    // Parameterized Constructor for Wild_Non_Veg
	    public WildNon_Veg(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, boolean isPredator, String prey) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood, isPredator);
	        this.setPrey(prey);
	    }

	    // Override methods from parent class
	    @Override
	    public void myFoodType(String foodType) {
	        System.out.println("I am a wild carnivorous animal and I primarily eat " + foodType + ".");
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a wild carnivorous animal and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void myFavoriteFood(String favoriteFood) {
	        System.out.println("I am a wild carnivorous animal and my favorite food is " + favoriteFood + ".");
	    }

	    // Additional method specific to Wild_Non_Veg
	    public void myPrey(String prey) {
	        System.out.println("My primary prey is " + prey + ".");
	    }

		public String getPrey() {
			return prey;
		}

		public void setPrey(String prey) {
			this.prey = prey;
		}
	}

