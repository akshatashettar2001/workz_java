package com.akshata.store.boot;

import com.akshata.store.app.WatchMan;

public class WatchManKiller {
	
	public static void main(String[] args) {
		System.out.println("invoking main in WatchManKiller ");
		WatchMan watchMan=new WatchMan();
		watchMan.secure();
	}

}
