package com.akshata.store.boot;

import com.akshata.store.app.Auditor;
import com.akshata.store.app.Company;
import com.akshata.store.app.Movie;
import com.akshata.store.app.Producer;

public class MovieRunner {
public static void main(String[] args) {
	System.out.println("Invoking main in MovieMaker....");
	
	Movie movie=new Movie();
	String name=movie.name;
	String language=movie.language;
	System.out.println("Movie name:"+name);
	System.out.println("Language:"+language);
	System.out.println();
	Producer producer=movie.producer;
	double budget=producer.budget;
	long mobNumber=producer.mobNumber;
	System.out.println("Total budget:" +budget);
	System.out.println("Mobile Number:"+mobNumber);
	System.out.println();
	Auditor auditor=producer.auditor;
	long aadharNumber=auditor.aadharNumber;
	System.out.println("Aadhar number:"+aadharNumber);
	System.out.println();
	Company company=auditor.company;
	String name1=company.name;
	String location=company.location;
	System.out.println("Company name:"+name1);
	System.out.println("Location:"+location);

	
}
}
