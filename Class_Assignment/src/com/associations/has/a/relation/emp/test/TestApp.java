package com.associations.has.a.relation.emp.test;


import com.associations.has.a.relation.emp.Account;
import com.associations.has.a.relation.emp.Employee;

public class TestApp {
	
	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAccNo("082397429");
		acc.setAccHolderName("Akash Shinge");
		acc.setAccType("Saving");
		acc.setBalance(2000);
		
		Employee emp=new Employee();
		emp.seteNo(111);
		emp.seteName("Akash Shinge");
		emp.seteAdd("Solapur");
		emp.setE(450000);
		emp.setAccount(acc);
		emp.getEmpDetails();
		

		
	}

}
