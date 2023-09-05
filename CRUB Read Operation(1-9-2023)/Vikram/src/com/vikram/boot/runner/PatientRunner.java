package com.vikram.boot.runner;

import com.vikram.app.service.PatientService;
import com.vikram.app.serviceImpl.PatientServiceImpl;

public class PatientRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PatientService patientService =new PatientServiceImpl(null);
		 patientService.validateAndSave("Cristiano Ronaldo");

}
}
