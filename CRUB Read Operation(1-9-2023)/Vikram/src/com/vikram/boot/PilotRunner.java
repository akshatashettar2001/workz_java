package com.vikram.boot;

import com.vikram.app.implementation.PilotRepositoryImpl;
import com.vikram.app.repository.PilotRepository;

public class PilotRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in PilotRunner..");

		PilotRepository repo = new PilotRepositoryImpl();

		repo.aircraft("Sourabh");
		repo.aircraft("Shashikala");
		repo.aircraft("S.H.Niraj");
		repo.aircraft("Tara Mehta");
		repo.aircraft("Sukanya");
		repo.aircraft("Mahesh");
		repo.aircraft("Gowrav");
	}

}
