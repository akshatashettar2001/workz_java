package com.encap.app;

import com.encap.boot.CRED;

public class CREDRunner {

	public static void main(String[] args) {

		CRED cred = new CRED();

		cred.setUseFor("Borrowing money");
		System.out.println(cred.getUseFor());

		cred.setYear(2018);
		System.out.println(cred.getYear());

		cred.setFounder("KunalShah");
		System.out.println(cred.getFouder());

		cred.setPlatforms("Android,IOS");
		System.out.println(cred.getPlatforms());

		cred.setIsNonBankingCompany(true);
		System.out.println(cred.getIsNonBankingCompany());

		cred.setIssueFine(true);
		System.out.println(cred.getIssueFine());

		cred.setAnnualTurnOverInCr(422);
		System.out.println(cred.getAnnualTurnOverInCr());

		cred.setNoOfEmployees(800);
		System.out.println(cred.getNoOfEmployees());

		cred.setLiveLocation(false);
		System.out.println(cred.getLiveLocation());

		cred.setIsUnicorn(true);
		System.out.println(cred.getIsUnicorn());

		cred.setIndianFounder(true);
		System.out.println(cred.getIndianFounder());

		cred.setUserName("Poorvi");
		System.out.println(cred.getUserName());

		cred.setMobNumber(746628832L);
		System.out.println(cred.getMobNumber());

		cred.setAbout("Available");
		System.out.println(cred.getabout());

	}

}
