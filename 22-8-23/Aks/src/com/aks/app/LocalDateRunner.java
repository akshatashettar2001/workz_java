package com.aks.app;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateRunner {
	public static void main(String[] args) {

		LocalDate today=LocalDate.now();
		System.out.println("Today : "+today);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		LocalDate from=LocalDate.from(today);
		System.out.println("From : "+from);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		LocalDate of=LocalDate.of(2002, Month.JUNE, 22);
		System.out.println("Of : "+of);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		LocalDate ofYearDay=LocalDate.ofYearDay(2000, 3);
		System.out.println("ofYearDay : "+ofYearDay);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		LocalDate ofEpochDay=LocalDate.ofEpochDay(9);
		System.out.println("ofEpochDay : "+ofEpochDay);
		
		
		
	}
}
