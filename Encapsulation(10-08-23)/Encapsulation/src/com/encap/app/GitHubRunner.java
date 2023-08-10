package com.encap.app;

import com.encap.boot.GitHub;

public class GitHubRunner {
	public static void main(String[] args) {

		GitHub git = new GitHub();

		git.setUseFor("Vision Control");
		System.out.println(git.getUseFor());

		git.setYear(2008);
		System.out.println(git.getYear());

		git.setFounder("Chris Wanstrath");
		System.out.println(git.getFouder());

		git.setPlatforms("Windows,Linux,Unix,Mac");
		System.out.println(git.getPlatforms());

		git.setRepository(true);
		System.out.println(git.getRepository());

		git.setVoiceMsg(true);
		System.out.println(git.getVoiceMsg());

		git.setVoiceCall(true);
		System.out.println(git.getVoiceCall());

		git.setVedioCall(true);
		System.out.println(git.getVedioCall());

		git.setLiveLocation(true);
		System.out.println(git.getLiveLocation());

		git.setFile("README");
		System.out.println(git.getFile());

		git.setStatusValidity(24);
		System.out.println(git.getStatusValidity());

		git.setUserName("Nithesh");
		System.out.println(git.getUserName());

		git.setMobNumber(7483217156L);
		System.out.println(git.getMobNumber());

		git.setAbout("Available");
		System.out.println(git.getabout());

	}
}
