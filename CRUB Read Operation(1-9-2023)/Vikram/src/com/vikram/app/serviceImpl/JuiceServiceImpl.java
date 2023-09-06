package com.vikram.app.serviceImpl;

import com.vikram.app.repository.JuiceRepository;
import com.vikram.app.service.JuiceService;

public class JuiceServiceImpl implements JuiceService {

	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean ValidateAndSave(String juiceName) {
		System.out.println("invoking ValidateAndSave in JuiceServiceImpl.. ");

		if (juiceName != null && !juiceName.isEmpty() && juiceName.length() > 2 && juiceName.length() < 20) {
			System.out.println("juiceName is valid ,then store juiceName " + this.getClass().getSimpleName());

			if (!this.juiceRepository.isExist(juiceName)) {
				this.juiceRepository.save(juiceName);
				return true;
			} else {
				System.err.println("JuiceName " + juiceName + " is already exist,please insert another");
			}
		} else {
			System.err.println("Cannot store data,juiceName is invalid");
		}

		return false;
	}

}
