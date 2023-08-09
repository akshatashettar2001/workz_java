package com.xworkz.loadride.app;

public class CurrentCity extends City {

	@Override
	public void place()
	{
		System.out.println("invocking no-args in City");
	}
	@Override
	public void place(String name,long population)
	{
		
	}
	@Override
	public void place(String name,long population,long foundedYear)
	{
		
	}
	@Override
	public void place(String name,long population,long foundedYear,boolean transportation)
	{
		
	}
	@Override
	public void place(String name,long population,long foundedYear,boolean transportation,double temprature)
	{
		
	}
	@Override
	public void place(String name,long population,long foundedYear,boolean transportation,double temprature,boolean isIndustryArea)
	{
		System.out.println("Name:" + name);
		System.out.println("Population:" + population);
		System.out.println("foundedYear:" + foundedYear);
		System.out.println("transportation:" + transportation);
		System.out.println("temprature:" + temprature);
		System.out.println("isIndustryArea:" + isIndustryArea);
	}
}
