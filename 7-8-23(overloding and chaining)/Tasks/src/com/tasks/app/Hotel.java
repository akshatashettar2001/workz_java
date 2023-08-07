package com.tasks.app;

public class Hotel {
	public void serve() {
		System.out.println("invoking serve with no arg in Hotel");
		serve("Kamadhenu");
		serve("Davanagere",50);
		serve("ShantiNagar","Bangalore");
	}
	public void serve(String name) {
		System.out.println("invoking serve with String in Hotel");
		System.out.println("name:"+name);
	}
	public void serve(String location,double price) {
		System.out.println("invoking serve with String,string in Hotel");
		System.out.println("location"+location+"\nprice:"+price);
	}
	public void serve(String name,String location) {
		System.out.println("invoking serve with String,string in Hotel");
		System.out.println("name:"+name+"\nlocation:"+location);
	}
}
