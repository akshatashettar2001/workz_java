package com.xworkz.loadride.app;

public class Hospital {

	public int room;
	public String location;
	public String name;
	public double charges;
	public boolean good;
	public int noOfPatients;

	public void checkup() {
		System.out.println("invocking no-args in Hospital");
	}

	public void checkup(int room, String location) {
		System.out.println("invocking int String in Hospital");
	}

	public void checkup(int room, String location, String name) {
	}

	public void checkup(int room, String location, String name, double charges) {
		
	}

	public void checkup(int room, String location, String name, double charges, boolean good) {
		
	}

	public void checkup(int room, String location, String name, double charges, boolean good, int noOfPatients) {
		
	}

}
