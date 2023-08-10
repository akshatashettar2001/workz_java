package com.encap.app;

import com.encap.boot.NammaMetro;

public class NammaMetroRunner {
	public static void main(String[] args) {
		
		NammaMetro nammametro=new NammaMetro();
			
			
			nammametro.setUseFor("Speedups the means of transport ");
			System.out.println(nammametro.getUseFor());
			
			nammametro.setYear(2011);
			System.out.println(nammametro.getYear());
			
			nammametro.setItsBelogsWhichState("Karnataka , Delhi , Hydrabad");
			System.out.println(nammametro.getItsBelogsWhichState());
			
			nammametro.setPlatforms("Android,IOS");
			System.out.println(nammametro.getPlatforms());
			
			nammametro.setGovernmentProject(true);
			System.out.println(nammametro.getGovernmentProject());
			
			nammametro.setGiveCompensation(true);
			System.out.println(nammametro.getGiveCompensation());
			
			nammametro.setAnnualTurnOverInCr(6);
			System.out.println(nammametro.getAnnualTurnOverInCr());
			
			nammametro.setNoOfEmployees(400);
			System.out.println(nammametro.getNoOfEmployees());
			
			nammametro.setLiveLocation(true);
			System.out.println(nammametro.getLiveLocation());
			
			nammametro.setIsCentralAided(false);
			System.out.println(nammametro.getIsCentralAided());
			
			nammametro.setTravelCityToCity(false);
			System.out.println(nammametro.getTravelCityToCity());
			
			nammametro.setUserName("Nithesh");
			System.out.println(nammametro.getUserName());
			
			nammametro.setMobNumber(7483217156l);
			System.out.println(nammametro.getMobNumber());
			
			nammametro.setAbout("Available");
			System.out.println(nammametro.getabout());
			
			
		}
}
