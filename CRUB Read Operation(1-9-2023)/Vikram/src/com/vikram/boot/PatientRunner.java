package com.vikram.boot;

import com.vikram.app.implementation.PatientRepositoryImpl;
import com.vikram.app.repository.PatientRepository;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientRunner..");

		PatientRepository repo = new PatientRepositoryImpl();

		repo.checkup("Sourabh");
		repo.checkup("Shashikala");
		repo.checkup("S.H.Niraj");
		repo.checkup("Tara Mehta");
		repo.checkup("Sukanya");
		repo.checkup("Mahesh");
		repo.checkup("Gowrav");

	}

}
