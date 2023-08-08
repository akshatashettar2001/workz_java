package com.poly.boot;

import com.poly.app.Mic;
import com.poly.app.MicSong;

public class MicRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MicRunner...");

		Mic mic = new MicSong();
		mic.sound();
	}
}
