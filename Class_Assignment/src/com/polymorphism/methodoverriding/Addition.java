package com.polymorphism.methodoverriding;

public class Addition extends Operation {
		 public Addition(int a, int b) {
		        super(a, b);
		    }

		    @Override
		    public void performAction() {
		        int result = a + b;
		        System.out.println(" Addition Is : " + result);
		    }
		}

	
