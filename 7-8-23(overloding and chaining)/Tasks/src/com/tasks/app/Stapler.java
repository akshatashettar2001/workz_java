package com.tasks.app;

public class Stapler {
	public void pin() {
		System.out.println("invoking pin with no arg in Stapler");
		pin("Blue");
		pin("Apsara",250);
		pin("Kangaro","pink");
	}
	public void pin(String color) {
		System.out.println("invoking serve with String in Stapler");
		System.out.println("color:"+color);
	}
	public void pin(String company,double price) {
		System.out.println("invoking serve with String,string in Stapler");
		System.out.println("company"+company+"\nprice:"+price);
	}
	public void pin(String company,String color) {
		System.out.println("invoking serve with String,string in Stapler");
		System.out.println("company:"+company+"\n color:"+color);
	}
}
