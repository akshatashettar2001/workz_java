package com.vikram.boot.runner;

import com.vikram.app.service.PoliticianService;
import com.vikram.app.serviceImpl.PoliticianServiceImpl;

public class PoliticianRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliticianService politicianService =new PoliticianServiceImpl(null);
		politicianService.validateAndSave("Narendra Modi");
	}
}
