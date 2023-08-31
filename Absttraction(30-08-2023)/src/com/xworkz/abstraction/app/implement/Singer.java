package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Music;

public class Singer {

	Music music;
	
	public void setMusic(Music music)
	{
		System.out.println("Invoking setMusic() in Singer");
	}
	
	public void song()
	{
		System.out.println("invoking song() in Singer");
		this.music.relax();
	}
	
	
}
