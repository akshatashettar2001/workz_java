package com.xworkz.loadride.app;

public class FlowerMarket extends Market{

	public void buy()
	{
		System.out.println("invocking no args in FlowerMarket");
	}
	public void buy(int buyers,int noStalls) 
	{
		
	}
	public void buy(int buyers,int noStalls,String location)
	{
		
	}
	public void buy(int buyers,int noStalls,String location,boolean open)
	{
		
	}
	public void buy(int buyers,int noStalls,String location,boolean open, long product)
	{
		
	}
	public void buy(int buyers,int noStalls,String location,boolean open, long product,int hours)
	{
		System.out.println("Buyers:"+buyers);
		System.out.println("No stalls:"+noStalls);
		System.out.println("Location:"+location);
		System.out.println("Open:"+open);
		System.out.println("Product:"+product);
		System.out.println("Hours:"+hours);
	}
}
