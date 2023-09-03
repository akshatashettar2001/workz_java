package com.vikram.app.implementation;

import com.vikram.app.repository.GroceryRepository;

public class GroceryRepositoryImpl implements GroceryRepository {

	String groceries[] = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void save(String grocery) {
		System.out.println("invoking save in GroceryRepositoryImpl");

		if (this.position < TOTAL_ITEMS) {
			this.groceries[position] = grocery;

			System.out.println("Stored " + grocery + " in position " + this.position);
			this.position++;
		}

		else {
			System.err.println("storage full,item can not be stored...");
		}

	}

}
