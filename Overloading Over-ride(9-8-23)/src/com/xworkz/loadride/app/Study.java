package com.xworkz.loadride.app;

public class Study extends Library {
	@Override
	public void read() {
		System.out.println("invocking no-args in Library");
	}

	@Override
	public void read(String name, int noOfStaff) {
		
	}

	@Override
	public void read(String name, int noOfStaff, int noOfBooks) {
	}

	@Override
	public void read(String name, int noOfStaff, int noOfBooks, boolean isOpen) {
	}

	@Override
	public void read(String name, int noOfStaff, int noOfBooks, boolean isOpen, double lateFee) {
	}

	@Override
	public void read(String name, int noOfStaff, int noOfBooks, boolean isOpen, double lateFee, String website) {
		System.out.println("Name:" + name);
		System.out.println("noOfStaff:" + noOfStaff);
		System.out.println("Books:" + noOfBooks);
		System.out.println("is open:" + isOpen);
		System.out.println("Fee:" + lateFee);
		System.out.println("website:" + website);
	}

}
