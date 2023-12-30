package com.polymorphism;

public class Employee {

	float da;
	float hra;
	float ta;
	float pt;
	float pf;
	int salary = 95000;
	float GrossSalary;
	float NetSalary;

	public float HRA() {
		hra = (salary * 15) / 100;
		return hra;

	}

	public float DA() {
		da = (salary * 12) / 100;
		return hra;

	}

	public float TA() {
		ta = (salary * 18) / 100;
		return ta;

	}

	public float PT() {
		hra = (salary * 15) / 100;
		return hra;

	}

	public float PF() {
		pf = (salary * 25) / 100;
		return hra;

	}

	public float Gross_Salary() {
		GrossSalary = salary + hra + da + ta;
		return GrossSalary;

	}

	public float Net_Salary() {
		NetSalary = GrossSalary - (pf + pt);
		return GrossSalary;

	}
}
