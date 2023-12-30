package com.abstraction;

public class Duke extends Bike {
	String Type;
	Duke(String name,String no,String type){
		super(name,no);
		this.Type=type;
	}
	@Override
	public  int noOfGear(int a) {
		 a=5;
		return a;
		
	}

public  int milage(int a) {
	 a=40;
	 return a;
}
 void showData() {
	 super.Display();
	 System.out.println("Type is bike >>>>"+this.Type);
 }

}
