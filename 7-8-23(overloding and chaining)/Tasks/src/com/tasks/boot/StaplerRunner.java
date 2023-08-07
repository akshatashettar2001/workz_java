package com.tasks.boot;

import com.tasks.app.Stapler;

public class StaplerRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in StaplerRunner");
		
		Stapler stapler=new Stapler();
		stapler.pin();
	}
}
