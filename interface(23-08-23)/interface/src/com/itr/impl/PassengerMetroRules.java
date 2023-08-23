package com.itr.impl;

import com.itr.app.MetroRules;

public class PassengerMetroRules implements MetroRules {

	@Override
	public boolean token() {
		System.out.println("invoking token in PassengerMetroRules...");
		return true;
	}

	@Override
	public boolean noEat() {
		System.out.println("invoking noEat in PassengerMetroRules....");
		return true;
	}

}
