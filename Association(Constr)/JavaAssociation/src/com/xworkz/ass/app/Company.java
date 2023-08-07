package com.xworkz.ass.app;

public class Company {
public String name;
public String ceo;
public String originCountry;

Company(String name,String ceo,String originCountry){
	this.name=name;
	this.ceo=ceo;
	this.originCountry=originCountry;
}

public void printInfo() {
	System.out.println("invoking printInfo in Company");
	System.out.println("name of the Company:"+name);
	System.out.println("CEO:"+ceo);
	System.out.println("origin country:"+originCountry);
}

}
