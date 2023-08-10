package com.encap.app;

import com.encap.boot.PhonePay;

public class PhonePayRunner {
	
	public static void main(String[] args) {
		
		PhonePay pay=new PhonePay();
		
		
		pay.setUseFor("Payment");
		System.out.println(pay.getUseFor());
		
		pay.setYear(2016);
		System.out.println(pay.getYear());
		
		pay.setFounder("Flipcart");
		System.out.println(pay.getFouder());
		
		pay.setPlatforms("Android");
		System.out.println(pay.getPlatforms());
		
		pay.setTextMsg(true);
		System.out.println(pay.getTextMsg());
		
		pay.setVoiceMsg(false);
		System.out.println(pay.getVoiceMsg());
		
		pay.setVoiceCall(false);
		System.out.println(pay.getVoiceCall());
		
		pay.setXBooking(true);
		System.out.println(pay.getXBooking());
		
		pay.setLiveLocation(false);
		System.out.println(pay.getLiveLocation());
		
		pay.setMobileRecharge(true);
		System.out.println(pay.getMobileRecharge());
		
		pay.setStatusValidity(24);
		System.out.println(pay.getStatusValidity());
		
		pay.setUserName("Nithesh");
		System.out.println(pay.getUserName());
		
		pay.setMobNumber(7483217156L);
		System.out.println(pay.getMobNumber());
		
		pay.setAbout("Available");
		System.out.println(pay.getabout());
		
		
	}
	

}
