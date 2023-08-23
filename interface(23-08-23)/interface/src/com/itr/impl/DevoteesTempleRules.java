package com.itr.impl;

import com.itr.app.TempleRules;

public class DevoteesTempleRules implements TempleRules {

	@Override
	public void noSleepers() {
		System.out.println("invoking noSleepers in DevoteesTempleRules");

	}

	@Override
	public boolean photos() {
		System.out.println("invoking photos in DevoteesTempleRules");
		return false;
	}

}
