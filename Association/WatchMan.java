package com.akshata.store.app;

public class WatchMan {
	Gun gun=new Gun();
	
	public void secure() {
		System.out.println("invoking secure in WatchMan");
		gun.shoot();
	}

}
