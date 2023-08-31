package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Internet;

public class ChromeBrowser implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking connect() in Browser");
	}

}
