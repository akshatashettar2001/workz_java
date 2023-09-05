package com.vikram.boot.runner;

import com.vikram.app.service.HistoricalPlacesService;
import com.vikram.app.serviceImpl.HistoricalPlacesServiceImpl;

public class HistoricalPlacesRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main");
		HistoricalPlacesService historicPlacesService=new HistoricalPlacesServiceImpl(null);
		historicPlacesService.validateAndSave("JOG FALLS");
	}
}
