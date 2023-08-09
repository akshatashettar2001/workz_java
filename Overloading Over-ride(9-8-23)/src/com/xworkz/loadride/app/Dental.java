package com.xworkz.loadride.app;

public class Dental extends Hospital {

	@Override
	public void checkup() {
		System.out.println("invocking no-args in Dental");
	}

	@Override
	public void checkup(int room, String location) {
	System.out.println("invoking int,string in dental");
	System.out.println("room:"+room);
	System.out.println("location:"+location);
	}

	@Override
	public void checkup(int room, String location, String name) {
		
	}

	@Override
	public void checkup(int room, String location, String name, double charges) {
		
	}

	@Override
	public void checkup(int room, String location, String name, double charges, boolean good) {
		
	}

	@Override
	public void checkup(int room, String location, String name, double charges, boolean good, int noOfPatients) {
		
	}
}
