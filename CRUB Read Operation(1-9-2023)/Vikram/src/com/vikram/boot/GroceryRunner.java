package com.vikram.boot;

import com.vikram.app.implementation.GroceryRepositoryImpl;
import com.vikram.app.repository.GroceryRepository;

public class GroceryRunner {
	public static void main(String[] args) {

		GroceryRepository repo = new GroceryRepositoryImpl();

		repo.save("Butter");
		repo.save("Onion");
		repo.save("Tomato");
		repo.save("Chees");
		repo.save("Ice-Cream");
		repo.save("Chocolate");
		repo.save("Potato");
		repo.save("Maggii");
		repo.save("Corn");
		repo.save("Capsicum");
		repo.save("Beetroot");

	}
}
