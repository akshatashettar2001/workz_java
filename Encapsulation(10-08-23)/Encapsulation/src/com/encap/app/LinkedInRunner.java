package com.encap.app;

import com.encap.boot.LinkedIn;

public class LinkedInRunner {
	
	public static void main(String[] args) {
		
		LinkedIn linkedin=new LinkedIn();
		
		
		linkedin.setUseFor("Professional Portfolio mantaining application");
		System.out.println(linkedin.getUseFor());
		
		linkedin.setYear(2011);
		System.out.println(linkedin.getYear());
		
		linkedin.setFounder("Reid Hoffman, Jean-Luc Vaillant, Konstantin Guericke, Eric Ly, Allen Blue");
		System.out.println(linkedin.getFouder());
		
		linkedin.setPlatforms("Android,IOS");
		System.out.println(linkedin.getPlatforms());
		
		linkedin.setTextMsg(true);
		System.out.println(linkedin.getTextMsg());
		
		linkedin.setVoiceMsg(false);
		System.out.println(linkedin.getVoiceMsg());
		
		linkedin.setVoiceCall(false);
		System.out.println(linkedin.getVoiceCall());
		
		linkedin.setVedioCall(false);
		System.out.println(linkedin.getVedioCall());
		
		linkedin.setLiveLocation(false);
		System.out.println(linkedin.getLiveLocation());
		
		linkedin.setPost(true);
		System.out.println(linkedin.getPost());
		
		linkedin.setPostViewedContactsShows(true);
		System.out.println(linkedin.getPostViewedContactsShows());
		
		linkedin.setUserName("Nithesh");
		System.out.println(linkedin.getUserName());
		
		linkedin.setMobNumber(7483217156l);
		System.out.println(linkedin.getMobNumber());
		
		linkedin.setAbout("Available");
		System.out.println(linkedin.getabout());
		
		
	}
}
