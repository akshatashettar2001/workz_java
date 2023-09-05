package com.vikram.boot.runner;

import com.vikram.app.service.PilotService;
import com.vikram.app.serviceImpl.PilotServiceImpl;

public class PilotRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PilotService pilotService =new PilotServiceImpl(null);
     pilotService.validateAndSave("WrightBrothers");
	}
}
