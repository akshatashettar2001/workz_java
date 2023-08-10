package com.encap.app;

import com.encap.boot.FaceBook;

public class FaceBookRunner {
	
		public static void main(String[] args) {
			

		FaceBook facebook=new FaceBook();
		
		facebook.setUseFor("Social Media");
		System.out.println(facebook.getUseFor());
		
		facebook.setYear(2004);
		System.out.println(facebook.getYear());
		
		facebook.setFounder("Mark Zuckerberg");
		System.out.println(facebook.getFouder());
		
		facebook.setPlatforms("Windows,Android,Mac");
		System.out.println(facebook.getPlatforms());
		
		facebook.setComment(true);
		System.out.println(facebook.getComment());
		
		facebook.setSubscribe(true);
		System.out.println(facebook.getSubscribe());
		
		facebook.setShare(true);
		System.out.println(facebook.getShare());
		
		facebook.setLike(true);
		System.out.println(facebook.getLike());
		
		facebook.setSearch(true);
		System.out.println(facebook.getSearch());
		
		facebook.setShorts(true);
		System.out.println(facebook.getShorts());
		
		facebook.setQualityAdjust(true);
		System.out.println(facebook.getQualityAdjust());
		
		facebook.setUserName("Akshata");
		System.out.println(facebook.getUserName());
		
		facebook.setAccountMail("Aksnit@gmail.com");
		System.out.println(facebook.getAccountMail());
		
		facebook.setAbout("Available");
		System.out.println(facebook.getabout());
		
		
	}
	

}
