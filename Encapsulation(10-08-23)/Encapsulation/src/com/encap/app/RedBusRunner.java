package com.encap.app;

import com.encap.boot.RedBus;

public class RedBusRunner {
	public static void main(String[] args) {
		
		RedBus redbus=new RedBus();
		
		
		redbus.setUseFor("Gaming application");
		System.out.println(redbus.getUseFor());
		
		redbus.setYear(2017);
		System.out.println(redbus.getYear());
		
		redbus.setFounder("Brendan Greene");
		System.out.println(redbus.getFouder());
		
		redbus.setPlatforms("Android,IOS");
		System.out.println(redbus.getPlatforms());
		
		redbus.setIndianBasedCompany(true);
		System.out.println(redbus.getIndianBasedCompany());
		
		redbus.setGiveCompensation(true);
		System.out.println(redbus.getGiveCompensation());
		
		redbus.setAnnualTurnOverInCr(1000);
		System.out.println(redbus.getAnnualTurnOverInCr());
		
		redbus.setNoOfEmployees(1000);
		System.out.println(redbus.getNoOfEmployees());
		
		redbus.setLiveLocation(false);
		System.out.println(redbus.getLiveLocation());
		
		redbus.setIsUnicorn(true);
		System.out.println(redbus.getIsUnicorn());
		
		redbus.setIndianFounder(true);
		System.out.println(redbus.getIndianFounder());
		
		redbus.setUserName("Nithesh");
		System.out.println(redbus.getUserName());
		
		redbus.setMobNumber(7483217156l);
		System.out.println(redbus.getMobNumber());
		
		redbus.setAbout("Available");
		System.out.println(redbus.getabout());
		
		
	}
}
