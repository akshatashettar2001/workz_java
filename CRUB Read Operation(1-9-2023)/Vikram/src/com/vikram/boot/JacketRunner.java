package com.vikram.boot;

import com.vikram.app.implementation.JacketRepositoryImpl;
import com.vikram.app.repository.JacketRepository;

public class JacketRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in JacketRunner...");

		JacketRepository repo = new JacketRepositoryImpl();

		repo.wear("Woodland Jackets");
		repo.wear("Adidas Jackets");
		repo.wear("Levi's Jackets");
		repo.wear("Puma Jackets");
		repo.wear("Jeens Jackets");
		repo.wear("Calvin Klein Jackets");

	}

}
