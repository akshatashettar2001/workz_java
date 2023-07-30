package com.akshata.store.app;

public class GarageKiller {
	public Mechanic mechanic=new Mechanic();
	public void protectVehical()
	{
		System.out.println("Invoking protectVehical() in Garage");
		this.mechanic.painting();
	}
	public void multifunction()
	{
		System.out.println("Invoking multifunction() in Garage");
		this.mechanic.repair();
	}
}
