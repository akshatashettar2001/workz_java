package com.encap.app;

import com.encap.boot.WhatsApp;

public class WhatsAppRunner {
public static void main(String[] args) {
	
	WhatsApp watsapp=new WhatsApp();
	
	
	watsapp.setUseFor("msg application");
	System.out.println(watsapp.getUseFor());
	
	watsapp.setYear(2009);
	System.out.println(watsapp.getYear());
	
	watsapp.setFounder("Brian Acton");
	System.out.println(watsapp.getFouder());
	
	watsapp.setPlatforms("Windows");
	System.out.println(watsapp.getPlatforms());
	
	watsapp.setTextMsg(true);
	System.out.println(watsapp.getTextMsg());
	
	watsapp.setVoiceMsg(true);
	System.out.println(watsapp.getVoiceMsg());
	
	watsapp.setVoiceCall(true);
	System.out.println(watsapp.getVoiceCall());
	
	watsapp.setVedioCall(true);
	System.out.println(watsapp.getVedioCall());
	
	watsapp.setLiveLocation(true);
	System.out.println(watsapp.getLiveLocation());
	
	watsapp.setStatus(true);
	System.out.println(watsapp.getStatus());
	
	watsapp.setStatusValidity(24);
	System.out.println(watsapp.getStatusValidity());
	
	watsapp.setUserName("Nithesh");
	System.out.println(watsapp.getUserName());
	
	watsapp.setMobNumber(7483217156L);
	System.out.println(watsapp.getMobNumber());
	
	watsapp.setAbout("Available");
	System.out.println(watsapp.getabout());
	
	
}
}
