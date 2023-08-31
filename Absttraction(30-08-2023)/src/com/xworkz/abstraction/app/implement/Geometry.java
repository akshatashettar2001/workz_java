package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Shape;

public class Geometry {
	
	Shape shape;
	public void setShape(Shape shape)
	{
		this.shape=shape;
	}
	
	public void type()
	{
		System.out.println("invoking type() in Geometry");
		this.shape.type();
	}

}
