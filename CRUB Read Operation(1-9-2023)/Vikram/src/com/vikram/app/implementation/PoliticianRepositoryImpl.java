package com.vikram.app.implementation;

import com.vikram.app.repository.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository {

	private String[] politicians = new String[TOTAL_POLITICIANS];
	int place;

	@Override
	public void politics(String politician) {
		System.out.println("invoking politics in PoliticianRepositoryImpl..");

		if (this.place < TOTAL_POLITICIANS) {
			this.politicians[place] = politician;
			System.out.println("Stored " + politician + " in place " + this.place);
			this.place++;
		}

		else {
			System.err.println("Places are filles,can not store politicians..");
		}
	}

}
