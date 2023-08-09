package com.xworkz.loadride.app;

public class GaneshaTemple extends Temple {

	@Override
	public void pray() {
		System.out.println("invocking no=args in Temple");
	}

	@Override
	public void pray(String name, boolean isOpen) {

	}

	@Override
	public void pray(String name, boolean isOpen, double donation) {

	}

	@Override
	public void pray(String name, boolean isOpen, double donation, String location) {

	}

	@Override
	public void pray(String name, boolean isOpen, double donation, String location, int capacity) {

	}

	@Override
	public void pray(String name, boolean isOpen, double donation, String location, int capacity, int priestCount) {
		System.out.println("Name:" + name);
		System.out.println("is Open:" + isOpen);
		System.out.println("Donation:" + donation);
		System.out.println("Location:" + location);
		System.out.println("Capacity:" + capacity);
		System.out.println("Priest count:" + priestCount);
	}

}
