package com.akshata.store.boot;

import com.akshata.store.app.Store;

public class StoreRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("invoking main in storeRunner");
		
		System.out.println("\n\n");
		String[] emails={"aksu@gmail.com","harshu@gamil.com","gayu56@gmail.com","raju455@gmail.com"};
		Store store=new Store();
		store.email(emails);
		
		System.out.println("\n\n");
		String[] groceryItems={"butte","tomato","chees","sause"};
		Store store1=new Store();
		store1.groceryItem(groceryItems);

		System.out.println("\n\n");
		String[] iplTeams={"RCB","CSK","DC","SRH"};
		Store store2=new Store();
		store2.iplTeam(iplTeams);

	}

}
