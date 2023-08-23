package com.itr.impl;

import com.itr.app.MilitaryRules;

public class SoldiersMilitaryRules implements MilitaryRules {

	@Override
	public void disciplane() {
		System.out.println("invoking disciplane in SoldiersMilitaryRules...");

	}

	@Override
	public boolean courage() {
		System.out.println("invoking courage in SoldiersMilitaryRules...");
		return true;
	}

}
