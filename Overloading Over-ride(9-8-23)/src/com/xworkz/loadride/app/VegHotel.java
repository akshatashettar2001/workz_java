package com.xworkz.loadride.app;

public class VegHotel extends Hotel {

	@Override
	public void business() {
		System.out.println("invocking no-args in Veghotel");
	}

	@Override
	public void business(int rating, String location) {

	}

	@Override
	public void business(int rating, String location, boolean guestRoom) {
	}

	@Override
	public void business(int rating, String location, boolean guestRoom, boolean parking) {
	}

	@Override
	public void business(int rating, String location, boolean guestRoom, boolean parking, int security) {
		
	}

	@Override
	public void business(int rating, String location, boolean guestRoom, boolean parking, int security,	boolean swimming)
	{
		System.out.println("Rating:" + rating);
		System.out.println("Location:" + location);
		System.out.println("GuestRoom:" + guestRoom);
		System.out.println("Parking:" + parking);
		System.out.println("security:" + security);
		System.out.println("swimmimg:" + swimming);
	}
}
