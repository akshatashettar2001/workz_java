package com.vikram.app.implementation;

import com.vikram.app.repository.HistoricalPlacesReppository;

public class HistoricalPlacesReppositoryImpl implements HistoricalPlacesReppository {

	private String places[] = new String[TOTAL_PLACES];
	int position;

	@Override
	public void visit(String place) {
		System.out.println("invoking visit in HistoricalPlacesReppositoryImpl...");

		if (this.position < TOTAL_PLACES) {
			this.places[position] = place;
			System.out.println("Stored " + place + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("storage is full,can not store place...");
		}

	}
}
