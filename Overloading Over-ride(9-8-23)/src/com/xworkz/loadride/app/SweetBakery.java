package com.xworkz.loadride.app;

public class SweetBakery extends Bakery {

	@Override
	public void cook() {
		System.out.println("invocking no args in SweetBakery");
	}

	@Override
	public void cook(String name, String type) {
		System.out.println("invocking String name, String type");

	}

	@Override
	public void cook(String name, String type, double price) {
		System.out.println("invocking String name, String type, double price");

	}

	@Override
	public void cook(String name, String type, double price, boolean open) {
		System.out.println("invocking String name, String type, double price, boolean open");
	}

	@Override
	public void cook(String name, String type, double price, boolean open, long coustomer) {
		System.out.println("invockin String name, String type, double price, boolean open, long coustomer");
	}

	@Override
	public void cook(String name, String type, double price, boolean open, long coustomer, int quantity) {
		System.out.println(
				"invocking String name, String type, double price, boolean open, long coustomer, int quantity");
		System.out.println("name:" + name);
		System.out.println("type:" + type);
		System.out.println("price:" + price);
		System.out.println("open:" + open);
		System.out.println("coustomer:" + coustomer);
		System.out.println("quantity:" + quantity);

	}

}
