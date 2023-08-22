package com.aks.app;

import java.util.Date;

public class DateRunner {
public static void main(String[] args) {
	
	Date currentDate=new Date();
	System.out.println("Current Date is : "+currentDate);
	 
	Date specifiedDate=null;
	System.out.println("Specified Date is : "+specifiedDate);
	
	System.out.println(" ");
	
	System.out.println("=======================================");
	
	System.out.println("Class is : "+currentDate.getClass());
	
	System.out.println("=======================================");
	
	System.out.println("before : "+currentDate.before(currentDate));
	
	System.out.println("=======================================");
	
	System.out.println("compareto : "+currentDate.compareTo(currentDate));
	
	System.out.println("=======================================");
	
	System.out.println("Day : "+currentDate.getDay());
	
	System.out.println("=======================================");
	
	System.out.println("Hours"+currentDate.getHours());
	
    System.out.println("=======================================");
	
	System.out.println("Minutes : "+currentDate.getMinutes());
	
	System.out.println("=======================================");
	
	System.out.println("Seconds : "+currentDate.getSeconds());
	
	System.out.println("=======================================");
	
	System.out.println("Time : "+currentDate.getTime());
	
	System.out.println("=======================================");
	
	System.out.println("Month : "+currentDate.getMonth());
	
	System.out.println("=======================================");
	
	System.out.println("Year : "+currentDate.getYear());
	
	System.out.println("=======================================");
	
	System.out.println("Both dates are equal : "+currentDate.equals(specifiedDate));
	
	
	
}
}
