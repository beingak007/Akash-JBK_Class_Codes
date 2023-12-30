package com.associations.has.a.relation;

public class Course {
	
	private String cId;
	private String cName;
	private Integer cost;
	public Course(String cId, String cName, Integer cost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cost = cost;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	

}
