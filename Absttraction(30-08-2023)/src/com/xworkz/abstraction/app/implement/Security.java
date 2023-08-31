package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.PassportVerification;

public class Security implements PassportVerification {

	@Override
	public void verify() {
		System.out.println("invoking verify() in Security");
	}

}
