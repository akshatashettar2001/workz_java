package com.tasks.boot;

import com.tasks.app.Plier;

public class PlierRunner {
public static void main(String[] args) {
	System.out.println("invoking main in PlierRunner");
	
	Plier plier=new Plier();
	plier.cut();
}
}
