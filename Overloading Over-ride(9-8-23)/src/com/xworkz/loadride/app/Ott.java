package com.xworkz.loadride.app;

public class Ott extends Theater {
	
	@Override
	public void watch() 
	{
		System.out.println("invocking no-args in Ott");
	}
	@Override
	public void watch( String name,double price)
	{
		
	}
	@Override
	public void watch( String name,double price, int noOfSeat)
	{
		
	}
	@Override
	public void watch( String name,double price, int noOfSeat, String location)
	{
		
	}
	@Override
	public void watch( String name,double price, int noOfSeat, String location, boolean hasBalcony)
	{
		
	}
	@Override
	public void watch( String name,double price, int noOfSeat, String location, boolean hasBalcony,  String movieName)
	{
		System.out.println("Name:" + name);
		System.out.println("noOfSeat:" + noOfSeat);
		System.out.println("price:" + price);
		System.out.println("Location:" + location);
		System.out.println("hasBalcony:" + hasBalcony);
		System.out.println("movieName:" + movieName);
	}
}
