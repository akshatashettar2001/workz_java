package com.poly.app;

public class TheaterHome extends Theater {
	@Override
	public void movie() {
		System.out.println("invoking movie in TheaterHome...");
		super.movie();
	}
}
