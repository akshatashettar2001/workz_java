package com.xworkz.loadride.app;

public class NationalZoo extends Zoo{
	@Override
	public void prison() {
		System.out.println("invocking no-args in NationalZoo");
	}
	@Override
	public void prison(double price, String name) {

	}
	@Override
	public void prison(double price, String name, String location) {

	}
	@Override
	public void prison(double price, String name, String location, long noOfVisitors) {

	}
	@Override
	public void prison(double price, String name, String location, long noOfVisitors, int noAnimal) {

	}
	@Override
	public void prison(double price, String name, String location, long noOfVisitors, int noAnimal, boolean splEvent) {
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("noOfVisitors:" + noOfVisitors);
		System.out.println("noAnimal:" + noAnimal);
		System.out.println("Price:" + price);
		System.out.println("splEvent:" + splEvent);

	}
}
