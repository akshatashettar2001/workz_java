package com.encap.app;

import com.encap.boot.Irctc;

public class IrctcRunner {
	public static void main(String[] args) {
		
		Irctc irctc=new Irctc();
			
			
			irctc.setUseFor("Train seat booking application ");
			System.out.println(irctc.getUseFor());
			
			irctc.setYear(1999);
			System.out.println(irctc.getYear());
			
			irctc.setItsBelogsWhichState("Every States");
			System.out.println(irctc.getItsBelogsWhichState());
			
			irctc.setPlatforms("Android,IOS");
			System.out.println(irctc.getPlatforms());
			
			irctc.setGovernmentProject(false);
			System.out.println(irctc.getGovernmentProject());
			
			irctc.setGiveCompensation(true);
			System.out.println(irctc.getGiveCompensation());
			
			irctc.setAnnualTurnOverInCr(19000);
			System.out.println(irctc.getAnnualTurnOverInCr());
			
			irctc.setNoOfEmployees(2000);
			System.out.println(irctc.getNoOfEmployees());
			
			irctc.setLiveLocation(true);
			System.out.println(irctc.getLiveLocation());
			
			irctc.setIsCentralAided(true);
			System.out.println(irctc.getIsCentralAided());
			
			irctc.setTravelCityToCity(true);
			System.out.println(irctc.getTravelCityToCity());
			
			irctc.setUserName("Avi");
			System.out.println(irctc.getUserName());
			
			irctc.setMobNumber(8473217156l);
			System.out.println(irctc.getMobNumber());
			
			irctc.setAbout("Travel");
			System.out.println(irctc.getabout());
			
			
		}
}
