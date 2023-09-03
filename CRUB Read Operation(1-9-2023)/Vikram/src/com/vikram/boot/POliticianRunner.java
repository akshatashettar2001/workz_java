package com.vikram.boot;

import com.vikram.app.implementation.PoliticianRepositoryImpl;
import com.vikram.app.repository.PoliticianRepository;

public class POliticianRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in POliticianRunner..");

		PoliticianRepository repo = new PoliticianRepositoryImpl();

		repo.politics("KumarSwamy");
		repo.politics("Yadiyurappa");
		repo.politics("Narendra Modi");
		repo.politics("P.Rajeev");
		repo.politics("Yadiyurappa");
		repo.politics("Jagadeesh Shettar");
		repo.politics("Satish J");

	}

}
