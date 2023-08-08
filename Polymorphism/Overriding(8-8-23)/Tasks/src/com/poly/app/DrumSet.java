package com.poly.app;

public class DrumSet extends Drum{
@Override
public void stick() {
	System.out.println("invoking stick in DrumSet...");
	super.stick();
}
}
