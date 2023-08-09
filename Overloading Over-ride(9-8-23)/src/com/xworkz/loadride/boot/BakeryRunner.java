package com.xworkz.loadride.boot;

import com.xworkz.loadride.app.*;

public class BakeryRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in BakeryRunner");
		Bakery bakery = new SweetBakery();
		bakery.cook();

		SweetBakery sweetBakery = new SweetBakery();
		sweetBakery.cook(null, null, 0, false, 0, 0);
		
		System.out.println("\n");
		
		Hospital ref=new Dental();
		ref.checkup(78,"deepa");
		
		Dental ref2=new Dental();
		ref2.checkup();
		
		System.out.println("\n");
		
		Hostel ref3=new GirlsHostel();
		ref3.stay();
		
		GirlsHostel ref4=new GirlsHostel();
		ref4.stay(0, false, null, 0, false, 0);
		
		

	}

}
