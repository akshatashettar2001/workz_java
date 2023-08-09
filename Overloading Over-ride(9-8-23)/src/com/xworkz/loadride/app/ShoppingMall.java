package com.xworkz.loadride.app;

public class ShoppingMall extends Mall {

	@Override
	public void shop() {
		System.out.println("invocking no-args in Mall");
	}

	@Override
	public void shop(String name, String location) {

	}

	@Override
	public void shop(String name, String location, int noOfFloors) {

	}

	@Override
	public void shop(String name, String location, int noOfFloors, boolean hasParking) {

	}

	@Override
	public void shop(String name, String location, int noOfFloors, boolean hasParking, boolean hasMovieTheater) {

	}

	@Override
	public void shop(String name, String location, int noOfFloors, boolean hasParking, boolean hasMovieTheater,
			int noOfEscalators) {
		System.out.println("invocking string, int,int const of Mall ");
		System.out.println("Name:"+name);
		System.out.println("location:"+location);
		System.out.println("noOfFloors:"+noOfFloors);
		System.out.println("hasParking:"+hasParking);
		System.out.println("noOfEscalators:"+noOfEscalators);
		System.out.println("hasMovieTheater:"+hasMovieTheater);
	}
}
