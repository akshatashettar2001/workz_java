package com.poly.boot;

import com.poly.app.Amoeba;
import com.poly.app.SmallAmoeba;

public class AmoebaKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in AmoebaKiller");

		Amoeba amoeba = new SmallAmoeba();
		amoeba.cell();
	}
}
