package com.tasks.boot;

import com.tasks.app.Hotel;

public class HotelRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in HotelRunner");
		
		Hotel hotel=new Hotel();
		hotel.serve();
	
}
}
