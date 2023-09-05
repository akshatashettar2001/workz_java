package com.vikram.app.serviceImpl;

import com.vikram.app.service.HistoricalPlacesService;

public class HistoricalPlacesServiceImpl implements HistoricalPlacesService {
	private HistoricalPlacesService historicPlacesService;
	@Override
	public boolean validateAndSave (String places) {
		if (places!= null && !places.isEmpty() && places.length()>=3 && places.length()<=15) {
	      System.out.println("places is good ,then store places");
	         
	     }
		else {
			System.err.println("Cannot store data,places is bad");
		}
		return false;
	}

	 public HistoricalPlacesServiceImpl(HistoricalPlacesService historicPlacesService) {
	        this.historicPlacesService = historicPlacesService;
	    }

}
