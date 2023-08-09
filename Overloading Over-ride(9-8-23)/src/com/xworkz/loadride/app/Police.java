package com.xworkz.loadride.app;

public class Police extends PoliceStation {

	@Override
	public void protect()
	{
		System.out.println("invocking no args in PoliceStation");
	}
	@Override
	public void protect(String name ,String location) 
	{
		
	}
	@Override
	public void protect(String name ,String location,int noOfOfficers) 
	{
		
	}
	@Override
	public void protect(String name ,String location,int noOfOfficers,boolean isEmergency) 
	{
		
	}
	@Override
	public void protect(String name ,String location,int noOfOfficers,boolean isEmergency,long noOfCriminals) 
	{
		
	}
	@Override
	public void protect(String name ,String location,int noOfOfficers,boolean isEmergency,long noOfCriminals,long hours) 
	{
		System.out.println("Name:" + name);
		System.out.println("noOfOfficers:" + noOfOfficers);
		System.out.println("location:" + location);
		System.out.println("noOfCriminals:" + noOfCriminals);
		System.out.println("isEmergency:" + isEmergency);
		System.out.println("hours:" + hours);
	}
}
