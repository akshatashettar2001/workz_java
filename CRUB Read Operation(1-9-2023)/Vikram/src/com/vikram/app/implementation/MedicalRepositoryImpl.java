package com.vikram.app.implementation;

import com.vikram.app.repository.MedicianRepository;

public class MedicalRepositoryImpl implements MedicianRepository {

	private String[] medicineNames = new String[NO_OF_MEDICINES];

	private int position;

	@Override
	public void cause(String name) {
		System.out.println("Invoking cause() in MedicialRepositoryImpl");

		if (this.position < NO_OF_MEDICINES) {
			this.medicineNames[position] = name;
			System.out.println("Medicine name " + name + " is added to position " + this.position);
			position++;
		} else {
			System.err.println("Data store is full not able to add new medicine");
		}

	}

}
