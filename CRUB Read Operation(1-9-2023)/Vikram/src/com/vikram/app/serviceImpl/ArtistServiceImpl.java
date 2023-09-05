package com.vikram.app.serviceImpl;

import com.vikram.app.service.ArtistService;

public class ArtistServiceImpl implements ArtistService {
	private ArtistService artistService;

	@Override
	public boolean validateAndSave(String artist) {
		if(artist!=null && !artist.isEmpty() && artist.length()>=3 && artist.length()<=20) {
			System.out.println("artist is good, then store artist");
		}
		else {
			System.err.println("cannot store data, artist is bad");
		}
		return false;
	}
		public ArtistServiceImpl(ArtistServiceImpl artistService) {
			this.artistService = artistService;
		}

}
