package com.polymorphism.methodoverriding.bigproblem;

public class Flying_Bird extends Bird {
	    private double wingspan;

	    public Flying_Bird(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, String ownerName, String species, double wingspan) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood, ownerName, species);
	        this.setWingspan(wingspan);
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a flying bird and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void whoIsMyOwner() {
	        System.out.println("I am a flying bird, and my owner is " + super.getOwnerName() + ".");
	    }

	    public void myWingspan(double wingspan) {
	        System.out.println("My wingspan is " + wingspan + " meters.");
	    }

		public double getWingspan() {
			return wingspan;
		}

		public void setWingspan(double wingspan) {
			this.wingspan = wingspan;
		}
	}



