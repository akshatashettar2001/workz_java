package com.encap.app;

import com.encap.boot.Instagram;


public class InstagramRunner {
public static void main(String[] args) {
	Instagram insta=new Instagram();
	
	
	insta.setUseFor("social media");
	System.out.println(insta.getUseFor());
	
	insta.setYear(2010);
	System.out.println(insta.getYear());
	
	insta.setFounder("Kevin Systrom");
	System.out.println(insta.getFouder());
	
	insta.setPlatforms("Windows,OS");
	System.out.println(insta.getPlatforms());
	
	insta.setTextMsg(true);
	System.out.println(insta.getTextMsg());
	
	insta.setVoiceMsg(true);
	System.out.println(insta.getVoiceMsg());
	
	insta.setVoiceCall(true);
	System.out.println(insta.getVoiceCall());
	
	insta.setVedioCall(true);
	System.out.println(insta.getVedioCall());
	
	insta.setLiveLocation(true);
	System.out.println(insta.getLiveLocation());
	
	insta.setStatus(true);
	System.out.println(insta.getStatus());
	
	insta.setStatusValidity(24);
	System.out.println(insta.getStatusValidity());
	
	insta.setUserName("Akshata");
	System.out.println(insta.getUserName());
	
	insta.setMobNumber(7483217156L);
	System.out.println(insta.getMobNumber());
	
	insta.setAbout("Available");
	System.out.println(insta.getabout());
	
	
}
}

