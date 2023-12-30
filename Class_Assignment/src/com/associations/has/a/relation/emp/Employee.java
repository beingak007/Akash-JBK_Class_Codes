package com.associations.has.a.relation.emp;

public class Employee {
	private int eNo;
	private String eName;
	private float eSal;
	private String eAdd;

	private Account account;

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float getE() {
		return eSal;
	}

	public void setE(float e) {
		this.eSal = e;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void getEmpDetails() { 
		System.out.println("employee Details :");
		System.out.println("----------------------");
		System.out.println("employe Number     :"+eNo);
		System.out.println("Employee Name      :"+eName);
		System.out.println("Employee Salary    :"+eSal);
		System.out.println("Employee  Add      :"+eAdd);
		
		System.out.println();
		
		System.out.println("Account Details Are :");
		
		System.out.println("----------------------");
		System.out.println("Account Number      :"+account.getAccNo());
		System.out.println("Account Holder name :"+account.getAccHolderName());
		System.out.println("Account Type        :"+account.getAccType());
		System.out.println("Account Balanace    :"+account.getBalance());
	}

}
