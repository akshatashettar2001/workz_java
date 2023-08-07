package com.tasks.boot;

import com.tasks.app.IronBox;

public class IronBoxRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in IronBoxRunner");
		
		IronBox ironbox1=new IronBox();
		ironbox1.iron();
	}
}
