package com.xworkz.loadride.boot;

import com.xworkz.loadride.app.*;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invocking main ZooRunner");
		
		Zoo ref =new NationalZoo();
		ref.prison();
		
		NationalZoo ref1 =new NationalZoo();
		ref1.prison(69, "BanergattaZoo", "Banergatta", 100, 250, false);
		System.out.println("\n");
		
		City ref2=new CurrentCity();
		ref2.place();
		CurrentCity ref3=new CurrentCity();
		ref3.place("Harihar", 10000, 1921, true, 21, true);
		System.out.println("\n");
		
		Pub ref4=new StoriesPub();
		ref4.enjoy();
		StoriesPub ref5=new StoriesPub();
		ref5.enjoy(50, "Stories", "Bangalore", true, false, 10000);
		System.out.println("\n");
		
		PoliceStation ref6=new Police();
		ref6.protect();
		Police ref7=new Police();
		ref7.protect("Ganesh", "Guttur", 50, false, 10, 24);
		
	}
}
