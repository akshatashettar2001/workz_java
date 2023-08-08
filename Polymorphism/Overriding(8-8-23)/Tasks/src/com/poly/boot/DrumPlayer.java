package com.poly.boot;

import com.poly.app.Drum;
import com.poly.app.DrumSet;

public class DrumPlayer {
public static void main(String[] args) {
	System.out.println("invoking main in DrumPlayer...");
	Drum drum=new DrumSet();
	drum.stick();
}
}
