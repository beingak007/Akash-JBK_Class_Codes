package com.method;

public class Operation {
	    int num1;
	    int num2;

	    public Operation(int num1, int num2) {
	        this.num1 = num1;
	        this.num2 = num2;
	    }

	    public int add() {
	       int  add= num1 + num2;
	       return add;
	    }

	    public int subtract() {
	        int sub= num1 - num2;
	        return sub;
	    }

	    public float division() {
	    	int div=num1/num2;
	    	return div;
	        }
	    

	    public double multiplication() {
	        double mul=num1 * num2;
	        return mul;
	    }
	}

	