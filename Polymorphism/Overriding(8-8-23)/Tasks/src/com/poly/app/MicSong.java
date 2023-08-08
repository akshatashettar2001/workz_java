package com.poly.app;

public class MicSong extends Mic {
	@Override
	public void sound() {
		System.out.println("invoking sound in MicSong...");

		super.sound();
	}

}
