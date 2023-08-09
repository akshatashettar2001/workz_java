package com.xworkz.loadride.app;

public class GirlsHostel extends Hostel {
	@Override
	public void stay() {
		System.out.println("invocking no-args in GirlsHostel");
	}

	@Override
	public void stay(int floor, boolean hasWiFi) {

	}

	@Override
	public void stay(int floor, boolean hasWiFi, String address) {

	}

	@Override
	public void stay(int floor, boolean hasWiFi, String address, double distance) {

	}

	@Override
	public void stay(int floor, boolean hasWiFi, String address, double distance, boolean hasLaundry) {

	}

	@Override
	public void stay(int floor, boolean hasWiFi, String address, double distance, boolean hasLaundry, int totalRooms) 
	{
		System.out.println("Floor:" + floor);
		System.out.println("hasWiFi:" + hasWiFi);
		System.out.println("Address:" + address);
		System.out.println("Distance:" + distance);
		System.out.println("hasLaundry:" + hasLaundry);
		System.out.println("totalRooms:" + totalRooms);
	}
}
