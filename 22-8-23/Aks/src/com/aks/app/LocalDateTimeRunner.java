package com.aks.app;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;


public class LocalDateTimeRunner {
public static void main(String[] args) {
	
	LocalDateTime today=LocalDateTime.now();
	System.out.println("Today : "+today);
	
	System.out.println("---------------------------------");
	
	int day=today.getDayOfMonth();
	System.out.println("Day of month : "+day);
	
	System.out.println("---------------------------------");
	
	int compare=today.compareTo(today);
	System.out.println("Compare : "+compare);
	
	System.out.println("---------------------------------");
	
	DayOfWeek day1=today.getDayOfWeek();
	System.out.println("day of week :"+day1);
	
	System.out.println("---------------------------------");
	
	Month month=today.getMonth();
	System.out.println("Month : "+month);
}
}
