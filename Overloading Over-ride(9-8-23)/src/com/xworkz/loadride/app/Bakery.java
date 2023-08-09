package com.xworkz.loadride.app;

public class Bakery {

	public String name;
	public String type;
	public double price;
	public boolean open;
	public long coustomer;
	public int quantity;

	public void cook() {
		System.out.println("invocking no args in Bakery");
	}

	public void cook(String name, String type) {
		System.out.println("invocking String name, String type");

	}

	public void cook(String name, String type, double price) {
		System.out.println("invocking String name, String type, double price");

	}

	public void cook(String name, String type, double price, boolean open) {
		System.out.println("invocking String name, String type, double price, boolean open");

	}

	public void cook(String name, String type, double price, boolean open, long coustomer) {
		System.out.println("invockin String name, String type, double price, boolean open, long coustomer");

	}

	public void cook(String name, String type, double price, boolean open, long coustomer, int quantity) {
		System.out.println(
				"invocking String name, String type, double price, boolean open, long coustomer, int quantity");

	}

}
