package com.encap.app;

import com.encap.boot.Youtube;

public class YoutubeRunner {
	public static void main(String[] args) {
		

	Youtube youtube=new Youtube();
	
	youtube.setUseFor("Social Media");
	System.out.println(youtube.getUseFor());
	
	youtube.setYear(2005);
	System.out.println(youtube.getYear());
	
	youtube.setFounder("Jawed Karem");
	System.out.println(youtube.getFouder());
	
	youtube.setPlatforms("Windows,Android,Mac");
	System.out.println(youtube.getPlatforms());
	
	youtube.setComment(true);
	System.out.println(youtube.getComment());
	
	youtube.setSubscribe(true);
	System.out.println(youtube.getSubscribe());
	
	youtube.setShare(true);
	System.out.println(youtube.getShare());
	
	youtube.setLike(true);
	System.out.println(youtube.getLike());
	
	youtube.setSearch(true);
	System.out.println(youtube.getSearch());
	
	youtube.setShorts(true);
	System.out.println(youtube.getShorts());
	
	youtube.setQualityAdjust(true);
	System.out.println(youtube.getQualityAdjust());
	
	youtube.setUserName("Nithesh");
	System.out.println(youtube.getUserName());
	
	youtube.setAccountMail("nit@gmail.com");
	System.out.println(youtube.getAccountMail());
	
	youtube.setAbout("Available");
	System.out.println(youtube.getabout());
	
	
}
}
