package com.vikram.boot;

import com.vikram.app.implementation.HistoricalPlacesReppositoryImpl;
import com.vikram.app.repository.HistoricalPlacesReppository;

public class HistoricalPlacesRunner {

	public static void main(String[] args) {

		HistoricalPlacesReppository ref = new HistoricalPlacesReppositoryImpl();

		ref.visit("Mysore palace");
		ref.visit("Nandi Hills");
		ref.visit("Chikkamangalore");
		ref.visit("Aihole");
		ref.visit("Badami");
		ref.visit("Hampi");
		ref.visit("Iskon Temple");
		ref.visit("Adiyogi");
		ref.visit("Gokarna");
		ref.visit("Pattadakallu");
		ref.visit("Shravana Belagola");
		ref.visit("Jog falls");
	}

}
