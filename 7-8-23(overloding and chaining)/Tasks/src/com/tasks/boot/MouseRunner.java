package com.tasks.boot;

import com.tasks.app.Mouse;

public class MouseRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MouseRunner");
		
		Mouse mouse=new Mouse();
		mouse.cursor();
}
}
