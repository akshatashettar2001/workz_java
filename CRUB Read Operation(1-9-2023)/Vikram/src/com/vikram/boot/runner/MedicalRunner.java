package com.vikram.boot.runner;

import com.vikram.app.service.MedicalService;
import com.vikram.app.serviceImpl.MedicalServiceImpl;

public class MedicalRunner {

	public static void main(String[] args) {
		MedicalService medicinesService=new MedicalServiceImpl(null);
		medicinesService.validateAndSave("Dolo650");

	}

}
