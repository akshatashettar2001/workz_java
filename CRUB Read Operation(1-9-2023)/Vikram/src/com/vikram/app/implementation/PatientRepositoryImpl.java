package com.vikram.app.implementation;

import com.vikram.app.repository.PatientRepository;

public class PatientRepositoryImpl implements PatientRepository {

	private String[] patients = new String[TOTAL_PATIENTS];
	int place;

	@Override
	public void checkup(String patient) {
		System.out.println("invoking checkup in PatientRepositoryImpl..");

		if (this.place < TOTAL_PATIENTS) {
			this.patients[place] = patient;
			System.out.println("Stored " + patient + " in place " + this.place);
			this.place++;
		}

		else {
			System.err.println("Places are filles,can not store patients..");
		}
	}
}
