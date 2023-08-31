package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Animal;

public class Dog implements Animal {

	@Override
	public void sounds() {
		System.out.println("invoking sounds() in Dog");

	}

}
