package com.tasks.app;

public class IronBox {
	public void iron() {
		System.out.println("invoking iron with no arg in IronBox");
		iron("Prestige");
		iron(1299);
		iron("Bosh",1300,2);
	}
	public void iron(String company) {
		System.out.println("invoking iron with string in IronBox ");
		System.out.println("company:"+company);
	}
	public void iron(double cost) {
		System.out.println("invoking iron with string,double in IronBox ");
		System.out.println("cost:"+cost);
	}
	public void iron(String company,double cost,int waranty) {
		System.out.println("invoking iron with string,double in IronBox ");
		System.out.println("company:"+company+"\ncost:"+cost+"\nwaranty:"+waranty);
	}
	
}
