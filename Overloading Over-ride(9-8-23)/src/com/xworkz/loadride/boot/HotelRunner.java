package com.xworkz.loadride.boot;

import com.xworkz.loadride.app.*;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in HotelRunner");
		Hotel ref = new VegHotel();
		ref.business();
	
		VegHotel vegHotel = new VegHotel();
		vegHotel.business(5, "Rajajinag", false, false, 10, false);
		
		System.out.println("\n");
		
		Library ref2=new Study();
		ref2.read();
		
		Study ref3=new Study();
		ref3.read("Ram Mandir library", 5, 10000, false, 8,"www.library.in");
        System.out.println("\n");
        
        Theater ref4=new Ott();
        ref4.watch();
        Ott ref5=new Ott();
        ref5.watch("Geetha anjali", 100, 250, "Vidyanagar", false, "Kanthara");
        System.out.println("\n");
        
        Mall ref6=new ShoppingMall();
        ref6.shop();
        
        ShoppingMall ref7=new ShoppingMall();
        ref7.shop("Lulu", "Rajajinagar", 5, false, true, 10);
        
        }
}
