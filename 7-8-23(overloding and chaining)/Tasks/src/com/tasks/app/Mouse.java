package com.tasks.app;

public class Mouse {
	public void cursor() {
		System.out.println("invoking pin with no arg in Mouse");
		cursor("Black");
		cursor("Dell",599);
		cursor("Ibol","Red");
	}
	public void cursor(String color) {
		System.out.println("invoking serve with String in Mouse");
		System.out.println("color:"+color);
	}
	public void cursor(String company,double price) {
		System.out.println("invoking serve with String,string in Mouse");
		System.out.println("company"+company+"\nprice:"+price);
	}
	public void cursor(String company,String color) {
		System.out.println("invoking serve with String,string in Mouse");
		System.out.println("company:"+company+"\n color:"+color);
	}
}
