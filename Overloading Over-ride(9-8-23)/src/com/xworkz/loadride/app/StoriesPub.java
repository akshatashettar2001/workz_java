package com.xworkz.loadride.app;

public class StoriesPub extends Pub{

	@Override
	public void enjoy()
	{
		System.out.println("invocking no arg in pub");
	}
	@Override
	public void enjoy(int noOfTables,String name)
	{
		
	}
	@Override
	public void enjoy(int noOfTables,String name, String location)
	{
		
	}
	@Override
	public void enjoy(int noOfTables,String name, String location,boolean isOpen)
	{
		
	}
	@Override
	public void enjoy(int noOfTables,String name, String location,boolean isOpen,boolean entertainment)
	{
		
	}
	@Override
	public void enjoy(int noOfTables,String name, String location,boolean isOpen,boolean entertainment,double price)
	{
		System.out.println("Name:" + name);
		System.out.println("noOfTables:" + noOfTables);
		System.out.println("location:" + location);
		System.out.println("isOpen:" + isOpen);
		System.out.println("entertainment:" + entertainment);
		System.out.println("price:" + price);
	}
}
