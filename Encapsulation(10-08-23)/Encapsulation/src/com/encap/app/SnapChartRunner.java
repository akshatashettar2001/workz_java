package com.encap.app;

import com.encap.boot.SnapChart;

public class SnapChartRunner {
	public static void main(String[] args) {

		SnapChart snapchart = new SnapChart();

		snapchart.setUseFor("instance media sharing application");
		System.out.println(snapchart.getUseFor());

		snapchart.setYear(2011);
		System.out.println(snapchart.getYear());

		snapchart.setFounder("Evan Spiegel");
		System.out.println(snapchart.getFouder());

		snapchart.setPlatforms("Android,IOS");
		System.out.println(snapchart.getPlatforms());

		snapchart.setTextMsg(true);
		System.out.println(snapchart.getTextMsg());

		snapchart.setVoiceMsg(true);
		System.out.println(snapchart.getVoiceMsg());

		snapchart.setVoiceCall(true);
		System.out.println(snapchart.getVoiceCall());

		snapchart.setVedioCall(true);
		System.out.println(snapchart.getVedioCall());

		snapchart.setLiveLocation(true);
		System.out.println(snapchart.getLiveLocation());

		snapchart.setStatus(true);
		System.out.println(snapchart.getStatus());

		snapchart.setStatusValidity(30);
		System.out.println(snapchart.getStatusValidity());

		snapchart.setUserName("Nithesh");
		System.out.println(snapchart.getUserName());

		snapchart.setMobNumber(7483217156L);
		System.out.println(snapchart.getMobNumber());

		snapchart.setAbout("Available");
		System.out.println(snapchart.getabout());

	}
}
