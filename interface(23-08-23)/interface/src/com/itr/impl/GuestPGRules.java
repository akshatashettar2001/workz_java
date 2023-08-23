package com.itr.impl;

import com.itr.app.PGRules;

public class GuestPGRules implements PGRules {

	@Override
	public double closeTime() {
		System.out.println("invoking closeTime in GuestPGRules....");
		return 10.30;
	}

	@Override
	public boolean noSmoke() {
		System.out.println("invoking noSmoke in GuestPGRules....");
		return false;
	}

}
