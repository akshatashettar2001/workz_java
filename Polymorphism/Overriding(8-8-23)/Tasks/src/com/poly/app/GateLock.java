package com.poly.app;

public class GateLock extends Gate {
	@Override
	public void key() {
		System.out.println("invoking key in GateLock...");
		super.key();

	}
}
