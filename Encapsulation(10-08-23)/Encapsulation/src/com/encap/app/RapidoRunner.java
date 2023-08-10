package com.encap.app;

import com.encap.boot.Rapido;

public class RapidoRunner {
	public static void main(String[] args) {
		
		Rapido rapido=new Rapido();
			
			
			rapido.setUseFor("two wheel and auto taxi booking application");
			System.out.println(rapido.getUseFor());
			
			rapido.setYear(2015);
			System.out.println(rapido.getYear());
			
			rapido.setFounder("	Aravind Sanka Pavan Guntupalli SR Rishikesh");
			System.out.println(rapido.getFouder());
			
			rapido.setPlatforms("Android,IOS");
			System.out.println(rapido.getPlatforms());
			
			rapido.setIndianBasedCompany(true);
			System.out.println(rapido.getIndianBasedCompany());
			
			rapido.setGiveCompensation(true);
			System.out.println(rapido.getGiveCompensation());
			
			rapido.setAnnualTurnOverInCr(600);
			System.out.println(rapido.getAnnualTurnOverInCr());
			
			rapido.setNoOfEmployees(739);
			System.out.println(rapido.getNoOfEmployees());
			
			rapido.setLiveLocation(true);
			System.out.println(rapido.getLiveLocation());
			
			rapido.setIsUnicorn(false);
			System.out.println(rapido.getIsUnicorn());
			
			rapido.setIndianFounder(false);
			System.out.println(rapido.getIndianFounder());
			
			rapido.setUserName("Nithesh");
			System.out.println(rapido.getUserName());
			
			rapido.setMobNumber(7483217156l);
			System.out.println(rapido.getMobNumber());
			
			rapido.setAbout("Available");
			System.out.println(rapido.getabout());
			
			
		}
}
