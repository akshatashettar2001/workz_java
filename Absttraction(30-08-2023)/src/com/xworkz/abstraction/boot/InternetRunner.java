package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.implement.Browser;
import com.xworkz.abstraction.app.implement.ChromeBrowser;
import com.xworkz.abstraction.app.rule.Internet;

public class InternetRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in InternetRunner");

		Internet internet=new ChromeBrowser();
		Browser browser = new Browser();
		browser.setInternet(internet);
		browser.connect();
	}

}
