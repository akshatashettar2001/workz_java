package com.poly.app;

public class ChildDinosaur extends Dinosaur{
	@Override
	public void wild() {
		System.out.println("invoking wild in ChildDinosaur...");
		super.wild();
	}
}
