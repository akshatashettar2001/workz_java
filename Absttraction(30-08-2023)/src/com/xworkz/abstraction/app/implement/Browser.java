package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Internet;

public class Browser {
	
	Internet internet;
	
	public void connect()
	{
		System.out.println("invoking connect() in browser");
		this.internet.connect();
	}

	public void setInternet(Internet internet2) {
		this.internet=internet2;
	}
	
}
