package com.polymorphism.methodoverriding;

public class Dog extends Animal  {

		int id;
		String breed;

		Dog(String name, String type, int id, String n) {
			super(name, type);
			this.id = id;
			this.breed = n;
		}

		@Override
		public void display() {
			System.out.println("Name  >>> "+super.name);
			System.out.println("Type  >>> "+super.type);
			System.out.println("Name of the  >>> "+this.breed);
			System.out.println("ID Number is  >>> "+this.id);

		}
		
	}


