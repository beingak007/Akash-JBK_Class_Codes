package com.polymorphism.methodoverriding.bigproblem;

public class Bird extends Domestic {
	    private String species;

	    public Bird(int lifePeriod, String foodType, String sound, String geoLocation, String favoriteFood, String ownerName, String species) {
	        super(lifePeriod, foodType, sound, geoLocation, favoriteFood, ownerName);
	        this.setSpecies(species);
	    }

	    @Override
	    public void mySound(String sound) {
	        System.out.println("I am a bird and I make the sound '" + sound + "'.");
	    }

	    @Override
	    public void whoIsMyOwner() {
	        System.out.println("I am a bird, and my owner is " + super.getOwnerName() + ".");
	    }

	    public void mySpecies(String species) {
	        System.out.println("I belong to the species " + species + ".");
	    }

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}
	}



