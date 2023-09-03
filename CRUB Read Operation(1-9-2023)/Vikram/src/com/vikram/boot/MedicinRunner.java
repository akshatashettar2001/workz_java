package com.vikram.boot;

import com.vikram.app.implementation.MedicalRepositoryImpl;
import com.vikram.app.repository.MedicianRepository;

public class MedicinRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main() in MedicineRunnner");

		MedicianRepository medicineRepository = new MedicalRepositoryImpl();

		medicineRepository.cause("NO COld");
		medicineRepository.cause("Dolo");
		medicineRepository.cause("Dart");
		medicineRepository.cause("Saridon");
		medicineRepository.cause("Cambiflame");
		medicineRepository.cause("vicks vapour");
		medicineRepository.cause("Citrizen");
		medicineRepository.cause("Alercet");
		// medicineRepository.cause(");
	}

}
