package com.poly.boot;

import com.poly.app.Theater;
import com.poly.app.TheaterHome;

public class TheaterRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in TheaterRunner...");
		Theater theater = new TheaterHome();
		theater.movie();
	}
}
