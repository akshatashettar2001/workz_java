package com.vikram.app.implementation;

import com.vikram.app.repository.PilotRepository;

public class PilotRepositoryImpl implements PilotRepository {

	private String[] pilots = new String[TOTAL_PILOTS];
	int place;

	@Override
	public void aircraft(String pilot) {
		System.out.println("aircraft group in PilotRepositoryImpl..");

		if (this.place < TOTAL_PILOTS) {
			this.pilots[place] = pilot;
			System.out.println("Stored " + pilot + " in place " + this.place);
			this.place++;
		}

		else {
			System.err.println("Places are filles,can not store pilots..");
		}
	}

}
