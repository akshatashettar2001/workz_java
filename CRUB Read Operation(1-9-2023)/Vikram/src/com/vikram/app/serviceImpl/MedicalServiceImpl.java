package com.vikram.app.serviceImpl;

import com.vikram.app.service.MedicalService;

public class MedicalServiceImpl implements MedicalService {

	private MedicalService medicinesService;
	@Override
	public boolean validateAndSave (String medicines) {
		if (medicines!= null && !medicines.isEmpty() && medicines.length()>=3 && medicines.length()<=10) {
	      System.out.println("medicines is good ,then store medicines");
	         
	     }
		else {
			System.err.println("Cannot store data,medicines is bad");
		}
		return false;
	}

	 public MedicalServiceImpl(MedicalService medicinesService) {
	        this.medicinesService = medicinesService;
	    }
}

