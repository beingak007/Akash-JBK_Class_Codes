package com.method;

public class Employee {
	    double da;  // 10% of salary
	    double hra; // 15% of salary
	    double ta;  // 20% of salary
	    double pt;  // 15% of salary
	    double pf;  // 10% of salary
	    double salary; // Given as 100000
	    double gross_salary;
	    double net_salary;

	    public Employee() {
	        
	        hra = 0.15 * salary;
	        ta = 0.20 * salary;
	        pt = 0.15 * salary;
	        pf = 0.10 * salary;
	    }

	    public void da() {
	        System.out.println("DA (Dearness Allowance): " + da);
	    }

	    public void hra() {
	        System.out.println("HRA (House Rent Allowance): " + hra);
	    }

	    public void ta() {
	        System.out.println("TA (Travel Allowance): " + ta);
	    }

	    public void pt() {
	        System.out.println("PT (Professional Tax): " + pt);
	    }

	    public void pf() {
	        System.out.println("PF (Provident Fund): " + pf);
	    }

	    public void gross_salary() {
	        gross_salary = salary + da + hra + ta;
	        System.out.println("Gross Salary: " + gross_salary);
	    }

	    public void net_salary() {
	        net_salary = gross_salary - (pf + pt);
	        System.out.println("Net Salary: " + net_salary);
	    }
	}


