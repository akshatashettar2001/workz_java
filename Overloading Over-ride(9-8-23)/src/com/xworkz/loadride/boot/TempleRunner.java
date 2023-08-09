package com.xworkz.loadride.boot;

import com.xworkz.loadride.app.*;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in TempleRunner");
		
		Temple ref=new GaneshaTemple();
		ref.pray();
		GaneshaTemple ref1=new GaneshaTemple();
		ref1.pray("Ganesh", false, 508900, "Banashankari", 200, 50);
		System.out.println("\n");
		
		Market ref2=new FlowerMarket();
		ref2.buy();
		FlowerMarket ref3=new FlowerMarket();
		ref3.buy(50, 10, "KR market", false, 15, 10);
		System.out.println("\n");
		
		Street ref4=new FoodStreet();
		ref4.road();
		FoodStreet ref5=new FoodStreet();
		ref5.road("Food", 60, 10, false, 100, true);
	}

}
