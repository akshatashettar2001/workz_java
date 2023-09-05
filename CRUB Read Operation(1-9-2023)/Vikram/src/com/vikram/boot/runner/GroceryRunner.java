package com.vikram.boot.runner;

import com.vikram.app.service.GroceryService;
import com.vikram.app.serviceImpl.GroceryServiceImpl;

public class GroceryRunner {

	public static void main(String[] args) { 
		System.out.println("Invoking main in GroceriesRunner ");
		GroceryService groceryService=new GroceryServiceImpl(null);
		groceryService.validateAndSave("Garlic");
		}
}
