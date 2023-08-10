package com.encap.app;

import com.encap.boot.PUBG;

public class PUBGRunner {
	public static void main(String[] args) {
		
		PUBG pubg=new PUBG();
		
		
		pubg.setUseFor("Gaming application");
		System.out.println(pubg.getUseFor());
		
		pubg.setYear(2017);
		System.out.println(pubg.getYear());
		
		pubg.setFounder("Brendan Greene");
		System.out.println(pubg.getFouder());
		
		pubg.setPlatforms("Android,IOS");
		System.out.println(pubg.getPlatforms());
		
		pubg.setIndianGame(true);
		System.out.println(pubg.getIndianGame());
		
		pubg.setIssueFine(true);
		System.out.println(pubg.getIssueFine());
		
		pubg.setAnnualTurnOverInCr(1000);
		System.out.println(pubg.getAnnualTurnOverInCr());
		
		pubg.setNoOfEmployees(1000);
		System.out.println(pubg.getNoOfEmployees());
		
		pubg.setLiveLocation(false);
		System.out.println(pubg.getLiveLocation());
		
		pubg.setIsUnicorn(true);
		System.out.println(pubg.getIsUnicorn());
		
		pubg.setIndianFounder(true);
		System.out.println(pubg.getIndianFounder());
		
		pubg.setUserName("Nithesh");
		System.out.println(pubg.getUserName());
		
		pubg.setMobNumber(7483217156l);
		System.out.println(pubg.getMobNumber());
		
		pubg.setAbout("Available");
		System.out.println(pubg.getabout());
		
		
	}
}
