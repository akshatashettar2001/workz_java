package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.implement.Hindustani;
import com.xworkz.abstraction.app.implement.Singer;
import com.xworkz.abstraction.app.rule.Music;

public class MusicRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in MusicRunner");
		
		Music music=new Hindustani();
		
		Singer singer=new Singer();
		
		singer.setMusic(music);
		
		singer.song();
		
	}

}
