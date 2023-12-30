package com.associations.has.a.relation;

//target Object
public class Student {
	private Integer sid;
	private String sname;
	private Integer sage;
	
	//HAS-A Relation
	private Branch branch;

	public Student(Integer sid, String sname, Integer sage, Branch branch) {
		
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
		
	}
 public void display() {
	 
	 System.out.println("Student details are :: ");
	 System.out.println("SID is: "+sid);
	 System.out.println("SNAME is: "+sname);
	 System.out.println("SAGE is : "+sage);
	 
	 System.out.println("------------------------");
	 
	 System.out.println("Branch Deatails are :");
	 System.out.println("BID is :"+branch.getBid());
	 System.out.println("BNAME is :"+branch.getBloc());
	 System.out.println("########################################");
 }
	


	
	

}
