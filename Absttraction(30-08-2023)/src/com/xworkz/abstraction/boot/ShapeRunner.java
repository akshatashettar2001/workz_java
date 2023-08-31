package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.implement.Geometry;
import com.xworkz.abstraction.app.implement.Rectangle;

//import com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Shape;

public class ShapeRunner {

	public static void main(String[] args) {
		System.out.println("ivnoking main in ShapeRunner");
		
		Shape shape=new Rectangle();
		Geometry geometry=new Geometry();
		geometry.setShape(shape);
		geometry.type();
		

	}

}
