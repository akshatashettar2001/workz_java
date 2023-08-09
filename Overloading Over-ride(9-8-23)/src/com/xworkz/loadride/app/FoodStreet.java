package com.xworkz.loadride.app;

public class FoodStreet extends Street {

	@Override
	public void road()
	{
		System.out.println("invocking no-args in FoodStreet");
	}
	@Override
	public void road(String name,int length) 
	{
		
	}
	@Override
	public void road(String name,int length, int noOfHouse) 
	{
		
	}
	@Override
	public void road(String name,int length, int noOfHouse,boolean sideWalk) 
	{
		
	}
	@Override
	public void road(String name,int length, int noOfHouse,boolean sideWalk,int noOfPeople) 
	{
		
	}
	@Override
	public void road(String name,int length, int noOfHouse,boolean sideWalk,int noOfPeople, boolean lessTraffic) 
	{
		System.out.println("Name:"+name);
		System.out.println("Length:"+length);
		System.out.println("No of House:"+noOfHouse);
		System.out.println("sideWalk:"+sideWalk);
		System.out.println("noOfPeople:"+noOfPeople);
		System.out.println("lessTraffic:"+lessTraffic);
	}
}
