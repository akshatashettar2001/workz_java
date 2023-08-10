package com.encap.app;

import com.encap.boot.Uber;

public class UberRunner {
	public static void main(String[] args) {
		
		Uber uber=new Uber();
			
			
			uber.setUseFor("taxi booking application");
			System.out.println(uber.getUseFor());
			
			uber.setYear(2009);
			System.out.println(uber.getYear());
			
			uber.setFounder("Travis Cordell Kalanick");
			System.out.println(uber.getFouder());
			
			uber.setPlatforms("Android,IOS");
			System.out.println(uber.getPlatforms());
			
			uber.setIndianBasedCompany(false);
			System.out.println(uber.getIndianBasedCompany());
			
			uber.setGiveCompensation(true);
			System.out.println(uber.getGiveCompensation());
			
			uber.setAnnualTurnOverInCr(3000);
			System.out.println(uber.getAnnualTurnOverInCr());
			
			uber.setNoOfEmployees(32000);
			System.out.println(uber.getNoOfEmployees());
			
			uber.setLiveLocation(true);
			System.out.println(uber.getLiveLocation());
			
			uber.setIsUnicorn(true);
			System.out.println(uber.getIsUnicorn());
			
			uber.setIndianFounder(false);
			System.out.println(uber.getIndianFounder());
			
			uber.setUserName("Nithesh");
			System.out.println(uber.getUserName());
			
			uber.setMobNumber(7483217156l);
			System.out.println(uber.getMobNumber());
			
			uber.setAbout("Available");
			System.out.println(uber.getabout());
			
			
		}
}
