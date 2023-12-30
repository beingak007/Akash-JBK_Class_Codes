package com.encapsulation;

public class Student {
	
	    private String name;
	    private int id;
	    private float per;
	    private int age;
	    private int std;

	   
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public float getPer() {
	        return per;
	    }

	    public void setPer(float per) {
	        this.per = per;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getStd() {
	        return std;
	    }

	    public void setStd(int std) {
	        this.std = std;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Percentage: " + per);
	        System.out.println("Age: " + age);
	        System.out.println("Standard: " + std);
	    }
	}

	