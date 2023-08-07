package com.tasks.app;

public class Plier {
	public void cut() {
		System.out.println("invoking pin with no arg in Plier");
		cut("Green");
		cut("Kaltron",299);
		cut("Tata","Yellow");
	}
	public void cut(String color) {
		System.out.println("invoking serve with String in Plier");
		System.out.println("color:"+color);
	}
	public void cut(String company,double price) {
		System.out.println("invoking serve with String,string in Plier");
		System.out.println("company"+company+"\nprice:"+price);
	}
	public void cut(String company,String color) {
		System.out.println("invoking serve with String,string in Plier");
		System.out.println("company:"+company+"\n color:"+color);
	}
}
