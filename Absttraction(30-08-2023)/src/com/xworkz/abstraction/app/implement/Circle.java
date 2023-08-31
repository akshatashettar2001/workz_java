package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Shape;

public class Circle implements Shape {

	@Override
	public void type() {
		System.out.println("invoking type() in Circle");
	}

}
