package com.poly.boot;

import com.poly.app.ChildDinosaur;
import com.poly.app.Dinosaur;

public class DinosaurKiller {

	public static void main(String[] args) {
		Dinosaur dinosaur=new ChildDinosaur();
		dinosaur.wild();
	}
}
