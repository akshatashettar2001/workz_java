package com.poly.app;

public class SmallAmoeba extends Amoeba{
	
	@Override
	public boolean cell() {
		System.out.println("invoking cell in SmallAmoeba");
		return super.cell();
	}
}
