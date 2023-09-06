package com.vikram.boot.runner;

import com.vikram.app.implementation.JuiceRepositoryImpl;
import com.vikram.app.repository.JuiceRepository;
import com.vikram.app.service.JuiceService;
import com.vikram.app.serviceImpl.JuiceServiceImpl;

public class JuiceRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in JuiceRunner");
    JuiceRepository juiceRepository=new JuiceRepositoryImpl();
		
    JuiceService juiceService=new JuiceServiceImpl(juiceRepository);
    boolean ref=juiceService.ValidateAndSave("Fanta");
    System.out.println(ref);
    
    boolean ref1=juiceService.ValidateAndSave("Fanta");
    System.out.println(ref1);
	}

}
