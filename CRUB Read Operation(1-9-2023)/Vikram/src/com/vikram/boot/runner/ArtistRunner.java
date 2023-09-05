package com.vikram.boot.runner;

import com.vikram.app.service.ArtistService;
import com.vikram.app.serviceImpl.ArtistServiceImpl;


public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistRunner....");
		ArtistService artistService = new ArtistServiceImpl(null);
		artistService.validateAndSave("Ravichandra");
	}
}
