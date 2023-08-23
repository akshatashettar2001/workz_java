package com.itr.impl;

import com.itr.app.EngineeringRules;

public class StudentEngineeringRules implements EngineeringRules {

	@Override
	public boolean idCard() {
		System.out.println("invoking idCard in StudentEngineeringRules... ");
		return true;
	}

	@Override
	public int attendance() {
		System.out.println("invoking attendance in StudentEngineeringRules... ");
		return 60;
	}

}
