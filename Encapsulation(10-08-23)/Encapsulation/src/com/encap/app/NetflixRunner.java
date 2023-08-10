package com.encap.app;

import com.encap.boot.Netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		
		Netflix netflix=new Netflix();
			
			
			netflix.setUseFor("OTT application for enterainment");
			System.out.println(netflix.getUseFor());
			
			netflix.setYear(1997);
			System.out.println(netflix.getYear());
			
			netflix.setFounderName("Marc Randolph and Reed Hastings ");
			System.out.println(netflix.getFounderName());
			
			netflix.setPlatforms("Android,IOS");
			System.out.println(netflix.getPlatforms());
			
			netflix.setentertainmentSpot(false);
			System.out.println(netflix.getEntertainmentSpot());
			
			netflix.setGiveCompensation(true);
			System.out.println(netflix.getGiveCompensation());
			
			netflix.setAnnualTurnOverInCr(3000);
			System.out.println(netflix.getAnnualTurnOverInCr());
			
			netflix.setNoOfEmployees(12000);
			System.out.println(netflix.getNoOfEmployees());
			
			netflix.setLiveLocation(true);
			System.out.println(netflix.getLiveLocation());
			
			netflix.setInadinCompany(false);
			System.out.println(netflix.getInadinCompany());
			
			netflix.setCaptureLoinShareInMarket(true);
			System.out.println(netflix.getCaptureLoinShareInMarket());
			
			netflix.setUserName("Nithesh");
			System.out.println(netflix.getUserName());
			
			netflix.setMobNumber(7483217156l);
			System.out.println(netflix.getMobNumber());
			
			netflix.setAbout("Available");
			System.out.println(netflix.getabout());
			
			
		}
}
