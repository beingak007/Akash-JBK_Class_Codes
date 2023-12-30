package com.polymorphism.methodoverriding.bigproblem;

public class MainWildNon_Veg {
	    public static void main(String[] args) {
	        WildNon_Veg lion = new WildNon_Veg(15, "meat", "roar", "savannas", "zebra", true, "zebra");
	        lion.myPrey("zebra");
	        lion.amIPredator();
	    }
	}



