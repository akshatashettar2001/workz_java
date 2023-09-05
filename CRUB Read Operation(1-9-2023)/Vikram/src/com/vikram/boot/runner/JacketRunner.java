package com.vikram.boot.runner;

import com.vikram.app.service.JacketService;
import com.vikram.app.serviceImpl.JacketServiceImpl;

public class JacketRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in jacketRunner....");
		
		JacketService jacketService=new JacketServiceImpl(null);
		
		jacketService.validateAndSave("Woodland");

	}
}
